/*
Esta clase debe cumplir con los siguientes requisitos:
• En la tienda existirán 4 tipos de animales: perros, gatos, loros y canarios.
• Los animales deben almacenarse en un ArrayList privado dentro de la clase Inventario.
• La clase debe permitir realizar las siguientes acciones:
◦ Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
◦ Mostrar todos los datos de un animal concreto.
◦ Mostrar todos los datos de todos los animales.
◦ Insertar animales en el inventario.
◦ Eliminar animales del inventario.
◦ Vaciar el inventario.
*/

package ArrayList_Polimorfismo;

import java.util.ArrayList;
import java.util.Iterator;


public class InventarioMascotas {
    
    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    
    private ArrayList<Mascota> lista = new ArrayList<Mascota>();
    
    
    
    
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    
    
    public InventarioMascotas() {     
    }
   
    
    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    
    // FUNCION MOSTRAR LISTA DE ANIMALES, SOLO TIPO Y NOMBRE, UNA LINEA POR ANIMAL
    public String verLista() {
        String dataTipoNombreMascota = "";
        
        for (Mascota i: lista) {
            dataTipoNombreMascota = dataTipoNombreMascota + i.Tipo() + " Nombre: " + i.getNombre() + "\n";
            
            /* Está bien pero poco elegante:
            if (i instanceof Perro) { //true
                dataTipoNombreMascota = "Tipo: perro. Nombre: " + i.getNombre() + "\n";
            } else if (i instanceof Gato) {
                dataTipoNombreMascota = "Tipo: gato. Nombre: " + i.getNombre() + "\n";
            } else if (i instanceof Canario) {
                dataTipoNombreMascota = "Tipo: canario. Nombre: " + i.getNombre() + "\n";
            } else if (i instanceof Loro) {
                dataTipoNombreMascota = "Tipo: Loro. Nombre: " + i.getNombre() + "\n";
            } else {
                dataTipoNombreMascota = "Tipo: Otro. Nombre: " + i.getNombre() + "\n";
            }
            */
        }
        
        return dataTipoNombreMascota;
    }
    
    
    // FUNCION TODOS LOS DATOS DE UN ANIMAL EN CONCRETO
    public String MostrarDatos(int posicion) {
        return lista.get(posicion).muestra();    
    }
    
    // MOSTRAR TODOS LOS DATOS DE TODOS LOS ANIMALES
    public String VerTodo() {
        String datosMascota = "";
        for (Mascota i: lista) {
            //Se mete: 1 posicionador de clase madre: nombre lista.
            datosMascota = datosMascota + i.muestra() + "\n";
        }
        return datosMascota;
        
    }
    
    
    // INSERTAR ANIMALES EN EL INVENTARIO
    public void AñadirMascota(Mascota animal) {
        lista.add(animal);
    }
    
    // ELIMINAR ANIMALES DEL INVENTARIO
    public void EliminarMascota(int posicion) {
        lista.remove(posicion);
    }

    
    // VACIAR EL INVENTARIO
    public void VaciarLista() {
        lista.clear();
    }

    
    
}
