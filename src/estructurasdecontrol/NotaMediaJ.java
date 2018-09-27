package estructurasdecontrol;

import java.util.Scanner;

public class NotaMediaJ {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int nota = 0;
        int total = 0;
        int acumulador = 0;
        
        do 
        {

            System.out.println("Introduzca una nota:");
            nota = entrada.nextInt();

            if (nota != -99) {
                total = total + nota;
                acumulador++;
            }
        } while (nota != -99);

        System.out.println (acumulador);
        System.out.println(total);
        double media = total/acumulador;

        System.out.println("La media total es " + media + ".");
    }
}