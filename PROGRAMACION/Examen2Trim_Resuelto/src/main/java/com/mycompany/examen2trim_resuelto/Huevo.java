
package com.mycompany.examen2trim_resuelto;


import java.util.Random;


public class Huevo {
    
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    private boolean esHembra;
    private boolean seraReina;
    
    private int alimentadaConJalea = 0;
    
    
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Huevo(Reina abejaReina) { //huevo de reina
        Random rd = new Random();
        esHembra = rd.nextBoolean();
        seraReina = false;
    }
    
    public Huevo() { //huevo de obrera
        esHembra = false;
        seraReina = false;
    }
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------

    
    
    /**
     * Aumenta en la cantidad indicada por parámetro el alimento ingerido por el huevo
     * @param int alimento 
     */
    // ALIMENTAR X CANTIDAD DE JALEA
    public void Alimentar(int alimento){
        alimentadaConJalea += alimento;
    }
    
    //COMPROBAR QUE ES REINA
    public boolean seraReina(){
        
        if (alimentadaConJalea >= 20){
           
            esHembra = true;
            seraReina = true;
            
        }
        return seraReina;
    }
    
    
    
    /**
     * Comprueba los atributos del huevo para determinar qué tipo de abeja va a nacer.
     * Dependiendo de eso utiliza el constructor de cada casta.
     * Se utiliza una abeja genérica para apuntar la abeja de cada tipo y devolverla
     * 
     * @return Abeja
     */
    public Abeja HuevoNace(){
        
        Abeja abj = new Abeja();
        
        if ( esHembra && seraReina() && alimentadaConJalea >= 5){
            Reina rn = new Reina();
            abj = (Abeja)rn;
            
            
        } else if (esHembra && alimentadaConJalea >= 5){
            Obrera obr = new Obrera();
            abj = (Abeja)obr;
            
        } else if (esHembra == false && alimentadaConJalea >= 5){
            Zangano zg = new Zangano();
            abj = (Abeja)zg;
        }
        
        return abj;
        
    }
    
    //TO STRING
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




    public int getAlimentadaConJalea() {
        return alimentadaConJalea;
    }



    
    
    
}
