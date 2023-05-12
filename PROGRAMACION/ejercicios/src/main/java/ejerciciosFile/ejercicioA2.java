/*
Partiendo de una copia del programa anterior, modifica la función muestraInfoRuta:
● En el caso de un directorio, mostrará la lista de directorios y archivos en orden alfabético. Es
decir, primero los directorios en orden alfabético y luego los archivos en orden alfabético. Te
será útil Arrays.sort().
● Añade un segundo argumento ‘boolean info’ que cuando sea ‘true’ mostrará, junto a la
información de cada directorio o archivo, su tamaño en bytes y la fecha de la última
modificación. Cuando ‘info’ sea ‘false’ mostrará la información como en el ejercicio anterior.
 */
package ejerciciosFile;

import java.io.File;
import java.util.Date;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ejercicioA2 {

    public static void main(String[] args) {//----------------------------------

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe la ruta de archivos donde quieras trabajar:");
        System.out.println("Cuando quieras parar de añadir rutas deja el espacio en blanco.");

        String ruta = "";
        //D:\FP_DAW\PROGRAMACION\Ejercicios_Progr\Ejercicios-progr\Documentos\Libros
        do
        {
            try
            {
                ruta = teclado.nextLine();
                File f = new File(ruta);

                if (f.exists())
                {
                    System.out.println("El archivo existe.");
                    muestraInfoRuta(f, true);

                } else if (!ruta.equalsIgnoreCase("") && f.exists() == false)
                {
                    throw new FileNotFoundException("EXCEPCION FILE NOT FOUND");
                }

            } catch (Exception e) //puede coger InputMismatchException u otra excepcion
            {
                System.out.println("EXCEPCION: has metido algo raro por teclado O el archivo no existe.");
                System.out.println();
            }
        } while (!ruta.equalsIgnoreCase(""));

    }//fin main

    static public void muestraInfoRuta(File file, boolean info) {

        if (file.isFile())
        {
            System.out.println("Nombre del archivo: " + file.getName());
        } else
        {
            System.out.println("Nombre del directorio: " + file.getName());
            File[] arrayArchivos = file.listFiles(); //para recordarme que es un array de Files
            ArrayList<File> listaDirs = new ArrayList<File>();
            ArrayList<File> listaFich = new ArrayList<File>();

            for (File f : arrayArchivos)
            {
                if (f.isDirectory())
                {
                    listaDirs.add(f);
                } else
                {
                    listaFich.add(f);
                }
            }
            Collections.sort(listaDirs);
            Collections.sort(listaFich);

            for (File f : listaDirs)
            {
                System.out.println("[*]" + f.getName());
                if (info)
                {
                    System.out.println("Tamaño en bytes: " + f.length());
//                  System.out.println("Ultima modificacacion: " + f.lastModified());
                    Date fecha = new Date(f.lastModified());
                    System.out.println("Ultima modificacion: " + fecha.toString());
                }
            }
            for (File f : listaFich)
            {
                System.out.println("[A]" + f.getName());
                if (info)
                {
                    System.out.println("Tamaño en bytes: " + f.length());
//                  System.out.println("Ultima modificacacion: " + f.lastModified());
                    Date fecha = new Date(f.lastModified());
                    System.out.println("Ultima modificacion: " + fecha.toString());
                }
            }
        }
        System.out.println("Ruta madre: " + file.getParent());
    }
    
    
}//fin-fin
