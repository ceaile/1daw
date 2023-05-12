
package ArrayList_Polimorfismo;


public class Cuadrado implements iFigura2D {
    
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    
    private double lado;
    
    
    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    
    public Cuadrado(double lado) {
        this.lado = lado;
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
        return lado * 4;
    }
    
    //FUNCION AREA
    public double CalcArea() {
        return Math.pow(lado, 2);
    }
    
    //FUNCION ESCALAR
    public void Escalar(double escala){
        if (escala > 0) lado *= escala;
        else System.out.println("Escala debe ser mayor que 0.");
    }
    
    //FUNCION IMPRIMIR
    public void Imprimir() {
        String mensaje = "Cuadrado { lado: " + lado 
                + ". Perimetro: " + CalcPerimetro() 
                + ". Area: " + CalcArea()
                + "}";
        System.out.println(mensaje);
    }


    
    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }


    
    
    

}

