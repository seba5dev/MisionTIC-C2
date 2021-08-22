package modelo;

import java.util.ArrayList;

public class EstudianteDTO {
    private EstudianteDAO estudiante;
    private ArrayList<Estudiante> grupo;

    public EstudianteDTO(){
        estudiante = new EstudianteDAO();
        grupo = new ArrayList<Estudiante>();
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
}
