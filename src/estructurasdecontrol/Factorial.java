package estructurasdecontrol;

import java.util.Scanner;

public class Factorial {

	public static void main (String[] args) {
		
		//Scaner para poder introducir a traves de teclado.
		Scanner entrada = new Scanner(System.in);
		
		//Variables
		System.out.println("Introducir numero a factorizar: ");
		int num = entrada.nextInt();
		
		int resAcum = 1 ;
		for (int cont = num; cont >= 1 ; cont --) 
		{
			//Acumular numeros
			resAcum = resAcum * cont;
			
		} 
		System.out.println("El factorial de " + num + " es " + resAcum + ".");
		
		
	}

}

