
package com.mycompany.proyecto_astros;


public abstract class Astro {
    
    
    // ATRIBUTOS PADRE ASTRO
    protected String nombre;
    protected double masaCuerpo; //(kg)
    protected double diametroMedio; //(km??)
    protected String periodoRotacion; //en su eje (string. días, horas, min)
    protected double periodoTraslacion; //alrededor del cuerpo que orbitan (días)
    protected double distanciaMedia; //al del cuerpo que orbitan (años luz)
    protected double radioEcuatorial; //el radio, como si fuera una esfera (km)
    protected double temperaturaMedia; //(grados Cº)
    protected double gravedad; //metros/segundo^2
    
    //METODO VOID NO ABSTRACTO DEMOSTRAR() como en el ejemplo de los apuntes
    public void demostrar() {
        System.out.println("Nombre: " + this.nombre + ".");
        System.out.println("Masa: " + this.masaCuerpo + " kg");
        System.out.println("Diámetro medio: " + this.diametroMedio + " km");
        System.out.println("Periodo de Rotación: " + this.periodoRotacion);
        System.out.println("Periodo de Traslacion: " + this.periodoTraslacion + " días");
        System.out.println("Distancia media al cuerpo que orbita: " + this.distanciaMedia + " años/luz");
        System.out.println("Radio: " + this.radioEcuatorial + " km");
        System.out.println("Temperatura media: " + this.temperaturaMedia + "ºC");
        System.out.println("Gravedad: " + this.gravedad + "metros/segundo^2");
    }
    
    
    //METODO NO ABSTRACTO MOSTRAR()
    public String mostrar() {
        String contenido = toString();
        return contenido;
    }
    
    //METODO ABSTRACTO MUESTRA()
    public abstract String muestra();
    /*
    1. Instanciamos el método abstracto que queremos usar
    2. Hacemos abstracta la clase padre.
        *Ya no podremos crear objetos genericos de esa clase.
    3. Creamos el método en la clase hija con el mismo nombre
    4. Si queremos acceder a las variables de la clase padre, usamos sus getters.
    */
    
    
    
    // TO STRING
    @Override
    public String toString() {
        return "Astro{" + "nombre=" + nombre +  ", masaCuerpo(kg)=" + masaCuerpo + ", diametroMedio(km)=" 
                + diametroMedio + ", periodoRotacion=" + periodoRotacion 
                + ", periodoTraslacion(días)=" + periodoTraslacion + ", distanciaMedia(años/luz)=" 
                + distanciaMedia + ", radioEcuatorial(km)=" + radioEcuatorial 
                + ", temperaturaMedia(ºC)=" + temperaturaMedia + ", gravedad(metros/segundo^2)=" + gravedad 
                + '}';
    }
    
    

    // CONSTRUCTORES
    public Astro(String nombre, double masaCuerpo, double diametroMedio, String periodoRotacion, double periodoTraslacion, double distanciaMedia, double radioEcuatorial, double temperaturaMedia, double gravedad) {
        this.nombre = nombre;
        this.masaCuerpo = masaCuerpo;
        this.diametroMedio = diametroMedio;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
        this.radioEcuatorial = radioEcuatorial;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    public Astro() {
    }
    
    
    
    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    
    public double getMasaCuerpo() {
        return masaCuerpo;
    }

    public void setMasaCuerpo(double masaCuerpo) {
        this.masaCuerpo = masaCuerpo;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public void setDiametroMedio(double diametroMedio) {
        this.diametroMedio = diametroMedio;
    }

    public String getPeriodoRotacion() {
        return periodoRotacion;
    }

    public void setPeriodoRotacion(String periodoRotacion) {
        this.periodoRotacion = periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public void setPeriodoTraslacion(double periodoTraslacion) {
        this.periodoTraslacion = periodoTraslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    public void setDistanciaMedia(double distanciaMedia) {
        this.distanciaMedia = distanciaMedia;
    }

    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public double getGravedad() {
        return gravedad;
    }

    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }
    
    
    
}
