package ejerciciosFunciones;

import java.util.Arrays;

public class MaxMinDe5Nums {

//ENCONTRAR MAXIMO DE ENTRE 5 NUMEROS SIN METER EN ARRAYLIST NI ARRAY
    public double MaxDe5(double num1, double num2, double num3, double num4, double num5) {
        double max = num1;

        //Los Strings no son devueltos, solo sirve esos trozos de codigo en un Main
        String maxNombres = "num1";

        if (num2 > max)
        {
            max = num2;
            maxNombres = "num2";

        } else if (num2 == max)
        {
            maxNombres += ", num2";
        }
        if (num3 > max)
        {
            max = num3;
            maxNombres = "num3";
        } else if (num3 == max)
        {
            maxNombres += ", num3";
        }
        if (num4 > max)
        {
            max = num4;
            maxNombres = "num4";
        } else if (num4 == max)
        {
            maxNombres += ", num4";
        }

        if (num5 > max)
        {
            max = num5;
            maxNombres = "num5";
        } else if (num5 == max)
        {
            maxNombres += ", num5";
        }
        return max;
    }

    //ENCONTRAR MAXIMO DE ENTRE 5 NUMEROS METIENDOLO EN UN ARRAY
    public double MayorDeTodos(double num1, double num2, double num3, double num4, double num5) {
        double max;
        double array[] = { num1, num2, num3, num4, num5 };

        Arrays.sort(array); //hay que importar la libreria de Arrays a lo mejor en el Main donde se use esto

        max = array[array.length - 1]; //de este modo puedo alterar el input de esta funcion más fácilmente y sigue sacando el último siempre 
        
        return max;
    }

    //ENCONTRAR MINIMO DE ENTRE 5 NUMEROS SIN METER EN ARRAYLIST NI ARRAY
    public double MinDe5(double num1, double num2, double num3, double num4, double num5) {

        double min = num1;
        //Los Strings no son devueltos, solo sirve esos trozos de codigo en un Main
        String minNombres = "num1";

        if (num2 < min)
        {
            min = num2;
            minNombres = "num2";
        } else if (num2 == min)
        {
            minNombres += ", num2";
        }
        if (num3 < min)
        {
            min = num3;
            minNombres = "num3";
        } else if (num3 == min)
        {
            minNombres += ", num3";
        }
        if (num4 < min)
        {
            min = num4;
            minNombres = "num4";
        } else if (num4 == min)
        {
            minNombres += ", num4";
        }
        if (num5 < min)
        {
            min = num5;
            minNombres = "num5";
        } else if (num5 == min)
        {
            minNombres += ", num5";
        }

        return min;

    }

    //ENCONTRAR MINIMO DE ENTRE 5 NUMEROS METIENDOLO EN UN ARRAY
    public double MenorDeTodos(double num1, double num2, double num3, double num4, double num5) {
        double min;
        double array[] = { num1, num2, num3, num4, num5 };

        Arrays.sort(array); //hay que importar la libreria de Arrays a lo mejor en el Main donde se use esto

        min = array[0];
        return min;
    }

    
    
    
    
    public static void main(String[] args) {
        // Testing time!
    }

}
