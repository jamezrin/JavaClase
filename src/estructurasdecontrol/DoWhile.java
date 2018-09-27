/*
 *
 *Pida por teclado una respuesta 
 *sabiendo que son validas la "S" y la "M". En caso que de que 
 *no sea valida que la pida. 
 */


package estructurasdecontrol;

import java.io.IOException;

public class DoWhile {
	
	public static void main(String[] args) throws IOException {
		
		//VARIABLES
		char resp;  
		
		System.out.println("Introduce una 'S' o una 'N' ");
		
		do {
		resp = (char) System.in.read();
		resp = Character.toUpperCase(resp);
		
		//La siguiente linea salta 2 caracteres en el buffer de teclado
		System.in.skip(2);
		if (resp != 'S' && resp != 'N') 
			System.out.println("Respuesta no válida.");
	} while (resp != 'S' && resp != 'N');
		
	}
}
