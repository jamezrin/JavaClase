package ejercicioscasa;

import java.util.Scanner;

public class ejercicioBase10 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int numero = pedirNumeros();
		int base = pedirBase();
		pedirConversor(numero, base);

	}

	//////////////////////////////////////////////

	private static int pedirNumeros() {
		int numero;
		System.out.println("Introduzca un numero positivo: ");
		boolean numPositivo;
		do {
			numero = entrada.nextInt();
			numPositivo = (numero >= 0);
			if (!numPositivo) {
				System.err.println("Error, introduzca un número positivo");
			}
		} while (!numPositivo);
		return numero;
	}

	//////////////////////////////////////////////

	private static int pedirBase() {

		System.out.println("Introduzca la base (mayor o igual a 1):");
		int base;
		boolean baseValida;
		do {
			base = entrada.nextInt();
			baseValida = (base >= 2 && base <= 9);
			if (!baseValida) {
				System.err.println("Error, introduzca un numero mayor que 1 y menor que 10.");
			}
		} while (!baseValida);
		return base;
	}

	//////////////////////////////////////////////

	private static void pedirConversor(int numero, int base) {

		int divisor = numero / base;
		int resto = numero % base;

		if (numero < base) {
			System.out.print(numero);

		} else {
			pedirConversor(divisor, base);
			System.out.print(resto);

		}
	}
}
