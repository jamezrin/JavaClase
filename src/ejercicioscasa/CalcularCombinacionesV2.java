package ejercicioscasa;

import java.util.Scanner;

public class CalcularCombinacionesV2 {

	public static void main(String[] args) {

		int m = pedirM();
		int n = pedirN(m);
		int totalcom = calcularFact(m, n);
		verResultados(totalcom);
	}

	private static int pedirM() {
		Scanner entrada = new Scanner(System.in);
		boolean check;
		int valido;

		do {
			System.out.println("Introduzca M: ");
			valido = entrada.nextInt();

			check = (0 < valido);
			if (!check) {
				System.out.println("Introduzca un número mayor o igual que 0: ");
			}

		} while (!check);

		return valido;
	}

	private static int pedirN(int m) {
		Scanner entrada = new Scanner(System.in);
		boolean check;
		int nvalido;
		do {

			System.out.println("Intrduzca N: ");
			nvalido = entrada.nextInt();
			check = (m >= nvalido && nvalido > 0);

			if (!check) {
				System.out.println("Por favor introduzca un numero menor o igual que 'M': ");
			}
		} while (!check);

		return nvalido;
	}
	////////////////////////////////

	private static int calcularFact(int m, int n) {

		return factorial(m) / (factorial(n) * factorial(m - n));
	}

	public static int factorial(int numero) {
		if (numero == 0) {
			return 1;
		}
		return numero * factorial(numero - 1);
	}

	private static void verResultados(int totalcom) {
		System.out.println("El total es: " + totalcom);
	}

}
