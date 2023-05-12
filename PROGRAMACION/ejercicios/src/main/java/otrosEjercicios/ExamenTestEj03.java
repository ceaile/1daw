/*
Necesitamos crear un programa para almacenar en una tabla el número de huevos
puestos por dos hembras de pájaro, una es un Carbonero y la otra un Petirrojo.
Queremos almacenar las puestas de las primaveras del 2018, 2019, 2020 y 2021.
El programa tiene que utilizar un array de dos dimensiones para almacenar estos
valores.

El usuario introducirá los números de huevos puestos por teclado y luego el
programa mostrará la mínima, máxima y media para cada pájaro.
Por ejemplo, para los siguientes datos:

             2018    2019    2020    2021
Carbonero   [dato]  [dato]  [dato]  [dato]  
Petirrojo   [dato]  [dato]  [dato]  [dato]  

El programa pediría por teclado 3, 3, 4, 2 para la hembra de Carbonero y 3, 2, 0, 3
para el petirrojo e imprimiría por pantalla:
La hembra de Carbonero puso mínimo 2 huevos, máximo 4 y de media 3
La hembra de Petirrojo puso mínimo 0 huevos, máximo 3 y de media 2
 */
package otrosEjercicios;

import java.util.Scanner;
import java.util.Arrays;

public class ExamenTestEj03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        int matriz[][] = new int[2][4]; //tamaño de la tabla requerido
        

        System.out.println("Introduce los datos de puesta de la hembra de carbonero: ");
        
        /*
        Como queremos solo colocar datos en una fila de la matriz,
        prescindimos del bucle exterior típico de recorrer matrices,
        y solo usamos el interior, concretando la posición.
        */
        
        int sumaC = 0;
        int sumaP = 0;
        int mediaC = 0;
        int mediaP = 0;
        
        for (int i = 0; i < matriz[0].length; i++)
        {
            matriz[0][i] = teclado.nextInt();
            sumaC += matriz[0][i];
        }

        System.out.println("Introduce los datos de puesta de la hembra de petirrojo: ");

        for (int i = 0; i < matriz[1].length; i++)
        {
            matriz[1][i] = teclado.nextInt();
            sumaP += matriz[1][i];
        }
        
        //CALCULAMOS EL MÍNIMO, EL MÁXIMO Y LA MEDIA DE CADA HEMBRA
        
        Arrays.sort(matriz[0]);
        Arrays.sort(matriz[1]);
        
        //COMPROBACIONES, NO BORRAR
        //System.out.println(Arrays.toString(matriz[0]));
        //System.out.println(Arrays.toString(matriz[1]));
        
        int minC = matriz[0][0];
        int minP = matriz[1][0];
        int maxC = matriz[0][matriz[0].length - 1];
        int maxP = matriz[0][matriz[1].length - 1];
        
        mediaC = sumaC / matriz[0].length;
        mediaP = sumaP / matriz[1].length;
        
        //IMPRIMIR CONTENIDO CONTENIDO
        System.out.println("La hembra de carbonero puso un mínimo de " + minC + " huevos, un máximo de " + maxC + " y una media de " + mediaC);
        System.out.println("La hembra de petirrojo puso un mínimo de " + minP + " huevos, un máximo de " + maxP + " y una media de " + mediaP);
        
        
        
    }

}
