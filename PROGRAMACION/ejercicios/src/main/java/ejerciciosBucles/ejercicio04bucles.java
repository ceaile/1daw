package ejerciciosBucles;

/*
Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
por teclado
 */

import java.util.Scanner;
public class ejercicio04bucles {
    public static void main(String[] args) {
        Scanner esc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int n = esc.nextInt();
        for (int m = 1 ; m <= n ; m++ ) {
            System.out.println(m);
        }
            
        
                
    }
    
}
