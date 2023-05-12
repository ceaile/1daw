package examen_real;

/*

*/
import java.util.Scanner;
import java.util.Arrays;

public class examen_ej1 {
    
    //FUNCION  ESCRIBIR
    public static void escribir(String vector[]) {
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
        System.out.println(vector[3]);
        System.out.println(vector[4]);
        System.out.println(vector[5]);
        System.out.println(vector[6]);
        System.out.println(vector[7]);
        System.out.println(vector[8]);
        System.out.println(vector[9]);
       
    } 
            
    
    //FUNCION  NUEVO NOMBRE
    public static void nuevoNombre(String vector[]) {
        
        //scanner, pedir y escribir nombre en la posicion requerida
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nuevo nombre");
        String nombre = teclado.nextLine();
        System.out.println("Escribe la posición donde deseas colocarlo:");
        int posicion = teclado.nextInt();
        
        //colocar nombre en posicion concreta
        vector[posicion] = "nombre";
        //System.out.println(vector[posicion] = "nombre");
        
    }
    
    
    //FUNCION  MOSTRAR APELLIDO DE LA MUJER EN POSICION X
    public static String apellido(String vector[]) {
        
        //ubicar el string en la posicion requerida
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe la posición del apellido que deseas saber:");
        int posicion = teclado.nextInt();
        
        //meter el trozo partido del apellido en la posicion
        return vector[posicion].split(" (?!.* )")[1]; 

    }
    
    
    
            
    //CODIGO        
    public static void main(String[] args) {
        
        //creamos string, introducimos nombres en cada posicion:
        String vector[] = new String[9];
        vector[0] = "Patria Mirabal";
        vector[1] = "Minerva Mirabal";
        vector[2] = "María Teresa Mirabal";
        vector[3] = "Lucrecia Pérez";
        vector[4] = "Ana Orantes";
        vector[5] = "Rocío Caíz";
        vector[6] = "Marta del Castillo";
        vector[7] = "Mahsa Amini";
        vector[8] = "Cecilia Monzón";
        vector[8] = "Freshta Kohistani";
        
        Scanner teclado = new Scanner(System.in);
        
        //MENU:
        boolean juego = true;
        do {
            System.out.println("*********** Menú ************");
            System.out.println("1. Ver nombres:");
            System.out.println("1. Cambiar nombre:");
            System.out.println("3. Ordenar alfabéticamente:");
            System.out.println("4. Mostrar apellido en posición X");
            System.out.println("5. Salir:");
            System.out.println("******************************");
            
            //variables char necesarias para usar el menú y que lo lea
            
            char ch;
            ch = teclado.next().charAt(0);
            
            //Menu
            switch (ch) {
                case '1':
                    escribir(vector); //la propia funcion ya imprime y pide
                    break;
                case '2':
                    nuevoNombre(vector); //la propia funcion ya imprime y pide
                    break;
                case '3':
                    //ordenar alfabéticamente. Sin terminar
                    break;
                case '4':
                    System.out.println("Opción 4 elegida. El apellido que quieres saber es: ");
                    System.out.println(apellido(vector)); //esta funcion no es void, requiere imprimir
                    break;
                case '5':
                    System.out.println("Has salido del programa");
                    juego = false;
                    break;
                default:
                    System.out.println("Carácter introducido no válido. Introduzca solo: 1, 2, 3, 4, ó 5.");
            }
            
        }  while (juego == true);
            
        
            
        
         
         
    }
}
        
       