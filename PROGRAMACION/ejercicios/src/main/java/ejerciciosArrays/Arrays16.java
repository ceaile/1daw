/*
Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
 */
package ejerciciosArrays;

import java.util.Arrays;

public class Arrays16 {


    public static void main(String[] args) {
        
        int N = 10;
        
        //metodo de gauss para calcular el largo del vector. La suma de nº consecutivos del 1 al 10
        //int largo = N * ((1+N)/2); // = P
        
        int vector[] = new int[55];
        int inicio = 0; // = j
        int fin = 1; // = k

        //recorre los nº del 1 al 10, los valores, no las posiciones!
        for (int v = 1; v <= 10; v++){
            Arrays.fill(vector, inicio, fin, v);
            inicio = fin;
            fin = fin + v + 1;
        }
        
        //sacarlo por pantalla
        System.out.println(Arrays.toString(vector));
    }
    
}
