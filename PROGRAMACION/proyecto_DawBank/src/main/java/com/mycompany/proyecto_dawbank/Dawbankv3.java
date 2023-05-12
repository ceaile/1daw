package com.mycompany.proyecto_dawbank;


import java.util.ArrayList;
import java.util.Arrays; //para las funciones relativas a los movimientos de la cuenta

public class Dawbankv3 {

    //ATRIBUTOS DEL OBJETO
    private final String IBAN; //2 letras y 22 numeros
    private String nombreTitular;
    private float saldo = 0;
    private int totalMovimientos = 0;

    //VARIABLES DE LA CLASE, UTILIZAS EN FUNCIONES "INTERNAS" (funciones "pieza" de una función mayor)
    private final int minDineroEnCuenta = -50; //mínimo saldo que puede haber en cuenta.
//    private float[] listaMovs = new float[100]; //creamos tamaño 100 y no del totalMovimientos para que haya hueco siempre
    public ArrayList aListMovs = new ArrayList();

    
    
    
    //FUNCION PUBLICA DE LA CLASE PARA COMPROBAR QUE EL NOMBRE DEL USER ES ACEPTABLE
    public static boolean isFullname(String nomTitular) {
    String expression = "^[a-zA-Z\\s]+"; //chequea que no contenga numeros
    return nomTitular.matches(expression); //retorna true si solo tiene letras     
    }
    
    
    
    //FUNCION-PIEZA INTERNA PARA FUNCION IBAN: GENERA 22 NUMEROS RANDOM
    private String numeroIBAN() {
        String numero = "";
        //genera numeros random 0-9 en un bucle de 22 posiciones:
        for (int i = 0; i < 22; i++)
        {
            int aleatorio = (int) (Math.random() * 10);
            numero = numero + String.valueOf(aleatorio);
        }
        return numero;
    }
    
    //FUNCION-PIEZA INTERNA PARA FUNCION IBAN: GENERA 2 LETRAS RANDOM RANDOM
    private String letrasIBAN() { 
        String letrasIBAN = "";
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";            //string para buscar en cada vuelta una pos. random
        for (int i = 0; i < 2; i++)
        {                              //2 vueltas porque solo necesito 2 letras
            char letra = alfabeto.charAt((int) (Math.random() * 26)); //((ant.22!))busco un char random en el string alfabeto y guardo
            letrasIBAN = letrasIBAN + letra;                               //meto el char guardado letra en el String final
        }
        return letrasIBAN;
    }

    //FUNCION INTERNA PARA FUNCION CREADOR DE IBAN: UTILIZA LA FUNCIÓN QUE GENERA LETRAS Y LA QUE GENERA NUMEROS:
    private String CreadorIBAN() {
        String newIBAN = letrasIBAN() + numeroIBAN();
        return newIBAN;
    }

    //CONSTRUCTORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
    public Dawbankv3(String nombreTitular) { // solo pide una variable, el nombre!
        this.nombreTitular = nombreTitular; //guarda el nombre que se introdujo en los paréntesis en el atributo
        this.IBAN = CreadorIBAN(); // peeeero también ejecuta la función de crear iban y lo guarda
    }

    //FUNCION 1: Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.
    public String infotoString() {
        String info = "Titular de la cuenta: " + nombreTitular + ". IBAN: " + IBAN + ". Saldo disponible: " + saldo + "€";
        return info;
    }

    //FUNCION 2: IBAN. Mostrará el IBAN. UTILIZO EL GETTER!
    public String getIBAN() {
        return IBAN;
    }

    //FUNCION 3: Titular. Mostrará el titular. UTILIZO EL GETTER!
    public String getNombreTitular() {
        return nombreTitular;
    }

    //FUNCION 4: Saldo. Mostrará el saldo disponible.
    public String saberSaldo() { //utilizo el getter del saldo y le añado un string
        String saldoDisponible = getSaldo() + " € disponible en cuenta.";
        return saldoDisponible;
    }

    //FUNCION 5: Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.
    public void Ingresar(float cantidad) {
        
        saldo += cantidad;
        totalMovimientos++;
        registroMovs(cantidad);
    }



    //FUNCION 6: Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.
    public void Retirar(float cantidad) throws Exception {
        


        if (cantidad >= 3000)
        {
            
            throw new AvisarHaciendaException("AVISO: Notificar a Hacienda");
            
        }

        float simulacro = saldo;
        simulacro = simulacro - cantidad;

        if (simulacro < -50)
        {
            throw new CuentaException("Su saldo negativo no puede ser inferior a -50€.");

        } else 
        {
            if (simulacro > -50 && simulacro < 0) throw new CuentaException("AVISO: Saldo negativo.");
            
            saldo = saldo - cantidad;
            totalMovimientos++;
            System.out.println("Retirada realizada con éxito.");
            registroMovs(-cantidad);
        }
    }
    
private void registroMovs(float cantidad) {
        aListMovs.add(cantidad);
    }
    
    
    //FUNCION 7: Movimientos. Mostrará una lista con el historial de movimientos. UTILIZO UN GETTER
    public String getListaMovs() {

        String listaMovs = "";
        for (Object i : aListMovs){
            listaMovs +=  i;
        }
        return listaMovs;
    }
    
    
    

    
    //RESTO DE GETTERS & SETTERS---------------------------------------------------------------------------------------------------------
    public float getSaldo() { //no la uso por sí misma, la uso en la función string saberSaldo()
        return saldo;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }
   
}

