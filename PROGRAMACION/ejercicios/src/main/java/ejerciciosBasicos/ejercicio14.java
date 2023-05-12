package ejerciciosBasicos;

/*
Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
 */

import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner escanerNum1 = new Scanner(System.in);
        int num1 = escanerNum1.nextInt();
        System.out.println("Introduce otro número");
        Scanner escanerNum2 = new Scanner(System.in);
        int num2 = escanerNum2.nextInt();
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
        }
        else if (num1 < num2) {
            System.out.println("El número " + num2 + " es mayor que el número " + num1);
        }
        else {
            System.out.println("Los números introducidos son iguales");
        }
    }
    
}
