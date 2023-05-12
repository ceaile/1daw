
package com.mycompany.proyecto_astros;

import java.util.Scanner;
import java.util.ArrayList; //NECESARIO
import java.util.Iterator;  //NECESARIO
// System.out.println();


public class Astro_Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Astro miAstro = new Astro();
        /*
        Una vez haces una clase abstracta, ya no puedes crear objetos genericos
        de esa clase, solo de las clases hijas
        */
        
        Planeta miAstro2 = new Planeta();
        
        Astro miAstro3 = new Planeta(); // esto es polimorfismo ._.
        
        
        Astro vectorAstro[] = new Astro[8];
        
        //vectorAstro[0] = miAstro;    Ya no funciona, porque ahora es abstracta
        
        vectorAstro[1] = miAstro2;
        
        vectorAstro[2] = miAstro3;
        
        /*
        Puedes hacer un array de Astros y meter Astros sin definir,
        Planetas y Satelites.
        O hacer un array de Satelites y que solo entren satelites...
        */
        
        //Enunciado ejercicio:
        /*
        "Una posible solución sería crear una lista de objetos, insertar los planetas y satélites (directamente
        mediante código o solicitándolos por pantalla) y luego mostrar un pequeño menú que permita al
        usuario imprimir la información del astro que elija.
        */
        
        ArrayList listaAstros = new ArrayList();
        
        
        /*
        ATRIBUTOS A RELLENAR AL CREAR PLANETAS:
        String nombre, 
        1_double masaCuerpo(kg), 2_double diametroMedio(km), 
        3_String periodoRotacion(dias, h, min, segs), 
        4_double periodoTraslacion(dias), 5_double distanciaMedia(años luz), 
        6_double radioEcuatorial(km), 
        7_double temperaturaMedia(grados Cº), 8_double gravedad(metros/segundo^2), 
        9_double distanciaSol(km), 
        10_double orbitaSol(excentricidad), boolean tieneSatelites
        
        ATRIBUTOS A RELLENAR AL CREAR SATELITES:
        String nombre, 1_double masaCuerpo(kg), 2_double diametroMedio(km), 
        3_String periodoRotacion(dias, h, min, segs), 
        4_double periodoTraslacion(dias), 5_double distanciaMedia(años luz), 
        6_double radioEcuatorial(km), 
        7_double 7_temperaturaMedia(grados Cº), 8_double gravedad(metros/segundo^2),
        9_double distanciaPlaneta(km), 
        10_double orbitaPlanetaria(excentricidad), 
        Planeta planetaPertenece)
        */
        
        //CREACION DE PLANETAS Y SATELITES Y SUS COMPROBACIONES
        Planeta tierra = new Planeta("Tierra", 5791999999999999000000000.0, 12742.0, "23horas, 56minutos, 4.1 segundos.",
                365, 0.000015567, 6371, 15.0, 9.807, 150000000, 0.017, true);
        
        Planeta venus = new Planeta("Venus", 4867000000000000000000000.0, 12104, "243 días", 225, 0.000011489, 
                6051.8, 499.85, 8.87, 1087000000000.0, 0.00677, false);
        
        Satelite luna = new Satelite("Luna", 73490000000000000000000.0, 3474.8, "27,32 días", 
                27.32, 0.00000004063, 1737.4, 123, 1.62, 384400, 0.05, tierra);
        
        Planeta mercurio = new Planeta("Mercurio", 328500000000000060000000.0, 4879.4, "58 días, 15h, 30min.", 
                88.0, 0.0000064468, 2439.7, 160.0, 3.7, 0.0000064468, 0.2056, false);
        
        
        //comprobar que esta creado y se muestra bien con los 3 metodos
        /*
        System.out.println("Prueba con metodo muestra() abstracto");
        System.out.println(mercurio.muestra()); //abstracto
        System.out.println();
        
        System.out.println("Prueba con metodo mostrar() de string:");
        System.out.println(mercurio.mostrar()); //string
        System.out.println();
        
        System.out.println("Prueba metodo void como el de los apuntes:");
        mercurio.demostrar(); //void system.out.print
        System.out.println();
        */
        

        
        
        listaAstros.add(mercurio);
        listaAstros.add(luna);
        listaAstros.add(tierra);
        listaAstros.add(venus);
        

        
        
        char opcionElegida;
        
        
        do {
            System.out.println();
            System.out.println("Elige un número para leer la información que haya de él dentro del arrayList");
            System.out.println("Solo existen 4 Astros en la lista. Inserte '1', '2', '3' ó '4'.");
            System.out.println("Introduzca número 0 para salir del menú");
            System.out.println();
            
            opcionElegida = teclado.next().charAt(0);
            
            switch (opcionElegida) {
                case '1':
                    //leer posicion 0
                    System.out.println(mercurio.muestra()); //abstracto
                    //System.out.println(listaAstros.get(0).muestra());     no funciona
                    System.out.println();
                    break;
                case '2':
                    //leer pos 1
                    System.out.println(luna.mostrar()); //abstracto
                    System.out.println();
                    break;
                case '3':
                    //leer pos 2
                    tierra.demostrar();
                    System.out.println();
                    break;
                case '4':
                    //leer pos 3
                    System.out.println(venus.muestra());
                    System.out.println();
                    break;
                default:
                    System.out.println("Caracter introducido no válido.");
                    System.out.println();
            }
                    
        } while (opcionElegida != '0');
        
        
        
        
         
        
        
        
    }
    
}
