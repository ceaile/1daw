/*
Implementa un programa que pida al usuario introducir por teclado una ruta del sistema de
archivos (por ejemplo, “C:/Windows” o “Documentos”) y muestre información sobre dicha ruta (ver
función más abajo). El proceso se repetirá una y otra vez hasta que el usuario introduzca una ruta
vacía (tecla intro). Deberá manejar las posibles excepciones.
Necesitarás crear la función void muestraInfoRuta(File ruta) que dada una ruta de tipo File haga
lo siguiente:
● Si es un archivo, mostrará por pantalla el nombre del archivo.
● Si es un directorio, mostrará por pantalla la lista de directorios y archivos que contiene (sus
nombres). Deberá mostrar primero los directorios y luego los archivos.
● En cualquier caso, añade delante del nombre la etiqueta [*] o [A] para indicar si es un
directorio o un archivo respectivamente.
● Si el path no existe lanzará un FileNotFoundException.
 */
package ejerciciosFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ejercicioA1 {

    public static void main(String[] args) {//----------------------------------

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe la ruta de archivos donde quieras trabajar:");
        System.out.println("Cuando quieras parar de añadir rutas deja el espacio en blanco.");

        String ruta = "";
        try
        {
            do
            {
                ruta = teclado.nextLine();
                //D:\FP_DAW\PROGRAMACION\Ejercicios_Progr\Ejercicios-progr\Documentos\Libros

                File f = new File(ruta);

                if (f.exists())
                {
                    System.out.println("F existe.");
                    muestraInfoRuta(f);
                    

                } else
                {
                    throw new FileNotFoundException();
                }

            } while (!ruta.equalsIgnoreCase(""));

        } catch (Exception e)
        {
            System.out.println("EXCEPCION: has metido algo raro por teclado O el archivo no existe.");
            System.out.println();
        }

    }//fin main

    static public void muestraInfoRuta(File file) {
            
            if (file.isFile())
            {
                System.out.println("Nombre del archivo: " + file.getName());
            } else
            {
                System.out.println("Nombre del directorio: " + file.getName());
                File listaArchivos[] = file.listFiles(); //para recordarme que es un array de Files
                
                for (File f : listaArchivos ) {
                    if (f.isDirectory()) System.out.println("[*]" + f.getName());
                }
                for (File f : listaArchivos ) {
                    if (f.isFile()) System.out.println("[A]" + f.getName());
                } 
            }
            System.out.println("Ruta madre: " + file.getParent());
    }
    
}//fin
