/*
Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de
multiplicar del 1 al 10 (cada tabla en una fila). 
Luego mostrará la matriz por pantalla.

1x0=0 1x1=1 1x2=2 1x3=3 1x4=4 1x5=5 1x6=6 1x7=7 1x8=8 1x9=9 1x10=10
2x0=0 2x1=2 2x2=4 2x3=6 2x4=8 2x5=10 2x6=12 2x7=14 2x8=16 2x9=18 2x10=20
3x0=0 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
4...
5...
6...
7...
8...
9...
10...
 */
package ejerciciosMatrices;

public class Matrices02 {

    public static void main(String[] args) {

        int matriz[][] = new int[10][11];
        

        for (int j = 0; j < matriz.length; j++) {
            

            for (int i = 0; i < matriz[j].length; i++) {
                
                matriz[j][i] = (j+1) * i;
                System.out.print(String.format("%" + 4 + "s", matriz[j][i])); //4 son los caracteres que quieres que ocupen
                
            }
            System.out.println();
        }

        
        
        
    }

}
