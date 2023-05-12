/*
Crea un programa que permita al usuario almacenar una secuencia aritmética en un array y
luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería
1, 3, 5, 7, 9... Con V=7 e I=10, la secuencia sería 7, 17, 27, 37... El programa solicitará al
usuario V, I además de N (nº de valores a crear)
 */
package ejerciciosArrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays13 {

    public static void main(String[] args) {

        // crear e iniciar las variables a utilizar
        System.out.println("Introduce el número de valores que deseas almacenar en la secuencia:");
        int secuencia; // = N
        Scanner teclado = new Scanner(System.in);
        secuencia = teclado.nextInt();

        System.out.println("Introduce el valor inicial para la secuencia aritmética:");
        int inicio; // = V
        inicio = teclado.nextInt();

        System.out.println("Introduce el valor del incremento para la secuencia aritmética:");
        int incremento; // = I
        incremento = teclado.nextInt();

        //crear array y la propia secuencia
        int vector[] = new int[secuencia];

        int acumulacion = 0;

        boolean posicion0 = true;

        for (int i = 0; i < vector.length; i++) {
            if (posicion0 == true) {
                vector[i] = inicio;
                posicion0 = false;
            } else {
                vector[i] = incremento + acumulacion;
                acumulacion = vector[i];
            }


        }

        System.out.println(Arrays.toString(vector));

    }

}
