
package ArrayList_Polimorfismo;

import java.util.ArrayList;

public class Empresa {
    //--------------------------------------------------------------------------
    //       ATRIBUTOS
    //--------------------------------------------------------------------------

    private final String nombreEmpresa;
    private final String CIF;
    private String telefono;
    private String direccion;
    ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
    
    //--------------------------------------------------------------------------
    //       CONSTRUCTOR
    //--------------------------------------------------------------------------
        public Empresa(String nombreEmpresa, String CIF, String telefono, String direccion) {
        this.nombreEmpresa = nombreEmpresa;
        this.CIF = CIF;
        this.telefono = telefono;
        this.direccion = direccion;
    }
        
    //--------------------------------------------------------------------------
    //       FUNCIONES
    //--------------------------------------------------------------------------
    
    //FUNCION AÑADIR EMPLEADOS
    public void AñadirEmpleado(Empleado empleado) {
       listaEmpleados.add(empleado);
    }
        
    //FUNCION ELIMINAR EMPLEADOS
    public void EliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);
    }
        
    //MOSTRAR TODA LA INFO DE TODOS LOS EMPLEADOS
    public String TodaInfoEmpleados(){
        String info = "";
        for (Empleado i: listaEmpleados) {
        info += i.toString() + "\n";
        }
        return info;
    }
        
    //MOSTRAR SUELDO BRUTO, NETO Y DNI DE TODOS LOS EMPLEADOS
    public String sueldoYdniEmpleados(){
                String info = "";
        for (Empleado i: listaEmpleados) {
        info += i.infoSueldoDni() + "\n";
        }
        return info;
    }
        
    //CALCULAR SUMA SUELDOS BRUTOS TODOS LOS EMPLEADOS
    public double TodosSueldosBrutos(){
        double sumaSueldosBrutos = 0;
        for (Empleado i: listaEmpleados){
            sumaSueldosBrutos += i.getSueldoBrutoAnual();
        }
        
        /* Haciéndolo con posiciones numéricas:
        for (int i = 0; i < listaEmpleados.size(); i++) {
        lista += listaEmpleados.get(i).infoSueldoBrutoAnual() + "\n" }
        */
        return sumaSueldosBrutos;
    }
        
    //CALCULAR SUMA SUELDOS NETOS DE TODOS LOS EMPLEADOS
    public double TodosSueldosNetos(){
        double sumaSueldosBrutos = 0;
        for (Empleado i: listaEmpleados){
            sumaSueldosBrutos += i.SueldoNeto();
        }
        return sumaSueldosBrutos;
    }
    
    
    //--------------------------------------------------------------------------
    //       GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }



    public String getCIF() {
        return CIF;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }


}
