/*
Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra
de la cadena en una línea distinta.
 */

package ejerciciosString;

import java.util.Scanner;

public class String01 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        //crear una cadena de texto y un elemento Scanner e introducirlo
        System.out.println("Introduce una cadena de texto: ");
        String texto1;
        texto1 = teclado.nextLine();
        
        //comprobacion
        System.out.println(texto1);
        
        //BUSCAR METODO .SPLIT en array de strings
        
        String array[] = texto1.split(" "); //separa cada vez que nota un espacio
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        
    }
}