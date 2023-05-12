/*
Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
hasta que el usuario elija la opción ‘c’ que terminará el programa.
 */

package ejerciciosArrays;

import java.util.Scanner;
import java.util.Arrays;

public class Arrays12mathrandomswitchcase {

    public static void main(String[] args) {

        //ARRAY DE ALEATORIOS
        int vector[] = new int[10];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10);
            /* 
            math.random es para números con decimales,
            necesitas hacer casting para convertirlos a enteros, y x10 para conseguir nº del 0-9
            */
        }

        //IMPORTANTE
        boolean juego = true;

        do {
            //OPCIONES
            System.out.println("Elige una opción de estas 3: ");
            System.out.println("a. Mostrar valores.");
            System.out.println("b. Introducir valor.");
            System.out.println("c. Salir.");

            char ch;

            Scanner teclado = new Scanner(System.in);
            ch = teclado.next().charAt(0);

            switch (ch) {
                case 'a':
                    System.out.println(Arrays.toString(vector));
                    break;

                case 'b':
                    //Variables. No introducidas al principio dado que solo se usan en case B
                    int numero;
                    int posicion;

                    System.out.println("Introduzca un número");
                    Scanner entrada = new Scanner(System.in);
                    numero = entrada.nextInt();
                    System.out.println("Introduzca la posición donde desea cambiarlo:");
                    posicion = entrada.nextInt();

                    //cambiar la posición por el numero
                    for (int i = 0; i < vector.length; i++) {
                        if (i == posicion) {
                            vector[i] = numero;
                        }
                    }
                    System.out.println(Arrays.toString(vector));
                    break;

                case 'c':
                    juego = false;
                    //Si no fuera un bucle, podría usar: System.exit(0);
                    break;
                default:
                    System.out.println("No corresponde. Introduzca solo 'a', 'b' ó 'c' (en minúsculas): ");
            }

        } while (juego == true);
        
        
        
        
        

    }

}
