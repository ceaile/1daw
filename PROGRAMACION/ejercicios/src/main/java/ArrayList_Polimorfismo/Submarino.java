
package ArrayList_Polimorfismo;

public class Submarino extends VehiculoAcuatico {
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    /*
    Hereda de Vehiculo:
    private final String matricula;
    private final String modelo;
    
    hereda de Vehiculo Acuatico
    protected final double eslora;
    */
    
    private double capacidadProfundidad;

    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------,
    
        public Submarino(double capacidadProfundidad, double eslora, String matricula, String modelo) {
        super(eslora, matricula, modelo);
        this.capacidadProfundidad = capacidadProfundidad;
    }
    
    
    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------
        
    //funcion abstracta que hereda de Vehiculo y se hace aquí:
    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Submarino{capacidadProfundidad=").append(capacidadProfundidad);
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

    public double getCapacidadProfundidad() {
        return capacidadProfundidad;
    }

    public void setCapacidadProfundidad(double capacidadProfundidad) {
        this.capacidadProfundidad = capacidadProfundidad;
    }





}
