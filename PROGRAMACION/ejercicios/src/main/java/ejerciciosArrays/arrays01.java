package ejerciciosArrays;

/*
 * Crea un programa que pida diez números reales por teclado, los almacene en un array, y
 * luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 */

import java.util.Scanner;
import java.util.Arrays;

public class arrays01 {
    public static void main(String[] args) {
        
        int array1[] = new int[10];
        
        Scanner teclado = new Scanner(System.in); //pide por teclado
        
        for (int vueltas = 0; vueltas < array1.length; vueltas++) {
            System.out.println("Escribe un número: ");
            array1[vueltas] = teclado.nextInt(); 
        }
        System.out.println(Arrays.toString(array1));
                
        
        
        
        
        
    }
    
}