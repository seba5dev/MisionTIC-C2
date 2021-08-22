package modelo.Persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.Estudiante;

public class Archivo {
    private ObjectInputStream entrada;
    private ObjectOutputStream salida;

    public Archivo(File archivo) {
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

        }
    }

    public void escribirArchivo(ArrayList<Estudiante> grupo, File archivo) {
        try {
            salida = new ObjectOutputStream(new FileOutputStream(archivo));
            salida.writeObject(grupo);
            salida.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Estudiante> leerArchivo(File archivo) {
        ArrayList<Estudiante> grupo = new ArrayList<Estudiante>();
        if (archivo.length() != 0) {
            try {
                entrada = new ObjectInputStream(new FileInputStream(archivo));
                grupo = (ArrayList<Estudiante>) entrada.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return grupo;
    }

    public ObjectInputStream getEntrada() {
        return entrada;
    }

    public void setEntrada(ObjectInputStream entrada) {
        this.entrada = entrada;
    }

    public ObjectOutputStream getSalida() {
        return salida;
    }

    public void setSalida(ObjectOutputStream salida) {
        this.salida = salida;
    }
}
