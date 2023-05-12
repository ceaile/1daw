
package ArrayList_Polimorfismo;

import java.util.logging.Logger;


public class VehiculoAereo extends Vehiculo {
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    
    /*
    Atributos que hereda de Vehiculo:
        protected final String matricula;
        protected final String modelo;
    */
    
    protected final int cantidadAsientos;

    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
   public VehiculoAereo(int cantidadAsientos, String matricula, String modelo) {
        super(matricula, modelo);
        this.cantidadAsientos = cantidadAsientos;
    }



    
    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------
    
    //funcion abstracta que hereda de Vehiculo y se hace aquí:
    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("VehiculoAereo { cantidadAsientos=").append(cantidadAsientos);
        sb.append(", matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        System.out.print(sb.toString());
    }
    
    //public boolean validadorMatricula() --> 4 letras + 6 nums
    static public boolean EsValida(String matricula){
        boolean esvalida = false;
        String expresion = "^[a-zA-Z]{4}[0-9]{6}$";
        return matricula.matches(expresion);
    }
    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }





}
