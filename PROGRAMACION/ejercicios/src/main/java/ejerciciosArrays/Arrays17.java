/*
Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
si son iguales o no.
 */
package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays17 {

    public static void main(String[] args) {
     
    int vector1[] = new int[10];
    int vector2[] = new int[10];
    int vectorLargo[] = new int[20];
    
    Scanner teclado = new Scanner(System.in);
   
    // haces un vector largo y metes todos los valores pedidos por teclado
    for (int i = 0; i < vectorLargo.length; i++) {
        System.out.println("Introduce un número " + i + "/20" );
        int numero = teclado.nextInt();
        vectorLargo[i] = numero;
     }
    
    //arraycopy a vector1 trozo 1 de arraylargo
    System.arraycopy(vectorLargo,0, vector1, 0, 10);
    System.out.println(Arrays.toString(vector1));
    
    //arraycopy a vector2 trozo 2 de arraylargo
    vector2 = Arrays.copyOfRange(vectorLargo, 10, 20);
    System.out.println(Arrays.toString(vector2));
    
               
        
        
    
}
    
    
}
