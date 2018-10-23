package ejercicioscasa;

import java.util.Scanner;

public class Potencia {
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

		verResultado(potencia , base);

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

		int acum = 1;
		for (int i = 1; i <= exponente; i++) {
			acum = base * acum;
		}

		return acum;
	}

	private static void verResultado(int potencia, int base) {
		
System.out.println("La potencia de " + base + " es " + potencia);

	}

}
