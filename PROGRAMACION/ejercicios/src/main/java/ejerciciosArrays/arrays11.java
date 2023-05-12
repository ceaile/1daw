/*
Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 */
package ejerciciosArrays;

import java.util.Arrays;

public class Arrays11 {
    public static void main(String[] args) {
        
        // creación e inicialización de arrays
        int array1a100[] = new int[100];
        int array100a1[] = new int[100];
        
        // array del 1 al 100
        for (int i = 0; i < array1a100.length; i++) {
            array1a100[i] = i +1;
        }
        
        // array 100 a 1
        for (int i = 0; i < array100a1.length; i++) {
            array100a1[i] = array1a100[(array1a100.length - 1) - i]; // -i para ir restando
            
            /* array.length - 1 porque quieres que use la posición última,
            y si lo dejas en array.length lo que entiende es el 100 (el tamaño
            que escribiste en primer lugar como longitud del array */
            
        }
        
        //Sacar por pantalla ambos
        System.out.println(Arrays.toString(array1a100));
        System.out.println(Arrays.toString(array100a1));
    }
    
}
