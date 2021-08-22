package modelo;

import java.io.Serializable;

public class Estudiante implements Serializable {
    private String nombre;
    private String apellido;
    private String fechadenacimiento;
    private String correoinstitucional;
    private String correopersonal;
    private long celular;
    private long telefono;
    private String programa;

    public Estudiante(String nombre, String apellido, String fechadenacimiento, String correoinstitucional,
            String correopersonal, long celular, long telefono, String programa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechadenacimiento = fechadenacimiento;
        this.correoinstitucional = correoinstitucional;
        this.correopersonal = correopersonal;
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

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getCorreoinstitucional() {
        return correoinstitucional;
    }

    public void setCorreoinstitucional(String correoinstitucional) {
        this.correoinstitucional = correoinstitucional;
    }

    public String getCorreopersonal() {
        return correopersonal;
    }

    public void setCorreopersonal(String correopersonal) {
        this.correopersonal = correopersonal;
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
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de nacimiento: " + fechadenacimiento
                + ", Correo institucional: " + correoinstitucional + ", Correo Personal: " + correopersonal
                + ", Celular: " + celular + ", Telefono: " + telefono + ", Programa: " + programa + ".\n";
    }
}
