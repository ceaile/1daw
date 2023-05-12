/*
Implementa un programa que pida al usuario, un nombre de archivo A para lectura y otro nombre
de archivo B para escritura. Leerá el contenido del archivo A (por ejemplo ‘usa_personas.txt’) y lo
escribirá ordenado alfabéticamente en B (por ejemplo ‘usa_personas_sorted.txt’).
 */
package ejerciciosFile;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ejercicioB3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        File fichLectura;
        File fichEscritura;
        ArrayList<String> listaPersonas = new ArrayList();

        try {
            System.out.println("Escribe la ruta del archivo A (lectura)");
            String rutaLectura = teclado.nextLine(); //fake, usará la ruta siguiente
            rutaLectura = "Documentos" + File.separator + "usa_personas.txt";
            fichLectura = new File(rutaLectura);
            System.out.println();

            if (fichLectura.exists() == false) {
                throw new Exception("El fichero de lectura no existe");

            } else {
                Scanner lector = new Scanner(fichLectura);
                System.out.println("Escribe la ruta del archivo B (escritura). Introduce un fichero que no exista.");
                String rutaEscritura = teclado.nextLine(); //fake, usará la ruta siguiente
                rutaEscritura = "Documentos" + File.separator + "usa_personas_sorted.txt";
                System.out.println();
                fichEscritura = new File(rutaEscritura);

                FileWriter escritor = new FileWriter(fichEscritura, false);
                while (lector.hasNextLine()) {
                    listaPersonas.add(lector.nextLine());
                }
                Collections.sort(listaPersonas);
                for (String i : listaPersonas) {
                    escritor.write(i + "\n");
                }
                escritor.close();
                lector.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
