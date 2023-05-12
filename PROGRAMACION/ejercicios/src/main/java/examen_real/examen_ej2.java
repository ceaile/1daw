/*
Patria Mirabal
Minerva Mirabal
María Teresa Mirabal
Lucrecia Pérez
Ana Orantes
Rocío Caíz
Marta del Castillo
Mahsa Amini
Cecilia Monzón
Freshta Kohistani. 
 */
package examen_real;

import java.util.Scanner;
import java.util.Arrays;

public class examen_ej2 {

    public static void main(String[] args) {
        
        //creamos tamaño del array
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array de strings");
        
        int tamaño = teclado.nextInt();
        teclado.nextLine(); //esta mierda me jodió la vida
        String[] vectorString = new String[tamaño];
        
        //bucle de introducir nombres
        System.out.println("Introduce nombres: ");
        for (int i = 0; i < vectorString.length; i++) {
            
            String nombre = teclado.nextLine();
            
            vectorString[i] = nombre;
            //comprobación: System.out.println(vectorString[i]);
            
        }
        
        //comprobacion leer sin bucle
        System.out.println("comprobacion leer sin bucle");
        System.out.println("Los nombres son: " + Arrays.toString(vectorString));
  
        
        /*
        meter nombres a mano para comprobacion
        
        vectorString[0] = "Patria Mirabal";
        vectorString[1] = "Minerva Mirabal";
        vectorString[2] = "María Teresa Mirabal";
        vectorString[3] = "Lucrecia Pérez";
        vectorString[4] = "Ana Orantes";
        vectorString[5] = "Rocío Caíz";
        vectorString[6] = "Marta del Castillo";
        vectorString[7] = "Mahsa Amini";
        vectorString[8] = "Cecilia Monzón";
        vectorString[8] = "Freshta Kohistani";
        */
        
        /*
        longitud nombre más corto
        longitud media
        longitud maxima
        numero mujeres por debajo de la media
        */
        
        
        

        

        
        
       
        
        
    }
    
    
}
