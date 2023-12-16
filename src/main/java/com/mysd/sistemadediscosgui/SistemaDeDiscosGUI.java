package com.mysd.sistemadediscosgui;

import Componentes.Artista;
import Componentes.Cancion;
import Componentes.Disco;
import GUI.Home;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Francis
 */
public class SistemaDeDiscosGUI {

    public static void main(String[] args) throws FileNotFoundException, IOException {
/**
        ObjectInputStream persistentArtista = new ObjectInputStream(new FileInputStream("Artistas.bin"));
        ObjectInputStream persistentCancion = new ObjectInputStream(new FileInputStream("Canciones.bin"));
        ObjectInputStream persistentDisco = new ObjectInputStream(new FileInputStream("Discos.bin"));
        
        
        try {
            Home.listaArtistas = (ArrayList<Artista>) persistentArtista.readObject();
            persistentArtista.close();
        } catch (Exception e) {
            
        }
        try {
            Home.listaCanciones = (ArrayList<Cancion>) persistentCancion.readObject();
            persistentCancion.close();
        } catch (Exception e) {
            
        }
        try {
            Home.listaDiscos = (ArrayList<Disco>) persistentDisco.readObject();
            persistentDisco.close();
        } catch (Exception e) {
          
        }
*/
        Home principal = new Home();
        principal.setResizable(false);
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);

/*       
        try {
            ObjectOutputStream serialArtistas = new ObjectOutputStream(new FileOutputStream("Artistas.bin"));
            ObjectOutputStream serialCanciones = new ObjectOutputStream(new FileOutputStream("Canciones.bin"));
            ObjectOutputStream serialDiscos = new ObjectOutputStream(new FileOutputStream("Discos.bin"));
            
            serialArtistas.writeObject(Home.listaArtistas);
            serialCanciones.writeObject(Home.listaCanciones);
            serialDiscos.writeObject(Home.listaDiscos);
            
            serialArtistas.close();
            serialCanciones.close();
            serialDiscos.close();
            
        } catch (Exception e) {
            System.out.println("Algo salio mal :|");
        }
*/
    }
}
