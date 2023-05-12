/*
Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones02_mayorDeEdad_boolean {

    public static boolean MayorDeEdad(int a) {
        return a >= 18;   
    }
    
    public static void main(String[] args) {
        
        System.out.println("Introduce una edad para comprobar si es mayor de edad o no: ");
        Scanner teclado = new Scanner(System.in);
        int edad = teclado.nextInt();
        
        if (MayorDeEdad(edad)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("NO es mayor de edad");
        }
    }
    
}
