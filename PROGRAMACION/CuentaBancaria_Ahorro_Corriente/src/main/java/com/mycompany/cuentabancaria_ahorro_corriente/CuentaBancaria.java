/*
import java.util.Arrays; //para las funciones relativas a los movimientos de la cuenta
 */
package com.mycompany.cuentabancaria_ahorro_corriente;

import java.util.Arrays;

/*
copia con modificaciones del ejercicio clase Dawbank.
 */
abstract public class CuentaBancaria {
    
    //ATRIBUTOS DE DAWBANK
    protected final String IBAN; //2 letras y 22 numeros
    protected String nombreTitular;
    protected float saldo = 0;
    protected int totalMovimientos = 0;
    //VARIABLES DE LA CLASE, UTILIZAS EN FUNCIONES PIEZA
    protected final int minDineroEnCuenta = -50; //mínimo saldo que puede haber en cuenta.
    protected float[] listaMovs = new float[100]; //creamos tamaño 100 y no del totalMovimientos para que haya hueco siempre
    
    //atributos nuevos:
    protected final double interesAnualBasico = 2.25; //%

    //--------------------------------------------------------------------------
    //        CONSTRUCTOR
    //--------------------------------------------------------------------------
    
    //FUNCION 0: CREAR CUENTA
    public CuentaBancaria(String nombreTitular) { // solo pide una variable, el nombre!
        this.nombreTitular = nombreTitular; 
        this.IBAN = CreadorIBAN(); 
    }
    
    //--------------------------------------------------------------------------
    //        FUNCIONES
    //--------------------------------------------------------------------------

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
    public void Retirar(float cantidad) {
        if (cantidad >= 3000)
        {
            System.out.println("AVISO: Notificar a Hacienda");
        }
        float simulacro = saldo;
        simulacro = simulacro - cantidad;
        if (simulacro < -50)
        {
            System.out.println("Su saldo negativo no puede ser inferior a -50€.");
        } else if (simulacro > -50 && simulacro < 0)
        {
            System.out.println("AVISO: Saldo negativo.");
            saldo = saldo - cantidad;
            totalMovimientos++;
            System.out.println("Retirada realizada con éxito.");
        } else
        {
            saldo = saldo - cantidad;
            totalMovimientos++;
            System.out.println("Retirada realizada con éxito.");
        }
        registroMovs(-cantidad);
    }

    //FUNCION 7: Movimientos. Mostrará una lista con el historial de movimientos. UTILIZO UN GETTER
    public String getListaMovs() {
        float arrayRecortado[] = new float[totalMovsAlmacenados()];
        for (int i = 0; i < arrayRecortado.length; i++) { 
            arrayRecortado[i] = listaMovs[i]; 
        }
        String[] arrayStrRecort = new String[totalMovsAlmacenados()];
        for (int i = 0; i < arrayRecortado.length; i++) {
            if (arrayRecortado[i] > 0) {
            arrayStrRecort[i] = "+" + Float.toString(arrayRecortado[i]);
            
            } else {
                arrayStrRecort[i] = Float.toString(arrayRecortado[i]);
            }
        }
        return Arrays.toString(arrayStrRecort);
    }
    
    //FUNCION 8: Traspasar dinero de una cuenta a otra. (NUEVA!)
    public void Transferencia(String ibanDestino, float cantidad) {
        //me falta validar si se puede hacer la resta del saldo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        //hacerla booleana permitiría saber qué ha pasado, si se ha producido
        //lo suyo es que dentro de esta función se llame a la función que reciba el saldo.
        
        //o sea que quizá recibir la transferencia aquí en lugar del main sea buena idea
        if (validaIBAN(ibanDestino) == true) {
            Retirar(cantidad);
        }
    }
    
    //FUNCION 9: RECIBIR LA TRANSFERENCIA (NUEVA!)
    public void recibirTransfer(float cantidad) {
        Ingresar(cantidad);
    }
    
    //FUNCION BOOLEAN TRANSFERENCIA REAL
    /* 
    public boolean TrueTransfer(CuentaBancaria destino, float cantidad){
        boolean hecho = false;
        destino.Ingresar(cantidad);
        if ()
    } 
    */
   
    
    //--------------------------------------------------------------------------
    //        FUNCIONES - PIEZAS
    //--------------------------------------------------------------------------
    
    //FUNCION ABSTRACTA CALCULAR INTERESES (NUEVA!)
    public abstract float CalcularIntereses();
    
    //FUNCION AÑADIR() DINERO POS/NEG AL SALDO (NUEVA!)
    public void Añadir(double cantidad) {
        saldo = saldo + (float)cantidad;
    }
    
    //FUNCION VALIDAR IBAN (NUEVA!)
    protected boolean validaIBAN(String iban){
        String expresionIban = "^[a-zA-Z]{2}[0-9]{22}$"; 
//no sé si funciona aún
        return iban.matches(expresionIban);
    }
    
    
    //FUNCION PUBLICA DE LA CLASE PARA COMPROBAR QUE EL NOMBRE DEL USER ES ACEPTABLE
    public static boolean isFullname(String nomTitular) {
    String expression = "^[a-zA-Z\\s]+"; //chequea que no contenga numeros
    return nomTitular.matches(expression); //retorna true si solo tiene letras     
    }
    
        
    //FUNCION-PIEZA INTERNA PARA LAS FUNCIONES DE RETIRADA E INGRESO: REGISTRAR MOVS
    private void registroMovs(float cantidad) {
        boolean registrado = false;
        if (listaMovs[listaMovs.length -1] != 0) {
            
           for (int i = 0; i < listaMovs.length - 1; i++) {
               
               listaMovs[i] = listaMovs[i + 1];
           }
           
           listaMovs[listaMovs.length -1] = 0;
        }
        for (int i = 0; (i < listaMovs.length) && (registrado == false); i++)
        {
            if (listaMovs[i] == 0) //la primera vez que encuentre un 0, lo escribe ahí dentro
            {
                listaMovs[i] = cantidad;
                registrado = true; //pero para que pare de dar vueltas usamos el booleano.
            }
        }
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
    
    
    //FUNCION-PIEZA INTERNA TOTAL MOVIMIENTOS ALMACENADOS
    private int totalMovsAlmacenados() {
        int total = listaMovs.length;
        boolean parar = false;    
        for ( int i = 0; (i < listaMovs.length) && (parar == false) ; i++) {
            if (listaMovs[i] == 0) {
                total = i;
                parar = true;
            }
        }
        return total;
    }
    
    
    //--------------------------------------------------------------------------
    //      GETTERS & SETTERS
    //--------------------------------------------------------------------------
    
    public float getSaldo() { //no la uso por sí misma, la uso en la función string saberSaldo()
        return saldo;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }
    
    
}


