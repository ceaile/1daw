
package ejerciciosExcepciones;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class newException extends Exception {

    /**
     * Creates a new instance of <code>newException</code> without detail
     * message.
     */
    public newException() {
    }
    
    public newException(String mensaje) { //hecho como en el constructor automatico de excepciones
        super(mensaje);
    }

    /**
     * Constructs an instance of <code>newException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    
    
    public String mensaje() {
        return "Este es el mensaje de la excepcion propia. Ha habido un fallo indeterminado";
    }
}
