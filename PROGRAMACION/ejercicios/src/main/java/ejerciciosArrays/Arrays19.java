package ejerciciosArrays;

/*
Necesitamos crear un programa para mostrar el ranking de puntuaciones de un torneo de
ajedrez con 8 jugadores. Se le pedirá al usuario que introduzca las puntuaciones de todos los
jugadores (habitualmente valores entre 1000 y 2800, de tipo entero) y luego muestre las
puntuaciones en orden descendente (de la más alta a la más baja)
 */

import java.util.Arrays;
import java.util.Scanner;

public class Arrays19 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //creo dos arrays donde guardaré el original y el inverso que crearé a partir del original
        int vectorAscendente[] = new int[8];
        int vectorDescendente[] = new int[8];
        
        int j=0;
        int numero;
        
        
        //Pido por teclado las puntuaciones y descalifico las que no entran en mi estándar de 1000-2800
        // usando un do while de esta manera no es necesario hacerlo con un for
        do {
            System.out.println("Introduce un número entre 1000 y 2800");
            numero = teclado.nextInt();
            
            if (numero >= 1000 && numero <= 2800){                
                vectorAscendente[j] = numero;
                j++;
            } else{
                System.out.println("El número introducido no es válido");
            }
        }
        while (j < vectorAscendente.length);
        
        
        
        
        /*
        "The only way to sort a primitive array in descending order is, 
        first sort the array in ascending order and then reverse the array in place. 
        This is also true for two-dimensional primitive arrays."
        */
        
        Arrays.sort(vectorAscendente); //de menor a mayor = ascendente
        
        for (int i = 0; i < vectorAscendente.length; i++) {
            vectorDescendente[vectorAscendente.length - i -1] = vectorAscendente[i];
        }
        
        System.out.println(Arrays.toString(vectorDescendente));
        
        
        
    }
    
}
