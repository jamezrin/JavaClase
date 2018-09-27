package estructurasdecontrol;

import java.util.Scanner;

public class Clase {
	public static void main(String[] args) {
		
		//Introducir notas
		Scanner entrada = new Scanner(System.in);

		//Introducir variables usuario
		System.out.println("Introduce la base: ");
		int nBase = entrada.nextInt();
		
		System.out.println("Introduce el exponente: ");
		int nExp = entrada.nextInt();
		
		int resPot = 1;
		
		for (int r = 1; r <= nExp ; r++) {
			resPot = resPot * nBase;
		}
		
		System.out.println("El resultado de la potencia es: " + resPot);
		
		
	}
}
