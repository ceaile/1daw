package ejerciciosBasicos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW
 */
/*Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta,
    producto y division*/
import java.util.Scanner;
public class ejercicio04 {
    public static void main(String args[]) {
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        Scanner escanerNum1 = new Scanner(System.in);
        System.out.println("Introduce un número");
        numero1 = escanerNum1.nextInt();
        Scanner escanerNum2 = new Scanner(System.in);
        System.out.println("Introduce otro número");
        numero2 = escanerNum2.nextInt();
        resultado = numero1 * numero2;
        System.out.println("El resultado es " + resultado);
                
    }
}
