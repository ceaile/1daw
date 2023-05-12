/*
Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
 */
package ejerciciosFunciones;

import java.util.Scanner;
import java.util.Arrays;

public class Funciones06_precioConIVA {
    
    //FUNCION
    public static double precioConIVA(double precio, double porcentaje) { 
        
        /*
        calcular precio con iva:
        calcular 21% de la cantidad,
        sumar cantidad + el 21% de la cantidad.
        */
        
        double iva = porcentaje * 0.01;
        double resultado = precio + iva;
        return resultado;
        //return Math.round(resultado); (•ᴗ•)
    }
    
    //CODIGO
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        double precio = 0;
        double porcentaje = 21;
        double vectorPrecios[] = new double[5];
        double vectorIVA[] = new double[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca un precio para calcular el precio + IVA");
            precio = teclado.nextDouble();
            vectorPrecios[i] = precio;
            vectorIVA[i] = precioConIVA(precio, porcentaje);
        }
        
        System.out.println("La lista de precios es: " + Arrays.toString(vectorPrecios));
        System.out.println("La lista de precios con IVA es: " + Arrays.toString(vectorIVA));
    }
    
}
