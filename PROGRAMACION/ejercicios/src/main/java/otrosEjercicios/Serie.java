/*
https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
 */
package otrosEjercicios;

/**
 *
 * @author Admin
 */
public class Serie implements Entregable {

    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    private String titulo;
    private String genero;
    private String creador;
    private int numTemporadas = 3;
    private boolean entregado = false;

    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------
    public Serie(String titulo, String genero, String creador, int numTemporadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
        this.numTemporadas = numTemporadas;
    }
    
    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
    }
    
    public Serie(){
        
    }

    //--------------------------------------------------------------------------
    //              METODOS
    //--------------------------------------------------------------------------
    //Heredados de interfaz Entregable:
    public void Entregar(){
        entregado = true;
    }

    public void devolver(){
        entregado = false;
    }

    public boolean isEntregado(){
        return entregado;
    }

    public boolean compareTo(Object s){                                             //CASTING AQUI
        Serie sr = (Serie) s;
        return ( numTemporadas == sr.getNumTemporadas() );
    }

    //Propios:

    @Override
    public String toString() {
        return "Serie{" + "titulo=" + titulo + ", genero=" + genero + ", creador=" + creador + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + '}';
    }
    
    
    
    
    //--------------------------------------------------------------------------
    //              GETTERS & SETTERS
    //--------------------------------------------------------------------------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }
    
    
    
    
}
