package ejerciciosBasicos;

/*
Escribe un programa que lea tres números distintos y nos diga cuál es el mayor
 */

import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        
        
        System.out.println("Introduce un número");
        
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        
        System.out.println("Introduce otro número");
        
        int num2 = teclado.nextInt();
        
        System.out.println("Introduce un tercer número");
        
        
        int num3 = teclado.nextInt();
        
        
        if (num1 > num2){
            
            if (num1 > num3) {
                System.out.println("El número mayor es " + num1);
            }
            else {
                System.out.println("El número mayor es " + num3);
            }
        }
        
        else {
            if (num3 > num2) {
                System.out.println("El número mayor es " + num3);
            }
            else {
                System.out.println("El número mayor es " + num2);
            }
        }
        
    }
    
}
