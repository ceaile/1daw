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

E: Necesitamos hacer algunos cambios para que todas las coordenadas estén entre (0,0) y (100,100).
Añade a la clase Rectángulo dos atributos llamados min y max. Estos valores son comunes a todos
los objetos y no pueden variar. Piensa qué modificados necesitas añadir a min y max.
Utiliza min y max en el constructor y en los setters para comprobar los valores (como de
costumbre, si no son correctos muestra un mensaje de error y apliques los cambios).
También necesitamos un método no constructor para crear rectángulos aleatorios. Impleméntalo.
Realiza pruebas en el main para comprobar su funcionamiento.
 */

package ejerciciosObjetos;



public class ejRectangulo {


    public static void main(String[] args) {
        
        Rectangulo R1 = new Rectangulo(0,0,5,5);
        Rectangulo R2 = new Rectangulo(7,9,2,3);
        System.out.println();
        
        /* ejercicio A:
        R1.x1 = 0;
        R1.y1 = 0;
        R1.x2 = 5;
        R1.y2 = 5;
        
        R2.x1 = 7;
        R2.y1 = 9;
        R2.x2 = 2;
        R2.y2 = 3;
        */
        
       
        System.out.println("Las coordenadas del rectángulo son: ");
        System.out.println(R1.Coordenadas());
        
        System.out.println("El área del rectángulo es: ");
        System.out.println(R1.GetArea());
        
        System.out.println("El perímetro del rectángulo es: ");
        System.out.println(R1.getPerimetro());
        
        
        System.out.println("Las coordenadas del rectángulo son: ");
        System.out.println(R2.Coordenadas());
        
        System.out.println("El área del rectángulo es: ");
        System.out.println(R2.GetArea());
        
        System.out.println("El perímetro del rectángulo es: ");
        System.out.println(R2.getPerimetro());
        
        /* Segunda parte del ejercicio: cambiar los valores [ejercicio A]
        R1.x1 = 5;
        R1.y1 = 5;
        R1.x2 = 10;
        R1.y2 = 10;
        
        R2.x1 = 2;
        R2.y1 = 3;
        R2.x2 = 9;
        R2.y2 = 3;
        
        
        System.out.println("Las coordenadas del rectángulo son: ");
        System.out.println(R1.Coordenadas());
        
        System.out.println("El área del rectángulo es: ");
        System.out.println(R1.GetArea());
        
        System.out.println("El perímetro del rectángulo es: ");
        System.out.println(R1.getPerimetro());
        */
        
        //ejercicio B: sacar mensaje error si x1,y1 es mayor que x2,y2
        System.out.println("ejercicio B: sacar mensaje error si x1,y1 es mayor que x2,y2");
        Rectangulo R4 = new Rectangulo(9,9,1,1);
        System.out.println("^ Aquí debería haber saltado el error");
        System.out.println("Imprimimos rectángulo para ver qué hay :");
        System.out.println(R1.Coordenadas());
        System.out.println();
        
        //ejercicio C: modificar los valores desde el set y mostrarlos con get.
        R1.setIx1(5);
        R1.setIy1(5);
        R1.setIx2(10);
        R1.setIy2(10);
        
        R2.setIx1(2);
        R2.setIy1(3);
        R2.setIx2(9);
        R2.setIy2(3);
        
        System.out.println("Sacamos por pantalla los nuevos valores [ej. C]:");
        System.out.println(R1.Coordenadas());
        System.out.println(R2.Coordenadas());
        
        System.out.println();
        System.out.println("Probamos los setters dobles:");
        R1.setX1Y1(15,15);
        R1.setX2Y2(20,20);
        System.out.println(R1.Coordenadas());
        System.out.println();
        System.out.println("Probamos los setters cuádruples:");
        R2.setX1Y1X2Y2(5,8,7,9);
        System.out.println(R2.Coordenadas());
        
        System.out.println("Probamos el constructor de rectángulo aleatorio y verlo:");
        Rectangulo aleatorioConstructor = new Rectangulo(); //constructor 2 - sobrecarga
        System.out.println(aleatorioConstructor.Coordenadas());
        System.out.println();
        System.out.println("Probamos la función de crear rectángulo aleatorio y verlo:");
        Rectangulo aleatorioFuncion = Rectangulo.creaRectanguloAleatorio();
        System.out.println(aleatorioFuncion.Coordenadas());
        System.out.println();
        
        
        
        
        
        
    }
    
}
