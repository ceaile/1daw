/*
Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla así:

  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25

 */
package ejerciciosMatrices;

public class Matrices01 {

    public static void main(String[] args) {
        
        int matriz[][] = new int[5][5];
        
        for (int j = 0; j < matriz.length; j++) {
            
            for (int i = 0; i < matriz[j].length; i++) {

                matriz[j][i] = (i + 1) + (matriz[j].length * j);

                /*
                Para ir introduciendo del 1 al 25 en la matriz
                multiplicamos 5 (longitud de la matriz) * indice j.
                Eso va haciendo uno a uno la multiplicación de
                columnas y filas (posiciones),
                sumado al número que habría en i + 1 va poniendo
                el número correcto.
                Introducir (i + 1) solo saca del 1 al 5 en cada fila.
                Por eso multiplicar la longitud de:
                ((i) Posicion en la que estás + 1 para no escribir dentro el 0),
                + la longitud del array (fila) * (j)posicion de la columna en la que estás.
                Es útil utilizar j a pesar de que j significa posición y no el nº de columnas ya completadas,
                que es el verdadero cálculo, porque igualmente necesitas siempre el nº que signifique j.
                */
                
                //sacar por pantalla la matriz con padding de 3 caracteres, 's' significa espacio, '%' ni idea
                System.out.print(String.format("%" + 3 + "s", matriz[j][i]));
            }
            System.out.println();
        }
        
        
        
    }
    
}
