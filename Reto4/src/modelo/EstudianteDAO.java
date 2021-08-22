package modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EstudianteDAO {
    PreparedStatement ps;
    Statement stmt;
    ResultSet rs;
    Connection con;
    Conexion connection = new Conexion();
    Estudiante e = new Estudiante();
    
    public boolean anadirEstudiante(Estudiante e){
        String sql = "INSERT INTO estudiantes (nombre, apellido, fechadenac, correoIns, correoPers, celular, telefono, programa) VALUES (?,?,?,?,?,?,?,?)";
        boolean r=false;
        try{
            con = connection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getFechadenac());
            ps.setString(4, e.getCorreoins());
            ps.setString(5, e.getCorreoper());
            ps.setLong(6, e.getCelular());
            ps.setLong(7, e.getTelefono());
            ps.setString(8, e.getPrograma());
            if(ps.executeUpdate()==1){
                r=true;
            }else{
                r=false;
            }
        }catch (Exception ex){
            
        }
        return r;
    }
    
    public Estudiante buscarEstudiante(String pCorreoIns){
        String nombre, apellido, fechadenac, correoins, correoper, programa;
        long celular, telefono;
        Estudiante e = new Estudiante();
        String sql = "SELECT * FROM estudiantes WHERE correoIns=?";
        try {
            con = connection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, pCorreoIns);
            rs = ps.executeQuery();
            while (rs.next()) {
                nombre = rs.getString(1);
                apellido = rs.getString(2);
                fechadenac = rs.getString(3);
                correoins = rs.getString(4);
                correoper = rs.getString(5);
                celular = rs.getLong(6);
                telefono = rs.getLong(7);
                programa = rs.getString(8);
                e = new Estudiante(nombre, apellido, fechadenac, correoins, correoper, celular, telefono, programa);
            }
        }catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore
                rs = null;
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException sqlEx) { } // ignore
                ps = null;
            }
        }
        return e;
    }
    
    public boolean editarEstudiante(Estudiante e){
        String sql = "UPDATE estudiantes SET correoPers=?, celular=?, telefono=?, programa=? WHERE correoIns='"+e.getCorreoins()+"'";
        boolean r = false;
        try {
            con = connection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, e.getCorreoper());
            ps.setLong(2, e.getCelular());
            ps.setLong(3, e.getTelefono());
            ps.setString(4, e.getPrograma());
            if(ps.executeUpdate()==1){
                r = true;
            }else{
                r = false;
            }
        }catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore
                rs = null;
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException sqlEx) { } // ignore
                ps = null;
            }
        }
        return r;
    }
    
    public boolean eliminarEstudiante(String pCorreoIns){
        boolean r=false;
        try {
            con = connection.getConnection();
            String sql = "DELETE FROM estudiantes WHERE correoIns=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,pCorreoIns);
            if(ps.executeUpdate()==1){
                r = true;
            }else{
                r = false;
            }
        }catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore
                rs = null;
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException sqlEx) { } // ignore
                ps = null;
            }
        }
        return r;
    }

    public String leerTodos(){
        String str="";
        try {
            con = connection.getConnection();
            ps = con.prepareStatement("SELECT * FROM estudiantes");
            rs = ps.executeQuery();
            int cont=0;
            while (rs.next()) {
                cont++;
                str += cont + ": ";
                str += rs.getString(1)+", ";
                str += rs.getString(2)+", ";
                str += rs.getString(3)+", ";
                str += rs.getString(4)+", ";
                str += rs.getString(5)+", ";
                str += rs.getLong(6)+", ";
                str += rs.getLong(7)+", ";
                str += rs.getString(8)+".\n";
            }
        }catch (SQLException ex){
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) { } // ignore
                rs = null;
            }
            if (ps != null) {
                try {
                    ps.close();
                } catch (SQLException sqlEx) { } // ignore
                ps = null;
            }
        }
        return str;
    }
}
