package estructurasdecontrol;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		// Introducimos las variables

		Scanner entrada = new Scanner(System.in);
		double op1 = 0;
		double op2 = 0;
		int correcta = 0;
		double resultado = 0;
		boolean validar = true;
		boolean mostrarRes = true;

		System.out.println("Introduzca el primer número: ");
		op1 = entrada.nextDouble();
		System.out.println("Introduzca el segundo número: ");
		op2 = entrada.nextDouble();

		do {
			System.out.println("Introduzca una forma de realizar el calculo: ");
			System.out.println("1. Suma ");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación ");
			System.out.println("4. División. ");
			System.out.println("5. Salir de la aplicación.");
			correcta = entrada.nextInt();
			

			validar = (correcta >= 1 && correcta <= 5);
			if (!validar)
				System.out.println("Error. Porfavor introduzca un numero entre 1 y 5");

			do {
				switch (correcta) {
				case 1:
					resultado = (op1 + op2);
					break;
				case 2:
					resultado = (op1 - op2);
					break;
				case 3:
					resultado = (op1 * op2);
					break;
				case 4:
					if (op2 == 0) {
						System.out.println("Introduzca otro operador2 que no sea 0");
						mostrarRes = false;
						break;
					}
					resultado = (op1 / op2);
					break;
				case 5:
					System.out.println("Saliendo de la aplicacion...");
					break;

				default:
					break;
				}

			} while (!mostrarRes);

		} while (!validar);

		System.out.println("El total es " + resultado);
	}
}
