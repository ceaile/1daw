/*
Implementa un programa con tres funciones:
◦ void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p < 0
◦ void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p >= 0
◦ La función main para realizar pruebas. Puedes llamar a ambas funciones varias veces con
distintos valores, hacer un bucle para pedir valores por teclado y pasarlos a las funciones,
etc. Maneja las posibles excepciones.
 */
package ejerciciosExcepciones;

public class e5 {

    public static void main(String[] args) {//----------------------------------
        System.out.println("Prueba 1: positivo");
        try
        {
            imprimePositivo(1);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Prueba 1.1: positivo limite");
        try
        {
            imprimePositivo(0);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Prueba 2: pos, excepcion");
        try
        {
            imprimePositivo(-5);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Prueba 3: neg");
        try
        {
            imprimeNegativo(-1);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Prueba 4: neg, excepcion");
        try
        {
            imprimeNegativo(5);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }//fin-Main-----------------------------------------------------------------

    //FUNCION IMPRIME POSITIVO
    static public void imprimePositivo(int p) throws Exception {
        if (p >= 0)
        {
            System.out.println(p);
        } else
        {
            throw new Exception("ERROR: Ha introducido un número no positivo.");
        }
    }

    //FUNCION IMPRIME NEGATIVO
    static public void imprimeNegativo(int n) throws Exception {
        if (n < 0)
        {
            System.out.println(n);
        } else
        {
            throw new Exception("ERROR: Ha introducido un número no negativo.");
        }
    }
}//fin--------------------------------------------------------------------------
