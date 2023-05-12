package ejerciciosBucles;

/*
Dibuja un ordinograma de un programa que lea una secuencia de números
no nulos, terminada con la introducción de un 0, y obtiene e imprime si ha
leído algún número negativo, cuantos positivos y cuantos negativos
 */
import java.util.Scanner;
public class ejercicio08bucles {
    public static void main(String[] args) {
      
        int neg = 0;
        int pos = 0;
        int num = 0;
        
        System.out.println("Introduce el número");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        
        while (num != 0) {
            if (num < 0) {
                neg++;
            } else {
                pos++;
            }
            System.out.println("Introduce el número:");
            num = teclado.nextInt();
        }
        
        if (neg > 0) {
            System.out.println("Se han introducido números negativos");
        }
        
        System.out.println("Se han introducido " + pos + " números positivos.");
        System.out.println("Se han introducido " + neg + " números negativos.");
    }
    
}
