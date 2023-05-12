/*
https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
 */
package otrosEjercicios;


public class Electrodomestico_Main {


    public static void main(String[] args) {
        Electrodomestico array[] = new Electrodomestico[4];
        
        Electrodomestico microondas = new Electrodomestico(40, "plateado", 'A', 5); 
        Electrodomestico secadora = new Electrodomestico(240,40);
        Lavadora lavadora1 = new Lavadora(300, "blanco", 'B', 50);
        Televisor tv1 = new Televisor(800, 3);
        
        array[0] = microondas;
        array[1] = secadora;
        array[2] = lavadora1;
        array[3] = tv1;
        
        
        //MOSTRAR PRECIO FINAL DE CADA UNO
        //MOSTRAR PRECIOS FINALES TODOS JUNTOS DE TODOS
        //MOSTRAR PRECIOS TOTALES AGRUPADOS POR INSTANCIA
        
        double precioTodosJuntos = 0; 
        double precioElectrodomesticos = 0; 
        double precioLavadoras = 0; 
        double precioTvs = 0; 
        
        for (int i = 0; i < array.length; i++){                                     // INSTANCEOF AQUI
            Object aux = array[i];
            
            if (aux instanceof Televisor){
                Televisor tv;
                tv = (Televisor) aux;
                precioTvs += array[i].precioFinal();
                
            } else if (aux instanceof Lavadora){
                Lavadora lv;
                lv = (Lavadora) aux;
                precioLavadoras += array[i].precioFinal();
                
            } else {
                precioElectrodomesticos += array[i].precioFinal();
            }
            precioTodosJuntos += array[i].precioFinal(); 
            
            
            System.out.println("Electrodomestico " + (i+1) + ": "  + array[i].precioFinal());
            System.out.println("");
        }
        System.out.println("Precio lavadoras total final: " + precioLavadoras + "€");
        System.out.println("Precio televisores total final: " + precioTvs + "€");
        System.out.println("Precio electrodomesticos total final: " + precioElectrodomesticos + "€");
        System.out.println("Precio total final de todos juntos: " + precioTodosJuntos + "€");
        
        
        
    }
    
}
