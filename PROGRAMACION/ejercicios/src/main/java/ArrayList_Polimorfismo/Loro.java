
package ArrayList_Polimorfismo;

/**
 *
 * @author Admin
 */
public class Loro extends Ave {
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
    private String origen;
    private boolean sabeHablar;
    
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    /* Funciones que hereda de Mascota:
    * abstract muestra();
    * abstract sabeHablar();
    * void cumpleaños(); ---no necesaria aquí
    * void morir(); ---no necesaria aquí
    * abstract String Tipo();
    
    Funciones que hereda de Ave:
    * abstract String volar();
    */
    
    //FUNCION ABSTRACTA MUESTRA()
    public String muestra() {
        StringBuilder sb = new StringBuilder();
        sb.append("Loro{");
        sb.append("origen=").append(origen);
        sb.append(", nombre=").append(getNombre());
        sb.append(", edad=").append(getEdad());
        sb.append(", estado=").append(getEstado());
        sb.append(", fecha de nacimiento=").append(getFechaNacimiento());
        sb.append(", habla=").append(sabeHablar);
        sb.append('}');
        return sb.toString();
    }
    
    // ABSTRACTA ONOMATOPEYA FROM MASCOTA, HABLA()
    public String habla() {
        String onomatopeya = "";
        if (sabeHablar == true) {
            onomatopeya ="¡Hola, caracola!";
        } else {
            onomatopeya = "¡aaaaaahhhrrrrRRRHHGGGHH!";
        }
        return onomatopeya;
    }
    
    // FUNCION SALUDA() - PROVIENE DE FUNCION HABLA - FUNCION SOLO LORO
    public String Saluda() {
        return habla(); //FIXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    }
    
    // ABSTRACTA FROM AVE - VOLAR() 
    public String volar() {
        if (vuela == true) {
            return "Flip, flip, flip...";
        } else {
            return "¡Clonk! (lo intentó y se dio un porrazo)";
        }
    }  
    
    public String Tipo() {
        return "Tipo = Loro. ";
    }
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    
    // CONSTRUCTOR CON TODO - ATRIBUTOS MASCOTAS, AVE, LORO
    public Loro(String origen, boolean habla, String pico, boolean vuela, String nombre, 
                    int edad, String fechaNacimiento) {
        super(pico, vuela, nombre, edad, fechaNacimiento);
        this.origen = origen;
        this.sabeHablar = habla;
    }
    
    // CONSTRUCTOR SOLO LORO
    public Loro(String origen, boolean habla) {
        this.origen = origen;
        this.sabeHablar = habla;
    }
    
    // CONSTRUCTOR VACIO 
    public Loro() {
    }
        
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean getHabla() {
        return sabeHablar;
    }

    public void setSabeHablar(boolean sabeHablar) {
        this.sabeHablar = sabeHablar;
    }

    //GETTERS Y SETTERS QUE HEREDA DE MASCOTAS-------------------
    
    // getNombre();
    // setNombre();
    
    // getEdad();
    // setEdad();
    
    // getEstado();
    // setEstado();
    
    // getFechaNacimiento();
    // setFechaNacimiento();
    
    
    //GETTERS Y SETTERS QUE HEREDA DE AVE-------------------------
    
    // getPico();
    // setPico();
    
    //getvuela();
    //setVuela();



}
