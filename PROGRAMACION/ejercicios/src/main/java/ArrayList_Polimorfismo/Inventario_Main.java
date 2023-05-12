/*
Esta clase debe cumplir con los siguientes requisitos:
• En la tienda existirán 4 tipos de animales: perros, gatos, loros y canarios.
• Los animales deben almacenarse en un ArrayList privado dentro de la clase Inventario.
• La clase debe permitir realizar las siguientes acciones:
◦ Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
◦ Mostrar todos los datos de un animal concreto.
◦ Mostrar todos los datos de todos los animales.
◦ Insertar animales en el inventario.
◦ Eliminar animales del inventario.
◦ Vaciar el inventario.
 */
package ArrayList_Polimorfismo;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Inventario_Main {

    static Scanner teclado = new Scanner(System.in); //static, para poder usarlo en funciones

    public static void main(String[] args) {

        //CREAMOS PERROS, GATOS, LOROS Y CANARIOS, CON CONSTRUCTORES COMPLETOS:
        Perro mati = new Perro("lanudo", false, "Mati", 14, "09-09-1999");
        Gato nietzsche = new Gato("naranja", false, "Nietzsche", 7, "14-02-2002");
        Canario piolin = new Canario("amarillo", true, "pequeño, corto", true, "Piolín", 4, "27-05-2021");
        Loro tristan = new Loro("Rio Negro", true, "negro, manchado", true, "Tristán", 12, "15-87-2000");

        /*
    CONSTRUCTOR COMPLETO DE PERRO:
    public Perro(String origenLoro, boolean pulgas, String nombre, int edad, String fechaNacimiento)
    
    CONSTRUCTOR COMPLETO DE GATO:
    public Gato(String color, boolean hablaOno, String nombre, int edad, String fechaNacimiento) {
    
    CONSTRUCTOR COMPLETO DE CANARIO:
    public Canario
    (String color, boolean canta, String pico, boolean vuela, String nombre, int edad, String fechaNacimiento) {
    
    CONSTRUCTOR COMPLETO DE LORO:
    public Loro
    (String origen, boolean habla, String pico, boolean vuela, String nombre, int edad, String fechaNacimiento) {
    
         */
        //INTRODUCIMOS EN UN ARRAYLIST
        InventarioMascotas inventario = new InventarioMascotas();

        inventario.AñadirMascota(mati);
        inventario.AñadirMascota(nietzsche);
        inventario.AñadirMascota(piolin);
        inventario.AñadirMascota(tristan);

        //--------------------------------------------------------------------------
        //                MENU
        //--------------------------------------------------------------------------
        System.out.println("Bienvenido al Menú de Inventario.");

        char opcionElegida = ' ';

        do
        {
            //System.out.println("--------------------------------------------------");
            System.out.println("Elija una opción para realizar diferentes acciones:");

            System.out.println("Pulse 1 para para mostrar el tipo y nombre de cada mascota del inventario.");
            System.out.println("Pulse 2 para mostrar los datos del animal que quieras ver.");
            System.out.println("Pulse 3 para mostrar todos los datos disponibles de todos los animales.");
            System.out.println("Pulse 4 para insertar un animal en el inventario.");
            System.out.println("Pulse 5 para eliminar un animal del inventario.");
            System.out.println("Pulse 6 para vaciar el inventario.");
            System.out.println("Pulse 7 para probar algunas funciones extra.");
            System.out.println("Pulse 0 para salir.");
            System.out.println("--------------------------------------------------");

            try{                
                opcionElegida = teclado.next().charAt(0);

                switch (opcionElegida)
                {

                    case '1': //MOSTRAR TIPO Y NOMBRE DE CADA ANIMAL
                        System.out.println(inventario.verLista());
                        System.out.println("--------------------------------------------------");
                        break;

                    case '2': //MOSTRAR LOS DATOS DE UN ANIMAL CONCRETO
                        System.out.println("Introduce la posición del animal que quieras ver.");
                        int num = teclado.nextInt();
                        System.out.println(inventario.MostrarDatos(num - 1));
                        System.out.println("--------------------------------------------------");
                        break;

                    case '3': //MOSTRAR TODOS LOS DATOS DE TODOS LOS ANIMALES
                        System.out.println(inventario.VerTodo());
                        System.out.println("--------------------------------------------------");
                        break;

                    case '4': //INSERTAR ANIMAL EN INVENTARIO:

                        char animalElegido;
                        do
                        {
                            System.out.println("Introduzca un número acorde al animal que desée crear:");
                            System.out.println("Introduzca 1 si desea insertar en el inventario un perro.");
                            System.out.println("Introduzca 2 si desea insertar en el inventario un gato.");
                            System.out.println("Introduzca 3 si desea insertar en el inventario un canario.");
                            System.out.println("Introduzca 4 si desea insertar en el inventario un loro.");
                            System.out.println("Introduzca 0 si no desea insertar ningún animal.");
                            animalElegido = teclado.next().charAt(0);
                            switch (animalElegido)
                            {
                                case '1': //crear perro
                                    System.out.println();
                                    System.out.println("Comenzará el proceso de creación de un perro.");
                                    System.out.println("Responda a las preguntas:");
                                    inventario.AñadirMascota(crearPerro());
                                    break;
                                case '2': //crear gato
                                    System.out.println();
                                    System.out.println("Comenzará el proceso de creación de un gato.");
                                    System.out.println("Responda a las preguntas:");
                                    inventario.AñadirMascota(crearGato());

                                    break;
                                case '3': //crear canario
                                    System.out.println();
                                    System.out.println("Comenzará el proceso de creación de un canario.");
                                    System.out.println("Responda a las preguntas:");
                                    inventario.AñadirMascota(crearCanario());
                                    break;
                                case '4': //crear loro
                                    System.out.println();
                                    System.out.println("Comenzará el proceso de creación de un loro.");
                                    System.out.println("Responda a las preguntas:");
                                    inventario.AñadirMascota(crearLoro());
                                    break;
                                default:
                                    System.out.println("No es una opción válida.");
                                    break;
                                case '0': //salir
                                    System.out.println();
                                    System.out.println("No se creará ningún animal.");
                                    System.out.println();

                            }
                        } while (animalElegido != '0');
                        System.out.println("--------------------------------------------------");

                        break; //break del case 4 exterior

                    case '5': //ELIMINAR ANIMAL DE INVENTARIO
                        System.out.println("Introduce la posición del animal que quieras eliminar.");
                        int num2 = teclado.nextInt();
                        inventario.EliminarMascota(num2 - 1);
                        System.out.println("Ha sido eliminado con éxito la mascota de la posición indicada");
                        System.out.println("--------------------------------------------------");
                        break;

                    case '6'://VACIAR INVENTARIO
                        inventario.VaciarLista();
                        System.out.println("Ha sido vaciado con éxito el inventario indicado");
                        System.out.println("--------------------------------------------------");
                        break;
                    case '7': //opciones extra:
                        System.out.println("Vamos a testear algunas funciones de cada clase a continuación:");
                        System.out.println("La función edad actualiza la edad de una mascota. Comprobémoslo.");
                        System.out.println("Edad actual de Nietzsche: " + nietzsche.getEdad());
                        System.out.println("Le sumaremos un año.");
                        nietzsche.cumpleaños();
                        System.out.println("Edad actual de Nietzsche: " + nietzsche.getEdad());
                        System.out.println();
                        System.out.println("Vamos a testear la función 'morir'.");
                        piolin.morir();
                        System.out.println("Devuelve false si el animal de la bbdd falleció :( ");
                        System.out.println("Estado de Piolin:" + piolin.getEstado());
                        System.out.println();
                        System.out.println("Ahora vamos a probar las funciones de hablar de cada uno:");

                        Loro loro2 = new Loro("Australasia", false);
                        Canario canario2 = new Canario("naranja", false);
                        inventario.AñadirMascota(loro2);
                        inventario.AñadirMascota(canario2);

                        System.out.println("Hemos creado e introducido un canario y un loro que no hablan ni cantan, a diferencia de Piolin y Tristán");
                        System.out.println("Nietzsche: " + nietzsche.habla());
                        System.out.println("Mati: " + mati.habla());
                        System.out.println("Piolin sabe cantar, así que hace: " + piolin.habla());
                        System.out.println("El otro canario no: " + canario2.habla());
                        System.out.println("Tristan sabe hablar, hace: " + tristan.habla());
                        System.out.println("El otro loro sin embargo hace: " + loro2.habla());
                        System.out.println();
                        System.out.println("Comprobemos cómo vuelan.");
                        System.out.println("Piolin vuela así: " + piolin.volar());
                        System.out.println("Pero el otro canario vuela asá: " + canario2.volar());
                        System.out.println();
                        break;

                    case '0':
                        //salir
                        System.out.println("Ha decidido salir del programa.");
                        System.out.println("--------------------------------------------------");
                        break;

                    default:
                        System.out.println("Ha introducido un valor incorrecto");
                        System.out.println("--------------------------------------------------");
                }
            }
            catch(InputMismatchException miExcepcion){
                System.out.println("Error: Error de missmatch...");
                
            }
            catch(Exception miExcepcion){
                System.out.println("Error: " + miExcepcion.getMessage());
            }

        } while (opcionElegida != '0');

    }

    //--------------------------------------------------------------------------
    //                            FUNCIONES
    //--------------------------------------------------------------------------
    
    //CREAR PERROS:
    static public Perro crearPerro() {

        Perro perroConstruido = null;

        
        System.out.println("¿Tiene más información del perro además de la raza y si tiene pulgas?");
        String respuesta = teclado.nextLine();

        while ((respuesta.equalsIgnoreCase("si") == false) && (respuesta.equalsIgnoreCase("no") == false))
        {
            System.out.println("Introduzca 'SI' si es que sí. Introduzca 'NO' en el caso contrario.");
            respuesta = teclado.nextLine();
        }

        if (respuesta.equalsIgnoreCase("si"))
        { //creador completo:
            // public Perro(String raza, boolean pulgas, String nombre, int edad, String fechaNacimiento)
            System.out.println("Debe introducir todos los datos que se le pidan.");

            System.out.println("Introduzca el nombre del perro:");
            String nombre = teclado.nextLine();

            System.out.println("Introduzca la edad del perro, escrito con números:");
            int edad = teclado.nextInt();
            teclado.nextLine(); //limpiar de int a string

            System.out.println("Introduzca la fecha de nacimiento con esta estructura: DD-MM-AAAA.");
            String fechaNacimiento = teclado.nextLine();
            
        //creador parcial:
        //public Perro(String raza, boolean pulgas) 

        System.out.println("Escriba la raza del perro:");
        String raza = teclado.nextLine();

        boolean tienePulgas;
        System.out.println("Conteste. ¿Tiene el perro pulgas actualmente? 'SI' o 'NO'.");

        String respuestaPulgas = teclado.nextLine();
        
        tienePulgas = respuestaPulgas.equalsIgnoreCase("si");

        Perro constructorPerro = new Perro(raza, tienePulgas, nombre, edad, fechaNacimiento);
        perroConstruido = constructorPerro;
        return perroConstruido;
            

        } else {
            // (respuesta == "NO")
        //creador parcial:
        //public Perro(String raza, boolean pulgas) 
        
            System.out.println("Escriba la raza del perro:");
            String raza = teclado.nextLine();

            boolean tienePulgas;
            System.out.println("Conteste. ¿Tiene el perro pulgas actualmente? 'SI' o 'NO'.");

            String respuestaPulgas = teclado.nextLine();
            tienePulgas = respuestaPulgas.equalsIgnoreCase("si");

            Perro constructorPerro = new Perro(raza, tienePulgas);
            perroConstruido = constructorPerro;        

            return perroConstruido;
        }
        

    }
    
    
    //CREAR GATOS:
    static public Gato crearGato() {
        /* Hereda de Mascota:
        protected String nombre;
        protected int edad;
        protected boolean estado = true;
        protected String fechaNacimiento;
     
        private String color;
        private boolean hablaOno; */

        Gato gatoConstruido;

        
        System.out.println("¿Tiene más información del gato además de su color y si tiene el pelo largo?");
        String respuesta = teclado.nextLine();
        
        while ((respuesta.equalsIgnoreCase("si") == false) && (respuesta.equalsIgnoreCase("no") == false))
        {
            System.out.println("Introduzca 'SI' si es que sí. Introduzca 'NO' en el caso contrario.");
            respuesta = teclado.nextLine();
        }

        if (respuesta.equalsIgnoreCase("si"))
        {   
            // constructor completo: public Gato(String color, boolean hablaOno, String nombre, int edad, String fechaNacimiento)
            System.out.println("Debe introducir todos los datos que se le pidan.");

            System.out.println("Introduzca el nombre del gato:");
            String nombre = teclado.nextLine();
            teclado.nextLine();

            System.out.println("Introduzca la edad del gato, escrito con números:");
            int edad = teclado.nextInt();
            teclado.nextLine(); //limpiar de int a string?

            System.out.println("Introduzca la fecha de nacimiento con esta estructura: DD-MM-AAAA.");
            String fechaNacimiento = "";
            teclado.nextLine();

            //atributos parciales:
            System.out.println("Escriba el color del gato, en minúsculas:");
            String colorGato = teclado.nextLine();

            boolean tienePeloLargo;
            System.out.println("Conteste. ¿Tiene el gato pelo largo? 'SI' o 'NO'.");
            String respuestaPeloLargo = teclado.nextLine();
            
            tienePeloLargo = respuestaPeloLargo.equalsIgnoreCase("si");

            Gato constructorGato = new Gato(colorGato, tienePeloLargo, nombre, edad, fechaNacimiento);
            gatoConstruido = constructorGato;
            return gatoConstruido;

        } else
        { //(respuesta == "NO")
            //constructor parcial:
            //public Gato(String color, boolean hablaOno)

            System.out.println("Escriba el color del gato, en minúsculas:");
            String colorGato = teclado.nextLine();

            boolean tienePeloLargo;
            System.out.println("Conteste. ¿Tiene el gato pelo largo? 'SI' o 'NO'.");
            String respuestaPeloLargo = teclado.nextLine();
            
            tienePeloLargo = respuestaPeloLargo.equalsIgnoreCase("si");

            Gato constructorGato = new Gato(colorGato, tienePeloLargo);
            gatoConstruido = constructorGato;
            return gatoConstruido;
        }
    }

    //CREAR CANARIOS:
    static public Canario crearCanario() {
        
        Canario canarioConstruido;
        System.out.println("¿Tiene más información del canario además de si canta y su color?");
        String respuesta = teclado.nextLine();
        
        while ((respuesta.equalsIgnoreCase("si") == false) && (respuesta.equalsIgnoreCase("no") == false))
        {
            System.out.println("Introduzca 'SI' si es que sí. Introduzca 'NO' en el caso contrario.");
            respuesta = teclado.nextLine();
        }

        if (respuesta.equalsIgnoreCase("si"))
        { //constructor completo:
            // public Canario(String color, boolean canta, String pico, 
            // boolean vuela, String nombre, int edad, String fechaNacimiento)

            System.out.println("Debe introducir todos los datos que se le pidan.");

            System.out.println("Introduzca el nombre del canario:");
            String nombre = teclado.nextLine();
            teclado.nextLine();

            System.out.println("Introduzca la edad del canario, escrito con números:");
            int edad = teclado.nextInt();
            teclado.nextLine(); //limpiar de int a string?

            System.out.println("Introduzca la fecha de nacimiento con esta estructura: DD-MM-AAAA.");
            String fechaNacimiento = "";
            teclado.nextLine();

            //atributos parciales propios de ave:
            System.out.println("Describa brevemente la forma de su pico, en minúsculas:");
            String formaPico = teclado.nextLine();

            boolean vuelaOno;
            System.out.println("Conteste. ¿Sabe volar el canario? 'SI' o 'NO'.");
            String respuestaVuelaOno = teclado.nextLine();
            
            vuelaOno = respuestaVuelaOno.equalsIgnoreCase("si");


            //atributos parciales propios de canario:
            
            System.out.println("Escriba el color del canario, en minúsculas:");
            String colorCanario = teclado.nextLine();

            boolean cantaOno;
            System.out.println("Conteste. ¿Sabe cantar el canario? 'SI' o 'NO'.");
            String respuestaCantaOno = teclado.nextLine();
            
            cantaOno = respuestaCantaOno.equalsIgnoreCase("si");


            Canario constructorCanario = new Canario(colorCanario, cantaOno, formaPico, vuelaOno, nombre, edad, fechaNacimiento);
            canarioConstruido = constructorCanario;
            return canarioConstruido;

        } else
        { // (respuesta == "NO")
            //constructor parcial: public Canario(String color, boolean canta)

            System.out.println("Escriba el color del canario, en minúsculas:");
            String colorCanario = teclado.nextLine();

            boolean cantaOno;
            System.out.println("Conteste. ¿Sabe cantar el canario? 'SI' o 'NO'.");
            String respuestaCantaOno = teclado.nextLine();

            cantaOno = respuestaCantaOno.equalsIgnoreCase("si");

            Canario constructorCanario = new Canario(colorCanario, cantaOno);
            canarioConstruido = constructorCanario;
            return canarioConstruido;
        }
    }
    
    
    //CREAR LOROS:
    static public Loro crearLoro() {

        Loro loroConstruido;
        
        System.out.println("¿Tiene más información del loro además de si sabe hablar y su origen?");
        String respuesta = teclado.nextLine();
        
        while (respuesta.equalsIgnoreCase("SI") == false && respuesta.equalsIgnoreCase("NO") == false)
        {
            System.out.println("Introduzca 'SI' si es que sí. Introduzca 'NO' en el caso contrario.");
            respuesta = teclado.nextLine();
        }
        
        if (respuesta.equalsIgnoreCase("SI"))
        { //creador completo:
            // public Loro(String origen, boolean habla, String pico, boolean vuela, String nombre, 
            //int edad, String fechaNacimiento)

            System.out.println("Debe introducir todos los datos que se le pidan.");

            System.out.println("Introduzca el nombre del loro:");
            String nombre = teclado.nextLine();
            teclado.nextLine();

            System.out.println("Introduzca la edad del loro, escrito con números:");
            int edad = teclado.nextInt();
            teclado.nextLine(); //limpiar de int a string?

            System.out.println("Introduzca la fecha de nacimiento con esta estructura: DD-MM-AAAA.");
            String fechaNacimiento = "";
            teclado.nextLine();

            //atributos parciales propios de ave:
            System.out.println("Describa brevemente la forma de su pico, en minúsculas:");
            String formaPico = teclado.nextLine();

            boolean vuelaOno;
            System.out.println("Conteste. ¿Sabe volar el loro? 'SI' o 'NO'.");
            String respuestaVuelaOno = teclado.nextLine();
            
            vuelaOno = respuestaVuelaOno.equalsIgnoreCase("si");
                    

            //atributos parciales propios de loro:
            System.out.println("Escriba el lugar de origen del loro, en minúsculas:");
            String origenLoro = teclado.nextLine();

            boolean hablaOno;
            System.out.println("Conteste. ¿Sabe hablar el loro? 'SI' o 'NO'.");
            String respuestaHablaOno = teclado.nextLine();
            
            hablaOno = respuestaHablaOno.equalsIgnoreCase("si");
            

            Loro constructorLoro = new Loro(origenLoro, hablaOno, formaPico, vuelaOno, nombre, edad, fechaNacimiento);
            loroConstruido = constructorLoro;
            return loroConstruido;

        } else
        { //(respuesta == "NO")
            //creador parcial:
            // public Loro(String origen, boolean habla)

            System.out.println("Escriba el lugar de origen del loro, en minúsculas:");
            String origenLoro = teclado.nextLine();

            boolean hablaOno;
            System.out.println("Conteste. ¿Sabe hablar el loro? 'SI' o 'NO'.");
            String respuestaHablaOno = teclado.nextLine();
            
            hablaOno = respuestaHablaOno.equalsIgnoreCase("si");

            Loro constructorLoro = new Loro(origenLoro, hablaOno);
            loroConstruido = constructorLoro;
            return loroConstruido;
        }

    }

}
