/*
Implementa un programa con una función boolean borraTodo(File f) que borre f: Si no existe
lanzará una excepción. Si es un archivo lo borrará. Si es un directorio, borrará primero sus archivos y
luego el propio directorio (recuerda que para poder borrar un directorio debe estar vacío). Devolverá
‘true’ si pudo borrar el ‘File f’ (‘false’ si no fué posible).
Prueba la función borrando las carpetas: ‘Documentos/Fotografias’, ‘Documentos/Libros’ y
‘Documentos’ (es decir, tres llamadas a la función, en ese orden).
Super extra challenge: Esta función, tal y como está definida, no borrará las subcarpetas que
estén dentro de una carpeta (para ello habría que borrar primero el contenido de dichas
subcarpetas). ¿Se te ocurre cómo podría hacerse? Inténtalo si te animas ;-
 */
package ejerciciosFile;

import java.io.File;

public class ejercicioA5 {
    public static void main(String[] args) {
        
        File fichero = new File("E:/FP_DAW/PROGRAMACION/Ejercicios_Progr/ejercicios/Documentos/Fotografias");
        try{
            borraTodo(fichero);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();//test
        }
           
        
        
        
    }//fin main

    //FUNCION BORRAR
    public static boolean borraTodo(File f) throws Exception {
        boolean borrado = true;
        if (!f.exists())
        {
            borrado = false;
            System.out.println();
            throw new Exception("EXCEPCION: EL ARCHIVO NO EXISTE");

        }
        if (f.isFile())
        {
            if (f.delete() == false)
            {
                borrado = false;
            }

        } else
        { //isDirectory()=true
            File[] arrayFichs = f.listFiles();
            for (int i = 0; i < arrayFichs.length; i++)
            {
                //super extra challenge:
                if (arrayFichs[i].isFile() && arrayFichs[i].delete() == false)
                {
                    borrado = false;
                } else if (arrayFichs[i].isDirectory()){
                    borraTodo(arrayFichs[i]);
                }

            }
            if (f.delete() == false) borrado=false;
           
        }

        return borrado;
    }

}//fin
