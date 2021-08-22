package modelo.Persistencia;

import java.io.File;
import java.util.ArrayList;

import modelo.Estudiante;

public class EstudianteDAO {
    private Archivo archivo;

    public EstudianteDAO(Archivo archivo) {
        this.archivo = archivo;
    }

    public String leerTodos(File archivo) {
        ArrayList<Estudiante> grupo = this.archivo.leerArchivo(archivo);
        String str = "TODOS LOS CLIENTES\n";
        for (int i = 0; i < grupo.size(); i++) {
            str = str.concat(grupo.get(i) + "\n");
        }
        return str;
    }

    public Estudiante buscar(String pCor, ArrayList<Estudiante> grupo) {
        Estudiante c = null;
        if (!grupo.isEmpty()) {
            for (int i = 0; i < grupo.size(); i++) {
                if (grupo.get(i).getCorreoinstitucional().equals(pCor)) { // para string usar getXXX().equals(xxx)
                    c = grupo.get(i);
                }
            }
        }
        return c;
    }

    public boolean anadirEstudiante(Estudiante pEst, ArrayList<Estudiante> grupo, File pFile) {
        String ci = pEst.getCorreoinstitucional();
        Estudiante c = null;
        c = buscar(ci, grupo);
        if (c == null) {
            grupo.add(pEst);
            archivo.escribirArchivo(grupo, pFile);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarEstudiante(Estudiante pEst, ArrayList<Estudiante> grupo, File pFile) {
        String ci = pEst.getCorreoinstitucional();
        Estudiante c = null;
        c = buscar(ci, grupo);
        if (c != null) {
            grupo.remove(pEst);
            archivo.escribirArchivo(grupo, pFile);
            return true;
        } else {
            return false;
        }
    }
}
