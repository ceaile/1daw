package ejerciciosBucles;

/*
Realiza un programa que calcule el valor A elevado a B (A^B) sin hacer uso del operador de
potencia (^), siendo A y B valores introducidos por teclado, y luego muestre el resultado por
pantalla
 */

import java.util.Scanner;
public class ejercicio12bucles {
    public static void main(String[] args) {
        
        int a = 0;
        int b = 0;
        int veces = 0;
        
        System.out.println("Dime el valor de A: ");
        Scanner teclado1 = new Scanner(System.in);
        a = teclado1.nextInt();
        
        System.out.println("Dime el valor de B: ");
        Scanner teclado2 = new Scanner(System.in);
        b = teclado2.nextInt();
        
        if (b < 0) {
            veces = -b;
        } else {
            veces = b;
        }
        int expo = 1;
        for (int cont = 1 ; cont <= veces ; cont++ ) {
            expo = expo * a;
        }
        if (b < 0) {
            expo = 1 / expo;
        }
        System.out.println(" El número " + a + " elevado a " + b + " es: " + expo );
        
        
    }
    
}
