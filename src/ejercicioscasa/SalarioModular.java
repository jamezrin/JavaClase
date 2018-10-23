package ejercicioscasa;

import java.util.Scanner;

/**
 * 
 * Diseñar un programa que obtenga el salario neto de n trabajadores de acuerdo
 * a las siguientes premisas: -Las 38 primeras horas semanales se cobran a la
 * tarifa ordinaria. -Cualquier hora extra realizada se cobra 1.5 veces la
 * tarifa ordinaria. -Los primeros 600 euros están libres de impuestos. Los
 * siguientes 600 están sometidos a retenciones del 25% y los restantes al 45%.
 * - Pedir por teclado el número de trabajadores y la tarifa ordinaria.
 * 
 * @author alumno
 *
 */

public class SalarioModular {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int numeroTrabajadores = pedirTrabajador();
		double salariohora = pedirSalario();
		double salarioNeto = calcularSalario(numeroTrabajadores, salariohora);

	}

	///////////////////////////////////////
	private static int pedirTrabajador() {

		System.out.println("Introduzca la cantidad de empleados: "); // mayor o igual 1
		int numero;
		boolean validar;
		do {
			numero = entrada.nextInt();
			validar = (numero >= 1);
			if (!validar) {
				System.out.println("Error. Introduzca 1 o más empleados: ");
			}

		} while (!validar);
		return numero;
	}

	///////////////////////////////////////
	private static double pedirSalario() {
		System.out.println("Introduzca la tarifa ordinaria (€/hora): "); // asegurarse > 0
		double numero;
		boolean validar;
		do {
			numero = entrada.nextDouble();
			validar = (numero > 0);
			if (!validar) {
				System.out.println("Error. Introduzca una tarifa superior a 0: ");
			}

		} while (!validar);
		return numero;
	}

	///////////////////////////////////////
	private static double calcularSalario(int numeroTrabajadores, double salariohora) {

		for (int i = 1; i <= numeroTrabajadores; i++) {
			System.out.println(
					"Introduzca el numero de horas trabajadas del trabajador " + i + " de " + numeroTrabajadores);
			int nhoras;
			boolean validar;
			do {
				nhoras = entrada.nextInt();
				validar = (nhoras > 38);
				if (!validar) {
					System.out.println("Error. Introduzca más de 38 horas: ");
				}

			} while (!validar);

			double salarioBruto = calcularSalarioBruto(nhoras, salariohora);
			System.out.println("El salario bruto del trabajador " + i + " es " + salarioBruto);

			double impuestos = calcularImpuestos(salarioBruto);
			System.out.println("El salario neto del trabajador " + i + " es " + (salarioBruto-impuestos));

		}
		return 0;
	}

	///////////////////////////////////////
	private static double calcularSalarioBruto(int nhoras, double salariohora) {

		if (nhoras > 38) {
			int extras = nhoras - 38;
			return (extras * salariohora * 1.5) + (38 * salariohora);
		}
		return nhoras * salariohora;
	}

	///////////////////////////////////////
	private static double calcularImpuestos(double salarioBruto) {
		final double tramo1 = (salarioBruto - 600);
		final double tramo2 = (salarioBruto - 1200);
		double impuestos;
		if (salarioBruto <= 600) {
			impuestos = 0;
		} else if (salarioBruto <= 1200)
			impuestos = tramo1 * 0.25;
		else {
			impuestos = tramo1 * 0.25 + tramo2 * 0.45;
		}

		return impuestos;
	}

}
