/*
Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último
dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.
 */
package ejerciciosBucles;
import java.util.Scanner;
public class Ejercicio17bucles {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int total = 0;
        int fallados = 0;
        int num = 0;
        int ultimo = 0;
        
        do {
            System.out.println("Introduce números, siempre mayor que el anterior.");
            num = teclado.nextInt();
            
            total++;
            if (num >= ultimo ) {
                ultimo = num;
            } else {
                
                fallados++;
                System.out.println("Menor que el anterior. Introduce un número mayor");
            }
            
            
        } while (num != 0);
        
        if (num == 0) {
            total--;
        }
        
        
        
        
        
       
    }
    
}
