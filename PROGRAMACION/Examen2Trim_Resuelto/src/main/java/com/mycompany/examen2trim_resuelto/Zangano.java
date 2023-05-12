
package com.mycompany.examen2trim_resuelto;




public class Zangano extends Abeja{
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    private final boolean esHembra = false;
    private final boolean sabeZumbar = true;
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Zangano(){
    }
   
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    //Hereda de Abeja:
    //public void volar(){
    
    public void zumbar(){ 
        String zumbido = "";
        if (sabeZumbar == true) {
            zumbido = "BBBBBBZZZZZZZZZZZZZZ!!!! *zumbido ruidoso de zangano*";
        }
        System.out.println(zumbido); 
    }
    
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zangano { esHembra=").append(esHembra);
        sb.append(", sabeZumbar=").append(esHembra);
        sb.append('}');
        return sb.toString();
    }
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------
    
    
    
}
