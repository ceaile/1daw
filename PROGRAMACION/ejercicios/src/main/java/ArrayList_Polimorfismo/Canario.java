
package ArrayList_Polimorfismo;


public class Canario extends Ave {
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    
    /* Hereda de Mascota:
    protected String nombre;
    protected int edad;
    protected boolean estado = true;
    protected String fechaNacimiento;
    
    Hereda de Ave:
    protected String pico;
    protected boolean vuela = true;
    */
    private String color;
    private boolean canta;
    
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    /* Funciones que hereda de Mascota:
    * abstract muestra();
    * abstract habla(); 
    * void cumpleaños(); ---no necesaria aquí
    * void morir(); ---no necesaria aquí
    * abstract String Tipo();
    
    Funciones que hereda de Ave:
    * abstract String volar();
    */
    
    // ABSTRACTA MUESTRA INFO DE ATRIBUTOS FROM MASCOTA
    public String muestra() {
        StringBuilder sb = new StringBuilder();
        sb.append("Canario{");
        sb.append("color=").append(color);
        sb.append(", nombre=").append(getNombre());
        sb.append(", edad=").append(getEdad());
        sb.append(", estado=").append(getEstado());
        sb.append(", fecha de nacimiento=").append(getFechaNacimiento());
        sb.append(", ¿canta?=").append(canta);
        sb.append('}');
        return sb.toString();
    }
    
    // ABSTRACTA ONOMATOPEYA FROM MASCOTA
    public String habla() {
        if (canta) {
        return "¡Lala, lalalala, lalalala~";
    } else {
            return "¡Pío, pío...!";
        }
        
    }
    
    // ABSTRACTA FROM AVE
    public String volar() {
        if (vuela == true) {
            return "Flip, flip, flip...";
        } else {
            return "¡Clonk! (lo intentó y se dio un porrazo)";
        }
    }  
    
    public String Tipo() {
        return "Tipo = Canario. ";
    }
    
    //NO FUNCIONES PROPIAS DE CANARIO
    
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    
    //CONSTRUCTOR CON TODO, MASCOTA Y AVE
    public Canario(String color, boolean canta, String pico, boolean vuela, String nombre, int edad, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, fechaNacimiento);
        this.color = color;
        this.canta = canta;
    }
    
    //CONSTRUCTOR SOLO CANARIO
    public Canario(String color, boolean canta) {
        this.color = color;
        this.canta = canta;
    }
   
    // CONSTRUCTOR VACIO
    public Canario() {
    }
    
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    
    
    //GETTERS Y SETTERS QUE HEREDA DE MASCOTAS:
    
    // getNombre();
    // setNombre();
    
    // getEdad();
    // setEdad();
    
    // getEstado();
    // setEstado();
    
    // getFechaNacimiento();
    // setFechaNacimiento();
    
    
    //GETTERS Y SETTERS QUE HEREDA DE AVE:
    
    // getPico();
    // setPico();
    
    // getvuela();
    // setVuela();


    
    
    
}
