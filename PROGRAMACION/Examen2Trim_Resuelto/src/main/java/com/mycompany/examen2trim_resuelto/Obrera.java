
package com.mycompany.examen2trim_resuelto;




public class Obrera extends Abeja {
    
   
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    private final boolean esHembra = true;
    private int alimentadaConJalea = 0; //min 10 para poder poner huevos
    
    
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    
    public Obrera(){
        
    }
    
    
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    //Hereda de Abeja:
    //public void volar(){
    
    public void alimentar(int cantidadAlimento){
        alimentadaConJalea += cantidadAlimento;
    }
    
    
    public void segregarCera(){
        System.out.println("ssssssssssssssss *abeja obrera segregando cera*");  // (????)
    }

    //PONER HUEVOS

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Obrera { esHembra=").append(esHembra);
        sb.append(", alimentadaConJalea=").append(alimentadaConJalea);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public boolean EsHembra() {
        return esHembra;
    }


    public int getAlimentadaConJalea() {
        return alimentadaConJalea;
    }
    
    
    
    
    
    
}
