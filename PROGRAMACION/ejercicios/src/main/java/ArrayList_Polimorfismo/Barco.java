
package ArrayList_Polimorfismo;


public class Barco extends VehiculoAcuatico {
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    
    /*
    Hereda de Vehiculo:
        private final String matricula;
        private final String modelo;
    
    Hereda de Vehiculo Acuatico:
        protected final double eslora;
    */
    
    private boolean tieneMotor;

    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    
    public Barco(boolean tieneMotor, double eslora, String matricula, String modelo) {
        super(eslora, matricula, modelo);
        this.tieneMotor = tieneMotor;
    }
    
    
    
    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------
    //funcion abstracta que hereda de Vehiculo y se hace aquí:
    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Barco{tieneMotor=").append(tieneMotor);
        sb.append(", eslora=").append(eslora);
        sb.append(", matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        System.out.print(sb.toString());
    }
    
    //public abstract boolean validadorMatricula(); --> en vehiculo acuatico

 
    
    
    
    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------

    public boolean isTieneMotor() {
        return tieneMotor;
    }

    public void setTieneMotor(boolean tieneMotor) {
        this.tieneMotor = tieneMotor;
    }




    
    
    
    
}