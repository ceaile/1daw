/*
Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el
mínimo. Implementa y utiliza la función:
int minimo(int a, int b) // Devuelve el menor entre a y b
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones03_elMenor {

    public static int elMenor(int a, int b) {
        int minimo;
        if (a > b) {
            minimo = b;
        } else {
            minimo = a;
        }
        return minimo;
    } 

    public static void main(String[] args) {
        
        System.out.println("Introduce un número para compararlo con otro: ");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        
        System.out.println("Introduce otro número para compararlo con el otro: ");
        int num2 = teclado.nextInt();
        
        System.out.println(elMenor(num1, num2));
    }

}
