/*
Escribe un programa que cree un array de tamaño 100 con los primeros 100 números naturales.
Luego muestra la suma total y la media. Implementa una función que calcule la suma de un
array y otra que calcule la media de un array
 */
package ejerciciosFunciones;

import java.util.Scanner;
import java.util.Arrays;

public class Funciones15_sumaArray_mediaArray {

    //FUNCION SUMA ARRAY
    public static int sumaIntArray(int array[]) {
        
        int suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            suma = array[i] + suma;
        }
        return suma;
    }
    
        //versión double:
        public static double sumaDArray(double array[]) {

            double suma = 0;

            for (int i = 0; i < array.length; i++) {
                suma = array[i] + suma;
            }
            
            //return (double)Math.round(suma * 100d) / 100d;
            return suma;
        }
    
    //FUNCION MEDIA ARRAY
        
    public static int mediaArray(int array[]) {
        
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
                suma = array[i] + suma;
        }
        int media = suma / array.length;
        return media;
    }
        //versión double:
        public static double mediaDArray(double array[]) {
        
            double suma = 0;
            for (int i = 0; i < array.length; i++) {
                    suma = array[i] + suma;
            }
            double media = suma / array.length;
            
            //return (double)Math.round(media * 100d) / 100d;
            return media;
        }
    
    //CODIGO
    public static void main(String[] args) {
        
        int vector[] = new int[100]; //posiciones 0-99
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = i + 1;
        }
        
        System.out.println("Test: El array de int relleno del 1 al 100 es:");
        System.out.println(Arrays.toString(vector));
        
        System.out.println("La suma de todos los números del array de int es:");
        System.out.println(sumaIntArray(vector));
        
        System.out.println("La media de todos los números del array de int es:");
        System.out.println(mediaArray(vector));
        
        
        //versión double:
        
        double vectorDouble[] = new double[100];
        
        for (int i = 0; i < vectorDouble.length; i++) {
            vectorDouble[i] = i + 1.76; //ejemplo
        }
        
        //IMPRIMIR ARRAY
        System.out.println("El array double relleno:");
        System.out.println(Arrays.toString(vectorDouble));
        
        //SUMA
        
        System.out.println("La suma de todos los números del array de double es:");
        System.out.println(sumaDArray(vectorDouble));
        
        System.out.println("La suma con menos decimales del array de double es:");
        System.out.println((double)Math.round(sumaDArray(vectorDouble) * 100d) / 100d);
        
        //MEDIA
        System.out.println("La media de todos los números del array de double es:");
        System.out.println(mediaDArray(vectorDouble));
        
        System.out.println("La media con menos decimales del array de double es:");
        System.out.println((double)Math.round(mediaDArray(vectorDouble) * 100d) / 100d);
        
        //CHEAT:  (double)Math.round(VARIABLE * 100d) / 100d;
        
    }
    
}
