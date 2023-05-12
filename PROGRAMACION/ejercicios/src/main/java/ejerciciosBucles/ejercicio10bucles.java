package ejerciciosBucles;

/*
Realiza un programa que lea una secuencia de notas (con valores que van de 0 a 10) que
termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 */

import java.util.Scanner;
public class ejercicio10bucles {
    public static void main(String[] args) {
        
        boolean sw1 = false;
        int nota = 0;
        
        System.out.println("Introduce una nota: ");
        Scanner teclado = new Scanner(System.in);
        nota = teclado.nextInt();
        
        while (nota != -1) {
            if (nota == 10) {
                sw1 = true;
            }
            System.out.println("Introduce una nota: ");
            nota = teclado.nextInt();
        }
        if (sw1 = true) {
            System.out.println("Hay al menos una nota de 10.");
        } else {
            System.out.println("No hay ninguna nota de 10");
        }
        
    }
    
}
