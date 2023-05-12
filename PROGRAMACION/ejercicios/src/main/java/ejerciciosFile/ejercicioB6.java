/*
Implementa un programa que pida al usuario un número de cualquier longitud, como por ejemplo
“1234”, y le diga al usuario si dicho número aparece en el primer millón de decimales del nº pi
(están en el archivo ‘pi-million.txt’). No está permitido utilizar ninguna librería ni clase ni método
que realice la búsqueda. Debes implementar el algoritmo de búsqueda tú.
 */
package ejerciciosFile;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ejercicioB6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número para comprobar que aparece en los decimales de PI.");

        int numeroElegido = teclado.nextInt();
        String numBuscamos = Integer.toString(numeroElegido);
        teclado.close();

        try {

            File piMillion = new File("Documentos" + File.separator + "pi-million.txt");

            if (piMillion.exists() && piMillion.isFile()) {
                
                
                Scanner lector = new Scanner(piMillion, "UTF-8");

                boolean encontrado = false;
                
                while (lector.hasNextLine()) {
                    System.out.println("Leyendo linea de pi...");
                    String linea = lector.nextLine();
                    if (linea.contains(numBuscamos)) {
                        encontrado = true;
                        break; //podria utilizar en el condicional un "&& encontrado == false" pero entonces lo buscaria al infinito, y puede no estar
                    }
                }
                System.out.println();
                System.out.println("¿Ha sido encontrado? Respuesta: " + encontrado);
                lector.close();
                
            } else{
                
                throw new Exception("El archivo indicado no es un archivo .txt");
            }

        } catch (Exception e) {
            System.out.println("");
        }

    }
}
