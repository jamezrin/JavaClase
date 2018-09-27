package estructurasdecontrol;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int nota = 0;
		int total = 0;
		int cont = 0;
		boolean fin = false;

		do {

			System.out.println("Introduzca una nota:");
			nota = entrada.nextInt();

			fin = (nota == -99);

			if (!fin) {

				cont++;
				total = total + nota;

			}

		} while (!fin);

		if (cont == 0) {
			System.out.println("No has introducido ninguna nota. ");
		} else {

			// Calculamos la media.
			System.out.println(cont);
			System.out.println(total);
			double media = total / cont;

			// Imprimimos por pantalla todo.

			System.out.println("La media total es " + media + ".");

		}
	}
}