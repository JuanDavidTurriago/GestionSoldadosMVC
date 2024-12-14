package controlador;

import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorVentanaPrincipal implements ActionListener {
    private VentanaPrincipal ventanaPrincipal;

    public ControladorVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.ventanaPrincipal.setControlador(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "Crear":
                ventanaPrincipal.mostrarCrear();
                break;
            case "Modificar":
                ventanaPrincipal.mostrarModificar();
                break;
            case "AsignarMision":
                ventanaPrincipal.mostrarAsignarMision();
                break;
            case "AsignarEstado":
                ventanaPrincipal.mostrarAsignarEstado();
                break;
            case "Acciones":
                ventanaPrincipal.mostrarAcciones();
                break;
            case "RESET ALL":
                ventanaPrincipal.resetAll();
                break;
        }
    }
}
