
package ArrayList_Polimorfismo;


        
public class Producto {
    private String nombre = "";
    private int cantidad = 0;
    
    public Producto(){
        
    }
    
    public Producto(String nombre, int cantidad){
     this.nombre = nombre;
     this.cantidad = cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
    
}
