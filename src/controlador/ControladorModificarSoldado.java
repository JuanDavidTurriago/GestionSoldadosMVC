package controlador;

import modelo.militar.rangos.Capitan;
import modelo.militar.rangos.Coronel;
import modelo.militar.rangos.SoldadoRaso;
import modelo.militar.rangos.Teniente;
import vista.Modificar;

import javax.swing.*;
import java.util.ArrayList;

public class ControladorModificarSoldado {

    private Modificar modificar;
    private SoldadoRaso soldadoRaso;
    private Teniente teniente;
    private Capitan capitan;
    private Coronel coronel;

    public ControladorModificarSoldado(Modificar modificar, SoldadoRaso soldadoRaso,Teniente teniente,Capitan capitan,Coronel coronel) {

        this.modificar = modificar;
        this.soldadoRaso = soldadoRaso;
        this.teniente = teniente;
        this.capitan = capitan;
        this.coronel = coronel;

        this.modificar.setControlador(this);

        this.modificar.agregarListener(e -> {
            modificarSoldado();
        });
    }

    public void modificarSoldado() {
        String ID = modificar.getID();
        String nombre = modificar.getNombre();
        String unidad = modificar.getjUnidad();
        String soldadosMando = modificar.getSoldadosMando();
        String estrategia = modificar.getEstrategia();
        String rango = modificar.getRango();
        boolean encontrado = false;

        switch (rango) {
            case "SoldadoRaso":
                ArrayList<SoldadoRaso> listaSoldadosRaso = soldadoRaso.getSoldadosRasos();

                for (SoldadoRaso raso : listaSoldadosRaso) {
                    if (raso.getId().equals(ID)) {
                        raso.setNombre(nombre);
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Soldado modificado con exito.");
                    modificar.limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el soldado raso con el ID ingresado");
                }
                break;
            case "Teniente":
                ArrayList<Teniente> listaTeniente = teniente.getTeniente();

                for (Teniente teniente1 : listaTeniente) {
                    if (teniente1.getId().equals(ID)) {
                        teniente1.setNombre(nombre);
                        teniente1.setUnidad(unidad);
                        encontrado = true;
                        break;
                    }
                }
                if (encontrado) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Soldado modificado con exito.");
                    modificar.limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el teniente con el ID ingresado");
                }

                break;
            case "Capitan":

                ArrayList<Capitan> listaCapitan = capitan.getCapitan();

                for (Capitan capitan1 : listaCapitan) {
                    if (capitan1.getId().equals(ID)) {
                        capitan1.setNombre(nombre);
                        capitan1.setCantidadSoldadosBajoSuMando(soldadosMando);
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Soldado modificado con exito.");
                    modificar.limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el capitan con el ID ingresado");
                }
                break;
            case "Coronel":

                ArrayList<Coronel> listaCoronel = coronel.getCoronel();

                for (Coronel coronel1 : listaCoronel) {
                    if (coronel1.getId().equals(ID)) {
                        coronel1.setNombre(nombre);
                        coronel.setEstrategia(estrategia);
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Soldado modificado con exito.");
                    modificar.limpiar();
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el coronel con el ID ingresado");
                }
                break;
        }
    }
}
