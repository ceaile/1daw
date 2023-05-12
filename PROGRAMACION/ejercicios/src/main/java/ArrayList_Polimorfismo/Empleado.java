/*
 
 */
package ArrayList_Polimorfismo;

/**
 *
 * @author DAW
 */
public class Empleado {
    
    //--------------------------------------------------------------------------
    //       ATRIBUTOS
    //--------------------------------------------------------------------------
    private final String dni;
    private final String nombreEmpleado;
    private int edad;
    private String telefono;
    
    private double sueldoBrutoAnual;
    
    //--------------------------------------------------------------------------
    //       CONSTRUCTOR
    //--------------------------------------------------------------------------
    public Empleado(String nombre, String dni, double sueldoBrutoAnual) {
        this.nombreEmpleado = nombre;
        this.dni = dni;
        this.sueldoBrutoAnual = sueldoBrutoAnual;
    }
    
    //--------------------------------------------------------------------------
    //       FUNCIONES
    //--------------------------------------------------------------------------
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado {dni=").append(dni);
        sb.append(", nombreEmpleado=").append(nombreEmpleado);
        sb.append(", edad=").append(edad);
        sb.append(", telefono=").append(telefono);
        sb.append(", sueldoBrutoAnual=").append(sueldoBrutoAnual);
        sb.append(", sueldoNetoAnual=").append(SueldoNeto());
        sb.append('}');
        return sb.toString();
    }
    
    public String infoSueldoDni() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado {dni=").append(dni);
        sb.append(", nombreEmpleado=").append(nombreEmpleado);
        sb.append(", sueldoBrutoAnual=").append(sueldoBrutoAnual);
        sb.append(", sueldoNetoAnual=").append(SueldoNeto());
        sb.append('}');
        return sb.toString();
    }
    
    //FUNCION CALCULAR SUELDO NETO
    public double SueldoNeto() {
        double sueldoNeto;
        if (sueldoBrutoAnual < 12000) {
            sueldoNeto = sueldoBrutoAnual - (sueldoBrutoAnual * 0.20);
        } else if ( (sueldoBrutoAnual > 12000) && (sueldoBrutoAnual < 25000) ) {
            sueldoNeto = sueldoBrutoAnual - (sueldoBrutoAnual * 0.30);
        } else {
            sueldoNeto = sueldoBrutoAnual - (sueldoBrutoAnual * 0.40);
        }
        return sueldoNeto;
    }
            
    //--------------------------------------------------------------------------
    //       GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public String getDni() {
        return dni;
    }


    public String getNombreEmpleado() {
        return nombreEmpleado;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldoBrutoAnual() {
        return sueldoBrutoAnual;
    }

    public void setSueldoBrutoAnual(double sueldoBrutoAnual) {
        this.sueldoBrutoAnual = sueldoBrutoAnual;
    }
    



    
    
}
