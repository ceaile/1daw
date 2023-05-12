/*
Crea un programa que pida veinte números reales por teclado, 
los almacene en un array y luego lo recorra 
para calcular y mostrar la media: (suma de valores) / nº de valores.
 */

package ejerciciosArrays;
import java.util.Scanner;
public class Arrays05 {
    public static void main(String[] args) {
        int numero = 0;
        int vector[] = new int[20];
        int suma = 0;
        int media = 0;
        
        System.out.println("Introduce 20 números por teclado: ");
        
        for (int vueltas = 0; vueltas < 20; vueltas++) { //bucle de pedir por teclado
            Scanner teclado = new Scanner(System.in);
            numero = teclado.nextInt();
            vector[vueltas] = numero; //lo almacena en un array, pero no pide que se imprima 
        }
        
        for (int i = 0; i < vector.length; i++) {
            suma = vector[i] + suma;
        }
        
        System.out.println(suma / vector.length);
    }
    
}
