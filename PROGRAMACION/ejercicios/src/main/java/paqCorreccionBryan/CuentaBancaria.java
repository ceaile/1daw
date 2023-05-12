
package paqCorreccionBryan;

import java.util.ArrayList;
import java.util.Iterator;

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
public class CuentaBancaria {

    //Atributos que quedan guardados del usuario
    private final String name;
    private final String lastName;
    private final String IBAN;
    private static double saldo;
    private ArrayList mov = new ArrayList();

    public CuentaBancaria(String name, String lastName, String Iban, double saldo) {
        this.name = name;
        this.lastName = lastName;
        this.IBAN = Iban;
        this.saldo = saldo;
    }

    public void mostrarDatos() {
        System.out.println("La cuenta se ha creado con los siguientes datos: ");
        System.out.println("Titular: " + this.name + "" + this.lastName);
        System.out.println("IBAN otorgado: " + this.IBAN);
        System.out.println("Saldo en la cuenta: " + this.saldo + " â‚¬");
    }

    //Devuelve el nombre y el apellido en caso de solicitarlo
    public String getname() {
        return name;
    }

    public String getlastName() {
        return lastName;
    }

    //Este atributo es el que puede estar en constate cambio por lo que sera solicitado mas de una vez para observar los movimientos realizados
    public double getsaldo() {
        return saldo;
    }

    //Con este public nos encargamos de que se pueda ingresar dinero a nuestro saldo
    public double setingresar(double ingreso) {

        if (ingreso <= 0) {
            System.out.println("****AVISO****");
            System.out.println("El ingreso debe ser superior a 0â‚¬");
        } else {
            if (ingreso > 3000) {
                System.out.println("****AVISO****");
                System.out.println("Notificar a hacienda");
                this.saldo = this.saldo + ingreso;
            } else {
                this.saldo = this.saldo + ingreso;
            }
        }
        mov.add("+ " + ingreso);
        return saldo;
    }

    public double setretirar(double retirar) {

        if (retirar <= 0) {
            System.out.println("Introduzca una cantidad posible a retirar");
        }
        if (retirar > this.saldo) {
            System.out.println("****AVISO****");
            System.out.println("Saldo negativo");

        } else {

            if (this.saldo < 0) {
                System.out.println("****AVISO****");
                System.out.println("Saldo negativo");
            } else {
                this.saldo -= retirar;
                mov.add("-" + retirar);
            }
        }

        return saldo;
    }

    public void mostrarMov() {
        System.out.println("Movimientos realizados:");
        for (Iterator iter = mov.iterator(); iter.hasNext();) {
            System.out.println(iter.next() + " â‚¬");
        }
    }

}
