/*
Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media.
 */
package ejerciciosArrays;

import java.util.Scanner;

public class Arrays10 {
    
    public static void main(String[] args) {
        
    
        //pedir por teclado N posiciones (tamaño) del vector
        System.out.println("Escribe cuántas alturas quieres comparar: ");
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
   
        float vector[] = new float[N];
        
        //bucle de pedir por teclado hasta llegar a N veces
        //también rellena el array con los datos introducidos por teclado
        
        for (int i = 0; i < N; i++){
            System.out.println("Escribe altura en metros a comparar " + i + "/" + N + ": ");
            float altura = teclado.nextFloat();
            vector[i] = altura; //(Math.round(altura*10d)/10d); ¿¿¿redondeado???
        }
        
        //calcular y mostrar la media, máxima y mínima
        
        float suma = 0;  // para calcular la media
        float media = 0;
        float maxima = 0;
        float minima = 0;
        int encimaMedia = 0;
        int debajoMedia = 0;
        
        for (int i = 0; i < vector.length; i++) {
            
            //para calcular media
            suma += vector[i];
            media = suma / vector.length;
           
            //para calcular cuántas van por encima y por debajo de la media
            if (vector[i] > media) {
                encimaMedia++;
                maxima = vector[i]; //para calcular máxima
            } else {
                debajoMedia++;
                minima = vector[i]; //para calcular mínima
            }
            
        }
        
        
         
        System.out.println("La media de alturas es: " + media);
        System.out.println("La máxima altura es: " + maxima);
        System.out.println("La mínima altura es: " + minima);
        System.out.println("Por encima de la media hay: " + encimaMedia);
        System.out.println("Por debajo de la media hay: " + debajoMedia);
      
    }
    
}
