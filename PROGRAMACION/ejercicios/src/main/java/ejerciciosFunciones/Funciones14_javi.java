package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones14_javi {

    //FUNCION
    public static String triangulo(String caracter, int lineas) {

        for (int altura = 1; altura <= lineas; altura++)
        {

            for (int espacio = 1; espacio <= lineas - altura; espacio++)
            {
                System.out.print(" ");
            }
            for (int letra = 1; letra <= (altura * 2) - 1; letra++)
            {
                System.out.print(caracter);
            }
            System.out.println();
        }
        return "";
    }

    public static void main(String[] args) {
        // Enunciado del ejercicio
        System.out.println("");
        System.out.println("14. Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir");
        System.out.println("dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo.");
        System.out.println("");

        //Variables ejercicio
        Scanner esc = new Scanner(System.in);
        int lineas = 0;
        String caracter = "";
        //Inicio del programa
        System.out.println("Inicio del Programa:");
        System.out.println("");

        //Sacar valores mediante pantalla
        System.out.println("Introduce la letra a copiar");
        caracter = esc.nextLine();
        System.out.println("");

        System.out.println("Introduce la cantidad de lineas");
        lineas = esc.nextInt();
        System.out.println("");

        System.out.println(triangulo(caracter, lineas));
    }
}
