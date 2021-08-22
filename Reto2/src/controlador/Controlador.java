package controlador;
import modelo.Estudiante;
import modelo.Alumnos;
import vista.Consola;

public class Controlador {
    private Estudiante e;
    private Consola c;
    private Alumnos a;


    public Controlador(){
        c = new Consola();
        a = new Alumnos();
        Menu();
    }

    public static void main(String[] args) {
        Controlador c = new Controlador();
    }

    public void Menu(){
        int opcion = 0;
        String str, nombre, apellido, fechadenac, correoins, correoper, programa;
        long celular, telefono;
        String menu =   "INSTITUTO LA FLORESTA\n"+
                        "Seleccione tarea a realizar\n"+
                        "1. Ingresar estudiente\n"+
                        "2. Buscar estudiante\n"+
                        "3. Modificar estudiante\n"+
                        "4. Eliminar Estudiante\n"+
                        "5. Ver directorio de estudiantes\n"+
                        "6. Salir\n"+
                        "Opción: ";
        do {
            opcion = c.leerEntero(menu);
            switch(opcion){
                case 1:
                    c.mostrarMensaje("Ingresar estudiante");
                    nombre = c.leerString("Ingresar nombres:");
                    apellido = c.leerString("Ingresar apellidos:");
                    fechadenac = c.leerString("Ingresar fecha de nacimiento (YYYY-MM-DD):");
                    correoins = c.leerString("Ingresar correo institucional:");
                    correoper = c.leerString("Ingresar correo personal:");
                    try {
                        celular = c.leerLong("Ingresar número de celular:");
                    } catch (Exception e) {
                        System.out.println("Por favor inserte un numero. "+e);
                        break;
                    }
                    try {
                        telefono = c.leerLong("Ingresar número fijo:");
                    } catch (Exception e) {
                        System.out.println("Por favor inserte un numero. "+e);
                        break;
                    }
                    programa = c.leerString("Ingresar programa:");
                    e = a.buscarPorCorreoInstitucional(correoins);
                    if(e == null){
                        e = new Estudiante(nombre, apellido, fechadenac, correoins, correoper, celular, telefono, programa);
                        a.anadirEntrada(e);
                        c.mostrarMensaje("Se agrego el estudiante\n");
                    }else{
                        c.mostrarMensaje("Estudiante ya existe");
                    }
                    break;
                case 2:
                    c.mostrarMensaje("Buscar estudiante");
                    correoins = c.leerString("Ingresar correo institucional:");
                    e = a.buscarPorCorreoInstitucional(correoins);
                    if(e == null){
                        c.mostrarMensaje("Estudiante no encontrado");
                    }else{
                        str = "Informacion del estudiante\n";
                        str = str + "Nombres: ";
                        str = str + e.getNombre()+"\n";
                        str = str + "Apellidos: ";
                        str = str + e.getApellido()+"\n";
                        str = str + "Fecha nacimiento: ";
                        str = str + e.getFecheDeNacimiento()+"\n";
                        str = str + "Correo institucional: ";
                        str = str + e.getCorreoInstitucional()+"\n";
                        str = str + "Correo personal: ";
                        str = str + e.getCorreoPersonal()+"\n";
                        str = str + "Numero de telefono celular: ";
                        str = str + e.getCelular()+"\n";
                        str = str + "Numero de telefono fijo: ";
                        str = str + e.getTelefono()+"\n";
                        str = str + "Programa academico: ";
                        str = str + e.getPrograma()+"\n";
                        c.mostrarMensaje(str);
                    }
                    break;
                case 3:
                    c.mostrarMensaje("Modificar estudiante");
                    correoins = c.leerString("Ingresar correo institucional:");
                    e = a.buscarPorCorreoInstitucional(correoins);
                    if(e == null){
                        c.mostrarMensaje("Estudiante no encontrado\n");
                    }else{
                        e.setCorreoPersonal(c.leerString("Ingresar correo personal:"));
                        try {
                            e.setCelular(c.leerLong("Ingresar numero de celular:"));
                        } catch (Exception e) {
                            System.out.println("Por favor inserte un numero. "+e);
                        }
                        try {
                            e.setTelefono(c.leerLong("Ingresar numero fijo:"));
                        } catch (Exception e) {
                            System.out.println("Por favor inserte un numero. "+e);
                        }
                        e.setPrograma(c.leerString("Ingresar programa:"));
                        c.mostrarMensaje("Se modifico el estudiante");
                    }
                    break;
                case 4:
                    c.mostrarMensaje("Eliminar estudiante");    
                    correoins = c.leerString("Ingresar correo institucional: ");
                    e = a.buscarPorCorreoInstitucional(correoins);
                    if (e == null) {
                        c.mostrarMensaje("Estudiante no encontrado");
                    }else{
                        a.eliminarEntrada(e);
                        c.mostrarMensaje("Se elimino el estudiante");
                    }
                    break;
                case 5:
                    str = a.listarDirectorio();
                    c.mostrarMensaje(str);
                    break;
                case 6:
                    c.mostrarMensaje("Hasta pronto");
                    break;
                default:
                    c.mostrarMensaje("Opcion Incorrecta");
            }
        } while(opcion != 6);
    }
}
