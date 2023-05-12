/*
Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre por pantalla
los números desde 1 hasta N, uno en cada línea, repitiendo cada número tantas veces como su
valor.
 */
package ejerciciosBucles;

import java.util.Scanner;
public class ejercicio20bucles {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número entre 0 y 20: ");
        int num = teclado.nextInt();
        
        //comprobar que no es menos de 1 ni mayor de 20
        if (num < 1) {
            num = 1;
        } else if (num > 20) {
            num = 20;
        }
        
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
            
        
    }
    
}
