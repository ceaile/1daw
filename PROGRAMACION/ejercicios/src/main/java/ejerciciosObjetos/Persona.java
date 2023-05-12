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

public class Persona {
    
    private final String iDNI; 
    private int iEdad;
    private String iNombre, iApellido;
    private static final int mayoriaEdad = 18; //estático: útil para el funcionamiento de la clase pero no para el objeto
    
    //CONSTRUCTOR
    public Persona(String dni, int edad, String nombre, String apellido) {
        
        //comprobamos que el DNI es válido primero:
        if ( validarDNI(dni) ) { // == true
            iDNI = dni;
        } else { // == false
            iDNI = "inválido";
        }
        
        iEdad = edad;
        iNombre = nombre;
        iApellido = apellido;
    } //A recordar: el constructor no tiene por qué rellenar todos los atributos
    
    //IMPRIME NOMBRE, APELLIDOS, DNI Y EDAD CON UNA FRASE INTELIGIBLE
    public void Imprime() {
        String frase = iNombre + " " + iApellido + " con DNI " + iDNI + " y edad actual " + iEdad;
        System.out.println(frase);
    }
    
    //MAYOR DE EDAD
    private boolean MayordeEdad() {
        return iEdad >= mayoriaEdad;   
    }
    
    //JUBILADO
    public boolean esJubilado() {
        return iEdad >=65;
    }
    
    //VALIDADOR DE DNI
    public static boolean validarDNI(String dni) {
        
        /*
        Funciones estáticas:
        Se utiliza llamando a la clase en lugar de al objeto: Persona.validarDNI(string dni)
        Por eso es por lo que se pide el DNI a la hora de usarse.
        En el caso de no querer hacerla estática, se utilizaría
        como las otras funciones, Jaime.validarDNI(), sin introducir el dni porque
        ya está esa información introducida a la hora de instanciar el objeto.
 
        */
        
        //1. partimos el dni en los trozos de letras y numeros
        //2. string trozo dni se convierte a int
        //3. se divide entre 23 (fórmula de dni)
        //4. el resto se busca en una posicion del char array
        //5. se pasa ese unico char a un char separado
        //6. se compara ese char con el trozo 2 convertido en char también
        
        String trozoNumeros = dni.substring(0,7); //parte del DNI de números
        String trozoLetra = dni.substring(7,8); //letra del DNI por separado
        int dniNum = Integer.parseInt(trozoNumeros); //de string de números a int
        int resto = dniNum % 23; //dividir entre 23
        String cadenaLetras = "TRWAGMYFPDXBNJZSQVHLCKE"; //string para buscar la posicion
        char chara = cadenaLetras.charAt(resto); // se busca en el char array
        String letraFinal = Character.toString(chara); //se pasa de char a string para después compararlos
        
        return letraFinal.equalsIgnoreCase(trozoLetra); //se compara uno con otro y da un resultado booleano
        
    }
        
    
    //TO STRING MAYOR DE EDAD
    public String toStringYMayordeEdad() {
        
        /*
        String ret = iNombre + " " + iApellido + " con DNI " + iDNI;
        
        if (MayordeEdad()) {
            ret = ret + " es mayor de edad";
        }
        else{
            ret = ret + " es menor de edad";
        }
        
        return ret;
        */
        
       
        //if booleano ultraresumido metido en un return:
        return iNombre + " " + iApellido + " con DNI " + iDNI + " es " + (MayordeEdad() ? " mayor" : "menor") + "de edad";
        //rotura de cabeza, aprender a usar esto por ejemplo: int f = 10 + (MayordeEdad() ? 3 : 4);
        
    }
    
    //TO STRING ESJUBILADO
    public String toStringEsJubilado() {
        return iNombre + " " + iApellido + " con DNI " + iDNI + (esJubilado() ? "es jubilado" : "no es jubilado");
    }
    
    //DIFERENCIA DE EDAD ENTRE PERSONAS
    public int diferenciaEdad(Persona p) {
        return Math.abs(iEdad - p.iEdad);
    }
    
    //SETTERS & GETTERS
    public String getDni() {
        return iDNI;
    }

    public int getEdad() {
        return iEdad;
    }

    public void setEdad(int edad) {
        this.iEdad = edad;
    }

    public String getNombre() {
        return iNombre;
    }

    public void setNombre(String nombre) {
        this.iNombre = nombre;
    }

    public String getApellido() {
        return iApellido;
    }

    public void setApellido(String apellido) {
        this.iApellido = apellido;
    }


    
    
    
}
