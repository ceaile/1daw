
package ArrayList_Polimorfismo;


public class Circulo implements iFigura2D {
    
    //----------------------------------------------------
    //             ATRIBUTOS
    //----------------------------------------------------
    private double radio;
    
    
    //----------------------------------------------------
    //             CONSTRUCTOR
    //----------------------------------------------------
    
    public Circulo(double radio) {
        this.radio = radio;
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
    
    public double CalcPerimetro() {
        return Math.PI * (radio * 2);
    }
    
    
    public double CalcArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    public void Escalar(double escala) {
        if (escala > 0) radio *= escala;
        else System.out.println("Introduzca una escala mayor que 0.");
    }
    
    public void Imprimir() {
        String mensaje = "Circulo { radio: " + radio
                + ". Perimetro: " + CalcPerimetro()
                + ". Area: " + CalcArea()
                + "}";
    }
    
    //----------------------------------------------------
    //             GETTERS & SETTERS
    //----------------------------------------------------

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }


    
    
}
