package Componentes;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Francis
 */
public class Artista implements Serializable {
// Atributos
    
    private String dni;
    private String nombre;
    private String nacionalidad;
    private ArrayList<Disco> discosArtista = new ArrayList<Disco>();

// Método constructor
    
    public Artista(String dni, String nombre, String nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        }

// Métodos accesores
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDiscosArtista(ArrayList<Disco> discosArtista) {
        this.discosArtista = discosArtista;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public ArrayList<Disco> getDiscosArtista() {
        return discosArtista;
    }


// Métodos especiales
    
    public void agregarDisco(ArrayList<Disco> nwDisk) {
        if (nwDisk == null) {
            System.out.println("[!] No se detectaron discos Registrados");
            return;
        }

        for (Disco iter : nwDisk) {
            if (iter != null) {
                if (iter.getArtistaDisco().equals(getNombre()) && !(getDiscosArtista().contains(iter))) {
                    getDiscosArtista().add(iter);
                }
            }
        }
    }
}
