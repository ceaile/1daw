/*
Escribe un programa que imprima las tablas de multiplicar del 1 al 10. Implementa una función
que reciba un número entero como parámetro e imprima su tabla de multiplicar.
 */

package ejerciciosFunciones;

import ejerciciosFunciones.Funciones11_tablaMultiplicar;

public class Funciones20_importar_funcion11 {

    //CODIGO
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(Funciones11_tablaMultiplicar.tablaMultiplicar(i));
        }
        
    }
    
}
