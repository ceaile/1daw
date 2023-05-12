
package examen_real;

import java.util.Scanner;

public class examen_ej3 {


    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de filas para la matriz:");
        int filas = teclado.nextInt();
        
        System.out.println("Introduce el número de filas para la matriz:");
        int columnas = teclado.nextInt();
        
        int matriz[][] = new int[filas][columnas];
        
        //introducir el contenido
        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                matriz[j][i] = (int)(-5+Math.random()*11);
            }
            
        }
        
        //visualizar el contenido
        for (int j = 0; j < matriz.length; j++) {
            
            for (int i = 0; i < matriz[j].length; i++) {
                //System.out.print("[" + matriz[j][j] + "]");
                System.out.print(String.format("%" + 4 + "s", "[" + matriz[j][j] + "]")); //formato para mejorar estetica
            }
            System.out.println();
        }
        
        
    }
    
}
