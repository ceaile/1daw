/*
7)
Crea una copia del programa anterior y modifica el main para hacer lo siguiente:
◦ Crea un ArrayList<Gato>. Luego, utilizando un bucle, pide al usuario que introduzca los
datos de 5 gatos: utiliza un Scanner para pedir los datos, instancia el objeto y guárdalo en
el ArrayList. Por último, imprime la información de los gatos.
◦ Maneja las posibles excepciones de modo que en el ArrayList solo almacenemos objetos
Gato válidos y el bucle se repita hasta crear y almacenar correctamente 5 gatos.
 */
package ejerciciosExcepciones;

import java.util.ArrayList;
import java.util.Scanner;


public class e7 {


    
    public static void main(String[] args) {
        
        ArrayList<Gato> listaGatos = new ArrayList<Gato>();
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            
            try {
                System.out.println("Introduzca el nombre del gato:");
                String nombreGato = teclado.nextLine();
//                teclado.nextLine();
                
                System.out.println("Introduzca la edad del gato:");
                int edadGato = teclado.nextInt();
                teclado.nextLine();

                Gato gatoNuevo = new Gato(nombreGato, edadGato);
                listaGatos.add(gatoNuevo);

            } catch (Exception e) {
                System.out.println(e.getMessage());
//                teclado.reset(); //???
                if (teclado.hasNext()){
                    teclado.next();
                }
                i--;
            }
            
        }
        
        
        for(Gato i : listaGatos){
            System.out.println(i.toString());
        }
            
    }

}
