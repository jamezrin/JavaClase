package ejercicioscasa;

import java.util.Scanner;

public class CalcularCombinaciones {

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
				System.out.println("Introduzca un n�mero mayor o igual que 0: ");
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

	private static int calcularFact(int m, int n) {

		int acumuladorm = 1;
		for (int i = m; 1 <= i; i--) {
			acumuladorm = acumuladorm * i;
		}

		int acumuladorn = 1;
		for (int i = n; 1 <= i; i--) {
			acumuladorn = acumuladorn * i;
		}

		int acumuladort = 1;
		for (int i = (m - n); 1 <= i; i--) {
			acumuladort = acumuladort * i;
		}

		int total = acumuladorm / (acumuladorn * acumuladort);
		return total;
	}

	private static void verResultados(int totalcom) {
		System.out.println("El total es: " + totalcom);
	}

}
