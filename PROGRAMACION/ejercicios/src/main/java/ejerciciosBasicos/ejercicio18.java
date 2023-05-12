package ejerciciosBasicos;

/*
Escribe un programa que calcula el salario neto semanal de un trabajador en función del
número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
• Las primeras 35 horas se pagan a tarifa normal.
• Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
• Las tasas de impuestos son:
• Los primeros 500 euros son libres de impuestos.
• Los siguientes 400 tienen un 25% de impuestos.
• Los restantes un 45% de impuestos.
Escribir nombre, salario bruto, tasas y salario neto.
 */
import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        double salario = 0;
        double impuesto = 0;
        double neto = 0;
        System.out.println("Introducir nombre del operario");
        Scanner escNombre = new Scanner(System.in);
        String nombre = escNombre.nextLine();
        System.out.println("Introduce las horas trabajadas");
        Scanner escHoras = new Scanner(System.in);
        double horas = escHoras.nextDouble();
        System.out.println("Introduce la tarifa por hora");
        Scanner escTarifa = new Scanner(System.in);
        double tarifa = escTarifa.nextDouble();
        if (horas <= 35) {
            salario = tarifa * horas; 
        } 
        else {
           salario = 35 * tarifa + (horas - 35) * tarifa * 1.5;
        }
        if (salario > 900) {
            impuesto = (400 * 0.25) + (salario - 900) * 0.45;
        }
        else if (salario > 500) {
            impuesto = (salario - 500) * 0.25;
        }
        else {
            neto = salario * impuesto;
        }
        System.out.println("El salario neto del operario " + nombre + "es de " + neto + "€ " + "y de impuestos " + impuesto);
    }
    
}
