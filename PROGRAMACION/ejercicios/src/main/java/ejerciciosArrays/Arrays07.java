/*
Crea un programa que pida dos valores enteros P y F, 
luego cree un array que contenga todos los valores desde P hasta F, 
y lo muestre por pantalla.
 */
package ejerciciosArrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays07 {
    public static void main(String[] args) {
        
        System.out.println("Introduce un número: ");
        Scanner teclado = new Scanner(System.in);
        int P = teclado.nextInt();
        
        System.out.println("Introduce número más grande: ");
        int F = teclado.nextInt();
        
        int R = F - P; // ????
        
        int vector[] = new int[R + 1]; // ??????
        
        //PRUEBA, A VER QUÉ PASA
        vector[0] = P; 
        //System.out.print(vector.length);
        //vector[(vector.length-1)] = F;
        
        
        
        for (int i = 0; i < (R+1); i++) {
            vector[i] = P++;
            System.out.print(vector[i] + " ");
        }
        //System.out.print(vector[vector.length-1]);
        //System.out.print(Arrays.toString(vector));
        
                
    }
    
}
