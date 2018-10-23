package estructurasdecontrol;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int nota = 0;
		int notaMax = 0;
		int notaMin = 10;

		for (int i = 1; i <= 3; i++) {

			System.out.println("Introduzca una nota: " + i + "/3");

			boolean notavalida = true;// true

			do {
				nota = entrada.nextInt();

				notavalida = (nota >= 1 && nota <= 10); // true

				if (!notavalida) { // si es falso , tal haz lo q sea
					System.out.println("Error, introduzca una nota entre 1 y 10:");

				}

			} while (!notavalida);

			if (nota > notaMax) {
				notaMax = nota;
			} if (nota < notaMin) {
				notaMin = nota;
			}

		}
		System.out.println("La nota máxima es: " + notaMax);
		System.out.println("La nota mínima es: " + notaMin);
	}

}
