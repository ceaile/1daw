
public class Pelicula {
    private String titulo;
    private String director;
    private int añoPubli;
    private String genero;
    private double precio = 17;

    public Pelicula(String titulo, String director, int añoPubli, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.añoPubli = añoPubli;
        this.genero = genero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pelicula{");
        sb.append("titulo=").append(titulo);
        sb.append(", director=").append(director);
        sb.append(", a\u00f1oPubli=").append(añoPubli);
        sb.append(", genero=").append(genero);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAñoPubli() {
        return añoPubli;
    }

    public void setAñoPubli(int añoPubli) {
        this.añoPubli = añoPubli;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
