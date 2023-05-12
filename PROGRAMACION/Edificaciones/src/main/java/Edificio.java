
import java.util.ArrayList;

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

public class Edificio {
    
    //ATRIBUTOS
    private ArrayList<Propiedad> edificio = new ArrayList<Propiedad>();
    
//    private ArrayList<Persona> habitantes = new ArrayList<Persona>();
    
    private double[] superficieCadaPlanta; //aquí solo se construye el array vacio de plantas donde se almacena la superficie de cada planta
    
    
    private int numPlantas;
    
    private boolean puertasAbiertas = true;
    private boolean pararrayos;
    private boolean antiterremotos;
    
    private Conserje conserje;
    
    
    
    //CONSTRUCTOR
    public Edificio(int numPlantas, Conserje conserje, boolean pararrayos, boolean antiterremotos) {
        this.numPlantas = numPlantas;
        this.conserje = conserje;
        superficieCadaPlanta = constructorSuperficiePlantas();
    }
    
    //FUNCIONES

    @Override
    public String toString() {
        //mostrar atributos
        StringBuilder sb = new StringBuilder();
        sb.append("Edificio { superficieCadaPlanta=").append(superficieCadaPlantaToString());
        sb.append(", número de plantas=").append(numPlantas);
        sb.append(", ¿puertas abiertas?=").append(puertasAbiertas);
        sb.append(", ¿tiene pararrayos?=").append(pararrayos);
        sb.append(", ¿tiene antiterremotos?=").append(antiterremotos);
        sb.append(", conserje=").append(conserje.toString());
        sb.append('}');
        return sb.toString();
    }
    
    /**
     * Da vueltas en el array de la superficie de cada planta y lo muestra por pantalla
     * @return String m2 superficie de cada planta
     */
    public String superficieCadaPlantaToString(){
        String info = "";
        for (int i = 0; i < superficieCadaPlanta.length ; i++){
            info += "La superficie de la planta " + i + " es " + superficieCadaPlanta[i] + "\n";
        }
        
        return info;
    }
    
    /**
     * 
     * @return String
     */
    public String propiedadesEdificio(){
        String info = "";
        for (Propiedad i : edificio) {
            info += i.toString() + "\n";
        }
        return info;
    }
    
    
    
    public void añadirPropiedad(Propiedad propiedad){
        edificio.add(propiedad);
    }

    //constructor del array superficieCadaPlanta
    private double[] constructorSuperficiePlantas(){
        double array[] = new double[numPlantas];
        return array;
    }
    
    public boolean estaPuertaAbierta() {
        return puertasAbiertas;
    }

    public void setPuertasAbiertas(boolean puertasAbiertas) { //lo acciona el conserje
        this.puertasAbiertas = puertasAbiertas;
    }

    public int getNumPlantas() {
        return numPlantas;
    }

    public void añadirPlanta() {
        numPlantas++;
    }

    public Conserje getConserje() {
        return conserje;
    }

    public void setConserje(Conserje conserje) {
        this.conserje = conserje;
    }
    
    
    
}
