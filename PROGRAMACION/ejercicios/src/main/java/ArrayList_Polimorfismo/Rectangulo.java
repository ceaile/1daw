
package ArrayList_Polimorfismo;


public class Rectangulo implements iFigura2D {
    
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    
    private double ancho;
    private double alto;
    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    
    public Rectangulo(double ancho, double alto) {
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
        return (ancho * 2) + (alto * 2);
    }
    
    //FUNCION AREA
    public double CalcArea() {
        return ancho * alto;
    }
    
    //FUNCION ESCALAR
    public void Escalar(double escala){
        if (escala > 0) {
            ancho *= escala;
            alto *= escala;
        } else {
            System.out.println("Escala debe ser mayor que 0");
        }
        
    }
    
    //FUNCION IMPRIMIR
    public void Imprimir() {
        String mensaje = "Rectangulo { ancho: " + ancho
                + ". Alto: " + alto
                + ". Perimetro: " + CalcPerimetro()
                + ". Area: " + CalcArea()
                + "}";
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
