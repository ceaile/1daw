/*
A:
Crea un programa con una clase llamada Articulo con los siguientes atributos: nombre, precio (sin
IVA), iva (siempre será 21) y cuantosQuedan (representa cuantos quedan en el almacén).
En el main de la clase principal instancia un objeto de la clase artículo. Asígnale valores a todos sus
atributos (los que quieras) y muestra por pantalla un mensaje del estilo “Pijama - Precio:10€ -
IVA:21% - PVP:12,1€” (el PVP es el precio de venta al público, es decir, el precio con IVA). Luego,
cambia el precio y vuelve a imprimir el mensaje.
B:
Añade un constructor con 4 parámetros que asigne valores a nombre, precio, iva y
cuantosQuedan. Dicho constructor deberá mostrar un mensaje de error si alguno de los valores
nombre, precio, iva o cuantosQuedan no son válidos. ¿Qué condiciones crees que podrían
determinar si son válidos o no? Razónalo e implementa el código.
Corrige el main y prueba a crear varios artículos. Introduce algunos con valores incorrectos para
comprobar si avisa del error.
C:
Aplica el encapsulamiento básico a la clase Articulo: Declara todos sus atributos como private y
crea todos los getters y setters necesarios (un get y un set por atributo).
Programa los setters para que comprueben los valores y los guarden en el objeto solo si son
correctos. En caso contrario muestra un mensaje de error.
D:
Añade a la clase Rectángulo métodos públicos con las siguientes funcionalidades:
• Método para imprimir la información del rectángulo por pantalla.
• Métodos setters dobles y cuadruples: setX1Y1, set X2Y2 y setAll(...).
• Métodos getPerimetro y getArea que calculen y devuelvan el perímetro y área del objeto.
Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.
E:
En España existen tres tipos de IVA según el tipo de producto:
• El IVA general (21%): para la mayoría de productos a la venta.
• El IVA reducido (10%): hostelería, transporte, vivienda, etc.
• El IVA super reducido (4%): alimentos básicos, libros, medicamentos, etc.
Estos tres tipos de IVA no pueden variar y a cada artículo se le aplicará uno de los tres.
Razona qué cambios sería necesario realizar a la clase Articulo e impleméntalos.
 */
package ejerciciosObjetos;


public class EjArticulo {


    public static void main(String[] args) {
        
        Articulo calcetines = new Articulo("calcetines de rayas",6.99,200,21); //Ejercicio B
        /* ejercicio A:
        calcetines.nombre = "calcetines de rayas";
        calcetines.precioSinIVA = 6.99;
        calcetines.stock = 200;
        */
        
        //PROBAMOS IMPRIMIR
        System.out.println("Probamos la función de imprimir el artículo correctamente hecho:");
        System.out.println(calcetines.stringImprimir());
        
        //PROBAMOS A CREAR UN ARTICULO CON NOMBRE NO VALIDO Y OTRO CON IVA NO VALIDO
        System.out.println();
        System.out.println("Probamos a crear un artículo de nombre 'gorro1' incorrecto, que contiene un número:");
        Articulo gorro = new Articulo("gorro1", 0.99,400,21);
        System.out.println("El mensaje de error debería haber aparecido justo antes de esto.");
        System.out.println("Probamos a imprimir el articulo 'gorro1' de nombre no válido.");
        System.out.println(gorro.stringImprimir());
        
        System.out.println();
        System.out.println("Probamos a crear un artículo 'guantes', de nombre correcto pero IVA incorrecto");
        Articulo guantes = new Articulo ("guantes", 3.05, 150, 20);
        System.out.println("El mensaje de error debería haber aparecido justo antes de esto.");
        System.out.println("Probamos a imprimir el articulo 'guantes' de IVA no válido.");
        System.out.println(guantes.stringImprimir()); //saca por pantalla IVA de 21 porque no es válido el introducido.
        
       
        System.out.println();
        System.out.println("Stock actual de calcetines:" + calcetines.getStock());
        System.out.println();
        
        //PROBAMOS VENDER Y ALMACENAR STOCK
        System.out.println("Probamos la función de vender booleana del artículo:");
        System.out.println("-> Intentamos vender 1 artículo: ");
        if (calcetines.vender(1) == true) {
            System.out.println("Se vendido x cantidad de artículos");
        } else {
            System.out.println("La cantidad supera al stock de artículos. No ha podido completarse la venta.");
        }
        System.out.println("Stock actual de calcetines:" + calcetines.getStock());
        
        System.out.println("-> Intentamos vender 201 artículos: ");
        if (calcetines.vender(201) == true) {
            System.out.println("Se vendido x cantidad de artículos");
        } else {
            System.out.println("La cantidad supera al stock de artículos. No ha podido completarse la venta.");
        }
        System.out.println("Stock actual de calcetines:" + calcetines.getStock());
        
        System.out.println();
        System.out.println("Probamos la función de almacenar stock booleana:");
        System.out.println("Intentamos almacenar un artículo");
        if (calcetines.Almacenar(1) == true) {
            System.out.println("Cantidad almacenada con éxito.");
        } else {
            System.out.println("Error. Introduzca una cantidad superior a 0.");
        }
        System.out.println("Stock actual de calcetines:" + calcetines.getStock());
        
        System.out.println("Intentamos almacenar -1 artículo:");
        if (calcetines.Almacenar(-1) == true) {
            System.out.println("Cantidad almacenada con éxito.");
        } else {
            System.out.println("Error. Introduzca una cantidad superior a 0.");
        }
        System.out.println("Stock actual de calcetines:" + calcetines.getStock());
        
        
        
    }
    
}
