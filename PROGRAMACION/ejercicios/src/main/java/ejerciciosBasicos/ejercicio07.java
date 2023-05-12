package ejerciciosBasicos;


 /* Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y
escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros.
 */
import java.util.Scanner;
public class ejercicio07 {
   public static void main(String args[]) {
       System.out.println("Escriba un número en millas marinas para transformarlo en metros: ");
       Scanner escanerNumero = new Scanner(System.in);
       double millas = escanerNumero.nextDouble();
       double metros = millas * 1.852;
       System.out.println("El resultado es " + metros);
   } 
}
