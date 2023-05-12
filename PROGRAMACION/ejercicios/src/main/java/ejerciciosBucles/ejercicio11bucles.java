package ejerciciosBucles;

/*
Realiza un programa que sume independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
 */

public class ejercicio11bucles {

    public static void main(String[] args) {
        
        int pares = 0;
        int impares = 0;
        
        for (int cont = 100 ; cont <= 200 ; cont++) {
            if (cont % 2 == 0) {
                pares = pares + cont;
            } else {
                impares = impares + cont;
            }
        }
        System.out.println("La suma total de los pares es: " + pares);
        System.out.println("La suma total de los impares es: " + impares);
         
    }
    
}
