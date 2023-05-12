/*
Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos,
para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que
pasándole un número entero devuelva si es primo o no.
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones17_esPrimo {
    
    //FUNCION
    static boolean isPrime(int num) {

        boolean resultado = true;
        
        if (num <= 1)
        {
            resultado = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0) {
                    resultado = false;
                }
            }            
        }
        
        return resultado;
        
        
    }
    
    //CODIGO
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        
        do {
            System.out.println("Introduce un número para ver si es primo. Introduce 0 para salir del programa:");
            numero = teclado.nextInt();
            if (isPrime(numero)) {
                System.out.println("Es primo");
            } else {
                System.out.println("No es primo");
            }
            
        } while (numero != 0);
        
        System.out.println("Fin del programa");

        
        
     
    }

}
