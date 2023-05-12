
import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String apellidos;
    private String DNI;
    private String telf;
    private int saldo = 50;
    private ArrayList productosComprados = new ArrayList();

    public Cliente(String nombre, String apellidos, String DNI, String telf) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.telf = telf;
    }

    //FUNCIONES
    public boolean comprarDisco(Disco disco) {
        boolean hecho = false;
        if (disco.getStock() > 0 && saldo > disco.getPrecio())
        {
            disco.setStock(0);
            productosComprados.add(disco);
            hecho = true;
        }
        return hecho;
        
    }

    public void comprarPeli(Pelicula peli) {
        if (saldo > peli.getPrecio())
        {
            productosComprados.add(peli);
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", DNI=").append(DNI);
        sb.append(", telf=").append(telf);
        sb.append(", saldo=").append(saldo);
        sb.append('}');
        return sb.toString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

}
