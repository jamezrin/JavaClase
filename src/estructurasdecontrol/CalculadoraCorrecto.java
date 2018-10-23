package estructurasdecontrol;

import java.util.Scanner;

public class CalculadoraCorrecto {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double op1 = 0;
		double op2 = 0;
		double resultado = 0;
		boolean salir = false;
		boolean mostrarResultados = true;

		do {
			System.out.println("Introduzca el primer n�mero: ");
			op1 = entrada.nextDouble();
			System.out.println("Introduzca el segundo n�mero: ");
			op2 = entrada.nextDouble();

			boolean mostrarOpciones = true;
			do {
					System.out.println("Introduzca una forma de realizar el calculo: ");
					System.out.println("");
					System.out.println("1. Suma ");
					System.out.println("2. Resta");
					System.out.println("3. Multiplicación ");
					System.out.println("4. División. ");
					System.out.println("5. Salir de la aplicación.");
				int operando = entrada.nextInt();
				// es true si el usuario introduce un numero correcto.
				mostrarOpciones = (operando >= 1 && operando <= 5);
				if (!mostrarOpciones) {
					System.out.println("Error. Porfavor introduzca un numero entre 1 y 5. ");
					System.out.println("");
				}
				switch (operando) {
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
						mostrarOpciones = false;
						break;
					}
					resultado = (op1 / op2);
					break;
				case 5:
					System.out.println("Saliendo de la aplicacion...");
					mostrarResultados = false;
					break;

				}

			} while (!mostrarOpciones);

		} while (salir);

		if (mostrarResultados) {
			System.out.println("El total es " + resultado);
		}
	}

}
