
package ArrayList_Polimorfismo;

//import java.time.*;
//import java.time.format.*;
//auto-comment: control + shift + c

public abstract class Mascota {
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    protected String nombre;
    protected int edad;
    protected boolean estado; 
    protected String fechaNacimiento;
    
    //TEST - JAVA TIME
    
    
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    // ABSTRACTA MUESTRA ATRIBUTOS
    public abstract String muestra();
    
    // ABSTRACTA ONOTOMATOPEYA
    public abstract String habla();
    
    // ABSTRACTA STRING TIPO
    public abstract String Tipo(); //no necesaria que tenga un atributo asociado como si fuera un getter
    
    // CUMPLE AÑOS
    public void cumpleaños() {
        //actualiza la edad a uno mas
        edad++;
    }
    
    // DEJA DE VIVIR :(
    public void morir() {
        //actualiza si el animal ha muerto :(
        estado = false;
    }
    
    
    
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    
    // CONSTRUCTOR CON TODO
    public Mascota(String nombre, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = true; //no haría falta en verdad, creo(?) se da de alta estando vivo.
    }
    
    // CONSTRUCTOR VACIO
    public Mascota()
    { 
            this.estado = true; 
    }
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
    
    
}
