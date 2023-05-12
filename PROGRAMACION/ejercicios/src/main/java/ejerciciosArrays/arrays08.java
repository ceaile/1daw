/*
Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 
y 1.0,
utilizando Math.random(), y luego le pida al usuario un valor real R. 
Por último, mostrará
cuántos valores del array son igual o superiores a R.
 */
package ejerciciosArrays;

import java.util.Scanner;


public class Arrays08 {

    public static void main(String[] args) {
        
        double vector[] = new double[100];
        //double de 100 posiciones porque utilizaremos decimales

        //meter los valores aleatorios en el array
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random();
            System.out.print(Math.round(vector[i]*100d)/100d + ", "); // redondea, quitando decimales
        }
        
        System.out.println(); //espacio para que no imprima todo junto
        
        //pedir por teclado al user un número (introducirlo con comas y no con punto al ejecutar!!)
        System.out.println("Introduce un valor entre 0.0 y 1.0: ");
        Scanner teclado = new Scanner(System.in);
        double R = teclado.nextDouble();
        
        //bucle 'for' para recorrer el array y sacar por pantalla los iguales y superiores a R
        for (int i = 0; i < 100; i++) {
            if (vector[i] >= R) {
                System.out.print(vector[i] + ", ");
            } //sin else porque no pide nada el ejercicio
        }      
    }
    
}
