package ejerciciosBasicos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW
 */
import java.util.Scanner;
public class ejercicio03 {
    public static void main(String args[]) {
        int lado = 0;
        int resultado = 0;
        Scanner escanerlado = new Scanner(System.in);
        System.out.println("Introduce la medida del lado del cuadrado para calcular su area");
        lado = escanerlado.nextInt();
        resultado = lado * lado;
        System.out.println("El resultado es " + resultado);
               
    }
}
