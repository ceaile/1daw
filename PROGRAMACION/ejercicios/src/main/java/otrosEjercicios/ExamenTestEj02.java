/*
Escribe un programa que muestre un menú con tres opciones: “1.Perímetro”,
“2.Área” y 3.”Salir del programa”
En las dos primeras se le pedirá al usuario que introduzca el lado de un cuadrado y
luego se le mostrará el cálculo. Implementa las funciones:
○ int menu() // Muestra el menú y devuelve el número elegido
○ double pideLado() // Pide que se introduzca el lado y lo devuelve
○ double perimetro(double r) // Calcula el perímetro y lo devuelve
○ double area(double r) // Calcula el área y la devuelve
El menú se repite hasta que el usuario decide salir.
 */
package otrosEjercicios;

import java.util.Scanner;

public class ExamenTestEj02 {

    public static void main(String[] args) {
        /*usamos un boolean y un do while para mantener el juego hasta que se decida cerrar 
        cambiando de sentido a false
        */
        boolean seguir = true;

        do {
            System.out.println();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Elige una de estas 3 opciones: ");
            System.out.println("1. Perímetro");
            System.out.println("2. Área");
            System.out.println("3. Salir del programa");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            Scanner teclado = new Scanner(System.in); //creamos variable Scanner
            
            /*
            Creamos el menú con un switch. 
            Necesita variables dentro para funcionar, como el char para el switch,
            o las propias variables con las que hará los cálculos requeridos para el usuario
            */
            char ch = teclado.next().charAt(0);
            double lado, perimetro, area;
            

            switch (ch) {
                case '1':
                    System.out.println("Introduce el lado del cuadrado. ¡Recuerda usar ',' y no '.' si tiene decimales!");
                    lado = teclado.nextDouble();
                    perimetro = lado * 4;
                    System.out.println("El perímetro de tu cuadrado es: " + Math.round(perimetro));
                    System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ");
                    System.out.println("Se reiniciará el menú.");
                    
                    break;
                case '2':
                    System.out.println("Introduce el lado del cuadrado. ¡Recuerda usar ',' si tiene decimales!");
                    lado = teclado.nextDouble();
                    area = lado * lado;
                    System.out.println("El área de tu cuadrado es: " + Math.round(area));
                    System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ");
                    System.out.println("Se reiniciará el menú.");
                    break;
                case '3':
                    System.out.println("¡Hasta luego, esperamos verte pronto!");
                    seguir = false;
                    break;
                default:
                    System.out.println("! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ! ");
                    System.out.println("No válido. Introduzca solo números 1, 2 ó 3.");
                    System.out.println("Se reiniciará el menú.");
                    

            }
        } while (seguir == true);

    }

}
