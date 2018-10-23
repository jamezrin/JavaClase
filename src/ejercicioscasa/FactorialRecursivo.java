package ejercicioscasa;

import java.util.Scanner;

public class FactorialRecursivo {

	/**
	 * 
	 * 
	 * Imprimir de forma recursiva el factorial
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int numero = pedirNumero();
		int fact = calcFact(numero);

		verResultado(fact, numero);

	}

///
	private static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		System.out.println("Introduzca un numero: ");

		boolean validar;

		do {
			numero = entrada.nextInt();
			validar = (numero > 0);
			
			if (!validar) 
				System.out.println("Error introduzca un numero mayor que 0: ");
				
			
				
		} while (!validar);

		return numero;

	}

///
	/**
	 * 
	 * Calcula el factorial utilzacndo un método recursivo.
	 * 
	 */
	private static int calcFact(int numero) {

		if (numero == 0) {
			return 1;
		}

		return numero * calcFact(numero - 1);

	}

///
	private static void verResultado(int fact, int numero) {

		System.out.println("El factorial de " + numero + " es " + fact);

	}
}
