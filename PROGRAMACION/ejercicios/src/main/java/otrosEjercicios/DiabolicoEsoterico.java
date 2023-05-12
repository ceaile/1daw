package otrosEjercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
https://www.aceptaelreto.com/problem/statement.php?id=101&cat=7

TERMINADO!!!!!!!!!!

la suma de las esquinas = const Magica 2
la suma de los alrededor = const Magica 2
la suma centros x 4 = const Magica 2
 */
public class DiabolicoEsoterico {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el número de lados:");
        int n = teclado.nextInt(); // N, el numero de casillas de cada cuadrado

        int cuadrado[][] = new int[n][n];

        System.out.println("Introduzca los números en el cuadrado:");

        //RELLENAR CUADRADO
        for (int j = 0; j < cuadrado.length; j++) //filas
        {
            for (int i = 0; i < cuadrado[j].length; i++) //columnas
            {
                cuadrado[j][i] = teclado.nextInt();
            }
        }

        //TESTING - COMENTAR DESPUÉS -------------------------------------------------------------------------------------
        //esoterico, n=3
        /*
        n = 3;
        cuadrado[0][0] = 4;
        cuadrado[0][1] = 9;
        cuadrado[0][2] = 2;
        cuadrado[1][0] = 3;
        cuadrado[1][1] = 5;
        cuadrado[1][2] = 7;
        cuadrado[2][0] = 8;
        cuadrado[2][1] = 1;
        cuadrado[2][2] = 6;
        */
        
        
        //diabolico, n=3
        /*
        n = 3;
        cuadrado[0][0] = 28;
        cuadrado[0][1] = 21;
        cuadrado[0][2] = 26;
        cuadrado[1][0] = 23;
        cuadrado[1][1] = 25;
        cuadrado[1][2] = 27;
        cuadrado[2][0] = 24;
        cuadrado[2][1] = 29;
        cuadrado[2][2] = 22;
        */ 
        
        
        
        
        //VER CUADRADO
        for (int j = 0; j < cuadrado.length; j++) //filas
        {
            for (int i = 0; i < cuadrado[j].length; i++) //columnas
            {
                System.out.print(" [" + cuadrado[j][i] + "] ");
            }
            System.out.println("");
        }

        //----------------------------------------------------------------------
        //                  COMPROBAR CONDICIONES DIABOLICO
        //----------------------------------------------------------------------
        //int constanteMagica = 0;
        int sumaFilas[] = new int[n];
        int sumaFila = 0;
        int sumaColumnas[] = new int[n];
        int sumaColumna = 0;

        int sumaDiagonal = 0;
        int sumaDiagonales[] = new int[2];

        //SUMAR VALORES FILAS Y VALORES COLUMNAS Y METER EN UN ARRAY
        for (int j = 0; j < cuadrado.length; j++) {
            for (int i = 0; i < cuadrado[j].length; i++) {
                
                sumaFila += cuadrado[j][i];
                sumaColumna += cuadrado[i][j];

            }

            sumaFilas[j] = sumaFila;
            sumaColumnas[j] = sumaColumna;
            //reset:
            sumaFila = 0;
            sumaColumna = 0;

        }

        // TESTING - COMENTAR DESPUES - VISUALIZAR ARRAY DE SUMAS-----------------------------------------------------
        /*
        System.out.println("Suma de filas (j):");
        System.out.println(Arrays.toString(sumaFilas));
        System.out.println("");
        System.out.println("Suma de columnas (i):");
        System.out.println(Arrays.toString(sumaColumnas));
        */
        
        //COMPARAR CONST. DIABOLICA FILAS Y COLUMNAS
        int constMagica = 0;
        boolean constDiabolica = true;

        for (int i = 0; i < sumaFilas.length; i++) {
            if (sumaFilas[0] != sumaFilas[i]) {
                constDiabolica = false; //en cuanto no encuentra una coincidencia lo manda a la puta
            }
        }

        for (int i = 0; i < sumaColumnas.length; i++) {
            if (sumaColumnas[0] != sumaColumnas[i]) {
                constDiabolica = false;
            }
        }

        
        //SUMAR VALORES DIAGONALES
        for (int j = 0; j < cuadrado.length; j++) //filas
        {
            //de principio a fin
            for (int i = 0; i < cuadrado[j].length; i++) //columnas
            {
                if (i == j) {
                    sumaDiagonal += cuadrado[j][i];
                }
            }
        }
        sumaDiagonales[0] = sumaDiagonal;
        sumaDiagonal = 0; //reseteamos

        for (int j = 0; j < cuadrado.length; j++) //filas
        {
            //de fin a principio
            for (int i = 0; i < cuadrado[j].length; i++) //columnas
            {
                if (i == n - 1 - j) {
                    sumaDiagonal += cuadrado[j][i];
                }
            }
        }
        sumaDiagonales[1] = sumaDiagonal;

        //TESTING - COMENTAR DESPUES ------------------------------------------------------------------------------------- 
        /*
        System.out.println("Testing: sumaDiagonales[0] = " + sumaDiagonales[0]);
        System.out.println("Testing: sumaDiagonales[1] = " + sumaDiagonales[1]);
        */

        //COMPROBAR CONST. DIABOLICA DIAGONALES
        for (int i = 0; i < sumaDiagonales.length; i++) {
            if (sumaDiagonales[0] != sumaDiagonales[i]) {
                constDiabolica = false; //en cuanto no encuentra una coincidencia lo manda a la puta
            }
        }

        //----------------------------------------------------------------------
        //               COMPROBAR CONDICIONES ESOTERICO
        //----------------------------------------------------------------------
        int sumaAlrededor = 0;
        int sumaCentros = 0;
        int sumaEsquinas = 0;
        boolean constEsoterica = false;

        //SUMAMOS ESQUINAS, DA IGUAL SI ES PAR O IMPAR
        for (int j = 0; j < cuadrado.length; j++) //filas
        {
            for (int i = 0; i < cuadrado[j].length; i++) {

                if ((j == 0 && i == 0)
                        || (j == n - 1 && i == n - 1)
                        || (j == 0 && i == n - 1)
                        || (j == n - 1 && i == 0)) {
                    sumaEsquinas += cuadrado[j][i];
                }
            }

        }

        //SUMAMOS CENTROS-CENTROS Y ALREDEDORES(CENTROS ARRIBA Y CENTROS ABAJO). SI ES PAR DE UNA MANERA Y SI ES IMPAR DE OTRA
        if ((n % 2) == 0) //si n es par
        {

            for (int j = 0; j < cuadrado.length; j++) //filas
            {

                for (int i = 0; i < cuadrado[j].length; i++) //columnas
                {
                    if (j == 0 || j == n - 1) //para sumar centros arriba y abajo
                    {
                        if ( i == n / 2 || i == n / 2 - 1 ) {
                            sumaAlrededor += cuadrado[j][i];
                        }

                    }

                    if (j == (n / 2) || j == (n / 2 - 1)) { //para sumar centros derecha e izquierda
                        if (i == 0 || i == n - 1) {
                            sumaAlrededor += cuadrado[j][i];
                        }
                        if (i == n / 2 || i == n / 2 - 1) {
                            sumaCentros += cuadrado[j][i];
                        }
                    }

                }

            }

        } else //si n es impar
        {
            for (int j = 0; j < cuadrado.length; j++) //filas
            {
                for (int i = 0; i < cuadrado[j].length; i++) //columnas
                {

                    if ( j == 0 || j == n-1 ) {
                        if (i == (n-1) / 2) {
                            sumaAlrededor += cuadrado[j][i]; //sumar centro arriba y centro abajo
                        }
                    }

                    if (j == (n-1) / 2 ) {
                        if (i == 0 || i == n-1) {
                            sumaAlrededor += cuadrado[j][i]; //suma centro derecha y centro izquierda
                        }

                        if (i == (n-1) / 2) {
                            sumaCentros = cuadrado[j][i]; //solo mete el valor del centro
                        }
                    }
                }

            }
            
        }
        

        //TESTING - COMENTAR DESPUES
        /*
        System.out.println("sumaCentros= " + sumaCentros);
        System.out.println("sumaAlrededor= " + sumaAlrededor);
        System.out.println("sumaEsquinas= " + sumaEsquinas);
        */
       

        if (sumaEsquinas == sumaAlrededor && sumaEsquinas == (sumaCentros * 4) && constDiabolica == true) {
            constEsoterica = true;
        }

        if (constEsoterica == true && constDiabolica == true) {
            System.out.println("ESOTERICO");
        } else if (constDiabolica == true && constEsoterica == false) {
            System.out.println("DIABOLICO");
        } else {
            System.out.println("NO.");
        }

    }
}
