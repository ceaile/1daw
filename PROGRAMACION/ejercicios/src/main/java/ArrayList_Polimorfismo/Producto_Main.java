
package ArrayList_Polimorfismo;

import java.util.ArrayList; //NECESARIO
import java.util.Iterator;  //NECESARIO
// System.out.println();
public class Producto_Main {

    
    public static void main(String[] args) {
        // 1. Crea 5 instancias de la Clase Producto.
        System.out.println("1. Crea 5 instancias de la Clase Producto.");
        
        Producto producto1 = new Producto("gafas", 5);
        Producto producto2 = new Producto("guantes", 5);
        Producto producto3 = new Producto("sombrero", 5);
        Producto producto4 = new Producto("collar", 10);
        Producto producto5 = new Producto("pendientes", 10);
        System.out.println("Hecho.");
        System.out.println();
        
        // 2. Crea un arrayList
        System.out.println("2. Crea un arrayList");
        ArrayList lista = new ArrayList();
        System.out.println("Hecho.");
        System.out.println();
        
        // 3. Añade las 5 instancias de Producto al ArrayList
        System.out.println("3. Añade las 5 instancias de Producto al ArrayList");
        lista.add(producto1);
        lista.add(producto2);
        lista.add(producto3);
        lista.add(producto4);
        lista.add(producto5);
        System.out.println("Hecho.");
        System.out.println();
        
        // 4. Visualiza el contenido de ArrayList utilizando Iterator.
        System.out.println("4. Visualiza el contenido de ArrayList utilizando Iterator.");
        
        Iterator iterador = lista.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next().toString());
        }
        
        System.out.println("Hecho.");
        System.out.println();
        
        
        
        // 5. Elimina dos elementos del ArrayList.  
        System.out.println("5. Elimina dos elementos del ArrayList.");
        
        lista.remove(producto3);
        lista.remove(producto4);
        
        System.out.println("Hecho.");
        Iterator iterador2 = lista.iterator();
        System.out.println("Comprobación:");
        while (iterador2.hasNext()) {
            System.out.println(iterador2.next().toString());
        }
        System.out.println();
        
        // 6. Inserta un nuevo objeto producto en medio de la lista.
        System.out.println("6. Inserta un nuevo objeto producto en medio de la lista.");
        Producto producto6 = new Producto("paraguas", 8);
        lista.add((lista.size()/2), producto6);
        System.out.println("Hecho.");
        System.out.println();
        
        // 7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator.
        System.out.println("7. Visualiza de nuevo el contenido de ArrayList utilizando Iterator.");
        Iterator iterador3 = lista.iterator();
        while (iterador3.hasNext()) {
            System.out.println(iterador3.next().toString());
        }
        System.out.println("Hecho.");
        System.out.println();
        
        // 8. Elimina todos los valores del ArrayList.
        System.out.println("8. Elimina todos los valores del ArrayList.");
        lista.clear();
        System.out.println("Hecho.");
        System.out.println();
    }
    
}
