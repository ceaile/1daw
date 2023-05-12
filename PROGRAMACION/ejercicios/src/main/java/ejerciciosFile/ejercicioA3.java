/*
Implementa un programa que haga lo siguiente:
● Cambiar el nombre de la carpeta ‘Documentos’ a ‘DOCS’, el de la carpeta ‘Fotografias’ a
‘FOTOS’ y el de la carpeta ‘Libros’ a ‘LECTURAS’
● Cambiar el nombre de todos los archivos de las carpetas FOTOS y LECTURAS quitándole la
extensión. Por ejemplo, ‘astronauta.jpg’ pasará a llamarse ‘astronauta’.
 */
package ejerciciosFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class ejercicioA3 {

    public static void main(String[] args) {

        File rutaDoc = new File("Documentos"); //estamos en el proyecto
        File rutaNuevaDocs = new File("DOCS");

        File rutaFotografias = new File("DOCS/Fotografias");
        File rutaNuevaFotos = new File("DOCS/FOTOS");

        File rutaLibros = new File("DOCS/Libros");
        File rutaNuevaLecturas = new File("DOCS/LECTURAS");
        System.out.println("Paso 1: comprobamos que 'Documentos' existe. En caso contrario, cae una excepcion.");
        try
        {
            if (rutaDoc.exists())
            {
                System.out.println("Comprobacion superada: El fichero 'Documentos' introducido existe.");
                System.out.println("");
            } else
            {
                throw new FileNotFoundException("EXCEPCION FILE NOT FOUND: 'Documentos' no existe.");
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try
        {
            System.out.println("Continuamos: Intento de mover/renombrar 'Documentos' a 'DOCS");
            if (rutaDoc.renameTo(rutaNuevaDocs))
            {
                System.out.println("Se ha cambiado el nombre de 'Documentos' a 'DOCS' correctamente");
                System.out.println("Comprobacion de nombre:" + rutaDoc.getName());
                System.out.println("Ahora rutaDoc (antigua 'Documentos') apunta a la ruta nueva DOCS");
            } else
            {
                System.out.println("No se ha podido cambiar de 'Documentos' a 'DOCS'");
            }

        } catch (NullPointerException e)
        {
            System.out.println("EXCEPCION NULL POINTER");
            e.printStackTrace();
        } catch (SecurityException e)
        {
            System.out.println("EXCEPCION DE SEGURIDAD");
            e.printStackTrace();
        } catch (Exception e)
        {
            System.out.println("EXCEPCION GENERICA");
            e.printStackTrace();
        }
        System.out.println("Paso 2: Comprobamos si las rutas de 'Fotografias' y 'Libros' existen.");
        System.out.println("En caso contrario, cae en una excepcion.");

        try
        {
            if (rutaFotografias.exists() && rutaLibros.exists())
            {
                System.out.println("Comprobación superada: La rutas antiguas de Fotografias y de Libros existen.");
                System.out.println("");
            } else
            {
                throw new FileNotFoundException("EXCEPCION FILE NOT FOUND. Las rutas Fotografias y Libros no existen.");
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------");
        System.out.println("Continuamos: movemos de 'Fotografias' a 'FOTOS' el contenido");
        try
        {

            if (rutaFotografias.renameTo(rutaNuevaFotos))
            {
                System.out.println("Se ha cambiado el nombre de 'Fotografias' a 'FOTOS' correctamente");
                System.out.println("Comprobacion de nombre: " + rutaNuevaFotos.getName());
            } else
            {
                System.out.println("No se ha podido cambiar el nombre.");
            }

            if (rutaLibros.renameTo(rutaNuevaLecturas))
            {
                System.out.println("Se ha cambiado el nombre de 'Libros' a 'LECTURAS' correctamente");
                System.out.println("Comprobacion de nombre: " + rutaNuevaLecturas.getName());
            } else
            {
                System.out.println("No se ha podido cambiar el nombre de 'Libros' a 'LECTURAS'.");
            }
        } catch (NullPointerException e)
        {
            System.out.println("EXCEPCION NULL POINTER");
            e.printStackTrace();
        } catch (SecurityException e)
        {
            System.out.println("EXCEPCION DE SEGURIDAD");
            e.printStackTrace();
        } catch (Exception e)
        {
            System.out.println("EXCEPCION GENERICA");
            e.printStackTrace();
        }

        //COMPROBACION SI RUTAS NUEVAS EXISTEN, AUNQUE DEBERIAN, SI NO CAYO EN EXCEPCION ANTES DE ESTE PASO
        System.out.println("--------------------------------------------------");
        try
        {
            if (rutaNuevaLecturas.exists())
            {
                System.out.println("Comprobacion: 'RutaNuevaLecturas' existe");
            } else
            {
                throw new FileNotFoundException("EXCEPCION FILE NOT FOUND");
            }
        } catch (Exception e)
        {
            System.out.println("Comprobación fallida! 'RutaNuevaLecturas' no existe.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try
        {
            if (rutaNuevaFotos.exists())
            {
                System.out.println("Comprobacion: 'RutaNuevaFotos' existe");
            } else
            {
                throw new FileNotFoundException("EXCEPCION FILE NOT FOUND");
            }
        } catch (Exception e)
        {
            System.out.println("Comprobación fallida! 'RutaNuevaFotos' no existe.");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        //cambiar el contenido de fotos y lecturas la extension
        System.out.println("Mostramos info de 'rutaNuevaLecturas' y 'rutaNuevaFotos' para comprobar después si hemos conseguido quitar la extension.");
        try{
            System.out.println("--------------------------------------------------");
            System.out.println();
            muestraInfoRuta(rutaNuevaLecturas, true);
            muestraInfoRuta(rutaNuevaFotos, true);
            System.out.println();
            System.out.println("--------------------------------------------------");
        } catch (Exception e){
            System.out.println("EXCEPCION: No ha conseguido mostrarse correctamente los ficheros de 'rutaNuevaLecturas' y 'rutaNuevaFotos'.");
            e.printStackTrace();
        }
        
        File arrayLecturas[] = rutaNuevaLecturas.listFiles();
        File arrayFotos[] = rutaNuevaFotos.listFiles();
        
        try
        {
            for (File f : arrayLecturas)
            {
                String separacion[] = f.getName().split("\\.", 0); //FALLO

//            int longitudTrozoInvalido = separacion[separacion.length-1].length() + 1; //el +1 es para contar el punto de la extension
//            String nombreDefinitivo_Imprimir = f.getName().substring(0, ( ( f.getName().length()-1 ) - longitudTrozoInvalido) );
                String nombreSinExt = "";
                for (int i = 0; i < separacion.length - 1; i++)
                {
                    nombreSinExt += /* "." + */ separacion[i];
                }

                File renombreFileSinTxt = new File("DOCS/LECTURAS/"+nombreSinExt);
                f.renameTo(renombreFileSinTxt);
            }
            System.out.println("Mostramos info nuevamente para ver si hemos conseguido quitar la extension:");
            muestraInfoRuta(rutaNuevaLecturas, true);
            System.out.println();

            for (File f : arrayFotos)
            {
                String separacion[] = f.getName().split("\\.");
                String nombreSinExt = "";
                for (int i = 0; i < separacion.length - 1; i++)
                {
                    nombreSinExt += separacion[i];
                }

                File renombreFileSinJpg = new File("DOCS/FOTOS/"+nombreSinExt);
                f.renameTo(renombreFileSinJpg);
            }
            System.out.println();
            muestraInfoRuta(rutaNuevaFotos, true);
            System.out.println();

        } catch (Exception e)
        {
            System.out.println("EXCEPCION: Ha habido algun tipo de error en la ejecucion.");
            e.printStackTrace();
        }

    }//fin main
    
    //queda comprobar
    static public void quitarExtension(File original, File[] arrayFile) throws Exception{
        for (File f : arrayFile)
            {
                String separacion[] = f.getName().split("\\.");
                String nombreSinExt = "";
                for (int i = 0; i < separacion.length - 1; i++)
                {
                    nombreSinExt += separacion[i];
                }

                File renombreFileSinExt = new File(original.getAbsolutePath() + nombreSinExt);
                f.renameTo(renombreFileSinExt);
            }
    }
    
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
}//fin
