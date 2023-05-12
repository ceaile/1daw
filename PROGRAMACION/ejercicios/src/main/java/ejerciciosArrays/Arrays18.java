package ejerciciosArrays;

/*
Crea un programa que cree un array de tamaño 30 y lo rellene con valores aleatorios entre 0
y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
pantalla
 */

import java.util.Arrays;

public class Arrays18 {
    
    public static void main(String[] args) {
        
        int vector[] = new int[30]; //crear array
        
        //Arrays.fill(vector, (int)(Math.random()*10) ); NO FUNCIONA ͼ(ݓ_ݓ)ͽ
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10);
        }
        
        System.out.println(Arrays.toString(vector)); //sacarlo por pantalla
        
        Arrays.sort(vector); //ordenarlos
        
        System.out.println(Arrays.toString(vector)); //sacarlos de nuevo
    }
    
}
