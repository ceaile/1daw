

package com.mycompany.examen2trim_resuelto;




public class Abeja {
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    protected boolean esHembra;
    protected final boolean sabenVolar = true;

    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    
    public Abeja(){
//        esHembra = false;
    }
    
  
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    public void volar(){
        System.out.println("bbbbbbbzzzzzzzz............ *onomatopeya de abeja volando*");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Abeja{");
        sb.append("esHembra=").append(esHembra);
        sb.append(", sabenVolar=").append(sabenVolar);
        sb.append('}');
        return sb.toString();
    }
    
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public boolean EsHembra() {
        return esHembra;
    }

    
    
    
    
}
