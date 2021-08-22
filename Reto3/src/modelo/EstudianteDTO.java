package modelo;

import java.io.File;
import java.util.ArrayList;

import modelo.Persistencia.Archivo;
import modelo.Persistencia.EstudianteDAO;

public class EstudianteDTO {
    private EstudianteDAO estudiante;
    private ArrayList<Estudiante> grupo;
    private File file = new File("datos_estudiantes.dat");
    private Archivo archivo;

    public EstudianteDTO() {
        archivo = new Archivo(file);
        estudiante = new EstudianteDAO(archivo);
        grupo = new ArrayList<Estudiante>();
        grupo = archivo.leerArchivo(file);
    }

    public EstudianteDAO getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(EstudianteDAO estudiante) {
        this.estudiante = estudiante;
    }

    public ArrayList<Estudiante> getGrupos() {
        return grupo;
    }

    public void setGrupos(ArrayList<Estudiante> grupo) {
        this.grupo = grupo;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Archivo getArchivo() {
        return archivo;
    }

    public void setArchivo(Archivo archivo) {
        this.archivo = archivo;
    }
}
