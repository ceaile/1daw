package ejerciciosBasicos;

/* Escribe un programa que lee un número 
y me dice si es positivo o negativo, 
consideraremos el cero como positivo. */ 
import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        System.out.println("Introduce un número: ");
        Scanner escanerNum1 = new Scanner(System.in);
        int num1 = escanerNum1.nextInt();
        if (num1 >= 0){
            System.out.println("Tu número es positivo");
        } else {
            System.out.println("Tu número es negativo");
        }
    }
    
}
