package ejerciciosBucles;

/*
Realiza un programa donde el usuario "piensa" un número del 1 al 100 
y el ordenador intenta
adivinarlo. Es decir, el ordenador irá proponiendo números una y otra vez hasta adivinarlo 
(el usuario deberá indicarle al ordenador si es mayor, 
menor o igual al número que ha pensado).
 */

import java.util.Scanner; 
public class ejercicio13bucles {

    public static void main(String[] args) {
        
        boolean seguir = true;
        int max = 100;
        int min = 1;
        int anterior = 0;
        int num = 0;
        
        while (seguir == true) {
            num = (max + min) / 2;
            if (num == anterior) {
                num++;
            }
            
            System.out.println("¿El número es " + num + "? (=, < ó >)");
            Scanner teclado = new Scanner(System.in);
            char respuesta = teclado.next().charAt(0);
            
            if (respuesta == '<') {
                max = num;
                anterior = num;
            }
            if (respuesta == '=') {
                seguir = false;
            }
            if (respuesta == '>') {
                min = num;
                anterior = num;
                
            }
                    
        }
        System.out.println("Lo acertéeeee!!");
        
    }
    
}
