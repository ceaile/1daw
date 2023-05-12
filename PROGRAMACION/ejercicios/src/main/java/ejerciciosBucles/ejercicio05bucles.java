package ejerciciosBucles;

/*
Realiza un programa que lea un número positivo N y calcule y visualice su factorial N!
Siendo el factorial
 */

import java.util.Scanner;
public class ejercicio05bucles {
    public static void main(String[] args) {
        int factorial = 0;
        Scanner esc = new Scanner(System.in);
        System.out.println("Escribe un número para calcular su factorial");
        int n = esc.nextInt();
        factorial = n;
        while (n >= 2) {
            n = n - 1;
           factorial = factorial * n; 
        }
        System.out.println("Su factorial es " + factorial);
            
    }
}
    

