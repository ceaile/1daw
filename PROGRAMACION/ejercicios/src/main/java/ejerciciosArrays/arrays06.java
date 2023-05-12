/*
 Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
escriba M en todas sus posiciones y lo muestre por pantalla.
 */

package ejerciciosArrays;

import java.util.Scanner;

public class Arrays06 {
    public static void main(String[] args) {
        
        System.out.println("Introduce un número: ");
        
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        
        System.out.println("Introduce otro número: ");
        int M = teclado.nextInt();
        
        int O[] = new int[N];
        
        for (int i = 0; i < O.length; i++) {
            O[i] = M;
            System.out.print(O[i] + " ");
        }
    }
}
