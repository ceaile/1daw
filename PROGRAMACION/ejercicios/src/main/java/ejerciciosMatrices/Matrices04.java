/*
Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
programa mostrará la nota mínima, máxima y media de cada alumno.

alumno1     [nota]   [nota]    [nota]    [nota]    [nota]
alumno2     [nota]   [nota]    [nota]    [nota]    [nota]
alumno3     [nota]   [nota]    [nota]    [nota]    [nota]
alumno4     [nota]   [nota]    [nota]    [nota]    [nota]

 */
package ejerciciosMatrices;

//atajo copiar linea entera: inicio/home + shift (flecha arriba) + fin
import java.util.Scanner;

public class Matrices04 {

    public static void main(String[] args) {

        int matriz[][] = new int[4][5];
        Scanner teclado = new Scanner(System.in);
        
        //recorrer matriz de manera normal
        for (int j = 0; j < matriz.length; j++) {
            
            //escribir la nota en cada posicion de la matriz
            for (int i = 0; i < matriz[j].length; i++) {
                System.out.println("Introduce las notas del alumno " + j + "/4");
                matriz[j][i] = teclado.nextInt();  
            }
        }
        
        //crear otro bucle aparte para complicarme menos
        
        
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            int minima = matriz[i][0]; //para que resetée en cada vuelta
            int maxima = 0;
            
            
            for (int j = 0; j < matriz[i].length; j++) {
                suma = suma + matriz[i][j];
                
                if (maxima < matriz[i][j]) {
                    maxima = matriz[i][j];
                }
                
                if (minima > matriz[i][j]) {
                   minima = matriz[i][j];
                }
                
            }
            
            int media = suma / matriz[i].length;
            System.out.println("La nota media del alumno " + (i+1) + " es: " + media);
            System.out.println("La nota máxima del alumno " + (i+1) + " es: " + maxima);
            System.out.println("La nota mínima del alumno " + (i+1) + " es: " + minima);
        }

                
    }

}
