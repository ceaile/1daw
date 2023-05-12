package ejerciciosBasicos;

/* Escribe un programa que lee 2 números y muestra el mayor */
import java.util.Scanner;
public class ejercicio11 {
    public static void main(String[] args) {
        System.out.println("Escribe un número");
        Scanner escanerNum1 = new Scanner(System.in);
        int num1 = escanerNum1.nextInt();
        System.out.println("Escribe otro número");
        Scanner escanerNum2 = new Scanner(System.in);
        int num2 = escanerNum2.nextInt();
        if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que el número " + num2);
        } else if (num1 == num2) {
            System.out.println("Los números introducidos son iguales.");
        } else {
            System.out.println("El número " + num2 + " es mayor que " + num1);
        }
        
    }
    
}
