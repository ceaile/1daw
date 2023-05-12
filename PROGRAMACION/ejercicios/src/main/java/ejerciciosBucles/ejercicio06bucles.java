package ejerciciosBucles;

/*
Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído
algún número negativo o no.
 */

import java.util.Scanner;
public class ejercicio06bucles {
    public static void main(String[] args) {
        int cont = 0;
        boolean sw = false;
        int num = 0;
        while (cont <= 10) {
            System.out.println("Introduce un número " + cont + "/100: ");
            Scanner num1 = new Scanner(System.in);
            num = num1.nextInt();
            if (num < 0){
                sw = true;      
            }
            cont = cont + 1;
        }
        
        if (sw = false) {
            System.out.println("No se han introducido números negativos.");
        }
        else {
            System.out.println("Se han introducido números negativos.");
        }
        
    }
    
}
