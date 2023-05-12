/*
Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). 
Supondremos que
el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). 
Un palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
Por ejemplo:
Amigo no gima
Dabale arroz a la zorra el abad
Amo la pacífica paloma
A man a plan a canal Panama
 */
package ejerciciosString;

import java.util.Scanner;

public class String05 {

    public static void main(String[] args) {
        
        //crear y leer string original
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena de texto: ");
        String txtOriginal;
        txtOriginal = teclado.nextLine();
        
        String txtRev = ""; //inicializar donde guardaré el string al revés
        
        int largo = txtOriginal.length(); //meter longitud en una variable int, no funciona con array.length
        
        //darle la vuelta al array de caracteres
        for (int i = largo -1; i >= 0; i-- ) {
            txtRev = txtRev + txtOriginal.charAt(i);
        }
        
        //comparar strings
        
        /* COMPROBACION, NO BORRAR
        System.out.println(txtOriginal.toLowerCase().replace(" ", ""));
        System.out.println(txtRev.toLowerCase().replace(" ", "")); 
        */
        
        if (txtRev.toLowerCase().replace(" ", "").equals(txtOriginal.toLowerCase().replace(" ", "")))
        {
            System.out.println("Son iguales, congrats ");
        } else {
            System.out.println("No son iguales, sorry ");
        }
                
                
        
        
        
    }

}
