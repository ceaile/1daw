/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package otrosEjercicios;

/**
 *
 * @author DAW
 */
public class Televisor extends Electrodomestico{
   
    //--------------------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------------------
    /* Hereda de Electrodomestico:
    protected double precio = 100; //€
    protected String color = "blanco";
    protected char consumoEnergetico = 'F'; //A - F
    protected double peso = 5; //kg
    */
    private int resolucion = 20; //pulgadas
    private boolean sintonizadorTdt = false;
    
    
    
    
    //--------------------------------------------------------------------------
    //                          CONSTRUCTORES
    //--------------------------------------------------------------------------
    
    public Televisor() {
    }

    public Televisor(double precio, double peso) {
        super(precio, peso);
    }

    public Televisor(double precio, String color, char consumoEnergetico, double peso) {
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
    
    public double precioFinalTv(){
        double precio = 0;
        precio += precioFinal();
        
        if (resolucion >= 40 && sintonizadorTdt == true){
            precio *= 1.30;
        }
        return precio;
    }
    
    
    
    
    

    public int getResolucion() {
        return resolucion;
    }

    public boolean tieneSintonizadorTdt() {
        return sintonizadorTdt;
    }


    
    
    
    
    
    
}
