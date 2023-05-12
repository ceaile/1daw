/*
Crea un programa que pida veinte números enteros por teclado, 
los almacene en un array y
luego muestre por separado la suma de todos los valores positivos y negativos
 */

package ejerciciosArrays;

import java.util.Scanner;

public class Arrays04 {

    public static void main(String[] args) {
        int numero = 0;
        int vector[] = new int[20];
        int positivos = 0;
        int negativos = 0;
        
        System.out.println("Introduce 20 números por teclado: ");
        
        //Almacenar los 20 números en el array:
        
        for (int vueltas = 0; vueltas < 20; vueltas++) { //bucle de pedir por teclado
            Scanner teclado = new Scanner(System.in);
            numero = teclado.nextInt();
            vector[vueltas] = numero; //lo almacena en un array, pero no pide que se imprima 
        }
        
        
        //Mostrar por separado la suma de los valores positivos:
        
        for (int i = 0; i < vector.length; i++) { //recorrer el array
            if (vector[i] > 0) {
            positivos = vector[i] + positivos;
            } else {
                negativos = vector[i] + negativos;
            }
        }
        
        System.out.println("La suma de los positivos del array es: " + positivos);
        System.out.println("La suma de los negativos del array es: " + negativos);
        
        
    }
}

    

