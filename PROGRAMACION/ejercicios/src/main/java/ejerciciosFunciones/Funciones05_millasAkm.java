/*
Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
 */
package ejerciciosFunciones;
import java.util.Scanner;
public class Funciones05_millasAkm {

    public static double millasAkm(double num) {
        double resultado = num * 1.60934;
        return resultado;
    }
    
    public static void main(String[] args) {
        System.out.println("Introduce un valor en millas: ");
        Scanner teclado = new Scanner(System.in);
        double millas = teclado.nextInt();
        
        System.out.println(millasAkm(millas));
        //System.out.println("math round, quita 2 decimales");
        //System.out.println((double)Math.round(millasAkm(millas)) * 100d) / 100d);
    }
    
}
