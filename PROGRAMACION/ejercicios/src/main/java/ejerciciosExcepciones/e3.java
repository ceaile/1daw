package ejerciciosExcepciones;

/*
Implementa un programa que cree un vector tipo double de tama�o 5 y luego, utilizando un
bucle, pida cinco valores por teclado y los introduzca en el vector. Tendr�s que manejar la/las
posibles excepciones y seguir pidiendo valores hasta rellenar completamente el vector.
 */
import ejerciciosExcepciones.newException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class e3 {

    static Scanner teclado = new Scanner(System.in); //lo dejo static y asi puedo usarlo tambien en la funcion de la excepcion

    public static void main(String[] args) {

        //CON EXCEPCIONES QUE YA EXISTEN, HACEMOS EN EL MAIN TODO
        boolean continuar = true;

        do {
            System.out.println("Creamos un vector de double de 5 posiciones. Se te pedirán los datos a continuacion:");
            double vector[] = new double[5];
            try {

                for (int i = 0; i < vector.length; i++) {
                    System.out.println("Introduzca un número decimal en el vector:");
                    System.out.println("Escríbelo CON COMAS");
                    vector[i] = teclado.nextDouble();
                }
                continuar = false;

            } catch (IndexOutOfBoundsException ioobe) //no necesita importar nada
            {
                System.out.println("EXCEPCION INDEX OUT OF BOUNDS: Has metido en una posicion del array que no existe o alguna cosa similar ");
                System.out.println("");

            } catch (InputMismatchException ime) { //necesita import
                System.out.println("EXCEPCION INPUT MISMATCH: Metiste una letra o un caracter en lugar de un numero");
                System.out.println("");
                teclado.nextLine();

            }
        } while (continuar == true);
        System.out.println("Ha terminado bucle 1");
        System.out.println("");

        //HACER LO MISMO PERO CON MI FUNCION PROPIA
        System.out.println("Empieza el test con la funcion propia");
        boolean continuar2 = true;
        do {
            try {
                rellenarArray();
                System.out.println();
                continuar2 = false;

            } catch (newException ne) {
                System.out.println("EXCEPCION PROPIA NEW EXCEPTION");
                System.out.println(ne.mensaje());

            }

        } while (continuar == true);

    }

    /*
    la funcion hace lo que hariamos en el main + lanza excepcion
    hay que a�adir un import de la excepcion propia, no la encuentra solo porque esten en el mismo paquete
    
    if ([instrucci�n que s� que no va a petar pero no quiero que ocurra]) -> throw exception.
    if ([instrucci�n que s� que puede petar]) try catch [La excepcu�n que puede petar o excepci�n gen�rica (Exception)]. 
    if ([Instrucci�n que puede petar pero quiero sacar miExcepticon]) -> try catch (Exception) -> throw miExcepcion
     */
    static public void rellenarArray() throws newException {

        double vector[] = new double[5];
        double num = 0;

        try {

            for (int i = 0; i < vector.length; i++) {
                System.out.println("Introduzca un valor en el vector:");
                num = teclado.nextDouble();
                vector[i] = num;

            }

        } catch (Exception e) {

            throw new newException();
        }

    }

}
