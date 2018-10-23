
/*Realizar un pseudocódigo que visualice en pantalla 
 * el número de palabras que tiene una frase acabada en punto.*/

package ejerciciosCasa;

import java.io.IOException;

public class CuentaPalabras {

	public static void main(String[] args) throws IOException {

		// Declaración de variables.
		int contadorP = 0;
		char caracter;
		boolean validadorP = true;

		System.out.println("Introduzca una frase: ");
		contadorP++;
		do {

			caracter = (char) System.in.read();
			if (caracter == ' ') {
				contadorP++;
			} else if (caracter == '.') {
				validadorP = false;
			}

		} while (validadorP == true);

		System.out.println("Usted a introducido: " + contadorP + " palabras. ");

	}

}
