package estructurasdecontrol;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {

		// Poder introducir notas
		Scanner entrada = new Scanner(System.in);
		// Variables
		System.out.println("Introduce la base: ");
		int numbas = entrada.nextInt();

		System.out.println("Introduce el exponente: ");
		int numexp = entrada.nextInt();
		int resultado = 1;
		
		for (int cont = 0; cont < numexp; cont++) {
			resultado = resultado * numbas;
		}
		
		/*
		 *Sacar por pantalla la potencia. 
		 * */
		System.out.println("La potencia de " + numbas + " en base " + numexp + " es: " + resultado);
	}
}
