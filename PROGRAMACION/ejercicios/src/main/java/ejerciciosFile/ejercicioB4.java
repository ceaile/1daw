/*
Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres
y apellidos de ‘usa_nombres.txt’ y ‘usa_apellidos.txt’). Se le pedirá al usuario cuántos nombres de
persona desea generar y a qué archivo añadirlos (por ejemplo ‘usa_personas.txt’).
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
public class ejercicioB4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe cuántos nombres de persona deseas generar.");
        int cantidadNombres = teclado.nextInt();
        teclado.nextLine(); //just in case, may fail

        System.out.println("Escribe a qué archivo deseas añadirlo:");
        String usaPersonasTxt = teclado.nextLine();                             //lee de teclado
        usaPersonasTxt = "Documentos" + File.separator + "usa_personas.txt";    //pero es mentira

        File usaNombres = new File("Documentos" + File.separator + "usa_nombres.txt");
        File usaApellidos = new File("Documentos" + File.separator + "usa_apellidos.txt");
        File usaPersonas = new File(usaPersonasTxt);

//        System.out.println("Se va a utilizar para nombres: " + usaNombres.getAbsolutePath());
//        System.out.println("Se va a utilizar para apellidos: " + usaApellidos.getAbsolutePath());
//        System.out.println("Se va a escribir en: " + usaPersonas.getAbsolutePath());

        try {
            if (usaNombres.exists() && usaApellidos.exists() && usaPersonas.exists()) {
                Scanner lectorNom = new Scanner(usaNombres);
                Scanner lectorApe = new Scanner(usaApellidos);
                FileWriter escritor = new FileWriter(usaPersonas, false);

                ArrayList<String> listaNom = new ArrayList();
                ArrayList<String> listaApe = new ArrayList();

                while (lectorNom.hasNextLine()) {
                    listaNom.add(lectorNom.nextLine());
                }

                while (lectorApe.hasNextLine()) {
                    listaApe.add(lectorApe.nextLine());
                }

                for (int i = 0; i < cantidadNombres; i++) {
                    Random randomGenerator = new Random();
                    int randomNom = listaNom.size();
                    int randomApe = listaApe.size();
                    
                    while (randomNom >= listaNom.size()) {
                        randomNom = randomGenerator.nextInt(listaNom.size());
                    }

                    while (randomApe >= listaApe.size()) {
                        randomApe = randomGenerator.nextInt(listaApe.size());
                    }


                    escritor.write(listaNom.get(randomNom) + " " + listaApe.get(randomApe) + "\n");

                }
                lectorNom.close();
                lectorApe.close();
                escritor.close();
            } else {
                throw new Exception("Al menos uno de los archivos de lectura o escritura no existe.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
