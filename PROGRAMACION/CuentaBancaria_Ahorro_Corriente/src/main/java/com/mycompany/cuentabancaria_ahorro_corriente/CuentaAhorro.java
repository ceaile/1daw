/*

 */
package com.mycompany.cuentabancaria_ahorro_corriente;


public class CuentaAhorro extends CuentaBancaria{
    
    //--------------------------------------------------------------------------
    //        ATRIBUTOS
    //--------------------------------------------------------------------------
    
    /*
    //ATRIBUTOS DE DAWBANK
    protected final String IBAN; //2 letras y 22 numeros
    protected String nombreTitular;
    protected float saldo = 0;
    protected int totalMovimientos = 0;
    
    //VARIABLES DE LA CLASE, UTILIZAS EN FUNCIONES PIEZA
    protected final int minDineroEnCuenta = -50; //mínimo saldo que puede haber en cuenta.
    protected float[] listaMovs = new float[100]; //creamos tamaño 100 y no del totalMovimientos para que haya hueco siempre
    
    //ATRIBUTOS NUEVOS:
    protected final double interesAnualBasico = 2.25; //%
    */
    
    final double saldoMinimo = 50; //€
    
    //--------------------------------------------------------------------------
    //        CONSTRUCTOR
    //--------------------------------------------------------------------------
    public CuentaAhorro(String nombreTitular) {
        super(nombreTitular);

    }
    
    
    //--------------------------------------------------------------------------
    //        FUNCIONES
    //--------------------------------------------------------------------------
    
        //FUNCION ABSTRACTA CALCULAR INTERESES
    public float CalcularIntereses() {
        double resultado;
        if (saldo < saldoMinimo) {
            resultado = saldo * ( interesAnualBasico / 2) / 100;
        } else {
            resultado = saldo * ( interesAnualBasico * 2 ) / 100;
        }
        return (float)resultado;
    }
}
