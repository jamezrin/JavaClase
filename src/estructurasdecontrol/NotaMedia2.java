package estructurasdecontrol;

import java.util.Scanner;

public class NotaMedia2 {

	public static void main(String[] args) {

		/*
		 * Necesitamos las siguientes variables: 
		 * Contador para saber cuantas notas hay que poner , nota variable para guardar la nota,
		 * acumulador.
		 * */
		Scanner entrada = new Scanner(System.in);
		int nota = 0;
		int total = 0;
		int cont = 0;

		do {

			System.out.println("Introduzca una nota:");
			nota = entrada.nextInt();
			
			if (nota != 99) {

				total = total + nota;

				cont++;
			}

		} while (nota != 99);
		
		if (nota == 99) {
			System.out.println("No ha introducido ninguna nota. ");
		} else {

		System.out.println(cont);
		System.out.println(total);
		int media = total / cont;

		System.out.println("La media total es " + media + ".");
		}
	}
}