package estructurasdecontrol;

import java.io.IOException;

public class ConversorNotas

{
	public static void main(String[] args) throws IOException {
		// Variables
		int notaNumerica = 0;

		// Sentencia de entrada para guardar la nota alfanumerica.
		System.out.println("Introduzca la nota I, A, B, N, S : ");
		char notaAlfabetica = (char) System.in.read();
		boolean notaCorrecta = true;
		switch (notaAlfabetica) {
			case 'I':
				notaNumerica = 4;
				break;
	
			case 'A':
				notaNumerica = 5;
				break;
	
			case 'B':
				notaNumerica = 6;
				break;
	
			case 'N':
				notaNumerica = 7;
				break;
	
			case 'S':
				notaNumerica = 8;
				break;
				
			default:
				notaCorrecta = false;
				break;

		}
		
		if (notaCorrecta) {
			System.out.println("La nota es: " + notaNumerica);
		} else {
			System.out.println("La nota no es correcta");
		}
	}

}
