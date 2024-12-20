package controlador;

import modelo.militar.rangos.Capitan;
import modelo.militar.rangos.Coronel;
import modelo.militar.rangos.SoldadoRaso;
import modelo.militar.rangos.Teniente;
import vista.ModificarEstado;

import javax.swing.*;

public class ControladorEstado {

    private ModificarEstado estado;
    private SoldadoRaso soldadoRaso;
    private Teniente teniente;
    private Capitan capitan;
    private Coronel coronel;

    public ControladorEstado(ModificarEstado estado, SoldadoRaso soldadoRaso,Teniente teniente,Capitan capitan,Coronel coronel) {

        this.estado = estado;
        this.soldadoRaso = soldadoRaso;
        this.teniente = teniente;
        this.capitan = capitan;
        this.coronel = coronel;

        this.estado.setControlador(this);

        this.estado.agregarListener(e -> {
            asignarEstado();
        });
    }

    public void asignarEstado(){

        String id = estado.getjTextFieldID();
        String mision = estado.getjTextFieldAsignar();
        boolean encontrado = false;

        for (SoldadoRaso soldado : soldadoRaso.getSoldadosRasos()) {
            if (soldado.getId().equals(id)) {
                soldado.reportarEstado(mision);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            for (Teniente teniente : teniente.getTeniente()) {
                if (teniente.getId().equals(id)) {
                    teniente.reportarEstado(mision);
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            for (Capitan capitan : capitan.getCapitan()) {
                if (capitan.getId().equals(id)) {
                    capitan.reportarEstado(mision);
                    encontrado = true;
                    break;
                }
            }
        }

        if (!encontrado) {
            for (Coronel coronel : coronel.getCoronel()) {
                if (coronel.getId().equals(id)) {
                    coronel.reportarEstado(mision);
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, "Estado asignado correctamente.");
            estado.limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "ID no encontrado.");
        }
    }
}
