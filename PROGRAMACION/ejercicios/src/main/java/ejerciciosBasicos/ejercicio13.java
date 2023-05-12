package ejerciciosBasicos;


/**
Escribe un programa que lee dos números y los visualiza en orden ascendente
 */
import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner escanerNum1 = new Scanner(System.in);
        int num1 = escanerNum1.nextInt();
        System.out.println("Introduce otro número");
        Scanner escanerNum2 = new Scanner(System.in);
        int num2 = escanerNum2.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + ", " + num2);
        } else {
        System.out.println(num2 + ", " + num1) ;
          }
       
    }
    
}
