
package ArrayList_Polimorfismo;


public class Avion extends VehiculoAereo{
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    
    /*
    Atributos que hereda de Vehiculo:
        protected final String matricula;
        protected final String modelo;
    
    Atributos que hereda de VehiculoAereo:
        protected final int cantidadAsientos;
    */
    
    private double cantidadHorasVuelo;

    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    
    public Avion(double cantidadHorasVuelo, int cantidadAsientos, String matricula, String modelo) {
        super(cantidadAsientos, matricula, modelo);
        this.cantidadHorasVuelo = cantidadHorasVuelo;
    }



    
    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------
    
    //funcion abstracta que hereda de Vehiculo y se hace aquí:
    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Avion { cantidadAsientos=").append(cantidadAsientos);
        sb.append(", cantidadHorasVuelo=").append(cantidadHorasVuelo);
        sb.append(", matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        System.out.print(sb.toString());
    }
    
    //public boolean validadorMatricula(); --> en VehiculoAereo
    
    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------

    public double getCantidadHorasVuelo() {
        return cantidadHorasVuelo;
    }

    public void setCantidadHorasVuelo(double cantidadHorasVuelo) {
        this.cantidadHorasVuelo = cantidadHorasVuelo;
    }




    
    
    
    
    
}



