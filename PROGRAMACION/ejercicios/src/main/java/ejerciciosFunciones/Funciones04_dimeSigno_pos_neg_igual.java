/*
Escribe un programa que pida un número entero por teclado y muestre por pantalla si es
positivo, negativo o cero. Implementa y utiliza la función:
int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones04_dimeSigno_pos_neg_igual {

    public static int dimeSigno(int a) {
        int resultado;
        if (a > 0 ) {
            resultado = 1;
        } else if (a == 0) {
            resultado = 0;
        } else {
            resultado = -1;
        }
        return resultado;
    }
    public static void main(String[] args) {
        
        System.out.println("Introduce un número para saber si es positivo, negativo o cero: ");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        
        System.out.println(dimeSigno(num1));
    }
    
}
