import controlador.ControladorVentanaPrincipal;
import vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {

        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

        ControladorVentanaPrincipal controlador = new ControladorVentanaPrincipal(ventana);

    }
}