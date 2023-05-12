/**
 * double X = Math.pow(x , 2); double Y = Math.pow(y, 2); double Z = Math.pow(z,
 * 2);
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones19_javi {

    //FUNCION
    public static String ecuacionPitagoras(int x, int y, int z) {

        //Math.pow(x , 2) + Math.pow(y, 2) == Math.pow(z, 2);
        double X = Math.pow(x, 2);
        double Y = Math.pow(y, 2);
        double Z = Math.pow(z, 2);

        if (X + Y == Z)
        {
            System.out.println("La ecuacion de pitagoras x ² + y ² = z ² : ");
            System.out.println("");
            return "Son iguales";
        } else
        {
            System.out.println("La ecuacion de pitagoras x ² + y ² = z ² : ");
            System.out.println("");
            return "No son iguales";
        }

    }

    //PROGRAMA
    public static void main(String[] args) {

        // Enunciado del ejercicio
        System.out.println("");
        System.out.println("19. Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta");
        System.out.println("a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se");
        System.out.println("deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.");
        System.out.println("Por ejemplo: 3 ² + 4 ² = 5 ².");
        System.out.println("");
        System.out.println("");

        //Variables ejercicio
        Scanner esc = new Scanner(System.in);
        int x, y, z;

        //Inicio del programa
        System.out.println("Inicio del Programa:");
        System.out.println("");

        //Sacar valores mediante pantalla
        System.out.println("Introduce el valor de X en la ecuacion: x ² + y ² = z ²");
        x = esc.nextInt();
        System.out.println("");

        System.out.println("Introduce el valor de Y en la ecuacion: x ² + y ² = z ²");
        y = esc.nextInt();
        System.out.println("");

        System.out.println("Introduce el valor de Z en la ecuacion: x ² + y ² = z ²");
        z = esc.nextInt();
        System.out.println("");

        //Llamada a la funcion ecuacionPitagoras(x,y,z)
        System.out.println(ecuacionPitagoras(x, y, z));

    }
}
