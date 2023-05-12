/*
Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el
productorio de 1 a N y el valor intermedio entre 1 y N. 

Implementa y utiliza las funciones:
int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones08_suma1aN_producto1aN_intermedio1aN {

    //FUNCION SUMATORIO
    public static int suma1aN(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            suma = suma + i;
        }
        return suma;
    }
    
    //FUNCION PRODUCTORIO
    public static int producto1aN(int n) {
        int producto = 0;
        for (int i = 1; i < n; i++) {
            producto = producto * i;
        }
        return producto;
    }
    
    
    //FUNCION INTERMEDIO
    public static double intermedio1aN(double n) {
        double resultado = (1 + n) / 2;
        return resultado;
    }
    
    
    //CODIGO
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el número con el que trabajar: ");
        int numero = teclado.nextInt();
        
        System.out.println("El sumatorio de 1 a tu número es:" + suma1aN(numero));
        
        System.out.println("El producto de 1 a tu número es:" + producto1aN(numero));
        
        System.out.println("El número intermedio de 1 a tu número es:" + intermedio1aN(numero));
    }
    
}
