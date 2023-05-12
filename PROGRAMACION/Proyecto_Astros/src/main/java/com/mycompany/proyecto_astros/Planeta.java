
package com.mycompany.proyecto_astros;


public class Planeta extends Astro {
    
    // ATRIBUTOS PLANETA:
    private double distanciaSol; //km
    private double orbitaSol; //excentricidad(e)
    private boolean tieneSatelites = false;
    
    
    
    
    //METODO VOID NO ABSTRACTO DEMOSTRAR() como en el ejemplo de los apuntes
    public void demostrar() {
        super.demostrar();
        System.out.println("Distancia al Sol: " + distanciaSol);
        System.out.println("Otbita al Sol: " + orbitaSol);
        System.out.println("¿Tiene Satelites? " + tieneSatelites);
    }
    
    //FUNCION NO ABSTRACTA MOSTRAR
    public String mostrar(){
        String contenido = super.mostrar() + ", distancia al Sol=" + distanciaSol + ", orbita al Sol="
                + ", ¿Tiene Satelites?" + tieneSatelites;
        return contenido;
    }
    
    //FUNCION ABSTRACTA MUESTRA()
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
                + getGravedad() + ", distancia al Sol=" + distanciaSol + ", orbita al Sol="
                + ", ¿Tiene Satelites?" + tieneSatelites + '}';
    }
    
    
    
    
    // CONSTRUCTORES
    public Planeta() {
        
    }
    
    public Planeta(String nombre, double masaCuerpo, double diametroMedio, String periodoRotacion, 
            double periodoTraslacion, double distanciaMedia, double radioEcuatorial, 
            double temperaturaMedia, double gravedad, double distanciaSol, double orbitaSol, 
            boolean tieneSatelites) {
        
        super(nombre, masaCuerpo, diametroMedio, periodoRotacion, periodoTraslacion, distanciaMedia, radioEcuatorial, temperaturaMedia, gravedad);
        this.distanciaSol = distanciaSol;
        this.orbitaSol = orbitaSol;
        this.tieneSatelites = tieneSatelites;
        
    }
    
    
    // GETTERS Y SETTERS
    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbitaSol() {
        return orbitaSol;
    }

    public void setOrbitaSol(double orbitaSol) {
        this.orbitaSol = orbitaSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }
    
    
}
