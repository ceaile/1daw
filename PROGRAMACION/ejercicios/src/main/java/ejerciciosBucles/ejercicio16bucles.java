/*
Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
 */
package ejerciciosBucles;

import java.util.Scanner;

public class ejercicio16bucles {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número para ver si es primo.");

        int num = teclado.nextInt();
        boolean resultado = true;
        
        if (num <= 1)
        {
            resultado = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0) {
                    resultado = false;
                }
            }            
        }
        
        if (resultado) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }

    }

}
