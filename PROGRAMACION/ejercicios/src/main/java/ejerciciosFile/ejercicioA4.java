/*
Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y
‘Alfabeto’. Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’. Luego crea dentro de
‘Alfabeto’ una carpeta por cada letra del alfabeto (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’. Te serán de
ayuda los códigos numéricos ASCII: https://elcodigoascii.com.ar
 */
package ejerciciosFile;

import java.io.File;
import java.io.FileNotFoundException;

public class ejercicioA4 {

    public static void main(String[] args) {
        //ya existentes:
        File documentos = new File("Documentos");
        File fotografias = new File("Documentos/Fotografias");
        File libros = new File("Documentos/Libros");
        //nuevas:
        File misCosas = new File("Documentos/misCosas");
        File misCosasLibros = new File("Documentos/misCosas/Libros");
        File misCosasFotografias = new File("Documentos/misCosas/Fotografias");
        File alfabeto = new File("Documentos/Alfabeto");

        try {
            if (documentos.exists() && fotografias.exists() && libros.exists()) {
                System.out.println("Comprobación 1: 'Documentos', 'Libros' y 'Fotografias' existen.");
                System.out.println();
            } else {
                throw new FileNotFoundException("EXCEPCION: ó 'Documentos' o 'Documentos/Fotografias' o 'Documentos/Libros' no existen");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try{
            if (misCosas.mkdir()){
                System.out.println("'Documentos/misCosas' ha podido crearse correctamente.");
            } else{
                throw new Exception("EXCEPCION: 'Documentos/misCosas' no ha podido crearse");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        try {            
                if (fotografias.renameTo(misCosasFotografias)) //FALLO
                {
                    System.out.println("Se ha conseguido mover 'Fotografias' a 'Documentos/misCosas'.");
                    System.out.println();
                } else {
                    throw new Exception("EXCEPCION: No se ha conseguido mover 'Fotografias' a 'Documentos/misCosas'.   ");
                }

                if (libros.renameTo(misCosasLibros)) //FALLO
                {
                    System.out.println("Se ha conseguido mover 'Libros' a 'Documentos/misCosas'.");
                    System.out.println();
                } else {
                    throw new Exception("EXCEPCION: No se ha conseguido mover 'Libros' a 'Documentos/misCosas'.");
                }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        
        try {
            if (alfabeto.mkdir()) {
                System.out.println("Se ha conseguido crear 'Documentos/Alfabeto'.");
            } else {
                System.out.println("No se ha conseguido crear'Documentos/Alfabeto'");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 65; i < 91; i++) { //65=A, 90=Z
            char ascii = (char) i;
            File letra = new File("Documentos/Alfabeto/" + ascii);
            try {
                if (letra.mkdir()) {
                    System.out.println("Se ha creado el directorio 'Documentos/Alfabeto/" + ascii + " con éxito.");
                }
            } catch (SecurityException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("EXCEPCION GENERICA capturada.");
            }
        }

    }//fin main
}//fin
