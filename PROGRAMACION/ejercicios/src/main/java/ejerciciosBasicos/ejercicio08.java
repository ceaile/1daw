package ejerciciosBasicos;

/* Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de
edad” solo si lo somos. */
import java.util.Scanner;

public class ejercicio08 {
    public static void main(String[] args) {
       System.out.println("Introduce tu edad: ");
       Scanner escanerEdad = new Scanner(System.in);
       int edad = escanerEdad.nextInt();
       if (edad >= 18) {
           System.out.println("Eres mayor de edad");
       }
       else {
           System.out.println("Pídele a tu madre que te haga un colacao y no vuelvas");
       }
    }
    
}
