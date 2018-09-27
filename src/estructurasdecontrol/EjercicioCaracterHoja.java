package estructurasdecontrol;

import java.io.IOException;
import java.util.Scanner;

public class EjercicioCaracterHoja {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		char caracter;
		int altura;
		
		System.out.println("Introduce un caracter: ");
		caracter = (char) System.in.read();
		
		System.out.println("Introduce la altura: ");
		altura = entrada.nextInt();
		
		for (int cont = 1; cont <= altura ; cont++) 
		{
			for (int j = 0; j < cont; j++) 
			{
				System.out.print(caracter);
			}
			System.out.println();
		}
	}
}
