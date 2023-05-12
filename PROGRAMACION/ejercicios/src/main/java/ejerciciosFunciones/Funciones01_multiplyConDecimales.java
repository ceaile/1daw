/*
Nota: Ninguna función mostrará nada por pantalla a no ser que se diga lo contrario.
1. Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
resultado de multiplicarlos. Implementa y utiliza la función:
double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 */
package ejerciciosFunciones;

public class Funciones01_multiplyConDecimales {

    public static double multiplyConDecimales(double a, double b) {
        double resultado = a * b;
        return resultado;

    }
    
    public static void main(String args[]) {
        double pepe = 4.7;
        double baba = 5.3;
        
        double resultEjercicio = multiplyConDecimales(pepe, baba);
        
        System.out.println(resultEjercicio);
    }
}
