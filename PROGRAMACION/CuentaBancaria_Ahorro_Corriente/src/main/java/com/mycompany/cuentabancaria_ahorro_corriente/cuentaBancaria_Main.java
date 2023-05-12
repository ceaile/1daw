
package com.mycompany.cuentabancaria_ahorro_corriente;

import com.mycompany.cuentabancaria_ahorro_corriente.CuentaCorriente;
import com.mycompany.cuentabancaria_ahorro_corriente.CuentaAhorro;
import java.util.Scanner;
import java.util.ArrayList;


public class cuentaBancaria_Main {

    
    public static void main(String[] args) {
        
        /*
        Implementa una clase principal con función main para probar el funcionamiento de las tres clases:
        Crea varias cuentas bancarias de distintos tipos, pueden estar en un ArrayList si lo deseas; prueba a
        realizar ingresos, retiradas y transferencias; calcula los intereses y muéstralos por pantalla; etc.
        */
        
        //CREACION DE CUENTAS
        CuentaCorriente cuenta1 = new CuentaCorriente("Pepito Perez");
        CuentaAhorro cuenta2 = new CuentaAhorro("Pepito Perez");
        
        //PRUEBAS VARIAS
        
        System.out.println();
        
        System.out.println("Comprobaciones:");
        System.out.println("El saldo por defecto al crear cuenta es 0, pero añadiremos saldo.");
        System.out.println("Probemos a calcular los intereses para una cuenta de ahorro");
        cuenta2.Añadir(49);
        System.out.println("Los intereses de cuenta2 son: " + cuenta2.CalcularIntereses());
        System.out.println();
        
        System.out.println("Probemos a añadir más del mínimo al saldo para que sea diferente ese cálculo.");
        cuenta2.Añadir(1);
        System.out.println("El saldo actual de la cuenta 2 es de: " + cuenta2.getSaldo());
        System.out.println();
        
        System.out.println("Calculamos de nuevo los intereses de la cuenta de ahorro cuenta2: " + cuenta2.CalcularIntereses());
        System.out.println();
        
        System.out.println("Introducimos saldo en la cuenta1 (cuenta corriente) y comprobamos distinto resultado: ");
        cuenta1.Añadir(50);
        System.out.println("Intereses: " + cuenta1.CalcularIntereses());
        System.out.println();
        
        System.out.println("Probamos a traspasar 50€ de cuenta1 a cuenta2:");
        cuenta1.Transferencia(cuenta2.getIBAN(), 50);
        cuenta2.recibirTransfer(50);
        System.out.println();
        
        System.out.println("Comprobación de saldo de cuenta1");
        System.out.println(cuenta1.getSaldo());
        System.out.println("Comprobación de saldo de cuenta2");
        System.out.println(cuenta2.getSaldo());
        System.out.println();
        
        System.out.println("Comprobación de movimientos de cuenta1");
        System.out.println(cuenta1.getListaMovs());
        System.out.println("Comprobación de movimientos de cuenta2");
        System.out.println(cuenta2.getListaMovs());
        
        
        
    }
    
}
