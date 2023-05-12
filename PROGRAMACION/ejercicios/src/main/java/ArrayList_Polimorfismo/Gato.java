
package ArrayList_Polimorfismo;


public class Gato extends Mascota {

    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    
    /* Hereda de Mascota:
    protected String nombre;
    protected int edad;
    protected boolean estado = true;
    protected String fechaNacimiento;
     */
    private String color;
    private boolean tienePeloLargo;
    
    

    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    /* Funciones que hereda de Mascota:
    * abstract muestra();
    * abstract habla();
    * void cumpleaños(); ---no necesaria aquí
    * void morir(); ---no necesaria aquí
    * abstract String Tipo();
    */
    public String muestra() {
        // (añade los atributos de Mascota aquí)
        StringBuilder sb = new StringBuilder();
        sb.append("Gato{");
        sb.append("nombre=").append(getNombre());
        sb.append(", edad=").append(getEdad());
        sb.append(", estado=").append(getEstado());
        sb.append(", fecha de nacimiento=").append(getFechaNacimiento());
        sb.append(", ¿tiene Pelo Largo?=").append(tienePeloLargo);
        sb.append('}');
        return sb.toString();
    }

    public String habla() {
        String maullido = "MIAU, MIAAAU...";
        return maullido;
    }
    
    public String Tipo() {
        return "Tipo = Gato. ";
    }
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    // CONSTRUCTOR CON TODO - MASCOTA Y GATO
    public Gato(String color, boolean tienePeloLargo, String nombre, int edad, String fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.color = color;
        this.tienePeloLargo = tienePeloLargo;
    }

    //CONSTRUCTOR PARCIAL SOLO GATO
    public Gato(String color, boolean tienePeloLargo) {
        this.color = color;
        this.tienePeloLargo = tienePeloLargo;
    }
    
    // CONSTRUCTOR VACIO 
    public Gato() {
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

    public boolean getTienePeloLargo() {
        return tienePeloLargo;
    }

    public void setTienePeloLargo(boolean tienePeloLargo) {
        this.tienePeloLargo = tienePeloLargo;
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


