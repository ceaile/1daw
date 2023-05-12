/*
Implementa una clase Gato con los atributos nombre y edad, un constructor con
parámetros, los getters y setters, además de un método imprimir() para mostrar los datos de
un gato. El nombre de un gato debe tener al menos 3 caracteres y la edad no puede ser
negativa. Por ello, tanto en el constructor como en los setters, deberás comprobar que los
valores sean válidos y lanzar una ‘Exception’ si no lo son. Luego, haz una clase principal con
main para hacer pruebas: instancia varios objetos Gato y utiliza sus setters, probando
distintos valores (algunos válidos y otros incorrectos). Maneja las excepciones.
 */
package ejerciciosExcepciones;


public class Gato {
    
    private String nombre;
    private int edad;
    
//    public Gato(String nombre, int edad) throws Exception{
//        if (edad < 0){
//            throw new Exception("EXCEPCION CONSTRUCTOR: No puede ser un negativo. No se ha completado la construcción.");
//        } else {
//            this.edad = edad;
//        }
//        
//        if ( nombre.length() < 3){
//            throw new Exception("EXCEPCION CONSTRUCTOR: Debe ser al menos de 3 letras. No se ha completado la construcción");
//        } else {
//            this.nombre = nombre;
//        } 
//    }
    
       public Gato(String nombre, int edad) throws Exception{
           setEdad(edad);
           setNombre(nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gato{nombre=").append(nombre);
        sb.append(", edad=").append(edad);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if ( nombre.length() < 3){
            throw new Exception("EXCEPCION SETTER DE NOMBRE: Debe ser al menos de 3 letras. No se ha completado el reset");
        } else {
            this.nombre = nombre;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
       
        if (edad < 0){
            throw new Exception("EXCEPCION SETTER DE EDAD: No puede ser negativo. No se ha completado el reset.");
        } else {
            this.edad = edad;
        }
        
    }
    
    
}
