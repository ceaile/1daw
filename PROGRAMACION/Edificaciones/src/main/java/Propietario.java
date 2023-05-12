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
public class Propietario extends Persona{
    
    public void diceHola(){
        System.out.println("'Hola!");
    }

    public Propietario(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Propietario { nombre:" ).append(getNombre());
        return sb.toString();
    }


    

    
}
