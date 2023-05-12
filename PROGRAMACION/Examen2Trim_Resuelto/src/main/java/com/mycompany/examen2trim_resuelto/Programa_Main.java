
package com.mycompany.examen2trim_resuelto;

import java.util.ArrayList;


public class Programa_Main {

    public static void main(String[] args) {

        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Creamos una reina, dos obreras y un zangano, y los introduce en la Colmena ");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Proceso concluido con éxito.");
        System.out.println("");
        
        Reina abejaReina = new Reina();
        Obrera obrera1 = new Obrera();
        Obrera obrera2 = new Obrera();
        Zangano zangano = new Zangano();

        Colmena colmena = new Colmena();

        colmena.añadirAbeja(obrera2);
        colmena.añadirAbeja(abejaReina);
        colmena.añadirAbeja(obrera1);
        colmena.añadirAbeja(zangano);

        //1. muestra info colmena:
        System.out.println("");
        System.out.println("Mostramos por pantalla los datos de cada abeja:");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(colmena.mostrarColmena());
        System.out.println("------------------------------------------------------------------------------");

        //3. RECORRER ENJAMBRE, 4., 5.
        System.out.println("");
        System.out.println("Accionamos puesta de huevos en el panal y acciones de cada casta de abejas, así como el nacimiento de las abejas:");
        System.out.println("Este bloque de acciones automatiza la alimentación, procreación y reubicación de las abejas y los huevos en el panal y la colmena.");
        colmena.recorrerEnjambre(); //esto acciona nacimientos y acciones de cada casta de abejas
        System.out.println("");
        System.out.println("Proceso concluido con éxito.");
        System.out.println("");
        

        System.out.println("Mostramos la colmena después de haber hecho los cambios");
        System.out.println(colmena.mostrarColmena());
        System.out.println("");

        
        //4. visualizar matriz panal para comprobar que se han puesto huevos
        System.out.println("Mostramos el panal para comprobar la ubicación de los huevos:");
        colmena.verPanal();
        
        System.out.println("");
        System.out.println("Programa finalizado con éxito.");
        
        
    }
}
