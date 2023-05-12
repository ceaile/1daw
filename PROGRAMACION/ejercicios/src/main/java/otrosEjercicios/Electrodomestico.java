/*
https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
 */


package otrosEjercicios;

import java.util.regex.Pattern;

public class Electrodomestico {

    //--------------------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------------------
    protected double precio = 100; //€
    protected String color = "blanco";
    protected char consumoEnergetico = 'F'; //A - F
    protected double peso = 5; //kg

    
    
    //--------------------------------------------------------------------------
    //                          CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Electrodomestico(){ 
    }
    
    
    public Electrodomestico(double precio, double peso){
        this.precio = precio;
        this.peso = peso;
    }
    
    
    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso){
        //lo pasamos a string, lo ponemos en mayus, y vuelta a char para el constructor
        String charStr = String.valueOf(consumoEnergetico).toUpperCase();
        char charConsumo = charStr.charAt(0);
        
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = charConsumo;
        this.peso = peso;
    }
    
    //--------------------------------------------------------------------------
    //                          METODOS
    //--------------------------------------------------------------------------
    //COMPROBAR CONSUMO ENERGETICO
    public boolean comprobarConsumoEnergetico(char letra){
        String letraStr = Character.toString(letra);
        return letraStr.matches("aA-fF");
    }
    
    
    //COMPROBAR COLOR
    public boolean comprobarColor(String color){
        return (this.color.equalsIgnoreCase(color));
    }
    
    
    //CALCULAR PRECIO FINAL
    public double precioFinal(){
        double precioFinal = 0;
        
        if ( Character.toString(consumoEnergetico).equalsIgnoreCase("A")) precioFinal = 100;
        else if ( Character.toString(consumoEnergetico).equalsIgnoreCase("B")) precioFinal = 80;
        else if ( Character.toString(consumoEnergetico).equalsIgnoreCase("C")) precioFinal = 60;
        else if ( Character.toString(consumoEnergetico).equalsIgnoreCase("D")) precioFinal = 50;
        else if ( Character.toString(consumoEnergetico).equalsIgnoreCase("E")) precioFinal = 30;
        else if ( Character.toString(consumoEnergetico).equalsIgnoreCase("F")) precioFinal = 10;
        
        if (peso >= 0 && peso <= 19) precioFinal += 10;
        else if (peso >= 20 && peso <= 49) precioFinal += 50;
        else if (peso >= 50 && peso <= 79) precioFinal += 80;
        else if (peso >= 80) precioFinal += 100;
        
        // precioFinal+=precio        no sé si hay que añadirle el precio Base primero o si es un sustituto
        return precioFinal;
    }
    
    
    
    //--------------------------------------------------------------------------
    //                          GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
     /*
//--------------------------------------------------------------------------
//                          ATRIBUTOS
//--------------------------------------------------------------------------

//--------------------------------------------------------------------------
//                          CONSTRUCTORES
//--------------------------------------------------------------------------

//--------------------------------------------------------------------------
//                          METODOS
//--------------------------------------------------------------------------

//--------------------------------------------------------------------------
//                          GETTERS & SETTERS
//--------------------------------------------------------------------------
 */
    
    
    
}
