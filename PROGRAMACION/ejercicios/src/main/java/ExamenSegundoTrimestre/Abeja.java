/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenSegundoTrimestre;

/**
 *
 * @author DAW
 */
public abstract class Abeja {
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    protected boolean esHembra;
    protected boolean sabenVolar;
    protected boolean puedeFecundar;
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    
    public Abeja(){
    }
    
  
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    public String volar(){
        return "bbbbbbbzzzzzzzz............ *zumbido suave*";
    }
    
    public abstract String toString(); //desarrollado individualmente en Abeja, Reina, Obrera y Zangano
        
    
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public boolean EsHembra() {
        return esHembra;
    }

    
    
    
    
}
