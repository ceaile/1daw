/*
Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una
empresa y detectar si existe brecha salarial entre ambos. El programa pedirá por teclado la
información de N personas distintas (valor también introducido por teclado). Para cada
persona, pedirá su género (0 para varón y 1 para mujer) y su sueldo. Esta información debe
guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada
género.
 */
package ejerciciosMatrices;

import java.util.Scanner;

public class Matrices05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número de personas total a evaluar: ");
        int N = teclado.nextInt();

        int matriz[][] = new int[N][2];
        int Mujeres = 0;
        int Hombres = 0;
        int sumaMujeres = 0;
        int sumaHombres = 0;
                
        //bucle para introducir datos
        for (int j = 0; j < matriz.length; j++) {
                //sin bucle interior porque solo hay 2 posiciones y encima se introducen datos de distinto tipo
                System.out.println("Introduce el género de la persona " + (j+1) + ". Mujer pulse 1. Hombre pulse 0.");
                matriz[j][0] = teclado.nextInt();
                
                System.out.println("Introduce el sueldo anual de la persona " + (j+1));
                matriz[j][1] = teclado.nextInt();   
        }
        

        
        //bucle para procesarlos
        for (int j = 0; j < matriz.length; j++) {
            if (matriz[j][0] == 1) {
                Mujeres++;
                sumaMujeres += matriz[j][1]; 
            } else {
                Hombres++;
                sumaHombres += matriz[j][1];
            } 
        }
        
        System.out.println("El sueldo medio de las mujeres evaluadas es: " + (sumaMujeres / Mujeres) );
        System.out.println("El sueldo medio de los hombres evaluados es: " + (sumaHombres / Hombres) );
        
    }

}
