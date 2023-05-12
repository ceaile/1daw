/*

 */
package otrosEjercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 
Código	Categoría

  D	 Desayunos
  A	 Comidas
  M	 Meriendas
  I	 Cenas
  C	 Copas
  
 */
public class BarJavier {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in); 
        HashMap<String, Double> registro = new HashMap<>();

        String todo = "";
        String entrada = "";
        String[] letraNumeros;

        int contD = 0;
        int contA = 0;
        int contM = 0;
        int contI = 0;
        int contC = 0;
        int contTotal = 0;

        double gananciaDesayunos = 0;
        double gananciaComidas = 0;
        double gananciaMeriendas = 0;
        double gananciaCenas = 0;
        double gananciaCopas = 0;
        double gananciaTotal = 0;

        double mediaTotal = 0;
        double mediaComidas = 0;

        double maxDia = gananciaDesayunos;
        double minDia = gananciaDesayunos;
        String maxDiaStr = "gananciaDesayunos";
        String minDiaStr = "gananciaDesayunos";
        
        String salida = "";


        while (!todo.contains("N 0"))

        {
            entrada = teclado.nextLine(); //quedaría comprobar que no meten otra cosa en el string
            
            

            if (entrada.matches("[a-zA-Z]\\s\\d+(\\.\\d+)?"))
            {
                switch (entrada.charAt(0))
                {
                    case 'D': //Desayunos
                        contD++;
                        contTotal++;
                        letraNumeros = entrada.split(" ");
                        gananciaDesayunos += Double.parseDouble(letraNumeros[1]); //no se que cojones de error aquí
                        gananciaTotal += gananciaDesayunos;
                        break;

                    case 'A': //Comidas
                        contA++;
                        contTotal++;
                        letraNumeros = entrada.split(" ");
                        gananciaComidas += Double.parseDouble(letraNumeros[1]);
                        gananciaTotal += gananciaComidas;
                        break;

                    case 'M': //Meriendas
                        contM++;
                        contTotal++;
                        letraNumeros = entrada.split(" ");
                        gananciaMeriendas += Double.parseDouble(letraNumeros[1]);
                        gananciaTotal += gananciaMeriendas;
                        break;

                    case 'I': //Cenas
                        contI++;
                        contTotal++;
                        letraNumeros = entrada.split(" ");
                        gananciaCenas += Double.parseDouble(letraNumeros[1]);
                        gananciaTotal += gananciaCenas;
                        break;

                    case 'C': //Copas
                        contC++;
                        contTotal++;
                        letraNumeros = entrada.split(" ");
                        gananciaCopas += Double.parseDouble(letraNumeros[1]);
                        gananciaTotal += gananciaCopas;
                        break;

                    case 'N': //salir
                        break;

                    default:
                        System.out.println("Entrada no válida.");
                } //fin del switch

            } else {
                System.out.println("Incorrecto.");
            }
                

            if (entrada.contains("N 0"))
            {
                

                mediaComidas = gananciaComidas / contA;
                mediaTotal = gananciaTotal / contTotal;

                //ENCONTRAR MAX
                if (gananciaComidas > maxDia)
                {
                    maxDia = gananciaComidas;
                    maxDiaStr = "COMIDAS";

                }
                else if (maxDia == gananciaComidas)
                {
                    maxDiaStr = "EMPATE";
                } 
                if (gananciaMeriendas > maxDia)
                {
                    maxDia = gananciaMeriendas;
                    maxDiaStr = "MERIENDAS";

                }
                else if (maxDia == gananciaMeriendas)
                {
                    maxDiaStr = "EMPATE";
                }
                if (gananciaCenas > maxDia)
                {
                    maxDia = gananciaCenas;
                    maxDiaStr = "CENAS";
                }
                else if (maxDia == gananciaCenas)
                {
                    maxDiaStr = "EMPATE";
                }
                if (gananciaCopas > maxDia)
                {
                    maxDia = gananciaCopas;
                    maxDiaStr = "COPAS";
                } 
                else if (maxDia == gananciaCopas)
                {
                    maxDiaStr = "EMPATE";
                }
                salida += maxDiaStr + "#";

                //ENCONTRAR MINIMO
                if (gananciaComidas < minDia)
                {
                    minDia = gananciaComidas;
                    minDiaStr = "COMIDAS";
                }
                else if (minDia == gananciaComidas)
                {
                    minDiaStr = "EMPATE";
                }
                if (gananciaMeriendas < minDia)
                {
                    minDia = gananciaMeriendas;
                    minDiaStr = "MERIENDAS";
                }
                else if (minDia == gananciaMeriendas)
                {
                    minDiaStr = "EMPATE";
                }
                if (gananciaCenas < minDia)
                {
                    minDia = gananciaCenas;
                    minDiaStr = "CENAS";
                }
                else if (minDia == gananciaCenas)
                {
                    minDiaStr = "EMPATE";
                }
                if (gananciaCopas < minDia)
                {
                    minDia = gananciaCopas;
                    minDiaStr = "COPAS";
                }
                else if (minDia == gananciaCopas)
                {
                    minDiaStr = "EMPATE";
                }
                salida += minDiaStr + "#";

                //ENCONTRAR MEDIA MAYOR: COMIDAS O TOTAL
                if (mediaComidas > mediaTotal)
                {
                    salida += "SI";
                } else
                {
                    salida += "NO";
                }
                
                //SALIDA POR PANTALLA
                System.out.println(salida);

                //VACIAR VARIABLES PARA EL SIGUIENTE DIA
                String nuevoDia = todo;
                todo = "";

                contD = 0;
                contA = 0;
                contM = 0;
                contI = 0;
                contC = 0;
                contTotal = 0;

                gananciaDesayunos = 0;
                gananciaComidas = 0;
                gananciaMeriendas = 0;
                gananciaCenas = 0;
                gananciaCopas = 0;
                gananciaTotal = 0;

                mediaTotal = 0;
                mediaComidas = 0;

                maxDia = gananciaDesayunos;
                minDia = gananciaDesayunos;
                maxDiaStr = "DESAYUNOS";
                minDiaStr = "DESAYUNOS";

            }

        }

    }
    
    
    

}
