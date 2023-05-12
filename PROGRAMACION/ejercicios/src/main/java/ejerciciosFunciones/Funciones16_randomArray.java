/*
Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con
valores aleatorios (utiliza Math.random()). Implementa la función que rellena un array con
valores aleatorios
 */
package ejerciciosFunciones;

import java.util.Scanner;
import java.util.Arrays;

public class Funciones16_randomArray {

    //FUNCION
    
    public static void randomArrayInt(int array[]) {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }         
    }
    
    public static void randomArrayDouble(double array[]) {
        for (int i = 0; i < array.length; i++) {
            //array[i] = Math.random()*100;
            //cómo redondear el contenido del aleatorio double?
            array[i] = Math.round(Math.random()*100 * 100d) / 100d;
            //array[i] = (double)Math.round(array[i] * 100d) / 100d;
            
            //CHEAT:  (double)Math.round(VARIABLE * 100d) / 100d;
            //CHEAT: array[i] = Math.random()*100;
        }
    }
    
    //CODIGO
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el tamaño del array de int");
        int tamañoVint = teclado.nextInt();
        
        System.out.println("Introduce el tamaño del array de double");
        int tamañoVdouble = teclado.nextInt();
        
        int vectorInt[] = new int[tamañoVint];
        double vectorDouble[] = new double[tamañoVdouble];
        
        //ejecutar función: relleno de vectorInt con números aleatorios del 0 al 99
        randomArrayInt(vectorInt);
        //imprimir vector de int
        System.out.println(Arrays.toString(vectorInt));
        
        //ejecutar funcion: relleno de vectorDouble con números aleatorios del 0,0 al 99,9999...
        randomArrayDouble(vectorDouble);
        System.out.println(Arrays.toString(vectorDouble));
        
        
       
    }
    
}
