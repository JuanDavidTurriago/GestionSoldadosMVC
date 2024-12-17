package controlador;

import modelo.militar.rangos.Capitan;
import modelo.militar.rangos.Coronel;
import modelo.militar.rangos.SoldadoRaso;
import modelo.militar.rangos.Teniente;
import modelo.militar.soldados.TodosLosSoldados;
import vista.Crear;
import vista.VentanaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorVentanaPrincipal implements ActionListener {
    private VentanaPrincipal ventanaPrincipal;
    private Crear crear;
    private SoldadoRaso soldadoRaso;
    private Capitan capitan;
    private Teniente teniente;
    private Coronel coronel;
    private TodosLosSoldados todosLosSoldados;

    public ControladorVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.ventanaPrincipal.setControlador(this);
        this.crear = crear;
        this.soldadoRaso = new SoldadoRaso("", "", "", 1);
        this.teniente = new Teniente("","","",2,"");
        this.capitan = new Capitan("","","",3,"");
        this.coronel = new Coronel("","","",4,"");
        this.todosLosSoldados = new TodosLosSoldados("",0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "Crear":
                Crear crear = new Crear();
                ControladorCrearSoldado crearSoldado = new ControladorCrearSoldado(crear,soldadoRaso,teniente,capitan,coronel,todosLosSoldados);
                ventanaPrincipal.mostrarCrear(crear);
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
            case "Rango":
                ventanaPrincipal.rango();
                break;

        }
    }

//    private void actualizarListaSoldados() {
//
//        ArrayList<SoldadoRaso> soldadosRasos = crear.getSoldadosRasos();
//        ArrayList<Teniente> tenientes = crear.getTenientes();
//        ArrayList<Capitan> capitanes = crear.getCapitanes();
//        ArrayList<Coronel> coroneles = crear.getCoroneles();
//
//        String categoriaSeleccionada = (String) jComboBox1.getSelectedItem();
//        jPanel2.removeAll();
//
//        switch (categoriaSeleccionada) {
//            case "Soldado raso":
//                imprimirDatos.imprimirSoldadoRaso(soldadosRasos);
//                for (SoldadoRaso soldadoRaso : soldadosRasos) {
//                    if (soldadoRaso.getMision() == null) {
//                        soldadoRaso.asignarMision("Sin misión");
//                    }
//                    if (soldadoRaso.getEstado() == null) {
//                        soldadoRaso.setEstado("Sin estado");
//                    }
//                    JLabel label = new JLabel("ID: "+soldadoRaso.getId()+"      Nombre: "+soldadoRaso.getNombre());
//                    JLabel lab = new JLabel("Misión: "+soldadoRaso.getMision()+"      Estado: "+soldadoRaso.getEstado());
//                    JLabel sep = new JLabel("___________________________________");
//                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    jPanel2.add(label);
//                    jPanel2.add(lab);
//                    jPanel2.add(sep);
//                }
//                break;
//            case "Teniente":
//                for (Teniente teniente : tenientes) {
//                    if (teniente.getMision() == null) {
//                        teniente.asignarMision("Sin misión");
//                    }
//                    if (teniente.getEstado() == null) {
//                        teniente.setEstado("Sin estado");
//                    }
//                    JLabel label = new JLabel("ID: "+teniente.getId()+"      Nombre: "+teniente.getNombre());
//                    JLabel lab = new JLabel("Misión: "+teniente.getMision()+"      Estado: "+teniente.getEstado());
//                    JLabel uni = new JLabel("Unidad: "+teniente.getUnidad());
//                    JLabel sep = new JLabel("___________________________________");
//                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    uni.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    jPanel2.add(label);
//                    jPanel2.add(lab);
//                    jPanel2.add(uni);
//                    jPanel2.add(sep);
//                }
//                break;
//            case "Capitan":
//                for (Capitan capitan : capitanes) {
//                    if (capitan.getMision() == null) {
//                        capitan.asignarMision("Sin misión");
//                    }
//                    if (capitan.getEstado() == null) {
//                        capitan.setEstado("Sin estado");
//                    }
//                    JLabel label = new JLabel("ID: "+capitan.getId()+"      Nombre: "+capitan.getNombre());
//                    JLabel lab = new JLabel("Misión: "+capitan.getMision()+"      Estado: "+capitan.getEstado());
//                    JLabel sep = new JLabel("___________________________________");
//                    JLabel bajo = new JLabel("Soldados a cargo: "+ capitan.getCantidadSoldadosBajoSuMando());
//                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    bajo.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    jPanel2.add(label);
//                    jPanel2.add(lab);
//                    jPanel2.add(bajo);
//                    jPanel2.add(sep);
//                }
//                break;
//            case "Coronel":
//                for (Coronel coronel : coroneles) {
//                    if (coronel.getMision() == null) {
//                        coronel.asignarMision("Sin misión");
//                    }
//                    if (coronel.getEstado() == null) {
//                        coronel.setEstado("Sin estado");
//                    }
//                    JLabel label = new JLabel("ID: "+coronel.getId()+"      Nombre: "+coronel.getNombre());
//                    JLabel lab = new JLabel("Misión: "+coronel.getMision()+"      Estado: "+coronel.getEstado());
//                    JLabel sep = new JLabel("___________________________________");
//                    JLabel est = new JLabel("Estrategia: "+ coronel.getEstrategia());
//                    label.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    lab.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    sep.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    est.setAlignmentX(Component.CENTER_ALIGNMENT);
//                    jPanel2.add(label);
//                    jPanel2.add(lab);
//                    jPanel2.add(est);
//                    jPanel2.add(sep);
//                }
//                break;
//            default:
//                JLabel label = new JLabel("Seleccione una categoría válida");
//                jPanel2.add(label);
//                System.out.println("nada");
//                break;
//        }
//
//        jPanel2.revalidate();
//        jPanel2.repaint();
//    }

}
