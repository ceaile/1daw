/*
Realiza un programa que lea una fecha introduciendo el día, 
mes y año por separado y nos diga
si la fecha es correcta o no. 
Supondremos que todos los meses tienen 30 días. 
Se debe crear una
función donde le pasemos los datos y devuelva si es correcta o no
 */
package ejerciciosFunciones;

import java.util.Scanner;
public class Funciones10_fechaValida {

    //FUNCION
    public static boolean fechaValida(int day, int month, int year) {
        boolean fecha = false;
        if ((day > 0) && (day <= 30) && (month > 0) && (month <= 12) && (year > 1920) && (year < 2100)) {
            fecha = true;
        }
        
        /*
        
        */
        
        return fecha;
            
    }
            
    
    //CODIGO
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int day, month, year;
        
        System.out.println("Introduce el día:");
        day = teclado.nextInt();
        
        System.out.println("Introduce el mes:");
        month = teclado.nextInt();
        
        System.out.println("Introduce el año:");
        year = teclado.nextInt();
        
        //if (fechaValida(day, month, year == true)) {                         //sustituible
        if (fechaValida(day, month, year)) {
            System.out.println("La fecha es válida");
        } else {
            System.out.println("La fecha no es válida");
        }
        
        
    }
    
}
