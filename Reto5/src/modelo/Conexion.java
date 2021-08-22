package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection con = null;

    public Conexion() {

    }

    public Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_estudiantes", "root", "1234");
            if (con != null) {

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
