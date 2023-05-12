package com.mycompany.proyecto_dawbank;

import java.util.Scanner;
import java.util.Arrays;

public class Dawbank_Main {

    static Scanner teclado = new Scanner(System.in);


    public static void main(String[] args) {

        //CREACION DE CUENTA:

        String nuevoNombre = "";
        do
        {
            System.out.println("Escriba su nombre completo para crear una cuenta en DawBank:");
            System.out.println("Asegúrese de escribir los espacios, las mayúsculas, y no introducir ningún número");
            nuevoNombre = teclado.nextLine();
        } while (Dawbank.isFullname(nuevoNombre) == false);


        Dawbank nuevaCuenta = new Dawbank(nuevoNombre);

        //MENÚ:

        System.out.println();
        System.out.println("***** Bienvenido al menú de Navegación de Dawbank *****");
        int opcionElegida = 0;
        while (opcionElegida != 8)
        {

            System.out.println();
            System.out.println("Seleccione una de estas 8 opciones:");
            System.out.println("Introduzca '1' si desea visualizar todos los datos de la cuenta.");
            System.out.println("Introduzca '2' si desea visualizar el IBAN.");
            System.out.println("Introduzca '3' si desea visualizar el nombre del titular de la cuenta.");
            System.out.println("Introduzca '4' si desea visualizar el saldo disponible.");
            System.out.println("Introduzca '5' si desea realizar un ingreso.");
            System.out.println("Introduzca '6' si desea retirar una cantidad de dinero.");
            System.out.println("Introduzca '7' si desea visualizar el historial de movimientos.");
            System.out.println("Introduzca '8' para salir del programa.");
            System.out.println("--------------------------------------------");

            opcionElegida = teclado.nextInt();

            String separacion = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
            String nuevaOperacion = "¿Desea realizar alguna otra operación?";

            switch (opcionElegida)
            {
                case 1:
                    //FUNCION 1: Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.
                    System.out.println(nuevaCuenta.infotoString());
                    System.out.println(separacion);
                    System.out.println(nuevaOperacion);
                    break;

                case 2:
                    //FUNCION 2: IBAN. Mostrará el IBAN.
                    System.out.println(nuevaCuenta.getIBAN());
                    System.out.println(separacion);
                    System.out.println(nuevaOperacion);
                    break;

                case 3:
                    //FUNCION 3: Titular. Mostrará el titular.
                    System.out.println(nuevaCuenta.getNombreTitular());
                    System.out.println(separacion);
                    System.out.println(nuevaOperacion);
                    break;

                case 4:
                    //FUNCION 4: Saldo
                    System.out.println(nuevaCuenta.saberSaldo());
                    System.out.println(separacion);
                    System.out.println(nuevaOperacion);
                    break;

                case 5:
                    //FUNCION 5: Ingreso. Pedirá la cantidad a ingresar y realizará el ingreso si es posible.
                    System.out.println("Introduce la cantidad que desea ingresar:");
                    float ingreso = teclado.nextFloat();
                    if (ingreso > 0)
                    {
                        nuevaCuenta.Ingresar(ingreso);
                        System.out.println("Ingreso realizado con éxito.");
                    } else
                    {
                        System.out.println("Introduzca una cantidad superior a 0.");
                    }
                    System.out.println(separacion);
                    System.out.println(nuevaOperacion);
                    break;

                case 6:
                    //FUNCION 6: Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.
                    System.out.println("Introduce la cantidad que desea retirar:");
                    float retirada = teclado.nextFloat();
                    if (retirada > 0)
                    {
                        nuevaCuenta.Retirar(retirada);
                        System.out.println("Recoja su tarjeta bancaria.");
                        System.out.println("Retire su dinero.");
                    } else
                    {
                        System.out.println("Introduzca una cantidad superior a 0.");
                    }
                    System.out.println(separacion);
                    System.out.println(nuevaOperacion);
                    break;

                case 7:
                    //FUNCION 7: Movimientos. Mostrará una lista con el historial de movimientos.
                    System.out.println("Total de movimientos realizados en su cuenta: " + nuevaCuenta.getTotalMovimientos());
                    System.out.println("Historial de movimientos:");
                    System.out.println(nuevaCuenta.getListaMovs());
                    System.out.println(separacion);
                    System.out.println(nuevaOperacion);
                    break;

                case 8:
                    //Salida
                    System.out.println("Ha decidido salir del programa.");
                    System.out.println("--------------------------------------------");
                    break;

                default:
                    System.out.println("Opción no válida. Introduzca un número del 1 al 8.");

            }
        }
    }

}
