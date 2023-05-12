
package ejerciciosFile;

import java.io.File;
import java.util.*;

public class restaurar {
    public static void main(String[] args) {
        File restaurador = new File("Documentos_restaurar");
        File copiaRestaurador = new File("Documentos_resturar_copia");
        
        File documentos = new File("Documentos");
        restaurador.renameTo(documentos);
        
//        try{ //https://commons.apache.org/proper/commons-io/apidocs/org/apache/commons/io/FileUtils.html#copyDirectory-java.io.File-java.io.File-
//            FileUtils.copyDirectory(documentos, copiaRestaurador);
//        } catch(Exception e){
//            System.out.println("EXCEPCION: No ha podido copiarse 'Documentos_restaurar'");
//        }
        
    }
}
