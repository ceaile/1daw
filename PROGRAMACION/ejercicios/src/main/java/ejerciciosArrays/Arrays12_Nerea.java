/*
Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
hasta que el usuario elija la opción ‘c’ que terminará el programa.
 */

package ejerciciosArrays;

import java.util.Scanner;

public class Arrays12_Nerea {

    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        int[] array=new int[10];
        
        boolean continuar=true;
        
            do {
                System.out.println("Selecciona una opción: \na. Mostrar valores. \nb.Introducir valor. \nc.Salir.");
                String opción=entrada.nextLine();
        
                switch(opción) {
                    case "a":
                        for (int i=0;i<array.length;i++) {
                            System.out.println("Introduce un valor " + (i+1) + "/10: ");
                            array[i]=entrada.nextInt();
                        }
                
                        for (int i=0;i<array.length;i++)
                            System.out.print(array[i] + " ");
                        
                        break;
                        
                    case "b":
                        System.out.println("Introduce un valor para el array: ");
                        int valorArray=entrada.nextInt();
                        
                        System.out.println("Introduce una posición del array: ");
                        int posición=entrada.nextInt();
                        
                        for (int i=0;i<array.length;i++) {
                            array[i]=i+1;
                        }
                        for (int i=0;i<array.length;i++){
                            array[posición]=valorArray;
                        }
                        
                        for (int i=0;i<array.length;i++){
                            System.out.print(array[i] + " ");
                        }
                        
                        break;
                        
                    case "c":
                        System.out.println("Final del programa");
                        continuar=false;
                        break;
                        
                    default:
                        System.out.println("Opción incorrecta, introduce otra opción: ");
                        
                }
            }
            
            while (continuar);
    }   
}