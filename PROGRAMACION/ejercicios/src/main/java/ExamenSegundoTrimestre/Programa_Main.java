
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenSegundoTrimestre;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Programa_Main {
    
    public static void main(String[] args) {
        
        
    //--------------------------NO EJECUTA--------------------------------------

    
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
    System.out.println(colmena.mostrarColmena());

    //CREAR PANAL
    colmena.crearPanal();
    
   
    
    //3. RECORRER ENJAMBRE
    colmena.recorrerEnjambre();
    /*
    pone huevos si es hembra, zumba si es macho
    */
    
    //4.
    //visualizar matriz panal para comprobar que se han puesto huevos
    colmena.verPanal(); //ya tiene Sout dentro
    
    
   //5. alimentar huevos
   
   
    
    
    
    }
}
