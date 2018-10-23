package ejercicioscasa;

import java.util.Scanner;

public class Factorial {
	/**
	 * 
	 * 
	 * Factorial de un numero
	 * 
	 * @param args
	 */
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// Introducimos las variables que necesitamos

		int numero = pedirNum();
		int factorial = calcularFactorial(numero);

		verResultados(numero, factorial);

	}

	private static int pedirNum() {

		System.out.println("Introduzca un número: ");
		return entrada.nextInt();

	}

////////////////////////////
	public static int calcularFactorial(int numero) {

		int acum = 1;
		for (int cont = numero; cont >= 1; cont--) {
			// Acumular numeros
			acum = acum * cont;

		}
		return acum;

	}
/////////////////////////////

	public static void verResultados(int numero, int factorial) {

		System.out.println("El factorial de " + numero + " es " + factorial);
	}
}
