
public class Disco {
    
    private String titulo;
    private String artista;
    private int añoPubli;
    private String genero;
    private double precio = 12;
    private int stock = 100; 

    public Disco(String titulo, String artista, int añoPubli, String genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.añoPubli = añoPubli;
        this.genero = genero;

    }

    public Disco() {
    }

    

    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Disco{");
        sb.append("titulo=").append(titulo);
        sb.append(", artista=").append(artista);
        sb.append(", a\u00f1oPubli=").append(añoPubli);
        sb.append(", genero=").append(genero);
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    
    
}
