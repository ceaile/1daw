
package ArrayList_Polimorfismo;


public class Triangulo implements iFigura2D {
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    
    private double ancho;
    private double alto;
    
    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    
    public Triangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }  
    
    //----------------------------------------------------
    //             FUNCIONES
    //----------------------------------------------------
    
    /* 
    Hereda de iFigura2D, y se implementan aquí:
        double CalcPerimetro();
        double CalcArea();
        void Escalar(double escala);
        void Imprimir();
    */
    
    //FUNCION PERIMETRO
    public double CalcPerimetro() {
        /*
        Raiz cuadrada [Math.sqrt] de la suma de los cuadrados[Math.pow(whatever,2)] de los catetos
        */
        double hipotenusa = Math.sqrt(Math.pow((ancho/2),2) + Math.pow(alto,2));
        double perimetro = hipotenusa * 2 + ancho;
        return perimetro;
    }
    
    
    //FUNCION AREA
    public double CalcArea() {
        return (ancho * alto) / 2;
    }
    
    //FUNCION ESCALAR
    public void Escalar(double escala){
        if (escala > 0) {
            ancho *= escala;
            alto *= escala;
        }
    }
    
    //FUNCION IMPRIMIR
    public void Imprimir() {
        String mensaje = "Triangulo { Ancho: " + ancho
                + ". Alto: " + alto
                + ". Perimetro: " + CalcPerimetro()
                + ". Area: " + CalcArea()
                + " }";
        System.out.println(mensaje);
        
    }
    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }


    
    
    
    
}
