/*
Programa que cree edificios, que tienen un número de plantas entre 1 y 10. 
Cada planta puede tener una superficie diferente. 
Los edificios pueden tener estructura antiterremotos o no. Algunos tienen pararayos.  
Los edificios están compuestos por propiedades, que pueden ser tiendas, viviendas y piscina. 
Nos gustaría saber la superficie de cada una, en qué planta y puerta está.
    • Las piscinas tienen capacidad en litros de agua y pueden llenarse o vaciarse. 
    • Las tiendas pueden estar abiertas o cerradas y pueden abrirse o cerrarse.
    • Las viviendas tienen un número máximo de personas que viven en ella y pueden añadirse o reducir el número de personas que viven en ellas.
Los edificios tienen conserje. El conserje abre y cierra la puerta del edificio. Cuenta chistes y tira la basura.
Las propiedades tienen un propietario, que es una persona.
Queremos que el programa principal:
    • cree un edificio, que tiene una tienda, dos viviendas y una piscina.
    • Muestra el edificio, sus atributos y componentes. Incluido a sus propietarios.
    • El conserje abre la puerta.
    • Un propietario vende su casa a otra persona.
    • Vaciamos la piscina.
    • Le añadimos una planta al edificio.
    • Muestra el dificio de nuevo.

*/
public class Edificaciones_Main {

    public static void main(String[] args) {

        System.out.println("Creamos edificio.");
        System.out.println("Añadimos propiedades al edificio.");

        int numPlantas = 0;
        Conserje conserje = new Conserje("Manuel");

        
        //en algun momento meter el dato en el constructor en lugar de medirlo desde aqui
        do {
            numPlantas = (int) (Math.random() * 10);
        } while (numPlantas < 1); //siempre el numPlantas debe ser entre 1 y 10.

        Edificio edf = new Edificio(numPlantas, conserje, true, true);
        //edificio con el numero de plantas definido, con conserje vacio, pararrayos y antiterremotos
        
        Propietario pptrVvd1 = new Propietario("Paulino");
        Propietario pptrVvd2 = new Propietario("Josefina");
        Propietario pptrTnda = new Propietario("Emilio");
        Propietario pptrPsc = new Propietario("Soledad");
        
        Vivienda vvd1 = new Vivienda(pptrVvd1, 70.0, 3);
        Vivienda vvd2 = new Vivienda(pptrVvd2, 90.0, 4);
        Tienda tnda = new Tienda(pptrTnda, 35.0);
        Piscina psc = new Piscina(17000, pptrPsc, 46.0);
        
        edf.añadirPropiedad(vvd1);
        edf.añadirPropiedad(vvd2);
        edf.añadirPropiedad(tnda);
        edf.añadirPropiedad(psc);
        
        System.out.println("");
        System.out.println("Edificio creado correctamente.");
        System.out.println("");
        
        System.out.println("Mostramos atributos del edificio:");
        System.out.println(edf.toString());
        System.out.println("Mostramos info de cada propiedad del edificio y su propietario");
        System.out.println(edf.propiedadesEdificio());
        System.out.println("");
        System.out.println("Informacion mostrada correctamente.");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Ahora el conserje abre la puerta.");
        edf.getConserje().abrePuerta(edf);
        System.out.println("");
        System.out.println("Puerta del edificio abierta con éxito.");
        System.out.println("");
        System.out.println("");
        
        System.out.println("Vaciamos piscina y mostramos la info antes y despues:");
        System.out.println(psc.toString());
        psc.vaciarPiscina();
        System.out.println(psc.toString());
        System.out.println("Acción realizada con éxito.");
        System.out.println("");
        System.out.println("");
        
        
        System.out.println("Propietario vende su casa a otro propietario y mostramos la info de tienda antes y despues");
        System.out.println(tnda.toString());
        tnda.cambioPropietario(pptrPsc);
        System.out.println(tnda.toString());
//      System.out.println("Acción realizada con éxito.");
        System.out.println("");

        System.out.println("Añadimos una planta al edificio.");
        System.out.println(edf.toString());
        edf.añadirPlanta();
        System.out.println(edf.toString());
        System.out.println("Acción realizada con éxito.");
        System.out.println("");
        
        
        System.out.println("");
        System.out.println("Mostramos atributos del edificio:");
        System.out.println(edf.toString());
        System.out.println("Mostramos info de cada propiedad del edificio y su propietario");
        System.out.println(edf.propiedadesEdificio());
        System.out.println("");
        System.out.println("Informacion mostrada correctamente.");

    }

}
