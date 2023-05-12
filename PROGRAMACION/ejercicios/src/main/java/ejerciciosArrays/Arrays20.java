/*
Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
mostrará por pantalla si N existe en el array, además de cuantas veces
 */
package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays20 {

    
    public static void main(String[] args) {
        
        //crear y rellenar vector de aleatorios
        int vector[] = new int[1000];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*100);
        }
        
        System.out.println("Escribe un número para verificar si se encuentra en el array: ");
        
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        
        //buscar N, decir cuántas veces, y decir si existe
        int contador = 0;
        for (int i = 0; i < vector.length; i++) 
            if (vector[i] == N) {
                contador++;
                
            }
        
        if (contador > 0) {
            System.out.println(N + " existe varias veces en el array. En concreto: " + contador + " veces.");
        } else {
            System.out.println("El número que introduciste no se encuentra.");
        }
            
            
        
        
        
    }
    
}
