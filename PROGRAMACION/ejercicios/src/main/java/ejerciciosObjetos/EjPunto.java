/*
A:
Crea un programa con una clase llamada Punto que representará un punto de dos dimensiones en
un plano. Solo contendrá dos atributos enteros llamadas x e y (coordenadas).
En el main de la clase principal instancia 3 objetos Punto con las coordenadas (5,0), (10,10) y (-3,
7). Muestra por pantalla sus coordenadas (utiliza un println para cada punto). Modifica todas las
coordenadas (prueba distintos operadores como = + - += *=...) y vuelve a imprimirlas por pantalla.
B:
Añade a la clase Punto un constructor con parámetros que copie las coordenadas pasadas como
argumento a los atributos del objeto.
Corrige el main y utiliza el constructor con parámetros para instanciar los objetos, pasándole como
argumento los valores deseados.
C:
Modifica los atributos de Punto para que sean private.
Fíjate que desde el main ya no te dejará utilizar ni modificar
los atributos x e y de los objetos.
Vamos a añadir los getteres: int getX() e int getY() que
devolverán los valores de x e y respectivamente. Es una
forma indirecta de leer sus valores.
Añadiremos también los setters: void setX(int x) y void
setY(int y) que copiarán el valor pasado como parámetro a
los atributos de la clase.
Tanto getters como setters deben ser public.
Corrige el main para utilizar los getters y setters. Prueba a
instanciar varios objetos, mostrar sus valores por pantalla,
modificarlos, etc.
D:
Añade a la clase Punto los siguientes métodos públicos:
• public void imprime() // Imprime por pantalla las coordenadas. Ejemplo: “(7, -5)”
• public void setXY(int x, int y) // Modifica ambas coordenadas. Es como un setter doble.
• public void desplaza(int dx, int dy) // Desplaza el punto la cantidad (dx,dy) indicada.
Ejemplo: Si el punto (1,1) se desplaza (2,5) entonces estará en (3,6).
• public int distancia(Punto p) // Calcula y devuelve la distancia entre el propio objeto (this) y
otro objeto (Punto p) que se pasa como parámetro: distancia entre dos coordenadas.
Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento
E:
Necesitamos un método que nos permita crear un objeto Punto con coordenadas aleatorias. Esta
funcionalidad no depende de ningún objeto concreto por lo que será estática. Deberá crear un
nuevo Punto (utiliza el constructor) con x e y entre -100 y 100, y luego devolverlo (con return).
• public static Punto creaPuntoAleatorio()
Pruebalo en el main para comprobar que funciona. Crea varios puntos aleatorios con
Punto.creaPuntoAleatorio() e imprime su valor por pantalla.
 */
package ejerciciosObjetos;


public class EjPunto {


    public static void main(String[] args) {
        Punto p1 = new Punto(5,0);
        Punto p2 = new Punto(10,10);
        Punto p3 = new Punto(-3,7);
        
        System.out.println("Comprobación de cómo se ve un 'punto' en String:");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        //cambiar el valor del atributo, por ejemplo, operando con lo que ya tiene dentro
        p1.setX(p1.getX()+3);
        p1.setY(p1.getY()-1);
        
        System.out.println("Comprobación del cambio de valor de los atributos:");
        System.out.println(p1.toString());
        
        System.out.println("Comprobación de función distancia:");
        System.out.println(p1.distancia(p2));
        
        System.out.println("Comprobación de la función de creación de punto automática:");
        Punto p4 = Punto.creaPuntoAleatorio();
        Punto p5 = Punto.creaPuntoAleatorio();
        Punto p6 = Punto.creaPuntoAleatorio();
        Punto p7 = Punto.creaPuntoAleatorio();
        Punto p8 = Punto.creaPuntoAleatorio();
        System.out.println(p4.Imprime());
        System.out.println(p5.Imprime());
        System.out.println(p6.Imprime());
        System.out.println(p7.Imprime());
        System.out.println(p8.Imprime());
        System.out.println("Comprobación del constructor nuevo de puntos aleatorios:");
        Punto p9 = new Punto();
        Punto p10 = new Punto();
        Punto p11 = new Punto();
        System.out.println(p9.Imprime());
        System.out.println(p10.Imprime());
        System.out.println(p11.Imprime());
        
    }
    
}
