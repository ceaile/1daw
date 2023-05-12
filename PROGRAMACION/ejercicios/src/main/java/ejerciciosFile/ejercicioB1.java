/*
Implementa un programa, que muestre por pantalla los valores máximos y mínimos del archivo
‘numeros.txt’.
 */
package ejerciciosFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ejercicioB1 {

    public static void main(String[] args) {

        File fichero = new File("numeros.txt"); //C:\Users\Admin\git-code\primero-daw\PROGRAMACION\ejercicios\Documentos\numeros.txt
        
        
        try {
            Scanner lector = new Scanner(fichero);
            
            ArrayList<Integer> alist = new ArrayList<Integer>();
            
            while (lector.hasNext()){
                alist.add(lector.nextInt());
            }
            
            int mayor = 1;
            int menor = 1;
            
            for (int i : alist){
                if (i > mayor) mayor = i;
                if (i < menor) menor = i;
            }
            
            System.out.println("El número menor es: " + menor);
            System.out.println("El número mayor es: " + mayor);
            
            
            
            lector.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        

    }
}
