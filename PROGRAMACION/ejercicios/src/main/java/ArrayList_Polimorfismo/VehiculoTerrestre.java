
package ArrayList_Polimorfismo;


public class VehiculoTerrestre extends Vehiculo {
    
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    
//  Atributos que hereda de Vehiculo:
//  protected final String matricula;
//  protected final String modelo;

    protected final int cantidadRuedas;
    
    
    
    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    public VehiculoTerrestre(int cantidadRuedas, String matricula, String modelo) {
        super(matricula, modelo);
        this.cantidadRuedas = cantidadRuedas;
    }
    
    
    
    
    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------
    

    //funcion abstracta que hereda de Vehiculo y se hace aquí:
    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("VehiculoTerrestre { cantidadRuedas=").append(cantidadRuedas);
        sb.append(", matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        System.out.print(sb.toString());
    }
    
    

    //Validador de matriculas de vehiculos terrestres: 4 numeros y 3 letras
    static public boolean EsValida(String matricula) {
        boolean esvalida = false;
        String expresion = "^[0-9]{4}$[a-zA-Z]{3}";
        return matricula.matches(expresion);
    }
    
    
    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }



 
    
    
    
    
}
