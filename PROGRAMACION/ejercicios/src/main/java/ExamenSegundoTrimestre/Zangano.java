/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenSegundoTrimestre;

/**
 *
 * @author DAW
 */
public class Zangano extends Abeja{
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    private final boolean sabeZumbar = true;
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Zangano(){
        super.esHembra = false;
    }
   
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    //Hereda de Abeja:
    //public String volar(){
    
    public String zumbar(){ 
        String zumbido = "";
        if (sabeZumbar == true) {
            zumbido = "BBBBBBZZZZZZZZZZZZZZ!!!!";
        }
        return zumbido;
    }
    
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zangano { esHembra=").append(esHembra);
        sb.append("sabeZumbar=").append(esHembra);
        sb.append('}');
        return sb.toString();
    }
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------
    
    
    
}
