/*
Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
muestre por pantalla.
 */
package ejerciciosArrays;

import java.util.Arrays;

public class Arrays14 {

    public static void main(String[] args) {

        int vector[] = new int[10];

        //variables
        int N = 1;
        int veces = 0;
              
        for (int i = 0; i < vector.length; i++) {
            /*
            cuando veces llegue a 0 necesito comprobarlo de nuevo
            para arreglarlo y que no se rompa a la siguiente vuelta
            */   
            if (veces == 0) {
                   veces = N;
               }
                /* 
                meter en la posición del vector el numero N;
                restar las veces hasta llegar a 0 para que meta en la posicion
                el mismo numero y no pase al siguiente hasta hacer la comprobación
                */
                
               vector[i] = N;
               veces--;
               
               //hacer la comprobacion
               
               if (veces == 0) {
                   N++;
               }
        }
        System.out.println(Arrays.toString(vector));        
    }
}
