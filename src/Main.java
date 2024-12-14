import vista.VentanaPrincipal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");

        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}