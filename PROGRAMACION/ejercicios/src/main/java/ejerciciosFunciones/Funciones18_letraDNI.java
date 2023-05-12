/*
El NIF (o letra asociada a un DNI) se obtiene de la siguiente manera: Se divide el número de DNI
entre 23 y el resto es codificado por una letra según la siguiente equivalencia:

0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E".

Escribe un programa que pida el DNI y muestre por pantalla la letra asociada. Para ello se
deberá crear una función a la que se le pase el número y devuelva la letra.
Ejemplo: para el DNI 56321122 el NIF es ‘X’.
 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones18_letraDNI {

    //FUNCION
    public static char letraDNI(int num) {
        
        
        String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";
        return cadena.toCharArray()[num%cadena.length()];
        
        /*
        int resto = num % 23;
        char letra = ' ';
        
        switch (resto)
        {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
            default:
                letra = ' ';
        }
        return letra;
        */
        
    }

    //CODIGO
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el número del DNI para averiguar la letra asociada (NIF): ");
        int dni = teclado.nextInt();
        
        System.out.println("La letra del DNI introducido es:");
        
        System.out.println(letraDNI(dni));
    }

}
