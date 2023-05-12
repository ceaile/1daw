


package ArrayList_Polimorfismo;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaVehiculos {

    public static void main(String[] args) {
        
        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
                
        Scanner teclado = new Scanner(System.in);
                
        /*
        
        try {

            vehiculo Todos = new vehiculo();
            vehiculo Todos = new vehiculo();
            vehiculo Todos = new vehiculo();

        } catch (Exception e) {
        
            System.out.println("e.getMessage()");
        
        } finally {
            doSomething();
        }
        
        */
    
        try {
            String matricula1 = teclado.nextLine();
            matricula1 = "ASDFGH"; //trampa para que en realidad el codigo ya tenga la matricula1 que queremos probar
            
           //comprobamos funciones de matriculas:
           
           
           if ( VehiculoAcuatico.EsValida("ASDFGH") ) {
               VehiculoAcuatico vA1 = new VehiculoAcuatico(2.2, "ASDFGH", "dron");
               lista.add(vA1);
               vA1.imprimir();
               
           } else {
               System.out.println("Matricula no valida.");
           }
           
           
            System.out.println("Probamos a meter una matricula incorrecta:");
            String matricula2 = teclado.nextLine();
            if ( VehiculoAcuatico.EsValida(matricula2)) {
                VehiculoAcuatico vA2 = new VehiculoAcuatico(3.3, matricula2, "aeronave");
            } else System.out.println("Matricula no valida. Solo debe contener 3-10 letras.");
           
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        } finally {
            System.out.println("Nada.");
        }
        
        
        
        
        
        
        
    
    }
    
}
