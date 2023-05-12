/*

Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
oportuno. 

Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario
también pueda solicitar el cálculo del volumen. Añade la función:
Implementa las funciones:

*int menu() // Muestra el menú y devuelve el número elegido
*double pideRadio() // Pide que se introduzca el radio y lo devuelve
*double circunferencia(double r) // Calcula la circunferencia y la devuelve
*double area(double r) // Calcula el área y la devuelve
*double volumen(double r) // Calcula el volumen y lo devuelve

Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez
y se muestren los tres cálculos posibles (circunferencia, área y volumen).

Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú ->
realizar el cálculo -> volver a mostrar menú).

Añade una opción más llamada “Salir” que terminará
el programa si es elegida.

 */
package ejerciciosFunciones;

import java.util.Scanner;

public class Funciones21_menu {
    static Scanner teclado = new Scanner(System.in);

    //FUNCION: MENU
    /*public static int menu() {
        //saca el menu por pantalla
        //pide un int que utilizará como opción y la devuelve
        
        String menuCompleto = "Menú de navegación ~~~~~~~~~~ \n" +
            "Elige una de estas 2 opciones: \n" +
            "1. Circunferencia: calcula la circunferencia. \n" +
            "2. Área: calcula el área de un círculo. \n" +
            "3. Volumen: calcula el volumen de una esfera. \n" +
            "4. Todas: Calcula circunferencia, área y volumen. \n" +
            "5. Salir del programa. \n" +
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        System.out.print(menuCompleto);
        int num;
        num = teclado.nextInt();
        return num;
    } */
        
        /*
        Repetición del menú de navegación ~~~~~~~~~~ \n
        Elige una de estas 2 opciones: \n
        1. Circunferencia: calcula la circunferencia. \n
        2. Área: calcula el área de un círculo. \n
        3. Volumen: calcula el volumen de una esfera. \n
        4. Todas: Calcula circunferencia, área y volumen. \n
        5. Salir del programa. \n
        ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        */

    
    
            
            
    //FUNCION: PIDE RADIO
    public static double pideRadio() {
       
        System.out.println("Introduce un radio");
        double r = teclado.nextDouble();
        System.out.println(r);
        return r;
    }
    
    //FUNCION: CIRCUNFERENCIA
    public static double circunferencia() {
        double r = pideRadio();                                
        double circunf = 2 * Math.PI * r;
        return circunf;
    }
    
    //FUNCION: AREA CIRCULO
    public static double area() {
        double r = pideRadio();
        double areaCirculo = Math.PI * Math.pow(r,2);
        return areaCirculo;
    }
    
    //FUNCION VOLUMEN
    public static double volumen() {
        double r = pideRadio();
        double volumenEsfera = 4/3 * Math.PI * Math.pow(r, 3);
        return volumenEsfera;
    }
    
    //FUNCION TODAS
    public static String todas() {
        double r = pideRadio();
        
        double circunf = 2 * Math.PI * r;
        //System.out.println("La circunferencia es: " + circunf);
        
        double areaCirculo = Math.PI * Math.pow(r,2);
        //System.out.println("El área es: " + areaCirculo);
        
        double volumenEsfera = 4/3 * Math.PI * Math.pow(r, 3);
        //System.out.println("El volumen es: " + volumenEsfera);
        
        String circunfStr = Double.toString(circunf);
        String areaCirculoStr = Double.toString(areaCirculo);
        String volumenEsferaStr = Double.toString(volumenEsfera);
        String todo = "La medida de circunferencia es " + circunfStr + ". El área es " + areaCirculoStr + ". El volumen es " + volumenEsferaStr;
        return todo;
    }
    
    
    //CODIGO
    public static void main(String[] args) {
        
        boolean juego = true;
        
        do {
            
            // sacamos menu por pantalla
            // elegimos opcion en switch
            //  
            
            String menuCompleto = "Menú de navegación ~~~~~~~~~~ \n" +
            "Elige una de estas 2 opciones: \n" +
            "1. Circunferencia: calcula la circunferencia. \n" +
            "2. Área: calcula el área de un círculo. \n" +
            "3. Volumen: calcula el volumen de una esfera. \n" +
            "4. Todas: Calcula circunferencia, área y volumen. \n" +
            "5. Salir del programa. \n" +
            "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
            
            System.out.print(menuCompleto);
            System.out.println();
            
            char opcionElegida = teclado.next().charAt(0); //como el valor devuelto es un int y me gusta hacer menús con chars, lo pasamos a un char
            //double r; //para que no se raye al ejecutar las funciones que utilizan esa variable???

            switch (opcionElegida) {
                case '1': //*double circunferencia(double r) // Calcula la circunferencia y la devuelve
                    System.out.println("La circunferencia es: " + circunferencia() ); //???
                    break;
                case '2': //*double area(double r) // Calcula el área y la devuelve
                    System.out.println();
                    System.out.println("El área es: " + area() ); //???
                    break;
                case '3': //*double volumen(double r) // Calcula el volumen y lo devuelve
                    System.out.println();
                    System.out.println("El volumen es: " + volumen() ); //???
                    break;
                case '4':
                    System.out.println(todas());
                    break;
                case '5':
                    juego = false;
                    break;
                default:
                    System.out.println("Carácter introducido no válido. Introduzca solo: 1, 2, 3, 4, 5 ó 6.");
            }
            
        }  while (juego == true);
        
    }
    
}
