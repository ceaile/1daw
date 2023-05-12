/*
Realiza un programa que pida dos número enteros A y B, siendo B mayor que A. Luego visualiza
los números desde A hasta B e indicar cuantos hay que sean pares.
 */
package ejerciciosBucles;

import java.util.Scanner;
public class ejercicio21bucles {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número A: ");
        int numA = teclado.nextInt();
        System.out.println("Introduce un número B, mayor que A: ");
        int numB = teclado.nextInt();
        
        int pares = 0;
        
        // numA = 4; numB = 9;
        
        for (int i = numA; i <= numB; i++) {
            System.out.print("[ " + i + " ]");
            if (i % 2 == 0) {
                pares++;
            }
        }
        System.out.println();
        System.out.println(pares + " son pares desde " + numA + " hasta " + numB);
    }
    
}
