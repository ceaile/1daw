package examen_real;

import java.util.Scanner;
import java.util.Arrays;

public class Ej1_repasado {
    
    static Scanner teclado = new Scanner(System.in); 

    //FUNCIONES:
    
    
    //FUNCION OPCION 1: MENSAJE + IMPRIMIR
    static void escribir (String vector[]) {
        
        System.out.println("Ha seleccionado la opción '1'.");
        System.out.println("La lista de nombres son:");
        
        imprimir(vector);
            
    }
    
    //FUNCION SOLO IMPRIMIR NOMBRES
    static void imprimir (String vector[]) {
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
            
    }
    
    //FUNCION OPCION 2: REESCRIBIR NOMBRES
    static void nuevoNombre(String vector[]) {
        
        System.out.println("Ha seleccionado la opción '2': Reescribir");
        System.out.println("Introduzca la posición que desea reescribir.");
        
        int posicion = teclado.nextInt();
        
        System.out.println("Ha introducido la posición " + posicion);
        teclado.nextLine(); //limpiar
        
        System.out.println("Introduzca el nombre y apellido que desea introducir:");
        String nombreNuevo = teclado.nextLine();
        teclado.nextLine(); //limpiar
        
        vector[posicion] = nombreNuevo;
        imprimir(vector);
        
    }
    

    
    //FUNCION APELLIDO MUJER POSICION X
    static void apellido(String vector[]) {
        
        System.out.println("Ha seleccionado la opción '4': Ver apellido");
        System.out.println("Introduzca la posición que desea visualizar.");
        int posicion = teclado.nextInt();
        
        String nombreCompleto = vector[posicion];
        String[] arrayNombreApellido = nombreCompleto.split(" ");
        System.out.println(arrayNombreApellido[1]);
        /*
        La función split devuelve un array en el que cada posición
        es lo que esté entre medias del caracter que elijas que utilice para partir
        */
        
    }
    
    
    
    //PROGRAMA PRINCIPAL:
    public static void main(String[] args) {

        //crear vectorNombres y almacenar nombres de mujeres 
        String[] vectorNombres = new String[10];

        vectorNombres[0] = "Patricia Mirabal";
        vectorNombres[1] = "Minerva Mirabal";
        vectorNombres[2] = "María Teresa Mirabal";
        vectorNombres[3] = "Lucrecia Pérez";
        vectorNombres[4] = "Ana Orantes";
        vectorNombres[5] = "Rocío Caíz";
        vectorNombres[6] = "Marta del Castillo";
        vectorNombres[7] = "Mahsa Amani";
        vectorNombres[8] = "Cecilia Monzón";
        vectorNombres[9] = "Freshta Kohistani";

        //Indicaciones del menú:
        //1. sacarlo por pantalla, una mujer por línea /void escribir (String vectorNombres[])
        //2. escribir nuevo nombre en posición x del vectorNombres /void nuevoNombre (String vectorNombres[])
        //3. ordenar alfabéticamente
        //4. mostrar apellido mujer posición x /String apellido (String vectorNombres[])
        //5. salir
        
        //MENÚ:
        Scanner teclado = new Scanner(System.in);
        char ch = 0;
        boolean menu = true;
        
        System.out.println("Bienvenido al menú de navegación del ejercicio 1:");
        System.out.println("-------------------------------------------------");
        do
        {
            
            System.out.println();
            System.out.println("Seleccione una de estas opciones:");
            System.out.println("Introduzca '1' para visualizar todos los nombres:");
            System.out.println("Introduzca '2' para escribir un nombre en la posición que elija");
            System.out.println("Introduzca '3' para ordenar alfabéticamente");
            System.out.println("Introduzca '4' para visualizar el apellido de la posición que elija:");
            System.out.println("Introduzca '5' para salir");
            System.out.println("--------------------------------------------------------------------");
            
            
            ch = teclado.next().charAt(0);
            switch (ch)
            {
                case '1':
                    //imprimir
                    escribir(vectorNombres);
                    break;
                case '2':
                    //reescribir
                    nuevoNombre(vectorNombres);
                    break;
                case '3':
                    //ordenar alfabéticamente
                    Arrays.sort(vectorNombres);
                    imprimir(vectorNombres);
                    break;
                case '4':
                    //mostrar apellido en posicion x
                    apellido(vectorNombres);
                    break;
                case '5':
                    //salir
                    menu = false;
                    System.out.println("Has salido del menú");
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("El carácter introducido no es válido.");
                    System.out.println("Introduzca solo caracteres '1', '2', '3', '4' o '5'.");
            }

        } while (menu == true);


    }

}
