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
public class Colmena {

    //ATRIBUTOS
    ArrayList<Abeja> colmena = new ArrayList<Abeja>();

    Huevo panal[][] = crearPanal(); //creado con funcion crearPanal()

    //CONSTRUCTOR
    public Colmena() {
    }

    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    //AÑADIR ABEJA A LA LISTA COLMENA
    public void añadirAbeja(Abeja abeja) {
        colmena.add(abeja);
    }

    
    
    //QUITAR ABEJA DE LA LISTA COLMENA
    public void quitarAbeja(Abeja abeja) {
        colmena.remove(abeja);
    }

    
    
    //MOSTRAR COLMENA
    public String mostrarColmena() {
        String info = "";
        for (Abeja i : colmena) {
            info += i.toString() + "\n";
        }
        return info;
    }

    
    
    //RECORRER PANAL Y ACCIONAR ENJAMBRE
    public void recorrerEnjambre() {
        for (Abeja i : colmena) {
            if (i.EsHembra()) {
                meterHuevo();
                meterHuevo();
            } else {
                Zangano zg = (Zangano) i;
                System.out.println(zg.zumbar());
            }

        }
    }

    
    
    
    //SACAR DATOS DE LA MATRIZ PANAL
    public String getPanaltoString() {
        return crearPanal().toString();
    }

    
    
    
    //CREAR MATRIZ PANAL
    public Huevo[][] crearPanal() {
        
        int fila = 0;
        int columna = 0;

        while (fila < 3 && fila > 10) {
            fila = (int) (Math.random() * 100);
        }
        columna = fila - 1;

        Huevo panal[][] = new Huevo[fila][columna];
        return panal;
    }

    
    
    //GETTER DEL ATRIBUTO PANAL
    public Huevo[][] getPanal() {
        return panal;
    }

    
    
    //VISUALIZAR MATRIZ PANAL
    public void verPanal() {
        for (int j = 0; j < panal.length; j++) {
            for (int i = 0; i < panal[j].length; i++) {
                System.out.println(panal[j][i].toString());
                
            }
        }
    }

    
    //NACER HUEVOS
    public void nacenHuevos(){
        
        for (int j = 0; j < panal.length; j++) {
            for (int i = 0; i < panal[j].length; i++) {
                if (panal[j][i] == null){
                    Huevo.Nacer();
                    
                }
                /*
                al encontrar el primero hueco no null en la matriz,
                activamos la funcion Huevo.Nacer()
                si es true llamamos al constructor de reina o de obrera dependiendo de su madre
                (me queda buscar la manera previa de asegurar saber su madre, quiza cambiando la estructuracion de las funciones)
                */
                
            }
        }
    }
    
    
    //ABEJA PONE HUEVOS
    static public Huevo AbejaPoneHuevo() {
        Huevo hv = new Huevo();
        return hv;
    }

    
    //METER HUEVO EN MATRIZ PANAL
    private void meterHuevo() {

        for (int j = 0; j < panal.length; j++) {
            for (int i = 0; i < panal[j].length; i++) {

                if (panal[j][i] == null) { //si el panal está vacío, la abeja pone un huevo
                    panal[j][i] = AbejaPoneHuevo();
                }

            }
        }
    }
    
    
    

}
