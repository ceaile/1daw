/*
El archivo ‘alumnos_notas.txt’ contiene una lista de 10 alumnos y las notas que han obtenido en
cada asignatura. El número de asignaturas de cada alumno es variable. Implementa un programa
que muestre por pantalla la nota media de cada alumno, junto a su nombre y apellido, ordenado
por nota media de mayor a menor.
 */
package ejerciciosFile;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Alumno {
    
    //ATRIBUTOS
    private String nombre = "";
    private ArrayList<Integer> notas = new ArrayList<Integer>();
    private double notaMedia;

    
    
    //CONSTRUCTORES
    public Alumno(String nombre, ArrayList notas) {
        this.nombre = nombre;
        this.notas = notas;
        this.notaMedia = rehacerMedia();
        
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }
    
    public Alumno(){
        
    }
    
    
    
    
    //METODOS
    public void añadirNota(int nota){
        notas.add(nota);
    }
    
    public double rehacerMedia(){
        double media = 0;
        int totalNotas = 0; //para saber la suma de las notas
        int sumaNotas = 0; //para saber cuantas notas hay
        
        for(int i : notas){
           totalNotas += i;
           sumaNotas++;
        }
        media = (double)totalNotas / (double)sumaNotas;
        
        //actualiza el atributo media
        this.notaMedia = media;
        
        //devuelve la media para que uses la variable al gusto
        return media;
    }
    
    public void añadirNombre(String nombre){
//        if (this.nombre.equalsIgnoreCase("")){
//            this.nombre = nombre;
//        } else{
//            this.nombre += " " + nombre;
//        }
        this.nombre += (this.nombre.equalsIgnoreCase("") ? "" : " ") + nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno{");
        sb.append("nombre=").append(nombre);
        sb.append(", notas=").append(notas);
        sb.append(", notaMedia=").append(notaMedia);
        sb.append('}');
        return sb.toString();
    }

    //SETTERS & GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    public double getNotaMedia() {
        return rehacerMedia();
    }

//    public void setNotaMedia(double notaMedia) {
//        this.notaMedia = notaMedia;
//    }
    
    
    
    
}
