/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otrosEjercicios;

import java.util.logging.Logger;

/**
 *
 * @author DAW
 */
public class Lavadora extends Electrodomestico {

    //--------------------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------------------
    /* Hereda de Electrodomestico:
    protected double precio = 100; //€
    protected String color = "blanco";
    protected char consumoEnergetico = 'F'; //A - F
    protected double peso = 5; //kg
     */
    private final int carga = 5; //kg

    //--------------------------------------------------------------------------
    //                          CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Lavadora() {
    }

    public Lavadora(double precio, double peso) {
        super(precio, peso);
    }

    public Lavadora(double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);

    }

    //--------------------------------------------------------------------------
    //                          METODOS
    //--------------------------------------------------------------------------
    /* Hereda métodos de Electrodomestico:
    public boolean comprobarConsumoEnergetico(char letra){
    public boolean comprobarColor(String color){
    public double precioFinal(){
     */
    public double precioFinalLavadora() {
        double precio = 0;
        if (carga >= 30) {
            precio += precioFinal() + 50;
        }
        return precio;
    }

    //--------------------------------------------------------------------------
    //                          GETTERS & SETTERS
    //--------------------------------------------------------------------------
    public int getCarga() {
        return carga;
    }

}
