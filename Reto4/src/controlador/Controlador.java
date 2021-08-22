package controlador;

import modelo.Estudiante;
import vista.Consola;
import modelo.EstudianteDTO;

public class Controlador {
    private Estudiante e;
    private Consola c;
    private EstudianteDTO grupo;

    public static void main(String[] args) {
        Controlador c;
        c = new Controlador();
    }

    public Controlador() {
        c = new Consola();
        grupo = new EstudianteDTO();
        Menu();
    }

    public void Menu() {
        int opcion = 0;
        String nombre, apellido, fechadenacimiento, correoinstitucional, correopersonal, programa;
        long celular, telefono;
        Estudiante respuesta;
        String menu = "INSTITUTO LA FLORESTA\n" + "Seleccione tarea a realizar\n" + "1. Ingresar estudiante\n"
                + "2. Buscar estudiante\n" + "3. Modificar estudiante\n" + "4. Eliminar estudiante\n"
                + "5. Ver directorio de estudiantes\n" + "6. Salir\n" + "Opción: ";
        do {
            opcion = c.leerEntero(menu);
            switch (opcion) {
                case 1:
                    c.mostrarMensaje("Ingresar estudiante");
                    nombre = c.leerString("Ingresar nombres:");
                    apellido = c.leerString("Ingresar apellidos:");
                    fechadenacimiento = c.leerString("Ingresar fecha de nacimiento (YYYY-MM-DD):");
                    correoinstitucional = c.leerString("Ingresar correo institucional:");
                    correopersonal = c.leerString("Ingresar correo personal:");
                    try {
                        celular = c.leerLong("Ingresar número de celular:");
                    } catch (Exception e) {
                        celular = 0;
                    }
                    try {
                        telefono = c.leerLong("Ingresar número fijo:");
                    } catch (Exception e) {
                        telefono = 0;
                    }
                    programa = c.leerString("Ingresar programa:");
                    e = new Estudiante(nombre, apellido, fechadenacimiento, correoinstitucional, correopersonal, celular, telefono,
                            programa);
                    if (grupo.getEstudiante().anadirEstudiante(e)) {
                        c.mostrarMensaje("Se agrego el estudiante\n");
                    } else {
                        c.mostrarMensaje("Estudiante no anadido");
                    }
                    break;
                case 2:
                    c.mostrarMensaje("Buscar estudiante");
                    correoinstitucional = c.leerString("Ingresar correo institucional:");
                    respuesta = grupo.getEstudiante().buscarEstudiante(correoinstitucional);
                    if (respuesta != null) {
                        c.mostrarMensaje(respuesta.toString());
                    } else {
                        c.mostrarMensaje("Estudiante no encontrado");
                    }
                    break;
                case 3:
                    c.mostrarMensaje("Modificar estudiante");
                    correoinstitucional = c.leerString("Ingresar correo institucional:");
                    respuesta = grupo.getEstudiante().buscarEstudiante(correoinstitucional);
                    if (respuesta != null) {
                        nombre = respuesta.getNombre();
                        apellido = respuesta.getApellido();
                        fechadenacimiento = respuesta.getFechadenac();
                        correopersonal = c.leerString("Ingresar correo personal: ");
                        celular = c.leerLong("Ingresar celular: ");
                        telefono = c.leerLong("Ingresar telefono");
                        programa = c.leerString("Ingresar programa: ");
                        Estudiante e = new Estudiante(nombre, apellido, fechadenacimiento, correoinstitucional, correopersonal, celular,
                                telefono, programa);
                        grupo.getEstudiante().editarEstudiante(e);
                        c.mostrarMensaje("Estudiante modificado.");
                    } else {
                        c.mostrarMensaje("Estudiante no encontrado.");
                    }
                    break;
                case 4:
                    c.mostrarMensaje("Eliminar estudiante");
                    correoinstitucional = c.leerString("Ingresar correo institucional: ");
                    if (grupo.getEstudiante().eliminarEstudiante(correoinstitucional)) {
                        c.mostrarMensaje("Estudiante eliminado");
                    } else {
                        c.mostrarMensaje("Estudiante no encontrado");
                    }
                    break;
                case 5:
                    c.mostrarMensaje(grupo.getEstudiante().leerTodos());
                    break;
                case 6:
                    c.mostrarMensaje("Hasta pronto");
                    break;
                default:
                    c.mostrarMensaje("Opcion Incorrecta");
                    break;
            }
        } while (opcion != 6);
    }
}
