/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenSegundoTrimestre;

/**
 *
 * @author DAW
 */
public class Reina extends Abeja{
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    
    private boolean puedeFecundar = true;
    
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Reina(){
        
    }
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    //Hereda de Abeja:
    //public String volar(){
    
     @Override
    public String toString() { //abstracta de Abeja
        StringBuilder sb = new StringBuilder();
        sb.append("Reina {puedeFecundar=").append(puedeFecundar);
        sb.append(", esHembra=").append(super.esHembra);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------

   
    
    
}
