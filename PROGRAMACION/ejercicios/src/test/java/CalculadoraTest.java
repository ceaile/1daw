
import otrosEjercicios.Calculadora;

//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;


/**
 * Puedes hacer todos los tests de una clase en una misma claseTest
 */
public class CalculadoraTest {
    
    //Calculadora calc;    (before)
    
//    @Before
    public void before(){
        //calc = new Calculadora();
        System.out.println("before()");
    }
    
    
//    @After
    public void after(){
        System.out.println("After");
//        calcu.clear();
//          porque en nuestros métodos se utilizan las funciones de dentro de calcu, no en la función se nombran
    }

//    @Test
    public void testSuma() {
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.suma();
//        assertEquals(30, resultado);
    }

//    @Test
    public void testMultiplica() {
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.multiplica();
//        assertEquals(200, resultado);
    }

//    @Test
    public void testDivision() {
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.divide();
//        assertEquals(2, resultado);
    }
    
//    @Test 
    public void testException() {
        
        try {
            
            Calculadora calcu = new Calculadora(20, 0);
            int resultado = calcu.divide(); //esta funcion de division no tiene tratamiento para excepciones como divide0
//            fail("FALLO, Debería haber lanzado una excepción");
            
        } catch (ArithmeticException variableExcepcion) {
            System.out.println("Caught.");
        }
    }

    //EJERCICIO 3.1
//    @Test
    public void testResta() { 
        Calculadora calcu = new Calculadora(20, 10);
        int resultado = calcu.resta();
//        assertEquals(10, resultado);
        //comprueba que el resultado esperado y el obtenido sean iguales
    }
    
//    @Test
    public void testDivide2(){
        Calculadora calcu = new Calculadora(20, 0);
        Integer resultado = calcu.divide2();
//        assertNull(resultado);
        //comprueba que al ejecutar salta un fallo nulo
    }
    
//    @Test
    public void testResta2(){
        Calculadora calcu = new Calculadora(0, 10);
        boolean resultado = calcu.resta2();
//        assertFalse(resultado);
        //comprueba que al ejecutar el resultado booleano sale falso
    }
    
//    @Test (expected = /*java.lang.*/ArithmeticException.class)
    public void testDivide0(){
         Calculadora calcu = new Calculadora(20, 0);
         Integer resultado = calcu.divide0();
         //espera una excepción de tipo aritmético dentro de una funcion que dentro tiene un try catch
    }
    

}
