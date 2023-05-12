package ejerciciosBucles;

/* Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando
cuántos son positivos y cuantos negativos.*/

import java.util.Scanner;
public class ejercicio07bucles {
    public static void main(String[] args) {
        int pos = 0;
        int neg = 0;
        int cont = 0;
        int num = 0;
        while (cont <= 10) {
            System.out.println("Escribe un número " + cont + "/10:" );
            Scanner num1 = new Scanner(System.in);
            num = num1.nextInt();
            if (num < 0) {
                neg++;
            } else {
                pos++;
            }
            cont++;
        }
        System.out.println("Se han encontrado " + pos + " números positivos.");
        System.out.println("Se han encontrado " + neg + " números negativos.");
    }
    
}
