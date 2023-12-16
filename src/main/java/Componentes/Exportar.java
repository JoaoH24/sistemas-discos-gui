package Componentes;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author Francis
 */
public class Exportar {
// Métodos constructor
    public Exportar() {
    }

// Métodos especiales    
    public void crearArchivo(String nameFile) throws IOException{
        File archivo = new File(nameFile);
        try {
            if (archivo.createNewFile()) {
                System.out.println("Se creo el archivo de manera correcta");
            }
        } catch (Exception e) {
            System.out.println("No se pudo crear el archivo");
        }
    }
}
