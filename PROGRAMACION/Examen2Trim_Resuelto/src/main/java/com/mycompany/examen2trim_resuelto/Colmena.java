package com.mycompany.examen2trim_resuelto;

import java.util.ArrayList;

public class Colmena {

    //ATRIBUTOS
    private ArrayList<Abeja> colmena = new ArrayList<Abeja>();

    static private Huevo panal[][]; //creado con funcion crearPanal()

    //CONSTRUCTOR
    public Colmena() {
        panal = crearPanal();

    }

    //--------------------------------------------------------------------------
    //              FUNCIONES
    //--------------------------------------------------------------------------
    /**
     * Crea una matriz panal con una longitud de filas aleatoria, cumpliendo el
     * mínimo de 3 y máximo de 10. La columna es la fila -1.
     *
     * @return Huevo
     */
    //CREAR MATRIZ PANAL
    private Huevo[][] crearPanal() {

        int fila = 0;
        int columna = 0;

        do
        {
            fila = (int) (Math.random() * 10);
        } while (fila < 3 && fila > 10);

        columna = fila - 1;

        Huevo panal[][] = new Huevo[fila][columna];
        return panal;
    }

    //SACAR DATOS DE LA MATRIZ PANAL
    public String getPanaltoString() {
        return crearPanal().toString();
    }

    //GETTER DEL ATRIBUTO PANAL
    static public Huevo[][] getPanal() {
        return panal;
    }

    //AÑADIR ABEJA A LA LISTA COLMENA
    public void añadirAbeja(Abeja abeja) {
        colmena.add(abeja);
    }

    //QUITAR ABEJA DE LA LISTA COLMENA
    public void quitarAbeja(Abeja abeja) {
        colmena.remove(abeja);
    }

    /**
     * Recorre el arraylist Colmena con un for-each.
     *
     * @return String
     */
    //MOSTRAR COLMENA
    public String mostrarColmena() {

        String info = "";
        for (Abeja i : colmena)
        {
            info += i.toString() + "\n";
        }
        return info;
    }

    /**
     * Acciona el trabajo de cada casta (volar, zumbar, poner huevos...) Se
     * acciona meterHuevo(), que introduce los huevos creados en la matriz Panal
     * Se acciona alimentar(), que alimenta huevos en cantidad y ubicacion
     * aleatorias Se acciona nacenHuevos(), que determina qué tipo de abeja va a
     * nacer, saca el huevo del panal y mete la abeja en el arraylist
     *
     * @see Huevo() constructor from class Huevo
     */
    //RECORRER PANAL Y ACCIONAR ENJAMBRE
    public void recorrerEnjambre() {

        for (Abeja i : colmena)
        {   // si es abeja, reina u obrera hace cada cosa
            if (i instanceof Reina)
            {
                Reina rn = (Reina) i;
                Huevo hv = new Huevo(rn);
                Huevo hv2 = new Huevo(rn);
                meterHuevo(hv);
                meterHuevo(hv2);
                i.volar();

            } else if (i instanceof Obrera)
            {
                Obrera obr = (Obrera) i;
                if (obr.getAlimentadaConJalea() >= 10)
                {
                    Huevo hv = new Huevo();
                    Huevo hv2 = new Huevo();
                    meterHuevo(hv);
                    meterHuevo(hv2);
                }

                obr.segregarCera();
                i.volar();

            } else
            {
                Zangano zg = (Zangano) i;
                zg.zumbar();
                i.volar();
            }
        }
        alimentarRandom();
        nacenHuevos();
    }

    /**
     * Recorre la matriz Panal y utiliza el método toString() de cada abeja.
     * Saca por pantalla.
     */
    //VISUALIZAR MATRIZ PANAL
    public void verPanal() {

        for (int j = 0; j < panal.length; j++)
        {
            for (int i = 0; i < panal[j].length; i++)
            {
                System.out.println(panal[j][i].toString());

            }
        }
    }

    /**
     * Recorre la matriz panal y hace eclosionar todos los huevos que cumplan
     * los requisitos. Dependiendo de las caracteristicas de los huevos, nace de
     * una casta u otra. Se encarga de sacar de la matriz ese huevo y de
     * introducirlo al arraylist ya como Abeja de cada casta
     *
     * @see seraReina(), HuevoNace() and EsHembra() from class Huevo
     */
    //NACER HUEVOS
    public void nacenHuevos() {

        for (int j = 0; j < panal.length; j++)
        {
            for (int i = 0; i < panal[j].length; i++)
            {

                if (panal[j][i] != null)
                {
                    if (panal[j][i].seraReina() && j == 0)
                    {
                        Reina rn = (Reina) panal[j][i].HuevoNace();
                        añadirAbeja(rn); //la abeja va al arraylist
                        panal[j][i] = null; // y el huevo sale de la matriz

                    } else if (panal[j][i].EsHembra() == false)
                    {
                        Zangano zg = (Zangano) panal[j][i].HuevoNace();
                        añadirAbeja(zg);
                        panal[j][i] = null; // y el huevo sale de la matriz

                    } else
                    {
                        Obrera obr = (Obrera) panal[j][i].HuevoNace();
                        añadirAbeja(obr);
                        panal[j][i] = null; // y el huevo sale de la matriz
                    }
                }

            }
        }
    }

    /**
     * Recorre la matriz Panal buscando un hueco, donde pondrá un huevo
     *
     * @param Huevo hv
     */
    //METER HUEVO EN MATRIZ PANAL
    private void meterHuevo(Huevo hv) {

        boolean haTerminado = false;

        for (int j = 0; j < panal.length && haTerminado == false; j++)
        {
            for (int i = 0; i < panal[j].length && haTerminado == false; i++)
            {

                if (panal[j][i] == null)
                { //si el panal está vacío, la abeja pone un huevo
                    panal[j][i] = hv;
                    haTerminado = true;
                }

            }
        }
    }

    /**
     * Elige una fila aleatoria entre las existentes de la matriz panal, y lo
     * mismo con la columna. Después se asegura de que haya un huevo ocupando
     * ese espacio Elige aleatoriamente la cantidad de abejas que se van a
     * alimentar. Y elige también aleatoriamente la cantidad de alimento que se
     * le va a dar a cada abeja.
     *
     * @see Alimentar(int alimento) from class Huevo
     */
    //ALIMENTAR RANDOM POSICION DE MATRIZ PANAL Y RANDOM CANTIDAD DE JALEA
    public void alimentarRandom() {
        int tamañoFilas = panal.length;
        int tamañoColumnas = tamañoFilas - 1;
        int filaAleatoria = 0;
        int columnaAleatoria = 0;
        int alimentoParaHuevosRandom= (int) Math.random() * 10;

        //ALIMENTAR HUEVOS
        do
        {

            do
            {
                filaAleatoria = (int) (Math.random() * 10);
            } while (filaAleatoria > tamañoFilas);

            do
            {
                columnaAleatoria = (int) (Math.random() * 10);
            } while (columnaAleatoria > tamañoColumnas);

        } while (panal[filaAleatoria][columnaAleatoria] == null);

        panal[filaAleatoria][columnaAleatoria].Alimentar(alimentoParaHuevosRandom);

        //ALIMENTAR OBRERAS
        for (Abeja i : colmena)
        {
            if (i instanceof Obrera)
            {
                int alimentoParaObrerasRandom = (int) Math.random() * 10;
                Obrera obr = (Obrera) i;
                obr.alimentar(alimentoParaObrerasRandom);
            }
        }
    }
}
