/*
 *
 *Pida por teclado una respuesta 
 *sabiendo que son validas la "S" y la "M". En caso que de que 
 *no sea valida que la pida. 
 */


package estructurasdecontrol;

import java.io.IOException;

public class DoWhileV2 {
	
	public static void main(String[] args) throws IOException 
	{
		
		//VARIABLES
		char resp;
		boolean respValida = true;
		
		System.out.println("Introduce una 'S' o una 'N' ");
		
		do {
			
		resp = (char) System.in.read();
		
		//La siguiente linea salta 2 caracteres en el buffer de teclado
		System.in.skip(2);
		resp = Character.toUpperCase(resp);
		respValida = (resp == 'S' || resp =='N');
			
		
		if (!respValida) 
		System.out.println("Respuesta no válida.");
		
		} while (!respValida); //!respValida equivale a respValida == false
		
	}
}
