package ejercicioscasa;

import java.util.Scanner;

public class MCDRecursivo {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int num1 = pedirNum1();
		int num2 = pedirNum2();

		int mcd = operacion(num1, num2);

		verResultados(mcd);

	}

/////////////

	private static int pedirNum1() {
		System.out.println("Introduce el primer numero: ");
		return entrada.nextInt();
	}

////////////

	private static int pedirNum2() {
		System.out.println("Introduce el segundo numero: ");
		return entrada.nextInt();
	}

////////////

	private static int operacion(int num1, int num2) {

		if (num1 != num2) {

			if (num1 > num2) {
				num1 = num1 - num2;
			} else
				num2 = num2 - num1;

			return operacion(num1, num2);
		}

		return num1;

	}

////////////

	private static void verResultados(int mcd) {
		System.out.println("El maximo comun divisor es: " + mcd);

	}

}
