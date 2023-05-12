/*
A:
Crea un programa con una clase llamada Persona que representará los datos principales de una
persona: dni, nombre, apellidos y edad.
En el main de la clase principal instancia dos objetos de la clase Persona. Luego, pide por teclado
los datos de ambas personas (guárdalos en los objetos). Por último, imprime dos mensajes por
pantalla (uno por objeto) con un mensaje del estilo “Azucena Luján García con DNI ... es / no es
mayor de edad”.

B:
Añade a Persona el constructor de abajo y corrige el main para utilizarlo:

C: 
Aplica el encapsulamiento básico a la clase Persona: Declara todos sus atributos como private y
crea todos los getters y setters necesarios (un get y un set por atributo).
Corrige el main para utilizar los getters y setters. Prueba a instanciar varios objetos, mostrar sus
valores por pantalla, modificarlos, etc.

D:
Añade a la clase Persona los siguientes métodos públicos:
• public void imprime() // Imprime la información del objeto: “DNI:... Nombre:... etc.”
• public boolean esMayorEdad() // Devuelve true si es mayor de edad (false si no).
• public boolean esJubilado() // Devuelve true si tiene 65 años o más (false si no).
• public int diferenciaEdad(Persona p) // Devuelve la diferencia de edad entre ‘this’ y p.
Prueba a utilizar estos métodos desde el main para comprobar su funcionamiento.

E:
El DNI de una persona no puede variar. Añade el modificador final al atributo dni y asegúrate de
que se guarde su valor en el constructor. Quita el método setDNI(...) que de todos modos ya no se
podrá utilizar porque Java no te dejará modificar el atributo dni.
La mayoría de edad a las 18 años es un valor común a todas las personas y no puede variar. Crea
un nuevo atributo llamado mayoriaEdad que sea static y final. Tendrás que inicializarlo a 18 en la
declaración. Utilízalo en el método que comprueba si una persona es mayor de edad.
Crea un método static boolean validarDNI(String dni) que devuelva true si dni es válido (tiene 8
números y una letra). Si no, devolverá false. Utilízalo en el constructor para comprobar el dni (si no
es válido, muestra un mensaje de error y no guardes los valores).
Realiza algunas pruebas en el main para comprobar el funcionamiento de los cambios realizados.
También puedes utilizar Persona.validarDNI(...) por ejemplo para comprobar si unos DNI
introducidos por teclado son válidos o no (sin necesidad de crear ningún objeto).
 */
package ejerciciosObjetos;


public class EjPersona {


    public static void main(String[] args) {
        
        Persona Jaime = new Persona("12345678A", 2, "Jaime","Pérez");
        Persona David = new Persona("13245367B", 66, "David", "Martínez");
        Persona Marta = new Persona("8976453C", 32, "Marta", "Fernández");
        
        System.out.println("Los nombres de cada 'persona' y si son mayores de edad:");
        System.out.println(Jaime.toStringYMayordeEdad());
        System.out.println(David.toStringYMayordeEdad());
        System.out.println(Marta.toStringYMayordeEdad());
        
        System.out.println();
        System.out.println("Probamos a añadir un apellido más a Jaime:");
        Jaime.setApellido(Jaime.getApellido() + " Gutiérrez");
        System.out.println(Jaime.getApellido());
        
        System.out.println();
        System.out.println("Probamos la función de imprimir la persona David:");
        David.Imprime();
        
        System.out.println();
        System.out.println("Probamos las funciones de comprobar si alguien es o no jubilado:");
        System.out.println(David.toStringEsJubilado());
        
        System.out.println();
        System.out.println("Probamos comparar dos edades de personas: ");
        System.out.println("La diferencia de edad entre Jaime y David es de: " + Jaime.diferenciaEdad(David));
        
        System.out.println();
        System.out.println("Probamos el validador del DNI");
        if (Persona.validarDNI("12345678")) { //se asume que es true, por eso no es necesario el == true
            System.out.println("El DNI introducido es válido.");
        } else { //poner un else es sinónimo de == false
            System.out.println("El DNI introducido no es válido.");
        }
        
        
    }
    
}
