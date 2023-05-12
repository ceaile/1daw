/*
Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y
su perímetro. Implementa y utiliza las funciones:
double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
double areaRectangulo(double ancho, double alto) // Devuelve el área
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones07_perimetro_area_rect {
    
    //FUNCION PERIMETRO
    public static double perimetroRectangulo(double ancho, double alto) {
        double resultado = ancho + ancho + alto + alto;
        return resultado;
    }
    
    //FUNCION AREA
    public static double areaRectangulo(double ancho, double alto) {
        double resultado = ancho * alto;
        return resultado;
    }

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Calculemos el perímetro y el área de un rectángulo.");
        
        System.out.println("Escribe el alto. Recuerda utilizar ',' y no '.' si lleva decimales.");
        double alto = teclado.nextDouble();
        System.out.println("Escribe el ancho. Recuerda utilizar ',' y no '.' si lleva decimales.");
        double ancho = teclado.nextDouble();
        
        System.out.println("El perímetro es " + perimetroRectangulo(ancho, alto));
        System.out.println("El área es " + areaRectangulo(ancho, alto));
        
        
        
    }

}
