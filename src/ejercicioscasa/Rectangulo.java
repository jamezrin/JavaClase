package ejercicioscasa;

import java.util.Scanner;

public class Rectangulo {
	/**
	 * 
	 * 
	 * Ejemplo de programación modular que calcula el area y perímetro de un
	 * rectangulo.
	 * 
	 * @param args
	 */

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// Introducimos la base y la altura
		double altura = pedirAltura();
		double base = pedirBase();

		// Calcular área y perímetro.
		double area = calcularArea(base, altura);
		double perimetro = calcularPerimetro(base, altura);

		// Ver resultados
		verResultados(area, perimetro);

	}
	///////////////////////////////////////

	private static double pedirBase() {
		System.out.println("Introducir la base: ");
		return entrada.nextDouble();

	}
	///////////////////////////////////////

	private static double pedirAltura() {
		System.out.println("Introducir la altura: ");
		return entrada.nextDouble();
	}

	///////////////////////////////////////

	public static double calcularArea(double base, double altura) {

		return base * altura;

	}
	////////////////////////////////////////

	public static double calcularPerimetro(double base, double altura) {
		return 2 * (base + altura);
	}

	/////////////////////////////////////////

	public static void verResultados(double area, double perimetro) {
		System.out.println("El área total es: " + area);
		System.out.println("El perimetro total es: " + perimetro);

	}

}
