
package ArrayList_Polimorfismo;


public class Helicoptero extends VehiculoAereo {
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
    
    private int numHelices;

    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    
    public Helicoptero(int numHelices, int cantidadAsientos, String matricula, String modelo) {
        super(cantidadAsientos, matricula, modelo);
        this.numHelices = numHelices;
    }


    
    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------
    
    //funcion abstracta que hereda de Vehiculo y se hace aquí:
    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Helicoptero { cantidadAsientos=").append(cantidadAsientos);
        sb.append(", numHelices=").append(numHelices);
        sb.append(", matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        System.out.print(sb.toString());
    }
    
    //public boolean validadorMatricula(); --> en VehiculoAereo
    
    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------

    public int getNumHelices() {
        return numHelices;
    }

    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }


    
    
    
    
    
    
}
