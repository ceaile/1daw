/*
Realiza un programa que lea y acepte únicamente aquellos que sean mayores que el último
dado. La introducción de números finaliza con la introducción de un 0. Al final se mostrará:
El total de números introducidos, excluido el 0.
El total de números fallados.
 */
package ejerciciosBucles;

import java.util.Scanner;

public class Ejercicio17bucles_b {

    public static void main(String[] args) {

        int total = 0;
        int fallados = 0;
        int ultimo;

        System.out.println("Introduce un número");
        Scanner teclado = new Scanner(System.in);
        int mayor = teclado.nextInt();

        do
        {
            System.out.println("Introduce un número mayor");
            ultimo = teclado.nextInt();
            if (ultimo > mayor)
            {
                mayor = ultimo;
                total++;

            } else if (ultimo == 0)
            {
                total++;
                System.out.println("Fin del juego.");
            } else
            {
                System.out.print("Número inaceptable. ");
                ultimo = mayor;
                fallados++;
                total++;

            }
        } while (ultimo != 0);

        System.out.println("El total de números introducidos es " + total);
        System.out.println("El total de números erróneos es " + fallados);
        System.out.println("El número más grande que has introducido es " + mayor);

    }

}
