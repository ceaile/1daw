/*
Entrada: Cada caso de prueba es un número entre 1 y 9.999.999. La entrada termina con un 0, que no debe procesarse. 

Salida: Por cada caso de prueba el programa escribirá la representación del número en notación egipcia. 
Dado que no se pueden escribir los símbolos originales, 
para cada uno se utilizará la inicial del nombre del símbolo que aparece destacada en la tabla superior 
(por orden de menor a mayor potencia, T, G, C, F, D, R y H). 
Se indicarán primero los símbolos de mayor valor. 
 */
package otrosEjercicios;

import java.util.Scanner;

/*
H = 1.000.000
R =   100.000
D =    10.000
F =     1.000
C =       100
G =        10
T =         1
 */
public class PreNavidad2022 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        /*
        Instrucciones:
        1. Iniciamos la var numero a 1 para que entre al bucle sin tener que pedirlo ya al user
        2. Dentro ya del bucle, sobreeescribimos el num a traducir por el que quiere el user
        3. Copiamos ese num en otra var para no ensuciarlo con cálculos, dado que llegará a 0
        4. Hace los cálculos restando en minibucles cada "escalón", y mete en un String la letra las veces necesarias
        5. Imprime al final el String y reinicia al final (innecesario?) en blanco el String para el num siguiente
        */
        

        int numero = 1; //iniciamos el numero a un num random para que entre al bucle
        
        while (numero != 0) { //entra porque no es 0
            
            System.out.println("Introduce un número entre 1 y 9.999.999");
            numero = teclado.nextInt();         //sobreeescribe aquí el numero con el intrducido por teclado
            String resultado = "";              //lo que sacará la "traducción
            int operacion = numero;             //copiamos el num en otra var para no ensuciarlo
            
            //System.out.println("Ha entrado al bucle.");
            if (operacion >= 1000000)
            {
                //System.out.println("Ha entrado al if1");
                while (operacion >= 1000000)
                {
                    //System.out.println("Ha entrado al while del if1");
                    operacion = operacion - 1000000;
                    String simboloH = "H";
                    resultado = resultado + simboloH;
                }
            } else if (operacion >= 100000)
            {
                //System.out.println("Ha entrado al if2");
                while (operacion >= 100000)
                {
                    //System.out.println("Ha entrado al while del if2");
                    operacion = operacion - 100000;
                    String simboloR = "R";
                    resultado = resultado + simboloR;
                }
            } else if (operacion >= 10000)
            {
                //System.out.println("Ha entrado al if3");
                while (operacion >= 10000)
                {
                    //System.out.println("Ha entrado al while del if3");
                    operacion = operacion - 10000;
                    String simboloD = "D";
                    resultado = resultado + simboloD;
                }
            } else if (operacion >= 1000)
            {
                //System.out.println("Ha entrado al if4");
                while (operacion >= 1000)
                {
                    //System.out.println("Ha entrado al while del if4");
                    operacion = operacion - 1000;
                    String simboloF = "F";
                    resultado = resultado + simboloF;
                }
            } else if (operacion >= 100)
            {
                //System.out.println("Ha entrado al if5");
                while (operacion >= 100)
                {
                    //System.out.println("Ha entrado al while del if5");
                    operacion = operacion - 100;
                    String simboloC = "C";
                    resultado = resultado + simboloC;
                }
            } else if (operacion >= 10)
            {
                //System.out.println("Ha entrado al if6");
                while (operacion >= 10)
                {
                    //System.out.println("Ha entrado al while del if6");
                    operacion = operacion - 10;
                    String simboloG = "G";
                    resultado = resultado + simboloG;
                }
            } else if (operacion >= 1)
            {
                //System.out.println("Ha entrado al if7");
                while (operacion >= 1)
                {
                    //System.out.println("Ha entrado al while del if7");
                    operacion = operacion - 1;
                    String simboloT = "T";
                    resultado = resultado + simboloT;
                }
            }

            System.out.println(resultado);
            System.out.println("");
            resultado = ""; //ponemos en blanco el string cada vez que da una vuelta
   
        }

    }

}
