/*
Realiza un programa que pida dos números enteros y realice la multiplicación de
los pares y los impares de los números comprendidos entre ambos, luego muestra
por pantalla ambos productos.
Por ejemplo, si los números introducidos son 4 y 10, el resultado sería:
El producto total de los pares es 1920
El producto total de los impares es 315
Si los números introducidos son 10 y 20, el resultado sería:
El producto total de los pares es 9676800
El producto total de los impares es 692835
 */
package otrosEjercicios;

import java.util.Scanner;
import java.util.Arrays;

public class ExamenTestEj01 {

    public static void main(String[] args) {

        //pedimos los números al user y los asignamos a variables
        System.out.println("Introduce un número");

        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();

        System.out.println("Introduce otro número");
        int num2 = teclado.nextInt();

        //creamos var para introducir el largo del vector, o sea la diferencia
        int mayor = 0;
        int menor = 0;
        
        //nos aseguramos de que tiene validez la resta entre ambos números
        if (num1 < num2) {
            mayor = num2;
            menor = num1;
        } else {
            mayor = num1;
            menor = num2;
        }

        int resta = mayor - menor;

        //resta se queda corto por culpa de la posición 0,
        int vector[] = new int[resta + 1]; //...por eso le añadimos +1
        // en un vector en el que almacenaremos todos esos números entre medias
        vector[0] = menor;
        

        for (int i = 1; i < (vector.length); i++) {
            vector[i] = menor + i;
        }

        System.out.println("Test del contenido del array: ");
        System.out.println(Arrays.toString(vector));

        int pares = 1;
        int impares = 1;

        /*
        recorremos el array para separar pares e impares y multiplicarlos,
        solo con los números entre medias como pide el ejercicio.
         */
        
        for (int i = 1; i < (vector.length - 1); i++) {
            if (vector[i] % 2 == 0) {
                    pares = pares * vector[i];
            } else { 
                impares = impares * vector[i];  
            }
            
        }
        System.out.println("El producto total de los pares es: " + pares);
        System.out.println("El producto total de los impares es: " + impares);
    }

}
