package Componentes;

/**
 *
 * @author Francis
 */
public class Venta {
// Atributos
    private String codigoVenta;
    private Catalogo catalogoVenta;
    private float montoTotal;
    private String fechaVenta;

// Método constructor
    public Venta(String codigoVenta, Catalogo catalogoVenta, float montoTotal, String fechaVenta) {
        this.codigoVenta = codigoVenta;
        this.catalogoVenta = catalogoVenta;
        this.montoTotal = montoTotal;
        this.fechaVenta = fechaVenta;
    }

// Métodos accesores
    public void setCodigoVenta(String codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public void setCatalogoVenta(Catalogo catalogoVenta) {
        this.catalogoVenta = catalogoVenta;
    }

    public void setMontoTotal(float montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getCodigoVenta() {
        return codigoVenta;
    }

    public Catalogo getCatalogoVenta() {
        return catalogoVenta;
    }

    public float getMontoTotal() {
        return montoTotal;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }
    
}
