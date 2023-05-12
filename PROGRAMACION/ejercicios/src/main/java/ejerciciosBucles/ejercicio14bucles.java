package ejerciciosBucles;

/*
Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado
(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar dicha
cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el mínimo de
billetes posible. Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario
1 billete de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de
5, que aunque sume 145 € no es el mínimo número de billetes posible)
 */

import java.util.Scanner;
public class ejercicio14bucles {
    public static void main(String[] args) {
        
        int cantidad = 0; //a meter por teclado
        int n = 500; //valor de billetes, empezando desde 500. Irá cambiando.
        int nBill = 0;
        
        System.out.println("Escribe una cantidad en €: ");
        Scanner teclado = new Scanner(System.in);
        cantidad = teclado.nextInt();
        
        while (cantidad > 0) {
            nBill = cantidad / n; //la fórmula
            cantidad = cantidad % n ; //para sustituir la cantidad al 'resto' 
            System.out.println(nBill + " billetes de " + n);
            
        
            switch (n) {
             case 500:
                 n = 200;
                 break;
             case 200:
                 n = 100;
                 break;
             case 100:
                 n = 50;
                 break;
             case 50:
                 n = 20;
                 break;
             case 20:
                 n = 10;
                 break;
             case 10:
                 n = 5;
                 break;       
            }
    
            
        }
    }
    
}
