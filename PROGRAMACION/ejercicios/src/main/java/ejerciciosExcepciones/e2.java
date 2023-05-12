package ejerciciosExcepciones;
import ejerciciosExcepciones.newException;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner),
calcule A/B y muestre el resultado por pantalla. Se deber�n tratar de forma independiente
las dos posibles excepciones, InputMismatchException y ArithmeticException, mostrando
en cada caso un mensaje de error diferente en cada caso.
 */
public class e2 {

    static Scanner teclado = new Scanner(System.in);

    //FUNCIONES
    static public int division(int a, int b) throws newException {

        int result = 0;

        if (a < b || a == 0 || b == 0)
        {
            throw new ArithmeticException("mensaje de excepcion arimetica");

        } else
        {
            try
            {
                result = a / b;
            } catch (Exception e)
            {
                throw new newException();
            }

            return result;
        }

    }

    //MAIN
    public static void main(String[] args) {

        int a = 0;
        int b = 0;

        //NORMAL, TODO EN EL MAIN
        do
            
        {
            try
            {
                System.out.println("Realizaremos una division.");
                System.out.println("Introduce un numero A:");
                System.out.println("Introduce un numero B:");
                a = teclado.nextInt();
                b = teclado.nextInt();

            } catch (InputMismatchException ime)
            {
                System.out.println("EXCEPCION INPUT MISMATCH: ha introducido una letra u otro caracter no numerico");
                teclado.nextLine();
                ime.printStackTrace();
            }
        } while (a == 0 || b == 0); //prevenimos que entre un 0 y caiga en la excepcion aritmetica

        
        System.out.println("Segundo try-catch: division");
        try
        {
            int div = a / b;

        } catch (ArithmeticException ae)
        {
            System.out.println("Ups, cayó en la EXCEPCION ARITMETICA.");
        }

        //USANDO FUNCION DIVISION
        System.out.println("Probaremos lo mismo usando la funcion de dividir");
        try
        {
            division(a, b);
            
        } catch (Exception e)
        {
            System.out.println("Fallo");
        }

    }

}
