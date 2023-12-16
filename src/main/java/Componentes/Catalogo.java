package Componentes;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Francis
 */
public class Catalogo implements Serializable {
// Atributos
    
    private String nombreCatalago;
    private ArrayList<String> arregloDisco = new ArrayList<String>();
    private double precio;
    private int stock;

// Métodos constructores    

    public Catalogo(String nombreCatalago, double precio, int stock) {
        this.nombreCatalago = nombreCatalago;
        this.precio = precio;
        this.stock = stock;
    }

// Métodos accesores

    public void setNombreCatalago(String nombreCatalago) {
        this.nombreCatalago = nombreCatalago;
    }

    public void setArregloDisco(ArrayList<String> arregloDisco) {
        this.arregloDisco = arregloDisco;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getNombreCatalago() {
        return nombreCatalago;
    }

    public ArrayList<String> getArregloDisco() {
        return arregloDisco;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

// Métodos especiales    



}
