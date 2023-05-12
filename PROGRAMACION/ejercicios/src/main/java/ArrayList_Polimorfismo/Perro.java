
package ArrayList_Polimorfismo;


public class Perro extends Mascota {
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    
    /* Hereda de Mascota:
    protected String nombre;
    protected int edad;
    protected boolean estado = true;
    protected String fechaNacimiento;
    */
    private String raza;
    private boolean pulgas;
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    // ABSTRACTA MUESTRA INFO DE ATRIBUTOS
    public String muestra() { //FUNCION PARA MOSTRAR TODOS LOS ATRIBUTOS
        // (añade los atributos de Mascota aquí)
        StringBuilder sb = new StringBuilder();
        sb.append("Perro{");
        sb.append("nombre=").append(getNombre());
        sb.append(", edad=").append(getEdad());
        sb.append(", estado=").append(getEstado());
        sb.append(", fecha de nacimiento=").append(getFechaNacimiento());
        sb.append(", raza=").append(raza);
        sb.append(", ¿tiene pulgas?=").append(pulgas);
        sb.append('}');
        return sb.toString(); 
    }
    // ABSTRACTA ONOMATOPEYA
    public String habla() {
        String ladrido = "¡GUAU, GUAU, GUAU...!";
        return ladrido;
    }
    
    public String Tipo() {
        return "Tipo = Perro. ";
    }
    
    /* Funciones que hereda de Mascota:
    * abstract muestra();
    * abstract habla();
    * void cumpleaños(); ---no necesaria aquí
    * void morir(); ---no necesaria aquí
    * abstract String Tipo();
    */
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------

    // CONSTRUCTOR CON TODO - ATRIBUTOS MASCOTA Y PERRO
    public Perro(String raza, boolean pulgas, String nombre, int edad, String fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }
    
    // CONSTRUCTOR SOLO PERRO
    public Perro(String raza, boolean pulgas) {
        this.raza = raza;
        this.pulgas = pulgas;
    }
    
    // CONSTRUCTOR VACIO
    public Perro() {
    }
    
    
    
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------
    
    //
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean getPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
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
