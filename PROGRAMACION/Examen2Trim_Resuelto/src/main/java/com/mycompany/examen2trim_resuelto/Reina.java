
package com.mycompany.examen2trim_resuelto;




public class Reina extends Abeja{
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    private final boolean esHembra = true;
    
    private final boolean puedeFecundar = true;
    
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Reina(){
        
    }
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    //Hereda de Abeja:
    //public void volar(){
    
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
