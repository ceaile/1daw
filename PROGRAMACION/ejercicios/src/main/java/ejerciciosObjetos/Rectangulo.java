/*
Crea un programa con una clase llamada Rectangulo que representará un rectángulo mediante dos
coordenadas (ix1,iy1) y (ix2,iy2) en un plano, por lo que la clase deberá tener cuatro atributos enteros:
ix1, iy1, ix2, iy2.
En el main de la clase principal instancia 2 objetos Rectangulo en (0,0)(5,5) y (7,9)(2,3). Muestra
por pantalla sus coordenadas, perímetros (suma de lados) y áreas (ancho x alto). 

A:
Modifica todas las
coordenadas como consideres y vuelve a imprimir coordenadas, perímetros y áreas.

B:
En nuestro software necesitamos asegurarnos de que la coordenada (ix1,iy1)
represente la esquina inferior izquierda y la (ix2,iy2) la superior derecha del
rectángulo, como en el dibujo.
Añade a Rectangulo un constructor con los 4 parámetros. Incluye un if que
compruebe los valores (*). Si son válidos guardará los parámetros en el objeto.
Si no lo son mostrará un mensaje del estilo “ERROR al instanciar Rectangulo...”
utilizando System.err.println(...). No podremos evitar que se instancie el objeto
pero al menos avisaremos por pantalla.
Corrige el main para utilizar dicho constructor. Debería mostrar un mensaje de error.
(*) Pista: Es suficiente con un if ( (condición) && (condición) )

C:
Aplica el encapsulamiento básico a la clase Rectángulo: Declara todos sus
atributos como private y crea todos los getters y setters necesarios (un get y un
set por atributo).
¿Recuerdas la condición explicada en B3? Tendrás que programar los setters
de modo que comprueben el valor pasado como argumento antes de guardarlo
en el objeto. Si no fuera correcto se mostrará un mensaje de error (y NO se
guardará el valor).
Corrige el main para utilizar los getters y setters. Prueba a instanciar varios objetos, mostrar sus
valores, modificarlos, etc. Prueba varios valores erróneos para comprobar si funciona.

D:
Añade a la clase Rectángulo métodos públicos con las siguientes funcionalidades:
• Método para imprimir la información del rectángulo por pantalla.
• Métodos setters dobles y cuadruples: setX1Y1, set X2Y2 y setAll(...).
• Métodos getPerimetro y getArea que calculen y devuelvan el perímetro y área del objeto.
Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.

E: 
Necesitamos hacer algunos cambios para que todas las coordenadas estén entre (0,0) y (100,100).
Añade a la clase Rectángulo dos atributos llamados min y max. Estos valores son comunes a todos
los objetos y no pueden variar. Piensa qué modificados necesitas añadir a min y max.
Utiliza min y max en el constructor y en los setters para comprobar los valores (como de
costumbre, si no son correctos muestra un mensaje de error y apliques los cambios).
También necesitamos un método no constructor para crear rectángulos aleatorios. Impleméntalo.
Realiza pruebas en el main para comprobar su funcionamiento.
 */
package ejerciciosObjetos;

public class Rectangulo {

    private int ix1, iy1, ix2, iy2;
    static private final int min = 0;
    static private final int max = 100;
    
    /*
    Privada para que nadie pueda modificarla desde fuera
    Final para que su valor esté determinado, con poca probabilidad de deseo de modificación
    Static para poder ser usada para la clase y no para el objeto
    */
    
    //FUNCION CREADOR DE RECTANGULOS ALEATORIOS - NO CONSTRUCTOR
    public static Rectangulo creaRectanguloAleatorio() {
        Rectangulo funcionRectanguloAleatorio = new Rectangulo( (int)(Math.random()*max), (int)(Math.random()*max), (int)(Math.random()*max), (int)(Math.random()*max) );
        return funcionRectanguloAleatorio;
    }
    
    //CONSTRUCTOR HECHO DE PUNTOS
    public Rectangulo(Punto p1, Punto p2) {
        ix1 = p1.getX();
        iy1 = p1.getY();
        ix2 = p2.getX();
        iy2 = p2.getY();
    }
    
    
    //CONSTRUCTOR DE RECTÁNGULOS ALEATORIOS
    public Rectangulo() {
        ix1 = (int)(Math.random()*max+1);
        iy1 = (int)(Math.random()*max+1);
        ix2 = (int)(Math.random()*max+1);
        iy2 = (int)(Math.random()*max+1);
    }
    
    //CONSTRUCTOR ESTANDAR
    public Rectangulo(int x1, int y1, int x2, int y2) {
            //ejercicio B: sacar mensaje error si x1,y1 es mayor que x2,y2
            if (x1 > x2 && y1 > y2) {
                System.err.println("ERROR al instanciar Rectangulo, los dos últimos valores deben ser mayores que los 2 primeros...");
            } else { 
                ix1 = x1;
                iy1 = y1;
                ix2 = x2;
                iy2 = y2;
            }
            
            
            if ( (x1 <= max && y1 <= max && x2 <= max && y2 <= max) && (x1 >= min && y1 >= min && x2 >= min && y2 >= min) ) {
                ix1 = x1;
                iy1 = y1;
                ix2 = x2;
                iy2 = y2;  
            } else {
                System.err.println("Valores introducidos erróneos. Introduce valores entre 0 y 100 solamente.");
            }

            //}
        
        }

    //FUNCION LADO
    private int Lado(int c1, int c2) {
        return Math.abs( c2 - c1 ); //esto hace el cálculo absoluto, de modo que no es necesario asegurarse de cuál es mayor
        /*manera de asegurarse de que fuciona (ejercicio A):
        if (c1 > c2) {
        return c1 - c2;
        } return c2-c1; */
    }
    
    
    //FUNCION PERIMETRO
    int getPerimetro() {
        /* ejemplo de rectángulo que no está en el eje (0,0):
                    (ix1,iy1) = (7,9)
            +--------+
            |        |
            |        |
            |        |
            +--------+
        (ix2,iy2) 
        = (2,3)
        
         */
        int ladoX = Lado(ix1, ix2);
        int ladoY = Lado(iy1, iy2);

        int perimeter = (2 * ladoX) + (2 * ladoY);
        return perimeter;
    }

    //FUNCION FORMATEAR COORDENADAS (TO STRING)
    String Coordenadas() {
        
        String coords = "(" + ix1 + "," + iy1 + ")(" + ix2 + "," + iy2 + ")";
        return coords;
    }
    
    
    //FUNCION AREA
    int GetArea() {
        
        int ladoX = Lado(ix1, ix2);
        int ladoY = Lado(iy1, iy2);

        int area = ladoX * ladoY;
        return area;
    }

    
    //GETTERS Y SETTERS
    
    public void setX1Y1(int ix1, int iy1) {
        if (ix1 >= min && ix1 <= max && iy1 >= min && iy1 <= max) {
            this.ix1 = ix1;
            this.iy1 = iy1;
        }
        
    }
    
    public void setX2Y2(int ix2, int iy2) {
        if (ix2 >= min && ix2 <= max && iy2 >= min && iy2 <= max) {
            this.ix2 = ix2;
            this.iy2 = iy2;
        }
        
    }
    
    public void setX1Y1X2Y2 (int ix1, int iy1, int ix2, int iy2) {
        if ( (ix1 <= max && iy1 <= max && ix2 <= max && iy2 <= max) && (ix1 >= min && iy1 >= min && ix2 >= min && iy2 >= min) ) {
            this.ix1 = ix1;
            this.iy1 = iy1;
            this.ix2 = ix2;
            this.iy2 = iy2; 
        }

    }
    
    public int getIx1() {
        return ix1;
    }

    public void setIx1(int ix1) {
        if (ix1 >= min && ix1 <= max) {
            this.ix1 = ix1;
        }
        
    }

    public int getIy1() {
        return iy1;
    }

    public void setIy1(int iy1) {
        if (iy1 >= min && iy1 <= max) {
            this.iy1 = iy1;
        }  
    }

    public int getIx2() {
        return ix2;
    }

    public void setIx2(int ix2) {
        if (ix2 >= min && ix2 <= max) {
            this.ix2 = ix2;
        }
        
    }

    public int getIy2() {
        return iy2;
    }

    public void setIy2(int iy2) {
        if (iy2 >= min && iy2 <= max) {
            this.iy2 = iy2;
        }
        
    }

}
