package Componentes;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Francis
 */
public class Disco implements Serializable {
// Atributos
    
    private String codigoDisco;
    private String nombreDisco;
    private String artistaDisco;
    private int stock;
    private double precio;
    private ArrayList<Cancion> cancionDisco = new ArrayList<Cancion>(); 

// Método constructor

    public Disco(String codigoDisco, String nombreDisco, String artistaDisco, int stock, double precio) {
        this.codigoDisco = codigoDisco;
        this.nombreDisco = nombreDisco;
        this.artistaDisco = artistaDisco;
        this.stock = stock;
        this.precio = precio;
    }

// Métodos accesores

    public void setCodigoDisco(String codigoDisco) {
        this.codigoDisco = codigoDisco;
    }

    public void setNombreDisco(String nombreDisco) {
        this.nombreDisco = nombreDisco;
    }

    public void setArtistaDisco(String artistaDisco) {
        this.artistaDisco = artistaDisco;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCancionDisco(ArrayList<Cancion> cancionDisco) {
        this.cancionDisco = cancionDisco;
    }

    public String getCodigoDisco() {
        return codigoDisco;
    }

    public String getNombreDisco() {
        return nombreDisco;
    }

    public String getArtistaDisco() {
        return artistaDisco;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public ArrayList<Cancion> getCancionDisco() {
        return cancionDisco;
    }

// Métodos especiales
    
    public void agregarCancion(ArrayList<Cancion> nwCancion) {
        for (Cancion iter : nwCancion) {
            if(iter != null) {
                if (iter.getNombreDisco().equals(getNombreDisco()) && !(getCancionDisco().contains(iter))) {
                    getCancionDisco().add(iter);
                }
            }
        }
    }
}
