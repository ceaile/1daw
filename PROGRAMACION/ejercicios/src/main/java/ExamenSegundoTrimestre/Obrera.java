/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenSegundoTrimestre;

/**
 *
 * @author DAW
 */
public class Obrera extends Abeja {
    
   
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    private boolean esHembra = true;
    private int alimentadaConJalea = 0;
    
    
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Obrera(){
        
    }
    
    
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    //Hereda de Abeja:
    //public String volar(){
    
    public void alimentar(){
        alimentadaConJalea++;
    }
    
    
    public String segregarCena(){
        return "ssssssssssssssss"; //(????)
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

    public void setEsHembra(boolean esHembra) {
        this.esHembra = esHembra;
    }

    public int getAlimentadaConJalea() {
        return alimentadaConJalea;
    }

    public void setAlimentadaConJalea(int alimentadaConJalea) {
        this.alimentadaConJalea = alimentadaConJalea;
    }


    
    
    
}
