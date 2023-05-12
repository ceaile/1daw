package ejerciciosBucles;

/*
Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
introducimos por teclado.
 */

import java.util.Scanner;
public class ejercicio15bucles {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int escNum = teclado.nextInt();
        
        int num = 1;
        while (num <= escNum){
            num = num * 3;
            System.out.println( num + ", ");
        }
        

        
        
        
    }
    
}
