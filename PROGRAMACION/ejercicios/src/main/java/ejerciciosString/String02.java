/*
Crea un programa que pida dos cadenas de texto por teclado 
y luego indique si son iguales,
además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 */
package ejerciciosString;

import java.util.Scanner;

public class String02 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //crear una cadena de texto y un elemento Scanner e introducirlo
        System.out.println("Introduce una cadena de texto: ");
        String texto1;
        texto1 = teclado.nextLine();
        
        //lo mismo
        System.out.println("Introduce otra cadena de texto: ");
        String texto2;
        texto2 = teclado.nextLine();
        
        //comparar
        if (texto1.equalsIgnoreCase(texto2)) {
            System.out.println("Las dos cadenas que escribiste son iguales.");
        } else {
            System.out.println("Las dos cadenas que escribiste no son iguales.");
        }
        
        
        
    }
    
}
