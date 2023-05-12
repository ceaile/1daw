
package ArrayList_Polimorfismo;

import java.util.ArrayList; //NECESARIO
import java.util.Iterator; //NECESARIO

public class APUNTES_ARRAYLIST {

    
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

//        lista.add(new Persona("Celia", 28));
        
        /*
        Una lista no tiene necesariamente longitud.
        Y puede guardar variables de todo tipo,
        incluso objetos de clases inventadas
        
        puedes meter en el arraylist objetos
        a los que ni siquiera les has puesto nombre!!
        */
        
//
//        lista.size(); //devuelve el número de elementos de la lista.
//
//        lista.get(int index); //devuelve una referencia al elemento en la posición index.
//        
//        lista.clear(); //elimina todos los elementos de la lista. Establece el tamaño a cero.
//
//        lista.isEmpty(); //retorna true si la lista no contiene elementos.
//
//        lista.add(E element); //inserta element al final de la lista y devuelve true.
//
//        lista.add(int index, E element); /* inserta element en la posición index de la lista. Desplaza una
//                    posición todos los demás elementos de la lista (no sustituye ni borra otros elementos).*/
//        lista.set(int index, E element); //sustituye el elemento en la posición index por element.
//
//        lista.contains(Object o); //busca el objeto o en la lista y devuelve true si existe. Utiliza el
//
//        lista.equals(whatever) //metodo equals
//
//        lista.indexOf(Object o); /*busca el objeto o en la lista, empezando por el principio, y devuelve el
//                índice dónde se encuentre. Devuelve -1 si no existe. Utiliza equals() para comparar objetos.*/
//        lista.lastIndexOf(Object o); //como indexOf() pero busca desde el final de la lista.
//
//        lista.remove(int index); //elimina el elemento en la posición index y lo devuelve.
//
//        lista.remove(Object obj); /* elimina la primera ocurrencia de obj en la lista. Devuelve true
//            si lo ha encontrado y eliminado, false en otro caso. Utiliza equals() para comparar objetos.*/
//        lista.remove(int index); /*Elimina el objeto de la lista que se encuentra en la posición index. Es
//                            más rápido que el método anterior ya que no necesita recorrer toda la lista*/
//        
//        //Recorrerlo con un for:
//        for(int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i)); // Lo imprimimos por pantalla
//        }
//        
//        //Recorrerlo con un iterador:
//        Iterator iterador = lista.iterator(); //instanciarlo
//        
//        
//        while (iterador.hasNext()) { //si tiene uno siguiente
//            System.out.println(iterador.next()); //saca ese siguiente
//        }
//        
//        //for each
//        for (Persona iteradorForEach : lista) {
//            System.out.println(iteradorForEach); //no funcionaria en verdad porque esta lista es de objetos
//                                                    //no de Strings
//        }

}

}
