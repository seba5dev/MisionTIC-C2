package modelo;
import java.util.ArrayList;

public class Alumnos {
    private ArrayList<Estudiante> alumnos;

    public Alumnos(){
        alumnos = new ArrayList<Estudiante>();
    }

    //p = parametro
    //Est = Estudiante

    public void anadirEntrada(Estudiante e){
        alumnos.add(e);
    }

    public void eliminarEntrada(Estudiante e){
        alumnos.remove(e);
    }

    public Estudiante buscarPorCorreoInstitucional(String pCorreoInstitucional){
        Estudiante e = null;
        for(Estudiante i: alumnos){
            if(i.getCorreoInstitucional().equals(pCorreoInstitucional)){
                e = i;
                break;
            }
        }
        return e;
    }

    public String listarDirectorio(){
        String str = "Directorio de estudiantes: \n";
        for(Estudiante i:alumnos){
            str += i.toString();
        }
        str += "\n";
        return str;
    }
}
