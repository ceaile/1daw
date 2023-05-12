/*
Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
Por ejemplo: 3 ² + 4 ² = 5 ².
 */
package ejerciciosFunciones;

/**
 *
 * @author Admin
 */
public class Funciones19_pitagoras {

    
    
    //FUNCION PITAGORAS : CALCULAR HIPOTENUSA DE TRIANGULO RECTANGULO: O SEA LA DISTANCIA ENTRE 2 PUNTOS (X,Y)
    
    /*
    D^2 = (Ax - Bx)^2 + (Ay - By)^2
    D = √[(Ax - Bx)^2 + (Ay - By)^2]
    */
    
    public boolean Pitagoras(int x, int y, int z) {
        return Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z,2);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
