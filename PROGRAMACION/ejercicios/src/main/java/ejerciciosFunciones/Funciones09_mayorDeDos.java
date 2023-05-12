/*
Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
tres) y nos devuelva el máximo de los dos valores.
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones09_mayorDeDos {

    //FUNCION
    public static int mayorDeDos(int a, int b) {
        if (a > b) {
            return a;
        } else if (a == b) {
            return a;
        } else {
            return b;
        }
    } 
            
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayor = 0;
        
        System.out.println("Introduce un número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce un segundo número: ");
        int num2 = teclado.nextInt();
        System.out.println("Introduce un tercer número: ");
        int num3 = teclado.nextInt();
        
        if (num1 > num2){
            mayor = num1;
        } else if (num1 == num2) {
            mayor = num1;
        }
        else {
            mayor = num2;
        }
        
        System.out.println("El número más grande es: " + mayorDeDos(mayor, num3));
            
    }
    
}
