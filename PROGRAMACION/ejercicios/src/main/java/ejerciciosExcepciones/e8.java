/*
Vamos a mejorar el software del caso práctico DawBank de la unidad 8 añadiendo
excepciones y alguna cosa más. Crea un nuevo proyecto y copia tu propio código de
DawBank (o el de la solución propuesta). Realiza los siguientes cambios:
1. Crea una nueva clase CuentaException que herede de Exception. La utilizaremos para
lanzar excepciones relacionadas con cuentas bancarias.
2. Crea una nueva clase AvisarHaciendaException que herede de Exception. La utilizaremos
para lanzar una excepción cuando haya que avisar a hacienda.
3. Modifica la clase CuentaBancaria:
A. Los movimientos deberán almacenarse en un ArrayList en lugar de en un vector. Ya
no será necesario limitar a 100 el n.º de movimientos.
B. No se mostrará ningún tipo de mensaje de error. En su lugar, se lanzarán excepciones.
C. Cuando se intente realizar algo incorrecto o no permitido se lanzará una excepción
CuentaExceptión (deberá incluir un mensaje breve sobre el error producido).
D. Cuando haya que avisar a hacienda se lanzará la excepción AvisarHaciendaException,
que contendrá información sobre el titular, el iban y la operación realizada. Recuerda
que aunque se avise a hacienda la operación debe realizarse de todos modos.
4. Modifica la clase principal que contiene el main para manejar todas las posibles
excepciones (no solo las de la clase CuentaBancaria), mostrando los mensajes de error
oportunos y los printStackTrace()
 */
package ejerciciosExcepciones;


public class e8 {
    
}
