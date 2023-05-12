/*
/*
6)
Implementa una clase Gato con los atributos nombre y edad, un constructor con
parámetros, los getters y setters, además de un método imprimir() para mostrar los datos de
un gato. El nombre de un gato debe tener al menos 3 caracteres y la edad no puede ser
negativa. Por ello, tanto en el constructor como en los setters, deberás comprobar que los
valores sean válidos y lanzar una ‘Exception’ si no lo son. Luego, haz una clase principal con
main para hacer pruebas: instancia varios objetos Gato y utiliza sus setters, probando
distintos valores (algunos válidos y otros incorrectos). Maneja las excepciones.

 */
package ejerciciosExcepciones;

import java.util.ArrayList;
import java.util.Scanner;

public class e6 {

    public static void main(String[] args) {

        System.out.println("EJERCICIO 6:"); //----------------------------------
        //GATO BIEN HECHO, COMPROBAMOS LOS GETTERS Y SETTERS MAL HECHOS PRIMERO
        try
        {
            System.out.println("Intentaremos construir tres gatos.");
            System.out.println("Uno con los datos correctos.");
            Gato luna = new Gato("Luna", 5);

            System.out.println();
            System.out.println("Comprobamos que se ha construido el primer gato. Sus datos:");
            System.out.println(luna.toString());

            try
            {
                System.out.println();
                System.out.println("Intentaremos cambiar a un nombre muy corto  y saltará la excepcion");
                luna.setNombre("Lu");
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println("");
            }

            System.out.println("Comprobamos de nuevo su nombre para ver que no se ha cambiado:");
            System.out.println(luna.getNombre());
            System.out.println("");

            try
            {

                System.out.println();
                System.out.println("Intentaremos cambiar la edad de Luna a -1 y saltará la excepcion");
                luna.setEdad(-1);
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println("");
            }

            System.out.println("Comprobamos de nuevo su edad para ver que no se ha cambiado:");
            System.out.println(luna.getEdad());
            System.out.println("");

            try
            {

                System.out.println("Probamos un setter correcto de nombre y otro de edad");
                System.out.println("No saltará una excepción.");
                luna.setEdad(6);
                luna.setNombre("Lunala");
                System.out.println("Nueva edad de Luna: " + luna.getEdad());
                System.out.println("Nuevo nombre de Luna: " + luna.getNombre());
                System.out.println("");
                System.out.println("");
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println("");
            }

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("");

        }

        //OTRO GATO MAL HECHO
        try
        {

            System.out.println("Intentamos otro gato con el nombre de menos de 3 chars");
            Gato gatoMalNombre = new Gato("An", 5);

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("");
        }

        //OTRO GATO MAL HECHO
        try
        {
            System.out.println("Otro con la edad menor de 0");
            Gato gatoMalaEdad = new Gato("Anabel", -1);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("");
        }

    }//fin main

}//fin programa
