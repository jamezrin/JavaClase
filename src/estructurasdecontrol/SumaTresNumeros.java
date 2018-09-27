package estructurasdecontrol;

/*
 * 
 * Esta clase suma los 3 primeros numeros naturales.
 * 
 * */


public class SumaTresNumeros 
{

	public static void main(String[] args)
	{
		//Variables
		int suma=0; // Acumulador
		
		//Este bucle calcula la suma de los 3 numeros.
		
		for (int cont=1; cont <=3; cont++)
			suma = suma + cont;
		
		//Mostramos por pantalla el resultado
		System.out.println("La suma es: " + suma);
	}
}
