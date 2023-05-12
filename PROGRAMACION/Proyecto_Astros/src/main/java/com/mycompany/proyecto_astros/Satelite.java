
package com.mycompany.proyecto_astros;


public class Satelite extends Astro {
    
    // ATRIBUTOS SATELITE
    /* Atributos heredados de Astro:
    protected String nombre;
    protected double masaCuerpo; //(kg)
    protected double diametroMedio; //(km??)
    protected String periodoRotacion; //en su eje (string. días, horas, min)
    protected double periodoTraslacion; //alrededor del cuerpo que orbitan (días)
    protected double distanciaMedia; //al del cuerpo que orbitan (años luz)
    protected double radioEcuatorial; //el radio, como si fuera una esfera (km)
    protected double temperaturaMedia; //(grados Cº)
    protected double gravedad; //metros/segundo^2
    */
    private double distanciaPlaneta; //(km)
    private double orbitaPlanetaria; //excentricidad (e)
    private Planeta planetaPertenece;
    
    // CONSTRUCTORES
    public Satelite() {
    }

    public Satelite(String nombre, double masaCuerpo, double diametroMedio, String periodoRotacion, 
            double periodoTraslacion, double distanciaMedia, double radioEcuatorial, 
            double temperaturaMedia, double gravedad, double distanciaPlaneta, 
            double orbitaPlanetaria, Planeta planetaPertenece) {
        super(nombre, masaCuerpo, diametroMedio, periodoRotacion, periodoTraslacion, 
                distanciaMedia, radioEcuatorial, temperaturaMedia, gravedad);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planetaPertenece = planetaPertenece;
    }
    
    /* Explicación constructor super:
    Se introducen en los parametros que pide el constructor los de la clase padre
    y luego dentro de la implementacion{} se pone lo primero de todo
    super() y entre esos parentesis todos los nombres de variables que tiene la clase padre
    y despues ya las variables de la clase hija que tendría un constructor normal
    */
    
    //METODO VOID NO ABSTRACTO DEMOSTRAR() como en el ejemplo de los apuntes
    public void demostrar() {
        super.demostrar();
        System.out.println("Distancia al planeta que orbita: " + distanciaPlaneta);
        System.out.println("Otbita planetaria: " + orbitaPlanetaria);
        System.out.println("Planeta al que pertenece: " + planetaPertenece);
    }
    
    //FUNCION NO ABSTRACTA MOSTRAR
    public String mostrar(){
        String contenido = super.mostrar() + ", distancia al Sol=" + ", distancia al Planeta=" 
                + distanciaPlaneta + ", orbita planetaria=" + orbitaPlanetaria 
                + ", planeta al que pertenece" + planetaPertenece;
        return contenido;
    }
    
    //METODO ABSTRACTO MUESTRA()
    /*
    1. Instanciamos el método abstracto que queremos usar
    2. Hacemos abstracta la clase padre.
        *Ya no podremos crear objetos genericos de esa clase.
    3. Creamos el método en la clase hija con el mismo nombre
    4. Si queremos acceder a las variables de la clase padre, usamos sus getters.
    */
    public String muestra() {
        return "Planeta{" + "nombre=" + getNombre() + ", masaCuerpo=" + getMasaCuerpo() + ", diametroMedio=" 
                + getDiametroMedio() + ", periodoRotacion=" + getPeriodoRotacion() 
                + ", periodoTraslacion=" + getPeriodoTraslacion() + ", distanciaMedia=" 
                + getDistanciaMedia() + ", radioEcuatorial=" + getRadioEcuatorial() 
                + ", temperaturaMedia=" + getTemperaturaMedia() + ", gravedad=" 
                +  getGravedad() + ", distancia al Sol=" + ", distancia al Planeta=" 
                + distanciaPlaneta + ", orbita planetaria=" + orbitaPlanetaria 
                + ", planeta al que pertenece" + planetaPertenece + '}';
    }
    
    
    
    
    //GETTERS Y SETTERS
    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public Planeta getPlaneta() {
        return planetaPertenece;
    }

    public void setPlaneta(Planeta planeta) {
        this.planetaPertenece = planetaPertenece;
    }
    
    
}
