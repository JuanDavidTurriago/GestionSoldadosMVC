package controlador;

import modelo.militar.rangos.Capitan;
import modelo.militar.rangos.Coronel;
import modelo.militar.rangos.SoldadoRaso;
import modelo.militar.rangos.Teniente;
import modelo.militar.soldados.TodosLosSoldados;
import vista.Acciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAcciones implements ActionListener {

    private Acciones acciones;
    private SoldadoRaso soldadoRaso;
    private Teniente teniente;
    private Capitan capitan;
    private Coronel coronel;
    private TodosLosSoldados todosLosSoldados;

    public ControladorAcciones(Acciones acciones, SoldadoRaso soldadoRaso,Teniente teniente,Capitan capitan,Coronel coronel,TodosLosSoldados todosLosSoldados) {

        this.acciones = acciones;
        this.soldadoRaso = soldadoRaso;
        this.teniente = teniente;
        this.capitan = capitan;
        this.coronel = coronel;
        this.todosLosSoldados = todosLosSoldados;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {
            case "Saludar":
                saludar();
                break;
            case "Patrullar":
                patrullar();
                break;
        }

    }

    public void saludar(){
        String id = acciones.getjTextFieldID();
        String saludo = "";

        for (TodosLosSoldados soldado : todosLosSoldados.getTodosLosSoldados()) {
            if (soldado.getId().equals(id)) {
                int nivel = soldado.getNivel();
                switch(nivel){
                    case 1:
                        for(SoldadoRaso raso : soldadoRaso.getSoldadosRasos()){
                            String nombre = raso.getNombre();
                            raso.saludar(nombre);
                            saludo = raso.getSalu();
                            JOptionPane.showMessageDialog(null, saludo);
                            break;
                        }
                        break;

                    case 2:
                        for (Teniente teniente : teniente.getTeniente()) {
                            String nombre = teniente.getNombre();
                            teniente.saludar(nombre);
                            saludo = teniente.getSalu();
                            JOptionPane.showMessageDialog(null, saludo);
                            break;
                        }
                        break;
                    case 3:
                        for (Capitan capitan : capitan.getCapitan()) {
                            String nombre = capitan.getNombre();
                            capitan.saludar(nombre);
                            saludo = capitan.getSalu();
                            JOptionPane.showMessageDialog(null, saludo);
                            break;
                        }
                        break;
                    case 4:
                        for (Coronel coronel : coronel.getCoronel()) {
                            String nombre = coronel.getNombre();
                            coronel.saludar(nombre);
                            saludo = coronel.getSalu();
                            JOptionPane.showMessageDialog(null, saludo);
                            break;
                        }
                        break;

                }

            }

        }


    }

    public void patrullar(){
        String id = acciones.getjTextFieldID();
        String patrullar = "";

        for (TodosLosSoldados soldado : todosLosSoldados.getTodosLosSoldados()) {
            if (soldado.getId().equals(id)) {
                int nivel = soldado.getNivel();
                switch(nivel){
                    case 1:
                        for(SoldadoRaso raso : soldadoRaso.getSoldadosRasos()){
                            String nombre = raso.getNombre();
                            raso.patrullar(nombre, id);
                            patrullar = raso.getPatru();
                            JOptionPane.showMessageDialog(null, patrullar);
                            break;
                        }
                        break;

                    case 2:
                        for (Teniente teniente : teniente.getTeniente()) {
                            String nombre = teniente.getNombre();
                            teniente.patrullar(nombre, id);
                            patrullar = teniente.getPatru();
                            JOptionPane.showMessageDialog(null, patrullar);
                            break;
                        }
                        break;

                    case 3:
                        for (Capitan capitan : capitan.getCapitan()) {
                            String nombre = capitan.getNombre();
                            capitan.patrullar(nombre, id);
                            patrullar = capitan.getPatru();
                            JOptionPane.showMessageDialog(null, patrullar);
                            break;
                        }
                        break;
                    case 4:
                        for (Coronel coronel : coronel.getCoronel()) {
                            String nombre = coronel.getNombre();
                            coronel.patrullar(nombre, id);
                            patrullar = coronel.getPatru();
                            JOptionPane.showMessageDialog(null, patrullar);
                            break;
                        }
                        break;

                }

            }
        }
    }


}
