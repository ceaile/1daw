package ejerciciosBasicos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW
 * Dibuja un ordinograma que dado el precio de un artículo y el precio de venta
real nos muestre el porcentaje de descuento realizado.
 */
import java.util.Scanner;
public class ejercicio06 {
    public static void main(String args[]) {
        double precioArticulo;
        double precioVenta;
        double Descuento;
        System.out.println("Escribe precio del artículo");
        Scanner escPrecioArticulo = new Scanner(System.in);
        precioArticulo = escPrecioArticulo.nextInt();
        System.out.println("Escribe precio de venta");
        Scanner escPrecioVenta = new Scanner(System.in);
        precioVenta = escPrecioVenta.nextInt();
        Descuento = (( precioArticulo - precioVenta ) * 100) / precioArticulo;
        System.out.println("El descuento es " + Descuento );
        
                
    }
}
