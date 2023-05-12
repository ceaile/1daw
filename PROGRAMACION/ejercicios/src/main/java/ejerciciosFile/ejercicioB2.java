/*
El archivo ‘alumnos_notas.txt’ contiene una lista de 10 alumnos y las notas que han obtenido en
cada asignatura. El número de asignaturas de cada alumno es variable. Implementa un programa
que muestre por pantalla la nota media de cada alumno, junto a su nombre y apellido, ordenado
por nota media de mayor a menor.
 */
package ejerciciosFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class ejercicioB2 {
    public static void main(String[] args) {
        
        File alumnosNotasTxt = new File("C:\\Users\\Admin\\git-code\\primero-daw\\PROGRAMACION\\ejercicios\\Documentos\\alumnos_notas.txt"); //C:\Users\Admin\git-code\primero-daw\PROGRAMACION\ejercicios\Documentos\alumnos_notas.txt
        
        try{
            Scanner lector = new Scanner(alumnosNotasTxt);
            ArrayList<String> listaDeLineas = new ArrayList<String>();
            ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
            
            while (lector.hasNextLine()){
                listaDeLineas.add(lector.nextLine());
            }
            
            for (String i : listaDeLineas){
                Alumno alumnoTemp = new Alumno();
                
                for (String j : i.split(" ") ){
                    if (j.matches("\\d+")){
                        alumnoTemp.añadirNota(Integer.parseInt(j));
                    } else{
                        alumnoTemp.añadirNombre(j);
                    }
                }
                alumnoTemp.rehacerMedia();
                listaAlumnos.add(alumnoTemp);
            }
            
            for(Alumno i : listaAlumnos){
                System.out.println("Nombre Alumno: " + i.getNombre() + ". Nota media: " + Math.round(i.getNotaMedia() * 100.0) / 100.0);
            }
            
            
            
            lector.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
        
    }
}
