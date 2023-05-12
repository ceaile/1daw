/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenSegundoTrimestre;

/**
 *
 * @author DAW
 */
public class Huevo extends Abeja {
    
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    private boolean esHembra = false;
    private boolean seraReina = false;
    
    private boolean nacido = false;
    
    static private int alimentadaConJalea = 0;
    
    
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Huevo(){
    }
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    //Hereda de Abeja:
    //public String volar(){
    
    public void Alimentar(){
        alimentadaConJalea++;
    }

    static public boolean Nacer(){
        boolean puedeNacer = false;
        if (alimentadaConJalea >= 20){
//            seraReina = true;
//            esHembra = true;
//            nacido = true;
        }
        return puedeNacer;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Huevo{esHembra=").append(esHembra);
        sb.append(", seraReina=").append(seraReina);
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

    public boolean SeraReina() {
        return seraReina;
    }

    public void setSeraReina(boolean seraReina) {
        this.seraReina = seraReina;
    }

    public int getAlimentadaConJalea() {
        return alimentadaConJalea;
    }

    //el setter de AlimentadaConJalea ha sido sobreescrito en Alimentar()


    
    
    
}
