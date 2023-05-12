/*
https://www.discoduroderoer.es/ejercicios-propuestos-y-resueltos-programacion-orientado-a-objetos-java/
 */
package otrosEjercicios;

/**
 *
 * @author Admin
 */
public class Videojuego implements Entregable {

    //--------------------------------------------------------------------------
    //              ATRIBUTOS
    //--------------------------------------------------------------------------
    private String titulo;
    private String genero;
//    public enum GeneroVj{
//        AVENTURA, RPG, ACCION, MMORPPG, SHOOTER, TERROR, PUZZLE, PLATAFORMAS
//    };
//    private GeneroVj genero;
    private String compañia;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    //--------------------------------------------------------------------------
    //              CONSTRUCTORES
    //--------------------------------------------------------------------------

    public Videojuego(String titulo, String genero, String compañia, int horasEstimadas) {
        this.titulo = titulo;
        this.genero = genero;
        this.compañia = compañia;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }
    
    public Videojuego(){
        
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

    public boolean compareTo(Object v){                                             //CASTING AQUI
        Videojuego vj = (Videojuego)v;
        return (horasEstimadas == vj.getHorasEstimadas());
    }

    //Propios:
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Videojuego{");
        sb.append("titulo=").append(titulo);
        sb.append(", genero=").append(genero);
        sb.append(", compa\u00f1ia=").append(compañia);
        sb.append(", horasEstimadas=").append(horasEstimadas);
        sb.append(", entregado=").append(entregado);
        sb.append('}');
        return sb.toString();
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

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }
    
    
    
}
