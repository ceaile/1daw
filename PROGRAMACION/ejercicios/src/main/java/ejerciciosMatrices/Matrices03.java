/*
Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
menores que cero y cuántos son igual a cero.
 */
package ejerciciosMatrices;

import java.util.Scanner;
public class Matrices03 {


    public static void main(String[] args) {
        
        System.out.println("Introduce un número: ");
        
        
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        
        System.out.println("Introduce un número: ");
        
        int M = teclado.nextInt();
        
        int matriz[][] =  new int[N][M];
        
        
        
        /*
        Una matriz es un vector dentro de un vector,
        */
        
        //solo leer e introducir valores
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                System.out.println("Introduce un número para llenar la matriz: ");
                matriz[i][j] = teclado.nextInt();
                // puedes introducirlo directamente en lugar de crear otra variable, porque ambas son tipo int
                //accedemos a la posicion j dentro del array contenido en la posicion i de matriz

            }
        }
            
        //mostrar por pantalla cuántos valores son > 0, cuántos < 0 y cuántos = 0
        
        //variables para acumular, hechas fuera del for!!
               int positivos = 0;
               int cero = 0;
               int negativos = 0;
               
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
               if (matriz[i][j] > 0) {
                   positivos++;
               } else if (matriz[i][j] == 0) {
                   cero++;
               } else {
                   negativos++;
               }
               

            }
        }
        
        System.out.println(positivos + " son mayores que 0, " + negativos + " son menores que cero, y " + cero + " son iguales a cero.");
        
        
    }
    
}
