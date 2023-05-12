/*
Implementa un programa que cree un vector de enteros de tamaño N (número aleatorio
entre 1 y 100) con valores aleatorios entre 1 y 10. Luego se le preguntará al usuario qué
posición del vector quiere mostrar por pantalla, repitiéndose una y otra vez hasta que se
introduzca un valor negativo. Maneja todas las posibles excepciones.
 */
package ejerciciosExcepciones;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

public class e4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //CREACION DEL VECTOR
        int tamañoVector = (int) (Math.random() * 100 + 1);

        int vector[] = new int[tamañoVector];

        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = (int) (Math.random() * 10) + 1;
        }
        
        System.out.println("Se ha creado un vector de tamaño aleatorio entre 1 y 100 y relleno de valores del 1 al 10.");
        System.out.println("Tamaño del vector: " + vector.length);
        System.out.println("Vector to String: " + Arrays.toString(vector));

        System.out.println("EJECUCION DE PRUEBA SOLO EN MAIN:");
        int posicionElegida = 0;

        do
        {
            try
            {
                
                System.out.println("");
                System.out.println("Qué posicion desea visualizar del vector?");
                System.out.println("Solo introduzca un valor negativo si desea salir");
                posicionElegida = teclado.nextInt();

                if (posicionElegida < vector.length && posicionElegida >= 0)
                {
                    System.out.println("Lo que hay en la posicion elegida es: " + vector[posicionElegida]);
                } else if (posicionElegida >= vector.length)
                {
                    throw new IndexOutOfBoundsException("EXCEPCION INDEX OUT OF BOUNDS: Ha introducido una posicion mayor del largo total");
                }

            } catch (InputMismatchException ime) //error de si meten letra (sale sola)
            {
                System.out.println("EXCEPCION INPUT MISMATCH");
                ime.printStackTrace();
                teclado.nextLine();

            } catch (Exception e) //error generico, que a lo mejor recoge el IndexOutOfBoundsException, por si la prevencion no fuera suficiente
            {
                System.out.println("EXCEPCION GENERICA: Puede tratase del IndexOutOfBoundsException.");
                System.out.println("Mensaje de la excepcion: " + e.getMessage());
                e.printStackTrace();
                teclado.nextLine();
            }
        } while (posicionElegida >= 0);
        System.out.println("Ha decidido salir del test 1.");

        //----------------------------------------------------------------------
        // CON FUNCIONES
        //----------------------------------------------------------------------
        System.out.println("");
        System.out.println("EJECUCION DE PRUEBA CON FUNCIONES");
        System.out.println("Esta parte reutiliza el mismo vector y su misma longitud y contenido.");
        boolean continuar = true;
        do
        {
            try
            {
                System.out.println("");
                System.out.println("Introduzca el numero de posicion que desea visualizar:");
                System.out.println("Introduzca un numero negativo para salir.");
                posicionElegida = teclado.nextInt();

            } catch (InputMismatchException ime) //error de si meten letra
            {
                System.out.println("EXCEPCION INPUT MISMATCH: No metas una letra o algo que no sea un numero");
                ime.printStackTrace();
                teclado.nextLine();
            }

            try
            {
                if (posicionElegida >= 0 && posicionElegida < vector.length)
                {
                    System.out.println("Este es el contenido: " + verContenido(vector, posicionElegida));
                } else if (posicionElegida > vector.length)
                {
                    throw new IndexOutOfBoundsException("EXCEPCION INDEX OUT OF BOUNDS: ha introducido un valor fuera del vector");
                    
                } else if (posicionElegida < 0){
                    System.out.println("Ha elegido salir.");
                    continuar = false;
                }
            } catch (Exception e)
            {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

        } while (continuar == true);

    } //cierre Main

    //FUNCION
    static public int verContenido(int[] vector, int posicion) throws Exception {
        int num = 0;

        try
        {
            num = vector[posicion];

        } catch (Exception e)
        {

            throw new Exception("EXCEPCION: error inesperado");
        }
        return num;
    }

} //cierre total
