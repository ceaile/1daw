/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqCorreccionBryan;

import java.util.Scanner;

/*
La empresa LibreCoders te ha contratado para desarrollar un software de gestiÃ³n de una cuenta
bancaria para la cooperativa de banca Ã©tica y sostenible DawBank. Se trata de una aplicaciÃ³n Java
formada por una clase principal DawBank y otra llamada CuentaBancaria.
El programa pedirÃ¡ los datos necesarios para crear una cuenta bancaria. Si son vÃ¡lidos, crearÃ¡ la
cuenta y mostrarÃ¡ el menÃº principal para permitir actuar sobre la cuenta. Tras cada acciÃ³n se
volverÃ¡ a mostrar el menÃº.
1. Datos de la cuenta. MostrarÃ¡ el IBAN, el titular y el saldo.
2. IBAN. MostrarÃ¡ el IBAN.
3. Titular. MostrarÃ¡ el titular.
4. Saldo. MostrarÃ¡ el saldo disponible.
5. Ingreso. PedirÃ¡ la cantidad a ingresar y realizarÃ¡ el ingreso si es posible.
6. Retirada. PedirÃ¡ la cantidad a retirar y realizarÃ¡ la retirada si es posible.
7. Movimientos. MostrarÃ¡ una lista con el historial de movimientos.
8. Salir. Termina el programa.
Clase CuentaBancaria
Una cuenta bancaria tiene como datos asociados el iban (international bank acount number,
formado por dos letras y 22 nÃºmeros, por ejemplo ES6621000418401234567891), el titular (un
nombre completo), el saldo (dinero en euros) y los movimientos (histÃ³rico de los movimientos
realizados en la cuenta, un mÃ¡ximo de 100(
*
)
 para simplificar).
Cuando se crea una cuenta es obligatorio que tenga un iban y un titular (que no podrÃ¡n cambiar
nunca). El saldo serÃ¡ de 0 euros y la cuenta no tendrÃ¡ movimientos asociados.
El saldo solo puede variar cuando se produce un ingreso (entra dinero en la cuenta) o una retirada
(sale dinero de la cuenta). En ambos casos se deberÃ¡ registrar la operaciÃ³n en los movimientos. Los
ingresos y retiradas solo pueden ser de valores superiores a cero.
El saldo de una cuenta nunca podrÃ¡ ser inferior a -50(
*
)
 euros. Si se produce un movimiento que
deje la cuenta con un saldo negativo (no inferior a -50) habrÃ¡ que mostrar el mensaje â€œAVISO: Saldo
negativoâ€�. Si se produce un movimiento superior a 3.000(
*
)
 euros se mostrarÃ¡ el mensaje â€œAVISO:
Notificar a haciendaâ€�.
No se realizarÃ¡ ningÃºn tipo de entrada por teclado. La Ãºnica salida por pantalla permitida son los
dos mensajes de aviso mencionados arriba, ninguna otra.
(
*
)
 Estos valores no pueden variar y son iguales para todas las cuentas bancarias.
Clase DawBank
Clase principal con funciÃ³n main. Encargada de interactuar con el usuario, mostrar el menÃº
principal, dar feedback y/o mensajes de error, etc. UtilizarÃ¡ la clase CuentaBancaria. Puedes
implementar las funciones que consideres oportunas.
 */
/**
 *
 * @author DAW
 */
public class DawBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        //Se le aÃ±ade las variables que usaremos para ejecutar el programa
        int opc;
        String IBAN;
        long numeroIban1;
        long numeroIban2;
        long leftLimit1 = 10000000000L;
        long rightLimit1 = 99999999999L;
        long leftLimit2 = 10000000000L;
        long rightLimit2 = 99999999999L;
        String nombre;
        String apellido;
        double saldo = 0;
        double saldoIngresar;
        double saldoRetirar;
        boolean salir = false;
        //El usuario introducira la informacion que solicita el programa para crearle una cuenta
        System.out.println("*****CREACIÃ“N DE CUENTA*****");
        System.out.println("***************************");
        System.out.println("-Introduzca el nombre del titular-");
        nombre = sc.nextLine();
        System.out.println("************************");
        System.out.println("-Introduzca el apellido-");
        apellido = sc.nextLine();
        System.out.println("************************");
        System.out.println("******CUENTA CREADA CON EXITO******");

        //Con el siguiente comando lo que hace es generando una IBAN aleatorio
        numeroIban1 = leftLimit1 + (long) (Math.random() * (rightLimit1 - leftLimit1));
        numeroIban2 = leftLimit2 + (long) (Math.random() * (rightLimit2 - leftLimit2));
        IBAN = "ES" + numeroIban1 +numeroIban2;
        
        //Los datos introducidos son guardados dentro de la clase "CuentaBancaria"
        CuentaBancaria persona = new CuentaBancaria(nombre, apellido, IBAN, saldo);
        
        persona.mostrarDatos();
        //Muestra las opciones posibles que el usuario puede usar
            System.out.println("Â¿Que opcion es la que desea?");
            System.out.println("1: Datos de la cuenta");
            System.out.println("2: Mostrar el IBAN");
            System.out.println("3: Mostrar el titular de la cuenta");
            System.out.println("4: Mostrar el saldo disponble");
            System.out.println("5: Ingesar dinero a la cuenta");
            System.out.println("6: Retirar dinero de la cuenta");
            System.out.println("7: Historial de movimientos realizados");
            System.out.println("8: Salir del programa");
            
            
        while(!salir){
            System.out.println("-Seleccione una OPCION-");
            System.out.println("Si desea volver a observar las OPCIONES pulse 0");
            
            opc = sc.nextInt();
            switch (opc) {
                case 0://Opcion extra que podra pedir el usuario si quiere volver a observar las opciones 
                     System.out.println("Â¿Que opcion es la que desea?");
                     System.out.println("1: Datos de la cuenta");
                     System.out.println("2: Mostrar el IBAN");
                     System.out.println("3: Mostrar el titular de la cuenta");
                     System.out.println("4: Mostrar el saldo disponble");
                     System.out.println("5: Ingesar dinero a la cuenta");
                     System.out.println("6: Retirar dinero de la cuenta");
                     System.out.println("7: Historial de movimientos realizados");
                     System.out.println("8: Salir del programa");
                    break;
                case 1: //Se encarga de mostrar los datos de cuenta del usuario
                    persona.mostrarDatos();
                    break;
                case 2://Muestra el IBAN correspondiente del titular
                    System.out.println("Su IBAN es el siguiente: ");
                    System.out.println(IBAN);
                    break;
                case 3://Muestra el nombre del titular de la cuenta
                    System.out.println("El tiutlar de esta cuenta es: " + persona.getname() + persona.getlastName());
                    break;
                case 4://Muestra el saldo actual del usuario
                    System.out.println("El saldo actual es de: " + persona.getsaldo() + " â‚¬");
                    break;
                case 5://Ingresa una cantidad de dinero
                    System.out.println("Introduzca la cantidad a ingresar: ");
                    saldoIngresar = sc.nextDouble();
                    persona.setingresar(saldoIngresar);
                    System.out.println("Saldo actual: " + persona.getsaldo() + " â‚¬");
                    break;
                case 6://Retira una cantidad de dinero solicitada
                    System.out.println("Introduzca la cantidad a retirar: ");
                    saldoRetirar = sc.nextDouble();
                    persona.setretirar(saldoRetirar);
                    System.out.println("Saldo actual: " + persona.getsaldo() + " â‚¬");
                    break;
                case 7://Se supone que en esta opcion tendria que mostrar el historial de movimientos del usuario...
                    persona.mostrarMov();
                    break;
                case 8://Finaliza el programa
                    System.out.println("Vuelva Pronto");
                    salir = true;
                    break;
                default: //Se le pide al usuario que seleccione solo las opciones validas
                    System.out.println("Solo numeros entre 1 y 8");


            }
        }
        

    }

}

