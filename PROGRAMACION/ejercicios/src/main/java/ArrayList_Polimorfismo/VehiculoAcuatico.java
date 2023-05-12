
package ArrayList_Polimorfismo;


public class VehiculoAcuatico extends Vehiculo {
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------

//  Atributos que hereda de Vehiculo:
//   protected final String matricula;
//   protected final String modelo;
    
    protected final double eslora;

    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    public VehiculoAcuatico(double eslora, String matricula, String modelo) {
        super(matricula, modelo);
        this.eslora = eslora;
    }

    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------


    //funcion abstracta que hereda de Vehiculo y se hace aquí:
    public void imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("VehiculoAcuatico { eslora=").append(eslora);
        sb.append(", matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        System.out.print(sb.toString());
    }
    
    
    
    //validador de matriculas de vehiculos acuaticos: 3-10 letras
    static public boolean EsValida(String matricula){
        
        boolean esValida = false;
        
        if (matricula.matches("[a-zA-Z]") && (matricula.length() >= 3) && (matricula.length() <=10 ) ) {
            
            esValida = true;
        }
        return esValida;
    }
    
    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------
    public double getEslora() {
        return eslora;
    }

  

    
    
    
}
