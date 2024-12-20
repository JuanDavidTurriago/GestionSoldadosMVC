package controlador;

import modelo.militar.rangos.Capitan;
import modelo.militar.rangos.Coronel;
import modelo.militar.rangos.SoldadoRaso;
import modelo.militar.rangos.Teniente;
import vista.AsignarM;

import javax.swing.*;

public class ControladorMision {

    private AsignarM asignarM;
    private SoldadoRaso soldadoRaso;
    private Teniente teniente;
    private Capitan capitan;
    private Coronel coronel;

    public ControladorMision(AsignarM asignarM, SoldadoRaso soldadoRaso,Teniente teniente,Capitan capitan,Coronel coronel) {

        this.asignarM = asignarM;
        this.soldadoRaso = soldadoRaso;
        this.teniente = teniente;
        this.capitan = capitan;
        this.coronel = coronel;

        this.asignarM.setControlador(this);

        this.asignarM.agregarListener(e -> {
            asignarMision();
        });
    }

    public void asignarMision(){
        String id = asignarM.getjTextFieldID();
        String mision = asignarM.getjTextFieldMision();
        boolean encontrado = false;

        for (SoldadoRaso soldado : soldadoRaso.getSoldadosRasos()) {
            if (soldado.getId().equals(id)) {
                soldado.asignarMision(mision);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            for (Teniente teniente : teniente.getTeniente()) {
                if (teniente.getId().equals(id)) {
                    teniente.asignarMision(mision);
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            for (Capitan capitan : capitan.getCapitan()) {
                if (capitan.getId().equals(id)) {
                    capitan.asignarMision(mision);
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            for (Coronel coronel : coronel.getCoronel()) {
                if (coronel.getId().equals(id)) {
                    coronel.asignarMision(mision);
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Misión asignada correctamente.");
            asignarM.limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "ID no encontrado.");
        }
    }
}
