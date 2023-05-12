package ejerciciosBasicos;

/*
Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y
segundos que nos calcula y escribe la hora, minutos y segundos que serán, transcurrido un
segundo.
 */
import java.util.Scanner;
public class ejercicio17 {
    public static void main(String[] args) {
        System.out.println("Introduce una hora");
        Scanner escanerHora = new Scanner(System.in);
        int hora = escanerHora.nextInt();
        System.out.println("Introduce los minutos");
        Scanner escanerMins = new Scanner(System.in);
        int minutos = escanerMins.nextInt();
        System.out.println("Introduce los segundos");
        Scanner escanerSegs = new Scanner(System.in);
        int segundos = escanerSegs.nextInt();
        if (segundos == 59) {
            segundos = 0;
            if (minutos == 59) {
                minutos = 0;
                if (hora == 23 ) {
                    hora = 0;
                }
                else {
                    hora = hora + 1;
                }
            } 
            else {
                minutos = minutos + 1;
            }
            
        }
        else {
            segundos = segundos + 1;
        }
        System.out.println("La hora es " + hora + ":" + minutos + ":" + segundos); 
    }
    
    
}
