package ejercicioscasa;

import java.util.Scanner;

public class PotenciaRecursiva {
	/**
	 * 
	 * 
	 * Potencia de un numero
	 * 
	 * @param args
	 */
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int base = pedirBase();
		int exponente = pedirExponente();

		int potencia = calcularP(base, exponente);

		verResultado(potencia, base);

	}

//////////////
	private static int pedirBase() {

		System.out.println("Introduzca la base: ");
		return entrada.nextInt();
	}

//////////////
	private static int pedirExponente() {
		System.out.println("Introduzca el exponente: ");
		return entrada.nextInt();
	}

//////////////
	private static int calcularP(int base, int exponente) {

		if (exponente == 0)
		{
			return 1;
		}
		return base * calcularP(base, exponente - 1);

	}

	private static void verResultado(int potencia, int base) {

		System.out.println("La potencia de " + base + " es " + potencia);

	}

}
