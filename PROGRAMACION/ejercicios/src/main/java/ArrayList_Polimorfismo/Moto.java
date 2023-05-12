
package ArrayList_Polimorfismo;


public class Moto extends VehiculoTerrestre {
     //---------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    /*
    Atributos que hereda de Vehiculo:
    protected final String matricula;
    protected final String modelo;
    
    Atributos que hereda de Vehiculo Terrestre:
    protected final cantidadRuedas;
    */
    private String color;
    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------

    public Moto(String color, int cantidadRuedas, String matricula, String modelo) {
        super(cantidadRuedas, matricula, modelo);
        this.color = color;
    }

   
    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------
    
    //funcion abstracta que hereda de Vehiculo y se hace aquí:
    public void imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append("Moto { color=").append(color);
        sb.append(", cantidadRuedas=").append(cantidadRuedas);
        sb.append(", matricula=").append(matricula);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        System.out.print(sb.toString());
    }
    
    //Hereda de VehiculoTerrestre:
    //public static boolean validadorMatricula();

    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------

    public String getColor() {
        return color;
    }




    

    
}
    

