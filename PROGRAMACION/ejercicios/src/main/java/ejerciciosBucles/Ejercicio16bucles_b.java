/*
Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
 */
package ejerciciosBucles;
import java.util.Scanner;

public class Ejercicio16bucles_b {
    
    //FUNCION PARA DETECTAR PRIMOS
    
    static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return false;
       }
       return true;
    }

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número para comprobar si es primo:");
        
        int numero = teclado.nextInt();
        
        //BUCLE MIENTRAS NO SE CUMPLA LA CONDICION QUE QUIERO
        while (numero <= 0) {
            System.out.println("Introduce un número positivo");
            numero = teclado.nextInt();
        }
       
        //System.out.println("El número es: " + numero);
        
        if (isPrime(numero)) {
            System.out.println("El número introducido es primo.");
        } else {
            System.out.println("El número introducido no es primo.");
        }
        
    }
    
}
