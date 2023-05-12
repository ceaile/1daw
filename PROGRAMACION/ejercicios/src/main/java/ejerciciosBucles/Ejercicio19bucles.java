/*
Realiza un programa que lea un número y a continuación escriba el carácter “*” tantas veces
igual al valor numérico leído. En aquellos casos en que el valor leído no sea positivo se deberá
escribir un único asterisco
 */
package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio19bucles {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número para sacar ese número en asteriscos: ");
        int num = teclado.nextInt();
        
        if (num <= 0) {
            num = 1;
        }
        
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }
        
        
    }
    
}
