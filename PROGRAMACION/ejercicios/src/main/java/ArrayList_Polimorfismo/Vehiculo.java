/*
terrestres, acuáticos y aéreos. Los
vehículos terrestres pueden ser coches y motos. Los vehículos acuáticos pueden ser barcos y
submarinos. Los vehículos aéreos pueden ser aviones y helicópteros
 */
package ArrayList_Polimorfismo;


public abstract class Vehiculo {
    
    //----------------------------------------------------
    //             ATRIBUTOS VEHICULO
    //----------------------------------------------------
    
    protected final String matricula;
    protected final String modelo;

    
    //----------------------------------------------------
    //             CONSTRUCTOR VEHICULO
    //----------------------------------------------------
    public Vehiculo(String matricula, String modelo) /*throws Exception*/ {
        this.matricula = matricula;
        this.modelo = modelo;
        
        /*
        if matricula.matches("AFVHSBGWJS"){
            this.matricula = matricula;
        } else {
            Exception e = new Exception("Matricula no valida");
            throw e;
        }
        */
        
    }
    
    //----------------------------------------------------
    //              FUNCIONES
    //----------------------------------------------------
    public abstract void imprimir();
    
   
   
    
    //----------------------------------------------------
    //                  GETTERS & SETTERS
    //----------------------------------------------------

    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }




    

}


