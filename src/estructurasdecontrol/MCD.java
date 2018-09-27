package estructurasdecontrol;

import java.util.Scanner;

public class MCD 
{
	/*
	 * 
	 * Esta clase calcula el máximo común divisor de dos números enteros.
	 * 
	 * */

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		//Introducimos pedimos los numeros por teclado.
		System.out.println("Introduce el primer número: ");
		//Introducimos numero 1.
		int num1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo número: ");
		int num2 = entrada.nextInt();
		
		//Calculamos el maximo comun divisor.
		while (num1 != num2)
		{
			if (num1 > num2)
				num1= num1 - num2;
			else 
				num2= num2 - num1;
		}
		//Imprimir en pantalla el resultado.
		System.out.println("El maximo comun divisor es: " + num1);
	}
}
