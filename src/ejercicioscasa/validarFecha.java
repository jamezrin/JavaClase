package ejercicioscasa;

import java.util.Scanner;

public class validarFecha {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		arrancarAplicacion();

	}

	private static void arrancarAplicacion() {

		int dia = pedirDia();
		int mes = pedirMes();
		int anno = pedirAnno();

		validarFecha(dia, mes, anno);

	}

////////////////////////////////////////
	private static int pedirDia() {
		int cifra;
		System.out.println("Introduzca el día: ");
		cifra = entrada.nextInt();
		return cifra;
	}

////////////////////////////////////////
	private static int pedirMes() {
		int cifra;
		System.out.println("Introduzca el mes: ");
		cifra = entrada.nextInt();
		return cifra;
	}

////////////////////////////////////////
	private static int pedirAnno() {
		int cifra;
		System.out.println("Introduzca el año: ");
		cifra = entrada.nextInt();
		return cifra;
	}

////////////////////////////////////////

	private static void validarFecha(int dia, int mes, int anno) {

		boolean validarDato = true;

		do {

			switch (mes) {
			case 1:
				if (!(dia > 0 && dia < 32)) {
					System.out.println("Error, introduzca una dia entre 1 y 30: ");
					dia = entrada.nextInt();
					validarDato = false;
				}
				if (!(anno > 1582)) {
					System.out.println("Error, introduzca un año superior a 1582: ");
					validarDato = false;

				}

				break;

			case 2:
				if (!(anno % 4 == 0) && (anno % 100 != 0) || (anno % 400 == 0)) {
					System.out.println("Error, introduzca un año bisiesto: ");
					anno = entrada.nextInt();
					validarDato = false;
				}
				if (!(dia > 0 && dia < 29)) {
					System.out.println("Error, introduzca un numero entre 1 y 29: ");
					dia = entrada.nextInt();
					validarDato = false;
				}
				break;

			default:
				System.out.println("Error, introduzca una mes entre 1 y 12: ");
				mes = entrada.nextInt();
				validarDato = false;
				break;
			}

			/*
			 * (!(mes > 0 && mes < 13)) {
			 * System.out.println("Introduzca una mes entre 1 y 12: "); mes =
			 * entrada.nextInt(); validarDato = false;
			 * 
			 * }
			 */

		} while (!validarDato);

	}

}
