package ejercicioscasa;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class NumeroPerfecto {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int numero = pedirNumero();
		if (esPerfecto(numero)) {
			System.out.println("El " + numero + " es perfecto");
		} else {
			System.out.println("El " + numero + " no es perfecto");
		}
	}

	/////////////////////////////

	private static int pedirNumero() {

		System.out.println("Introduzca un número para comprobar si es perfecto: ");
		return entrada.nextInt();
	}

	/////////////////////////////
	/**
	 * Un numero es perfecto cuando la suma de los divisores propios es igual al
	 * propio numero. Un divisor propio es aquel que implica que al dividir el
	 * numero por el divisor el resto es 0.
	 *
	 * @param numero
	 * @return
	 */

	private static boolean esPerfecto(int numero) {

		boolean correcto = true;

		/*
		 * Acumulador para comprobar que la suma de los divisores propios son son
		 * iguales o no al propio numero .
		 */
		int acumulador = 0;

		for (int i = 1; i <= numero / 2; i++) {

			// Comprpobamos si un numero es divisor propio de 6.

			if (numero % i == 0)
				acumulador = acumulador + i;

		}

		// Comprobamos si el numero es perfecto

		if (acumulador == numero) {
			return true;
		}
		return false;

	}

	/////////////////////////////

}
