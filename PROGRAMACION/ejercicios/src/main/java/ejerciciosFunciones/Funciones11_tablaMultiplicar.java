/*
Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones11_tablaMultiplicar {

    //FUNCION
    public static String tablaMultiplicar(int num) {
        
        int resultado;
        String cadena = "";
        
        for (int i = 0; i < 11; i++) {
            resultado = num * i;
            cadena = cadena + (num + " x " + i + " = " + resultado) + "\n";
        }
        cadena = cadena + "\n";
        return cadena;
    }
    
    //CODIGO
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero = 0;
        
        System.out.println("Introduce un número para imprimir su tabla de multiplicar");
        
        numero = teclado.nextInt();
        
        System.out.println(tablaMultiplicar(numero));
        
        //test: 
        //tablaMultiplicar(7);
        
        
        
        
        
    }
    
}
