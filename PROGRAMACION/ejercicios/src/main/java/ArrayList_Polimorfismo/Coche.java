
package ArrayList_Polimorfismo;


public class Coche extends VehiculoTerrestre{
    
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    /*
    Atributos que hereda de Vehiculo:
    protected final String matricula;
    protected final String modelo;
    
    Atributos que hereda de Vehiculo Terrestre:
    protected final cantidadRuedas;
    */
    private boolean aireAcondicionado;
    
    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    public Coche(boolean aireAcondicionado, int cantidadRuedas, String matricula, String modelo) {
        super(cantidadRuedas, matricula, modelo);
        this.aireAcondicionado = aireAcondicionado;
    }
   
    
    
    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------
    

    
    //Hereda de VehiculoTerrestre:
    //public static boolean validadorMatricula();
    
    //funcion abstracta que hereda de Vehiculo y se hace aquí:
    public void imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append("Coche { aireAcondicionado=").append(aireAcondicionado);
        sb.append(", matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append(", cantidadRuedas=").append(cantidadRuedas);
        sb.append('}');
        System.out.print(sb.toString());
    }
    




    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------
    public boolean tieneAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setTieneAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
    

    
}
