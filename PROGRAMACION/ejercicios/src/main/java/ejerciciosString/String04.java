/*
Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
Nº de A's: 3
Nº de E's: 1
Nº de I's: 2
Nº de O's: 0
Nº de U's: 0
 */
package ejerciciosString;

import java.util.Scanner;

public class String04 {

    public static void main(String[] args) {

        String frase;

        System.out.println("Introduzca una frase para contar sus vocales: ");
        Scanner teclado = new Scanner(System.in);
        frase = teclado.nextLine();
        
        int contA = 0;
        int contE = 0;
        int contI = 0;
        int contO = 0;
        int contU = 0;

        //la lluvia en sevilla es una maravilla
        for (int i = 0; i < frase.length(); i++) {
            char c1 = frase.charAt(i);

            switch (c1) {
                case 'a':
                    contA++;
                    break;
                case 'e':
                    contE++;
                    break;
                case 'i':
                    contI++;
                    break;
                case 'o':
                    contO++;
                    break;
                case 'u':
                    contU++;
                    break;
            }

        }
        System.out.println("'a' se repite " + contA + " veces.");
        System.out.println("'e' se repite " + contE + " veces.");
        System.out.println("'i' se repite " + contI + " veces.");
        System.out.println("'o' se repite " + contO + " veces.");
        System.out.println("'u' se repite " + contU + " veces.");

    }

}
