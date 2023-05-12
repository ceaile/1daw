/*
Implementa un programa que lea un documento de texto y muestre por pantalla algunos datos
estadísticos: nº de líneas, nº de palabras, nº de caracteres y cuáles son las 10 palabras más
comunes (y cuántas veces aparecen). Prueba el programa con los archivos de la carpeta ‘Libros’.
NOTA: Para llevar la cuenta de cuántas veces aparece cada palabra puedes utilizar una
HashMap. Un mapa hash es una estructura de datos tipo colección (como el ArrayList), que
permite almacenar pares clave-valor. Por ejemplo {“elefante”, 5} o {“casa”, 10} son pares
<String,Integer> que asocian una palabra (clave) con un nº entero (valor
 */
package ejerciciosFile;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap; // import the HashMap class
import java.util.*;

public class ejercicioB7 {

    public static void main(String[] args) {

        try {
            File dirLibros = new File("Documentos" + File.separator + "Libros"); //directorio

            if (!dirLibros.exists()) {
                throw new Exception("La carpeta 'Libros' no existe o la ruta es incorrecta.");

            } else if (dirLibros.isDirectory()) {

                //para diez palabras mas comunes y cuantas veces aparecen:
                HashMap<String, Integer> hmRep = new HashMap<String, Integer>();
                ArrayList<String> alist = new ArrayList();
                int contLineas = 0;
                int contPalabras = 0;
                int contChars = 0;

                // bucle leyendo cada libro
                File libros[] = dirLibros.listFiles();
                for (File f : libros) {
                    if (f.isFile()) {
                        Scanner lector = new Scanner(f, "UTF-8");

                        //bucle leyendo cada linea
                        while (lector.hasNextLine()) {
                            String linea = "";
                            linea = lector.nextLine();
                            alist.add(linea);
                            contLineas++;

                            //bucle leyendo cada palabra
                            String palabras[] = linea.split(" ");
                            int palabrasXstring = palabras.length;
                            for (String p : palabras) {
                                contPalabras++;

                                //bucle leyendo el hashmap para encontrar repeticiones
                                if (hmRep.containsKey(p)) {
                                    hmRep.put(p, hmRep.get(p) + 1);
                                } else {
                                    hmRep.put(p, 1);
                                }
                            }

                            //bucle leyendo cada char de la linea
                            for (int ch = 0; ch < linea.length(); ch++) {
                                contChars++;
                            }
                        }
                        lector.close();
                        
                        //ordenamos hashmap y sacamos sus valores ????????????????????????????????????????????
                        ArrayList<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(hmRep.entrySet());
                        
                        listaOrdenada.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
                        
                        for (int i = 0; i < Math.min(10, listaOrdenada.size()); i++) {
                            Map.Entry<String, Integer> entry = listaOrdenada.get(i);
                            System.out.println("Palabra: " + entry.getKey() + ". Repeticiones: " + entry.getValue());
                        } 
                        // ?????????????????????????????????????????????????????????????????????????????????
                        listaOrdenada.clear();
                    }

                    System.out.println("El titulo del libro es: " + f.getName());
                    System.out.println("El numero total de lineas es: " + contLineas);
                    System.out.println("El numero total de chars del documento entero es: " + contChars);
                    System.out.println();

                    hmRep.clear();
                    contChars = 0;
                    contLineas = 0;
                    contPalabras = 0;

                }
            } else {
                throw new Exception("La ruta indicada no es un directorio de libros, es un documento.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
