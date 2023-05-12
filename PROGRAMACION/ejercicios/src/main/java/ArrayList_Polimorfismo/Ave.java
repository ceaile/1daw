
package ArrayList_Polimorfismo;


public abstract class Ave extends Mascota {
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    
    /* Hereda de Mascota:
    protected String nombre;
    protected int edad;
    protected boolean estado = true;
    protected String fechaNacimiento;
    */
    protected String pico;
    protected boolean vuela;
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    /* Funciones que hereda de Mascota:
    * abstract muestra(); ---no necesaria aquí
    * abstract habla(); ---no necesaria aquí
    * void cumpleaños(); ---esta clase es abstracta, no necesaria aquí
    * void morir(); ---esta clase es abstracta, no necesaria aquí
    */
    
    // FUNCION ABSTRACTA DE AVE:
    public abstract String volar();
    
    
 
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    
    // CONSTRUCTOR CON TODO
    public Ave(String pico, boolean vuela, String nombre, int edad, String fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }
    // CONSTRUCTOR SOLO AVE
    public Ave(String pico, boolean vuela) {
        this.pico = pico;
        this.vuela = vuela;
    }
    // CONSTRUCTOR VACIO
    public Ave() {
    }
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean getVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    //RESTO DE GETTERS Y SETTERS QUE HEREDA DE MASCOTAS:
    
    // getNombre();
    // setNombre();
    
    // getEdad();
    // setEdad();
    
    // getEstado();
    // setEstado();
    
    // getFechaNacimiento();
    // setFechaNacimiento();


    
    
    
}
