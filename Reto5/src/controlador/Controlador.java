package controlador;

import modelo.Estudiante;
import modelo.EstudianteDTO;
import vista.Interfaz;
import java.awt.event.*;

public class Controlador implements ActionListener {
    private EstudianteDTO grupo;
    private Interfaz gui;
    private Estudiante estudiante;

    public Controlador() {
        grupo = new EstudianteDTO();
        gui = new Interfaz();
        gui.getBtnBuscar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gui.btnBuscar) {
            estudiante = this.grupo.getEstudiante().buscarEstudiante(this.gui.getTxtCorreoIns().getText());
            this.gui.getTxTNombre().setText(estudiante.getNombre());
            this.gui.getTxTApellido().setText(estudiante.getApellido());
            this.gui.getTxTFechaDeNac().setText(estudiante.getFechadenac());
            this.gui.getTxtCorreoIns().setText(estudiante.getCorreoins());
            this.gui.getTxTCorreoPer().setText(estudiante.getCorreoper());
            this.gui.getTxTCelular().setText(estudiante.getCelularString());
            this.gui.getTxTTelefono().setText(estudiante.getTelefonoString());
            this.gui.getTxTPrograma().setText(estudiante.getPrograma());
        }
    }
}
