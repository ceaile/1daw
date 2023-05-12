/*

 */
package ejerciciosFunciones;

import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Validaciones {

    /**
     * Separa un String en texto y numeros. 
     * El texto lo mete en un String y los numeros en un arraylist.
     * Luego ese texto y esa lista de numeros los mete en otro arraylist
     * y los devuelve.
     * Puede utilizarse dentro (recorriendo) un arraylist que contenga
     * lineas en las que haya separar por texto y numeros.
     * No tiene una utilidad real y por lo tanto la funcion es estandarizada
     * y modificable.
     * @param lineaTexto
     * @return lista de lista de numeros y string
     */
    static public ArrayList separadorDeTextoYNumeros(String lineaTexto) {
        String texto = "";
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        ArrayList<Integer> listaTodo = new ArrayList<Integer>();
        
        for (String i : lineaTexto.split(" ")) {

            if (i.matches("\\d+")) {
                listaNumeros.add(Integer.parseInt(i));
                
            } else { //si está vacío el texto, introduce j. Si está lleno, pone un espacio antes del String j.
                texto += (texto.equalsIgnoreCase("") ? "" : " ") + i;
            }
        }
        return listaTodo;
    }

    public static boolean isFullname(String nomTitular) {
        String expression = "^[a-zA-Z\\s]+"; //chequea que no contenga numeros
        return nomTitular.matches(expression); //retorna true si solo tiene letras     
    }

    public static boolean fechaValida(int day, int month, int year) {
        boolean fecha = false;
        if ((day > 0) && (day <= 30) && (month > 0) && (month <= 12) && (year > 1920) && (year < 2100)) {
            fecha = true;
        }
        return fecha;

    }

    //validador de matriculas de vehiculos acuaticos: 3-10 letras
    static public boolean EsValida(String matricula) {

        boolean esValida = false;

        if (matricula.matches("[a-zA-Z]") && (matricula.length() >= 3) && (matricula.length() <= 10)) {

            esValida = true;
        }
        return esValida;
    }

    //public boolean validadorMatricula() --> 4 letras + 6 nums
    static public boolean EsValida2(String matricula) {
        boolean esvalida = false;
        String expresion = "^[a-zA-Z]{4}[0-9]{6}$";
        return matricula.matches(expresion);
    }

    static public boolean textoNoEnBlanco(String texto) {
        boolean valido = true;
        if (texto.matches("^\\s*$")) {
            valido = false;
        }
        return valido;
    }

}
