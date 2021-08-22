package vista;

import controlador.Controlador;

import java.awt.*;
import javax.swing.*;

public class Interfaz extends JFrame {
    public JLabel lblNombre, lblApellido, lblCorreoIns, lblCorreoPer, lblFechaDeNac, lblPrograma, lblCelular,
            lblTelefono;
    public JTextField txtNombre, txtApellido, txtCorreoIns, txtCorreoPer, txtFechaDeNac, txtPrograma, txtCelular,
            txtTelefono;
    public JButton btnBuscar;

    public static void main(String[] args) {
        Controlador con = new Controlador();
    }

    public Interfaz() {
        this.setTitle("Instituto la Floresta");
        this.crearGUI();
        this.setVisible(true);
    }

    public void crearGUI() {
        lblNombre = new JLabel("Nombre");
        txtNombre = new JTextField();

        lblApellido = new JLabel("Apellido");
        txtApellido = new JTextField();

        lblFechaDeNac = new JLabel("Fecha de Nacimiento");
        txtFechaDeNac = new JTextField();

        lblCorreoIns = new JLabel("Corrreo Institucional");
        txtCorreoIns = new JTextField();

        lblCorreoPer = new JLabel("Correo Personal");
        txtCorreoPer = new JTextField();

        lblCelular = new JLabel("Celular");
        txtCelular = new JTextField();

        lblTelefono = new JLabel("Telefono");
        txtTelefono = new JTextField();

        lblPrograma = new JLabel("Programa");
        txtPrograma = new JTextField();

        this.btnBuscar = new JButton("Buscar");

        JPanel jp1 = new JPanel(new GridLayout(8, 2));

        jp1.add(lblNombre);
        jp1.add(txtNombre);
        jp1.add(lblApellido);
        jp1.add(txtApellido);
        jp1.add(lblFechaDeNac);
        jp1.add(txtFechaDeNac);
        jp1.add(lblCorreoIns);
        jp1.add(txtCorreoIns);
        jp1.add(lblCorreoPer);
        jp1.add(txtCorreoPer);
        jp1.add(lblCelular);
        jp1.add(txtCelular);
        jp1.add(lblTelefono);
        jp1.add(txtTelefono);
        jp1.add(lblPrograma);
        jp1.add(txtPrograma);

        JPanel jp2 = new JPanel(new GridLayout(1, 1));

        jp2.add(btnBuscar);

        Container cn = this.getContentPane();
        cn.setLayout(new BoxLayout(cn, BoxLayout.Y_AXIS));

        this.add(jp1);
        this.add(jp2);

        this.pack();

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public JTextField getTxTNombre() {
        return txtNombre;
    }

    public JTextField getTxTApellido() {
        return txtApellido;
    }

    public JTextField getTxTFechaDeNac() {
        return txtFechaDeNac;
    }

    public JTextField getTxtCorreoIns() {
        return txtCorreoIns;
    }

    public JTextField getTxTCorreoPer() {
        return txtCorreoPer;
    }

    public JTextField getTxTCelular() {
        return txtCelular;
    }

    public JTextField getTxTTelefono() {
        return txtTelefono;
    }

    public JTextField getTxTPrograma() {
        return txtPrograma;
    }

    public JButton getBtnBuscar() {
        return btnBuscar;
    }
}
