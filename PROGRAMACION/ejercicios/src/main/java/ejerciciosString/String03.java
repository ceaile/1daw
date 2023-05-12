/*
Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego
mostrará un código de usuario (en mayúsculas) formado por la concatenación de las tres
primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
“Alcocer” mostrará “LIOTARALC”.
 */
package ejerciciosString;

import java.util.Scanner;


public class String03 {


    public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in);
        
        //crear una cadena de texto y un elemento Scanner e introducirlo
        System.out.println("Introduce un nombre: ");
        String nombre;
        nombre = teclado.nextLine();
        
        System.out.println("Introduce primer apellido: ");
        String apellido1;
        apellido1 = teclado.nextLine();
        
        System.out.println("Introduce segundo apellido: ");
        String apellido2;
        apellido2 = teclado.nextLine();
        
        //crear variable string nueva para introducir la suma (.concat) de los 3 trozos (.substring) de cada variable string
        String trozoTotal = nombre.substring(0, 3).concat(apellido1.substring(0,3)).concat(apellido2.substring(0,3));
        
        System.out.println(trozoTotal.toUpperCase());
        
        
    }
    
}
