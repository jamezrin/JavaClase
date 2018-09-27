package estructurasdecontrol;

import java.util.Scanner;

public class MayoresMenores {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		//Variables que necesito
		int nota;
		int menq = 0;
		int mayq = 0;
		int entre = 0;
		
		//Bucle que vaya pidiendo numeros
		for (int i = 1; i <= 6; i++) 
		{
			System.out.println("Introduzca " + i + "/6");
			nota = entrada.nextInt();
			if (nota <= 15) {
				menq++;
			} else if  (nota >= 55) {
				mayq++;
			} else if (nota >= 45) {
				entre++;
			}
		}
		System.out.println("Hay " + menq + " números menores que 15");
		System.out.println("Hay " + mayq + " números mayores que 55");
		System.out.println("Hay " + entre + " números entre 45 y 55"); 

	}

}
