package ejercicioscasa;

import java.util.Scanner;

public class CalculadoraModular {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = pedirOperador();
		if (opcion == 5) {
			System.out.println("Saliendo de la aplicación. ");
		} else {
			double total = calculadora(opcion);
			System.out.println("El resultado total es: " + total);
		}
	}

	private static int pedirOperador() {
		int x;
		System.out.println("Introduzca una forma de realizar el calculo: ");
		System.out.println("");
		System.out.println("1. Suma ");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicación ");
		System.out.println("4. División. ");
		System.out.println("5. Salir de la aplicación.");
		x = entrada.nextInt();

		if (x > 5 || x < 1) {
			System.out.println("Porfavor, introduzca un numero entre 1 y 5.");
			return pedirOperador();
		}
		return x;

	}

	private static double calculadora(int opcion) {

		double n1;
		double n2 = 0;
		double resultado = 0;
		boolean validar;

		do {
			System.out.println("Introduzca el primer numero: ");
			n1 = entrada.nextInt();

			System.out.println("Introduzca el segundo numero: ");
			n2 = entrada.nextInt();
			validar = (n2 == 0);

			switch (opcion) {
			case 1:
				resultado = n1 + n2;
				break;
			case 2:
				resultado = n1 - n2;
				break;
			case 3:
				resultado = n1 * n2;
				break;
			case 4:

				if (validar) {
					System.out.println("Error, introduzca un numero que no sea 0 como divisor.");
					break;
				}

				resultado = n1 / n2;
				break;

			default:
				break;
			}

		} while (validar);
		return resultado;

	}

}
