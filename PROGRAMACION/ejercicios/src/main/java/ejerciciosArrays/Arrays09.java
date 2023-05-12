/*
Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N.
 */


package ejerciciosArrays;

//import java.util.Arrays;

import java.util.Scanner;

public class Arrays09 {

 
    public static void main(String[] args) {
        
        int vector[] = new int[100];
        
        //bucle para rellenar de números aleatorios
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(1 + Math.random()*10);
        }
        
        System.out.println("Introduce un número: ");
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        
        //bucle para comparar con N
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == N){
                //System.out.print(Arrays.toString(vector)); ????
                System.out.print(vector[i] + " ");
            }
        }
        
        
        
    }
    
}
