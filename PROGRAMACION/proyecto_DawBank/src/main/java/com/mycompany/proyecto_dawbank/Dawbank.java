package com.mycompany.proyecto_dawbank;


import java.util.Arrays; //para las funciones relativas a los movimientos de la cuenta

public class Dawbank {

    //ATRIBUTOS DEL OBJETO
    private final String IBAN; //2 letras y 22 numeros
    private String nombreTitular;
    private float saldo = 0;
    private int totalMovimientos = 0;

    //VARIABLES DE LA CLASE, UTILIZAS EN FUNCIONES "INTERNAS" (funciones "pieza" de una función mayor)
    private final int minDineroEnCuenta = -50; //mínimo saldo que puede haber en cuenta.
    private float[] listaMovs = new float[100]; //creamos tamaño 100 y no del totalMovimientos para que haya hueco siempre

    
    
    
    //FUNCION PUBLICA DE LA CLASE PARA COMPROBAR QUE EL NOMBRE DEL USER ES ACEPTABLE
    public static boolean isFullname(String nomTitular) {
    String expression = "^[a-zA-Z\\s]+"; //chequea que no contenga numeros
    return nomTitular.matches(expression); //retorna true si solo tiene letras     
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

    //CONSTRUCTORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
    public Dawbank(String nombreTitular) { // solo pide una variable, el nombre!
        this.nombreTitular = nombreTitular; //guarda el nombre que se introdujo en los paréntesis en el atributo
        this.IBAN = CreadorIBAN(); // peeeero también ejecuta la función de crear iban y lo guarda
    }

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
        
        /* Explicaciones:
        1. Esta función no ha de sacar nada por pantalla, ni aquí ni desde el Main!
            Su propósito es solamente ejecutar el ingreso!
        2. Lo que hace es añadir al saldo la cantidad (positiva) que hayan añadido por teclado.
        3. Suma 1 al atributo totalMovimientos, que luego será útil para las funciones de movimientos.
        4. Activo la funcion registroMovs, que es una "funcion-pieza" que comprueba que el ingreso
            se guarda con un "+" delante en un array para visualizar luego los movimientos desde otra funcion.
        5. Se comprobó que poner un '+' delante desde aquí no saldría
            donde se introduce la cantidad en la función.
        6. La prueba para que no metan un número negativo o un 0 se hace desde el Main, dado que es allí.
        */
        
        saldo += cantidad;
        totalMovimientos++;
        registroMovs(cantidad);
    }



    //FUNCION 6: Retirada. Pedirá la cantidad a retirar y realizará la retirada si es posible.
    public void Retirar(float cantidad) {
        
        /* Explicación:
        1. Primero comprobamos la cantidad >= 3000 para el mensaje de Hacienda
        2. Después creamos y ejecutamos simulacro de saldo para determinar el posible saldo:
        3. En el caso de que la cantidad sea menor de -50 no actualizamos saldo real.
        4. En el caso de que la cantidad sea negativa pero mayor de -50, se actualiza el saldo y el contador de movimientos.
        5. En los demás casos también permitimos ejecutar retirada y actualizamos el contador de movimientos.
        6. Al final actualizamos el array registroMovimientos con la cantidad y un '-' delante, para que se sepa
            que es una retirada.
        7. La prueba para que no metan un número negativo o un 0 se hace desde el Main, dado que es allí
            donde se introduce la cantidad en la función.
         */

        if (cantidad >= 3000)
        {
            System.out.println("AVISO: Notificar a Hacienda");
        }

        float simulacro = saldo;
        simulacro = simulacro - cantidad;

        if (simulacro < -50)
        {
            System.out.println("Su saldo negativo no puede ser inferior a -50€.");

        } else 
        {
            if (simulacro > -50 && simulacro < 0) System.out.println("AVISO: Saldo negativo.");
            
            saldo = saldo - cantidad;
            totalMovimientos++;
            System.out.println("Retirada realizada con éxito.");
            registroMovs(-cantidad);
        }
    }
    
    //FUNCION-PIEZA INTERNA PARA LAS FUNCIONES DE RETIRADA E INGRESO: REGISTRAR MOVS
    private void registroMovs(float cantidad) {
        
        /* Explicación:
        ** Esta función registra los movimientos y sobreescribe para que solo se guarden
            los 100 últimos movimientos **
        1. El booleano sirve para salir del segundo bucle cuando se haya registrado con éxito.
        2. El if comprueba que en la última posición del array no haya un 0.
            Que haya haya un 0 en la última posición quiere decir que se han llenado los 100
            primeros movimientos, y por lo tanto que toca borrar un movimiento y añadir otro.
        3. Después, con un bucle, traslada todas los datos anteriores una posición para atrás,
            y mete un 0 en la última posición, para poder escribir ahí otro movimiento.
            Este if solo actúa cuando ya se han llenado todas las posiciones.
        4. El segundo bucle comprueba en cada vuelta que está ya relleno con un movimiento (que lo que hay dentro no sea 0) 
            cada posición
            desde el principio. De ese modo, puede escribir el movimimiento en una posición que tenía.
            Este bucle es el que llena por primera vez el array.
        5. Cuando consigue escribir, deja de dar vueltas porque activamos el booleano a true.
        */
        
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
    
    
    //FUNCION 7: Movimientos. Mostrará una lista con el historial de movimientos. UTILIZO UN GETTER
    public String getListaMovs() {
        
        /* Explicación:
        ** Surge como necesidad de recortar el array de la lista de movimientos que vería el usuario en el caso de que
            no haya hecho 100 movimientos aún. **
        ** También corrige la puntuación (que saque un "+numero" si es ingreso y un "-numero" si es una retirada **
        1. Si no devolviésemos una versión recortada del atributo ListaMovs, se visualizarían todas las posiciones a 0
            de los movimientos que aún no se han hecho. 
        2. Así que lo primero es recortar ese array de 100 posiciones, creando una variable del tamaño del total de Movimientos.
        3. El bucle recorre el array recortado e introduce el contenido del array de 100 posiciones.
        4. Para que salgan los ingresos con un +cantidad y las retiradas -cantidad, creamos un array de Strings.
        5. Recorremos el array recortado (float) buscando los negativos y los positivos. Los negativos
            salieron tal cual desde la función retirada porque sí que dejó.
        6. Pero para los positivos hay que ponerle un +, y así sabe que es un ingreso
        */
        
        float arrayRecortado[] = new float[totalMovsAlmacenados()]; 
        
        for (int i = 0; i < arrayRecortado.length; i++) { //bucle del arrayRecortado para no rayarnos con los 0s del otro array
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
    
    
    
    //FUNCION-PIEZA INTERNA TOTAL MOVIMIENTOS ALMACENADOS
    private int totalMovsAlmacenados() {
        
        /* Explicación:
        ** Función para combinar con el arrayRecortado para que no salga una lista enorme de 0s
            cuando quieras ver la lista de movimientos y aún no hayas llenado las 100 posiciones.
            Devuelve las posiciones que ya estén ocupadas en el array de 100 **
        1. La var total en principio tendrá el tamaño del array float listaMovs (100)
        2. Con el bucle, cuando encuentre un 0, cambiaremos el total por i,
            dado que i es el número de vuelta pero a la vez es a efectos prácticos el total de posiciones ocupadas.
        3. Paramos el bucle con el booleano.
        */
        
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
    
    //RESTO DE GETTERS & SETTERS---------------------------------------------------------------------------------------------------------
    public float getSaldo() { //no la uso por sí misma, la uso en la función string saberSaldo()
        return saldo;
    }

    public int getTotalMovimientos() {
        return totalMovimientos;
    }
    
    /*
    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }
     */

 /*
    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
     */

 /*
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
     */

 /*
    public void setTotalMovimientos(int totalMovimientos) {
        this.totalMovimientos = totalMovimientos;
    }
     */
}
