/*
Realiza un programa para calcular la suma de los cuadrados de los 5 primeros números
naturales
 */
package ejerciciosBucles;


public class Ejercicio18bucles {


    public static void main(String[] args) {
        int total = 0;
        
        for (int i = 1; i < 6; i++) {
            total = total + (int)(Math.pow(i,2));
        }
        System.out.println("la suma de los cuadrados de los 5 primeros números naturales es: " + total);
    }
    
}
