/*
Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo.
Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado. Se debe
crear una función a la que le pasemos ambos valores y nos devuelva el descuento.
 */
package ejerciciosFunciones;

import java.util.Scanner;
public class Funciones13_descuento {

    //FUNCION
    public static double descuento(double num1, double num2) {
        double resultado = (num2 * 100) / num1;
        resultado = 100 - resultado;
        return resultado;
        
        /*
        precio normal = 76 (ejemplo)
        precio con descuento = 55 (ejemplo)
        76€ --- 100%
        55€ --- 72%
        100% - 72% = resultado
        
        */
    }
    
    //CODIGO
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un precio sin descuento:");
        double precioNormal = teclado.nextDouble();
        
        System.out.println("Introduce un precio con descuento:");
        double precioDescuento = teclado.nextDouble();
        
        System.out.println(descuento(precioNormal, precioDescuento));
    }
    
}
