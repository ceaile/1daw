package otrosEjercicios;

/*
La entrada estará compuesta de una serie de casos de prueba. 
Cada caso de prueba está compuesto de una única línea que tiene tres números enteros 
(no mayores de 10^9) separados por espacios. 
Los dos primeros números indican cuántos envoltorios se necesitan para que nos den qué cantidad de chicles. 
El tercer número indica el número de chicles que compramos inicialmente. 
Ninguno de esos números será negativo; 
el primero, además, será siempre mayor que cero. 
Los casos de prueba terminan cuando los tres son cero. 
 */

/**
Para cada caso de prueba se escribirá una línea que tendrá, a su vez, dos números. 
El primero indicará el número total de chicles que nos comemos, 
y el segundo con cuántos envoltorios nos quedamos al final.

Si la oferta hace que la empresa se arruine con nosotros se escribirá RUINA. 
Se considerará que la empresa va a la ruina cuando tenga que regalarnos chicles de forma indefinida.
 */

import java.util.Scanner;
public class retoChicles {

    public static void main(String[] args) {
        
        // variables entrada
        int chiclesComprados = 0; // Z
        int envoltoriosSeNecesitan = 0; // Y
        int chiclesTeDan = 0; // W
        
        // variables salida
        int chiclesComidos = 0; // C
        int envoltoriosQuedan = 0; // B
        
        // resto de variables
        int A = 0; // A
        int X = 0; // X
        
        //Parte 1: Leer
        
        do {
            
        
            // "Escribe la cantidad de envoltorios que exigen para cambiar"); = Y
            System.out.println();
            Scanner teclado = new Scanner(System.in);
            envoltoriosSeNecesitan = teclado.nextInt();
            System.out.print(envoltoriosSeNecesitan + ", ");

            // "Escribe la cantidad de chicles te dan por la cantidad anterior de envoltorios"); = W
            System.out.println();
            
            chiclesTeDan = teclado.nextInt();
            System.out.print(chiclesTeDan + ", ");

            // "Escribe la cantidad de chicles que has comprado") = Z
            System.out.println();
            chiclesComprados = teclado.nextInt();
            System.out.println(chiclesComprados);
            
            
            //Parte 2: Calcular

                /* 
                paso1: Z / Y = X
                paso2: comprobar que X es mayor o igual que Y ( x = b | c = z + b)
                paso3: X / Y = B (resultado de salida 2)
                paso4: comprobar que W no sea mayor nunca que Y (ruina si no)
                paso5: Z + X = A
                paso6: A + B = C (resultado de salida 1)
                */
                
                
            if (envoltoriosSeNecesitan != 0 && chiclesTeDan != 0 && chiclesComprados != 0) { // para finalizar

                X = chiclesComprados / envoltoriosSeNecesitan;
                if (X >= envoltoriosSeNecesitan) {
                    envoltoriosQuedan = X / envoltoriosSeNecesitan;
                    if (chiclesTeDan >= envoltoriosSeNecesitan) {
                        System.out.println("RUINA"); // para evitar error 01: que se enfrasque en bucle infinito
                    } else {
                        A = chiclesComprados + X;
                        chiclesComidos = A + envoltoriosQuedan;
                        }
                } else {
                    envoltoriosQuedan = X;
                    chiclesComidos = chiclesComprados + envoltoriosQuedan;
                }
                System.out.println("---------------------------");
                    System.out.print(chiclesComidos + " ");
                    System.out.println(envoltoriosQuedan);  
            } else if (envoltoriosSeNecesitan != 0 || chiclesComprados != 0 || chiclesTeDan != 0) {
                System.out.println("ERROR"); 
            } // para cuando se introduzca un 0 en alguno de los datos
        } while (envoltoriosSeNecesitan != 0 || chiclesComprados != 0 || chiclesTeDan != 0); // para que solo funcione si no se introduce un 0  
        
        
         
         
         
        
        
        
        
        
        
                
                

    }
    
}
