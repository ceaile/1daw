/*
Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe
tener una función que reciba como parámetro una cantidad en kilómetros y nos la devuelva en
millas.
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones12_kmAmillas {

    //FUNCION
    public static double kmAmillas(double num) {
        double millas = num / 1.60934;
        return millas;
    }
    
    //CODIGO
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Escribe los kilómetros para calcular las millas:");
        double km = teclado.nextInt();
        
        //System.out.println("math round, quita 2 decimales");
        //System.out.println((double)Math.round(kmAmillas(km) * 100d) / 100d);
        System.out.println();
        System.out.println("resultado real:");
        System.out.println(kmAmillas(km));
       
    }
    
}
