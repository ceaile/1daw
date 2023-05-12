
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Disco> listaDiscos = new ArrayList<Disco>();
        ArrayList<Pelicula> listaPelis = new ArrayList<Pelicula>();

        //meto unos clientes, discos y pelis en la lista para probar funciones:
        //public Disco(String titulo, String artista, int añoPubli, String genero) {
        //public Pelicula(String titulo, String director, int añoPubli, String genero) {
        //public Cliente(String nombre, String apellidos, String DNI, String telf) {
        Disco fallen = new Disco("Fallen", "Evanescence", 2003, "rock");
        Pelicula titanic = new Pelicula("Titanic", "James Cameron", 1997, "drama");

        listaDiscos.add(fallen);
        listaPelis.add(titanic);
        //VAMOS A ASUMIR QUE EL USUARIO DE ESTE MENU ES EL CLIENTE PEPA, QUE YA TENIA CUENTA
        Cliente pepa = new Cliente("Pepa", "Rodriguez Salazar", "111222333444", "777888999");

        //menu:
        int opcionElegida = 0;
        do
        {
            System.out.println("");
            System.out.println("Menú de alquiler de discos y peliculas:");

            System.out.println("Pulse 1 para Insertar un disco");
            System.out.println("Pulse 2 insertar una pelicula"); //etc con el resto de opciones del menú
            System.out.println("Pulse 3 para saber todos los titulos de un disco");
            System.out.println("Pulse 4 para saber el titulo cada pelicula");
            System.out.println("Pulse 5 para saber el artista de cada disco");
            System.out.println("Pulse 6 para saber director pelicula");
            System.out.println("Pulse 7 para saber el año publicacion de cada disco");
            System.out.println("Pulse 8 para saber el año publicacion de cada pelicula");
            System.out.println("Pulse 9 para saber toda la informacion de cada disco");
            System.out.println("Pulse 10 para saber toda la informacion de cada pelicula");
            System.out.println("Pulse 11 para saber toda la informacion de cada cliente");
            System.out.println("Pulse 12 para comprar un disco");
            System.out.println("Pulse 13 para comprar una pelicula");
            System.out.println("Pulse 14 para salir");
            System.out.println("");
            opcionElegida = teclado.nextInt();
            teclado.nextLine(); //reset scanner

            switch (opcionElegida)
            {
                case 1:
                    System.out.println("Esta opción permite insertar un disco");

                    try
                    {
                        String titulo = "";
                        while (textosValidos(titulo) == false)
                        {
                            System.out.println("Inserte titulo del album");
                            titulo = teclado.nextLine();
                        }

                        String artista = "";
                        while (textosValidos(artista) == false)
                        {
                            System.out.println("Inserte el artista");
                            artista = teclado.nextLine();
                        }

                        int añoPubli = 0;
                        while (añoPubliValido(añoPubli) == false)
                        {
                            System.out.println("Inserte el año de publicacion:");
                            añoPubli = teclado.nextInt();
                            teclado.nextLine();
                        }

                        String genero = "";
                        while (textosValidos(genero) == false)
                        {
                            System.out.println("Inserte el género musical:");
                            genero = teclado.nextLine();
                        }

                        Disco cd = new Disco(titulo, artista, añoPubli, genero);
                        listaDiscos.add(cd);

                    } catch (Exception e)
                    {
                        System.out.println("Ha habido un error procesando la inserción del disco.");
                    }

                    break;

                case 2:
                    System.out.println("Esta opción permite insertar una película");
                    //utilizar mismas validaciones, funciones propias que en la case 1 y try catch

                    System.out.println("Inserte el titulo de la pelicula");
                    String tituloPeli = teclado.nextLine();

                    System.out.println("Inserte el director");
                    String director = teclado.nextLine();

                    System.out.println("año publicacion:");
                    int añoPubliPeli = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Genero:");
                    String generoPeli = teclado.nextLine();

                    Pelicula peli = new Pelicula(tituloPeli, director, añoPubliPeli, generoPeli);
                    listaPelis.add(peli);
                    break;

                case 3:
                    System.out.println("Esta opción permite obtener el título de cada disco del inventario");
                    for (Disco i : listaDiscos)
                    {
                        System.out.println(i.getTitulo());
                    }
                    break;

                case 4:

                    System.out.println("Esta opción permite obtener el título de cada película del inventario");
                    for (Pelicula i : listaPelis)
                    {
                        System.out.println(i.getTitulo());
                    }
                    break;

                case 5:
                    System.out.println("Esta opción permite obtener el artista de cada disco del inventario");
                    
                    try
                    {
                        System.out.println("Inserte el titulo del disco del que desea conocer el artista:");
                        String tituloDisco = teclado.nextLine();
                        System.out.println("El artista del disco que has especificado es:");
                        System.out.println(saberDisco(tituloDisco, listaDiscos).getArtista());
                    } catch (Exception e)
                    {
                        System.out.println("Ha habido un error en la obtención del artista.");
                    }

                    break;

                case 6:
                    System.out.println("Esta opción permite obtener el director de cada pelicula del inventario");
                    for (Pelicula i : listaPelis)
                    {
                        System.out.println(i.getDirector());
                    }
                    break;

                case 7:
                    System.out.println("Esta opción permite obtener el año de publicacion de cada disco del inventario");
                    for (Disco i : listaDiscos)
                    {
                        System.out.println(i.getAñoPubli());
                    }
                    break;

                case 8:
                    System.out.println("Esta opción permite obtener el año de publicacion de cada pelicula del inventario");
                    for (Pelicula i : listaPelis)
                    {
                        System.out.println(i.getAñoPubli());
                    }
                    break;

                case 9:
                    System.out.println("Esta opción permite obtener la info completa de cada disco del inventario");
                    for (Disco i : listaDiscos)
                    {
                        System.out.println(i.toString());
                    }
                    break;

                case 10:
                    System.out.println("Esta opción permite obtener la info completa de cada peli");
                    for (Pelicula i : listaPelis)
                    {
                        System.out.println(i.toString());
                    }
                    break;

                case 11:
                    System.out.println("Esta opción permite obtener la info completa del cliente usuario");
                    System.out.println(pepa.toString());
                    break;

                case 12:
                    System.out.println("Esta opción permite comprar discos");

                    try
                    {
                        System.out.println("Inserte el titulo del disco que desea comprar:");

                        String titulo = teclado.nextLine();
                        if (existeDisco(titulo, listaDiscos) && saberDisco(titulo, listaDiscos).getStock() > 0)
                        {
                            pepa.comprarDisco(saberDisco(titulo, listaDiscos));
                        } else
                        {
                            System.out.println("No se encuentra en stock el disco que desea comprar");
                        }
                    } catch (Exception e)
                    {
                        System.out.println("Ha habido un error en la ejecucion de la compra del disco. Pruebe más tarde.");
                    }

                    break;

                case 13:
                    //implementar mismas validaciones y try catch que en case 12, creando sus propias funciones para pelis
                    System.out.println("Esta opción permite comprar peliculas");
                    pepa.comprarPeli(titanic);
                    break;

                case 14:
                    System.out.println("Esta opción permite salir del menu");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcionElegida != 14);

    }

    //FUNCIONES VALIDADORAS
    public static boolean textosValidos(String texto) {
        boolean valido = false;
        if (texto.matches("^[a-zA-Z\\s]+"))
        {
            valido = true;
        }
        return valido;
    }

    public static boolean añoPubliValido(int año) {
        boolean valido = false;
        if (año <= 2050 && año > 1900)
        {
            valido = true;
        }
        return valido;
    }

    public static boolean existeDisco(String titulo, ArrayList<Disco> listaDiscos) {
        boolean encontrado = false;
        for (Disco i : listaDiscos)
        {
            if (i.getTitulo().equalsIgnoreCase(titulo))
            {
                encontrado = true;
            }
        }
        return encontrado;
    }

    public static Disco saberDisco(String tituloDisco, ArrayList<Disco> listaDiscos) {
        Disco esteDiscoEs = new Disco();
        boolean parar = false;
        for (Disco i : listaDiscos)
        {
            if (i.getTitulo().equalsIgnoreCase(tituloDisco))
            {
                esteDiscoEs = i;
            }
        }
        return esteDiscoEs;
    }
}
