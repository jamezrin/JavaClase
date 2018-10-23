/*Realizar un pseudocódigo que visualice en pantalla
 * el número de palabras que tiene una frase acabada en punto.*/

package estructurasdecontrol;

import java.io.IOException;

public class ContadorPalabras {

	public static void main(String[] args) throws IOException {

		// Declaración de variables.
		int contadorP = 1;
		char caracter;
		boolean validadorP = true;

		System.out.println("Introduzca una frase: ");

		do {

			caracter = (char) System.in.read();
			if (caracter == ' ') {
				contadorP++;

			} else if (caracter == '.') {
				validadorP = false;
			}

		} while (validadorP);

		System.out.println("Usted a introducido: " + contadorP + " palabras. ");

	}

}