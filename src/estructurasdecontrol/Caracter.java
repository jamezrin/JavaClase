package estructurasdecontrol;

import java.io.IOException;
import java.util.Scanner;

public class Caracter {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		char caracter;
		int base;
		int altura;
		
		System.out.println("Introduce un caracter: ");
		caracter = (char) System.in.read();
		
		System.out.println("Introduce la base: ");
		base = entrada.nextInt();
		
		System.out.println("Introduce la altura: ");
		altura = entrada.nextInt();
		
		for (int i = 0; i < altura; i++) 
		{												//veces que se va ha hacer la altura
			for (int j=0; j < base; j++) 
			{											//veces que va ha pintar la base
				System.out.print(caracter);				//imprime x veces la altura y la base
			}
			System.out.println(); 						//salta una linea para poder hacer bien el dibujo.
					
			
		}
		
	}
}
