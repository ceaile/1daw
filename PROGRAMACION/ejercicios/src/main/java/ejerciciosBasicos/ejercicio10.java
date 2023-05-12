package ejerciciosBasicos;

/* Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta,
producto y división. (Ten en cuenta la división por cero) */
import java.util.Scanner;
public class ejercicio10 {
    public static void main(String args[]) {
        double num1 = 0;
        double num2 = 0;
        double suma = 0;
        double resta = 0;
        double producto = 0;
        double division = 0;
        System.out.println("Introduce un número");
        Scanner escanerNum1 = new Scanner(System.in);
        num1 = escanerNum1.nextDouble();
        System.out.println("Introduce otro número");
        Scanner escanerNum2 = new Scanner(System.in);
        num2 = escanerNum2.nextDouble();
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        System.out.println("La suma de tus números es " + suma);
        System.out.println("La resta de tus números es " + resta);
        System.out.println("La multiplicacion de tus números es " + producto);
        if (num2 == 0) {
            System.out.println("La division no pudo completarse, dado que no puede dividirse entre 0");
        } 
        else {
            division = num1 / num2; 
            System.out.println("La division de tus números es " + division); 
        }
        
        
        
                
    }
    
}
