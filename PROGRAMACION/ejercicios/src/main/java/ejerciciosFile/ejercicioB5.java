/*
Implementa un programa que cree la carpeta ‘Diccionario’ con tantos archivos como letras del
abecedario (A.txt, B.txt... Z.txt). Introducirá en cada archivo las palabras de ‘diccionario.txt’ que
comiencen por dicha letra.
 */
package ejerciciosFile;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class ejercicioB5 {

    public static void main(String[] args) {

        try {

            File diccionario = new File("Documentos" + File.separator + "Diccionario");

            if (diccionario.exists()) {

                if (!borraTodo(diccionario)) {
                    throw new Exception("La carpeta 'Diccionario' ya existe y no ha podido eliminarse correctamente.");
                }
            }

            if (!diccionario.mkdir()) {
                throw new Exception("El directorio 'Diccionario' no ha podido crearse.");
            }

            ArrayList<String> alistLetras = new ArrayList();

            for (char letra = 'A'; letra <= 'Z'; letra++) {
                File letraDiccionario = new File("Documentos" + File.separator + "Diccionario" + File.separator + Character.toString(letra) + ".txt");
                File diccionarioTxt = new File("Documentos" + File.separator + "diccionario.txt");

                FileWriter escritor = new FileWriter(letraDiccionario, false);
                Scanner lector = new Scanner(diccionarioTxt, "UTF-8");

                while (lector.hasNextLine()) {
                    String palabra = lector.nextLine();
                    if (palabra.toUpperCase().startsWith(Character.toString(letra))) {
                        alistLetras.add(palabra);
                    }
                }

                for (String i : alistLetras) {
                    escritor.write(i + "\n");
                }

                escritor.close();
                lector.close();
                alistLetras.clear();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //FUNCION BORRAR CONTENIDO DE CARPÈTAS
    public static boolean borraTodo(File f) throws Exception {
        boolean borrado = true;
        if (!f.exists()) {
            borrado = false;
            System.out.println();
            throw new Exception("EXCEPCION: EL ARCHIVO NO EXISTE");

        }
        if (f.isFile()) {
            if (f.delete() == false) {
                borrado = false;
            }

        } else { //isDirectory()=true
            File[] arrayFichs = f.listFiles();
            for (int i = 0; i < arrayFichs.length; i++) {
                //super extra challenge:
                if (arrayFichs[i].isFile() && arrayFichs[i].delete() == false) {
                    borrado = false;
                } else if (arrayFichs[i].isDirectory()) {
                    borraTodo(arrayFichs[i]);
                }

            }
            if (f.delete() == false) {
                borrado = false;
            }

        }

        return borrado;
    }
}
