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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Articulo {
    
    //ATRIBUTOS
    private String nombre;
    private double precioSinIVA;
    private int stock;
    private int porcentIVAgeneral = 21; //por defecto está a 21, solo se coloca el 21 si introducen un IVA inválido.
    private final String numeros = "1234567890";
    
    //FUNCION STRING
    String stringImprimir() {
        String imprimir = nombre + " - Precio:" + precioSinIVA + " IVA:" + porcentIVAgeneral + "% - PVP:" + precioConIVA() + "€";
        return imprimir;
    }
    
    //FUNCION PRECIO CON IVA
    public double precioConIVA() {
        /*
        precio sin iva --- 6e --- 100
        precio con iva --- x --- 120
        */
        double iva = porcentIVAgeneral * 0.01;
        double precioConIva = precioSinIVA + iva;
        return Math.round(precioConIva);     
    }
    
    //FUNCION VENDER
    public boolean vender(int x) {
        boolean vendido = false;
        if (stock >= x) {
            stock = stock - x;
            vendido = true;
        }
        return vendido;
    }
    
    //FUNCION ALMACENAR
    public boolean Almacenar(int x) {
        boolean almacenado = false;
        if (x > 0) {
            almacenado = true;
            stock = stock + x;
        }
        return almacenado;
    }
    
    //FUNCION CONTIENE SOLO LETRAS
    static boolean contieneSoloLetras(String cadena) {
        boolean soloLetras = true;
        for (int i = 0; i < cadena.length(); i++) {
            char chara = cadena.charAt(i);
            if ( (chara >= 'a' && chara <= 'z') || (chara >= 'A' && chara <= 'Z') || (chara == ' ') ) {
                soloLetras = true;
            } else {
                soloLetras = false;
            }
        } 
        return soloLetras;
    }
    
    //CONSTRUCTOR
    public Articulo(String nombre, double precioSinIVA, int stock, int porcentajeIVA) {

        if (contieneSoloLetras(nombre)) {
            this.nombre = nombre;
        } else {
            System.out.println("Go fuck yourself");
        }
        
        this.precioSinIVA = precioSinIVA;
        this.stock = stock;
        if (porcentajeIVA == 21 | porcentajeIVA == 10 | porcentajeIVA == 4) {
            this.porcentIVAgeneral = porcentajeIVA;
        } else {
            System.err.println("Valor de IVA introducido no correcto");
        }
        
        
    }
    
    //GETTERS AND SETTERS - NO TOCAR
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        /*if (nombre.contains(numeros.toCharArray())) {
            
        }*/
        this.nombre = nombre;
    }

    public double getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(double precioSinIVA) {
        
        this.precioSinIVA = precioSinIVA;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        this.stock = stock;
    }
    
    
}
