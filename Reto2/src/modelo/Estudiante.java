package modelo;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String fecheDeNacimiento;
    private String correoInstitucional;
    private String correoPersonal;
    private long celular;
    private long telefono;
    private String programa;

    public Estudiante(String nombre, String apellido, String fecheDeNacimiento, String correoInstitucional, String correoPersonal, long celular, long telefono,String programa){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecheDeNacimiento = fecheDeNacimiento;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.celular = celular;
        this.telefono = telefono;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFecheDeNacimiento() {
        return fecheDeNacimiento;
    }

    public void setFecheDeNacimiento(String fecheDeNacimiento) {
        this.fecheDeNacimiento = fecheDeNacimiento;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    @Override
    public String toString(){
        return "Nombre: "+nombre+", Apellido: "+apellido+", Fecha de nacimiento: "+fecheDeNacimiento+", Correo institucional: "+correoInstitucional+", Correo Personal: "+correoPersonal+", Celular: "+celular+", Telefono: "+telefono+", Programa: "+programa+".\n";
    }
}
