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


public class Punto {
    
    int x, y;
    
    //FUNCION AUTOMATICA TO STRING
    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    //FUNCION IMPRIMIR HECHA POR MÍ
    public String Imprime() {
        return "(" + x + "," + y + ")";
    }
    
    //FUNCION DESPLAZAR PUNTO
    public void desplaza(int dx, int dy) {
        this.x = x + dx;
        this.y = y + dy;
    }
    
    //FUNCION DISTANCIA
    public int distancia(Punto p) {
        // D^2 = (Ax - Bx)^2 + (Ay - By)^2
        // D = √[(Ax - Bx)^2 + (Ay - By)^2]
        int d = (int)Math.sqrt( Math.pow(( x - p.getX() ),2) + Math.pow( ( y - p.getY() ) ,2) );
        return d;
    }
    
    //FUNCION CREAR PUNTO ALEATORIO
    public static Punto creaPuntoAleatorio() {
        Punto aleatorio = new Punto ( (int)(-100+Math.random()*200) , (int)(-100+Math.random()*200) );
        return aleatorio;
    }
    
    //CONSTRUCTOR DE PUNTOS ALEATORIOS
    public Punto () {
        x = (int)(-100+Math.random()*200);
        y = (int)(-100+Math.random()*200);
    }
    
    //CONSTRUCTOR ESTANDAR
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //GETTERS & SETTERS
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}
