/*
Crea un programa que pida la usuario dos valores N y M y luego cree un array de tamaño N
que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
 */
package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays15 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dime el tamaño del array: ");
        int tamaño = teclado.nextInt(); // = N
        
        System.out.println("Dime el numero a meter en el array: ");
        int numero = teclado.nextInt(); // = M
        
        int vector[] = new int[tamaño];
        
        /* for (int i = 0; i < vector.length; i++) {
            vector[i] = numero;
        }
        
        */
        
        Arrays.fill(vector, numero);
        
        System.out.println(Arrays.toString(vector));
                 
    }
    
}
