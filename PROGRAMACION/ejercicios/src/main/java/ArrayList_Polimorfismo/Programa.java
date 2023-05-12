
package ArrayList_Polimorfismo;


public class Programa {


    public static void main(String[] args) {
        
        System.out.println("---------------------------"); 
        // sout + tabulador
        System.out.println("Creamos diferentes empresas.");
        //String nombreEmpresa, String CIF, String telefono, String direccion
        Empresa empresa1 = new Empresa("Empresa1", "11233", "919776655", "c/Patatito, 1");
        Empresa empresa2 = new Empresa("Empresa2", "94852", "919776655", "c/Patatito, 2");
        
        Empleado empleado1 = new Empleado("Pepita", "123456789A", 23000);
        Empleado empleado2 = new Empleado("Mengano", "123456789B", 21000);
        Empleado empleado3 = new Empleado("Fulano", "123456789C", 27000);
        Empleado empleado4 = new Empleado("Menganita", "123456789C", 28000);
        //String nombre, String dni, double sueldoBrutoAnual
        
        empresa1.AñadirEmpleado(empleado3);
        empresa1.AñadirEmpleado(empleado1);
        empresa2.AñadirEmpleado(empleado4);
        empresa1.AñadirEmpleado(empleado2);
        
        System.out.println("... Hecho.");
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("Visualizamos empleados de ambas empresas:");
        System.out.println("De empresa1:");
        System.out.println(empresa1.sueldoYdniEmpleados());
        System.out.println("");
        System.out.println("De empresa2:");
        System.out.println(empresa2.sueldoYdniEmpleados());
        System.out.println("");
        System.out.println("Eliminamos algún empleado de empresa1 y volvemos a mostrar la info.");
        System.out.println("");
        empresa1.EliminarEmpleado(empleado1);
        empresa1.EliminarEmpleado(empleado2);
        System.out.println(empresa1.sueldoYdniEmpleados());
        
        System.out.println("");
        System.out.println("---------------------------");
        System.out.println("Hemos visto ya los sueldos brutos y netos de algunos empleados");
        System.out.println("Vamos a ver ahora todos los sueldos netos de empresa1");
        System.out.println(empresa1.TodosSueldosNetos()  + "€ totales");
        
        System.out.println("Vamos a ver ahora todos los sueldos brutos de empresa1");
        System.out.println(empresa1.TodosSueldosBrutos() + "€ totales");
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
