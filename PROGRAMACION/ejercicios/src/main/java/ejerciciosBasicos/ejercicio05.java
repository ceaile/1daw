package ejerciciosBasicos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAW
 * 
 * Escribe un programa que toma como dato de entrada un número que corresponde 
 *   a la longitud de un radio y 
 *  nos escribe la longitud de la circunferencia, el área del círculo y el volumen de la
    esfera que corresponden con dicho radio
 */
import java.util.Scanner;
public class ejercicio05 {
    public static void main(String args[]) {
        double radio = 0;
        double longitudCircunferencia = 0;
        double areaCirculo = 0;
        double volumenEsfera = 0;
        Scanner escanerNumero = new Scanner(System.in);
        System.out.println("Introduce la longitud del radio de la circunferencia: ");
        //longitud circunferencia: (2*pi)*diametro
        //area: pi* radio^2
        //volumen: 4/3*pi*R^3
        radio = escanerNumero.nextInt();
        longitudCircunferencia = radio * (Math.PI) * 2;
        areaCirculo = (Math.PI) * Math.pow(radio, 2);
        volumenEsfera = (4/3) * (Math.PI) * Math.pow(radio, 3);
        System.out.println("La longitud de tu circunferencia es " + Math.round(longitudCircunferencia));
        System.out.println("El área de tu círculo es " + Math.round(areaCirculo));
        System.out.println("El volumen de tu esfera sería " + Math.round(volumenEsfera));
        
        
        
        
                
    }
}
