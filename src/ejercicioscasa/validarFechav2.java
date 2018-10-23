package ejercicioscasa;

import java.util.Scanner;

public class validarFechav2 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		arrancarAplicacion();

	}

	private static void arrancarAplicacion() {
		boolean diaValido = false;
		int mes;
		int anno;
		int dia;

		mes = pedirMes();
		anno = pedirAnno();
		do {
			dia = pedirDia();
		} while (!diaValido);

	}

	private static int pedirAnno() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int pedirDia() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int pedirMes() {

		return 0;
	}
}
