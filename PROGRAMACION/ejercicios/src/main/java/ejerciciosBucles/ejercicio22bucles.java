/*
Realiza un programa que pida un número y construya por pantalla su pirámide
 */
package ejerciciosBucles;
import java.util.Scanner;
public class ejercicio22bucles {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número para sacar su pirámide: ");
        int num = teclado.nextInt();
        
        int totalCh = num * 2 - 1;
        
        for (int i = 1; i <= num; i++) {
            
            int numAst = i * 2 -1;
            int numEsp = totalCh - numAst;
            
            //bucle espacios
            for (int k = 0; k < (numEsp/2); k++) {
                System.out.print("_");
            }
            //bucle estrellas
            for (int l = 0; l < numAst; l++ ) {
                System.out.print("*");
            }
            //bucle espacios
            for (int k = 0; k < (numEsp/2); k++) {
            System.out.print("_");
            }
            System.out.println();
        }
        
    }
    
}
