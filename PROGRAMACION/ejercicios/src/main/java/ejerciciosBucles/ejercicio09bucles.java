package ejerciciosBucles;

/*
Dibuja un ordinograma de un programa que calcula y escribe la suma y el
producto de los 10 primeros números naturales.
 */

import java.util.Scanner;
public class ejercicio09bucles {
    public static void main(String[] args) {
        
        /* System.out.println("Introduce el número");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt(); */
        
        int suma = 0;
        int producto = 1;
        
        for (int cont = 1 ; cont <= 10 ; cont++) {
            suma = suma + cont;
            producto = producto * cont;
            cont = cont + 1;
        }
        System.out.println("La suma es " + suma + " y el producto es " +  producto);

    }
    
}
