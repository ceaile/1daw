
package ejerciciosExcepciones;
/*
Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de
Scanner) y luego muestre por pantalla el mensaje “Valor introducido: ...”. Se deberá tratar la
excepción InputMismatchException que lanza nextInt() cuando no se introduce un entero
válido. En tal caso se mostrará el mensaje “Valor introducido incorrecto”.
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class e1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un valor numérico. Si no lo haces y metes una letra saltará una excepcion");
        
        try{
            int valor = teclado.nextInt();
            
        } catch (InputMismatchException e){
            System.out.println("Mensaje que he escrito yo:");
            System.out.println("Valor introducido incorrecto");
            System.out.println("Mensaje de la Excepción:");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
        
        
        
        
        
    }
}
