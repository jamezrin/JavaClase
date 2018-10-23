package ejercicioscasa;

import java.util.Scanner;

public class CalcModular2 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		arrancarAplicacion();

	}

	////////////////////////////////////////////
	private static void arrancarAplicacion() {

		boolean salir = false;
		do {
			int opcion = verMenu();

			salir = (opcion == 5);
			

			if (!salir)

			{
				// Pido los operandos.
				System.out.println("Introduzca operando 1: ");
				double operando1 = pedirNumero();

				System.out.println("Introduce operando 2: ");
				double operando2 = pedirNumero();
				double resultado = 0;
				switch (opcion) {
				case 1:
					resultado = suma(operando1, operando2);
					break;
				case 2:
					resultado = resta(operando1, operando2);
					break;
				case 3:
					resultado = mult(operando1, operando2);
					break;
				case 4:
					if (operando2 == 0) {
						System.out.println("Introduzca otro operador2 que no sea 0");
						break;
					}
					resultado = dividir(operando1, operando2);
					break;
				case 5:
					System.out.println("Saliendo de la aplicacion...");
					break;

				}
				System.out.println("El resultado es: " + resultado);
				
			}
			else {
				System.out.println("Saliendo de la aplicación. "); 
			}
			

		} while (!salir);
		
	}

	/////////////////////////////////////

	private static double suma(double operando1, double operando2) {

		return operando1 + operando2;
	}

/////////////////////////////////////
	private static double resta(double operando1, double operando2) {
		return operando1 - operando2;
	}

/////////////////////////////////////
	private static double mult(double operando1, double operando2) {
		return operando1 * operando2;
	}

/////////////////////////////////////
	private static double dividir(double operando1, double operando2) {
		return operando1 / operando2;
	}

	////////////////////////////////////////////
	/*
	 * 
	 * Muestra un menú en pantalla Pide la opcion, la valida
	 * 
	 */

	private static int verMenu() {
		System.out.println("Introduzca una forma de realizar el calculo: ");
		System.out.println("");
		System.out.println("1. Suma ");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación ");
		System.out.println("4. División. ");
		System.out.println("5. Salir de la aplicación.");

		int opcion;

		boolean entre1y5;
		do {

			opcion = entrada.nextInt();
			entre1y5 = (opcion >= 1 && opcion <= 5);
			if (!entre1y5) {
				System.out.println("Error introduzca un numero entre 1 y 5:");
			}
		} while (!entre1y5);

		return opcion;

	}

	private static double pedirNumero() {

		return entrada.nextDouble();
	}

}
