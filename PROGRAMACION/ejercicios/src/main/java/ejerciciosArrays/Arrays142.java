/*
Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla.
 */
package ejerciciosArrays;

import java.util.Arrays;

public class Arrays142 {


    public static void main(String[] args) {
        
        
        int vector[] = new int[10];

        //variables
        int N = 1;
        
              
        for (int i = 0; i < vector.length; i++) {
            for (int veces = 1; veces <= N; veces++) {
                vector[i] = N;
                i++;
            }
        }
        System.out.println(Arrays.toString(vector));
    }
    
}
