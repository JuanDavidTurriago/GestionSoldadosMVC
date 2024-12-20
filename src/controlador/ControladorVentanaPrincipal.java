package controlador;

import modelo.militar.rangos.Capitan;
import modelo.militar.rangos.Coronel;
import modelo.militar.rangos.SoldadoRaso;
import modelo.militar.rangos.Teniente;
import modelo.militar.soldados.TodosLosSoldados;
import vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ControladorVentanaPrincipal implements ActionListener {
    private VentanaPrincipal ventanaPrincipal;
    private Crear crear;
    private Modificar modificar;
    private SoldadoRaso soldadoRaso;
    private Capitan capitan;
    private Teniente teniente;
    private Coronel coronel;
    private TodosLosSoldados todosLosSoldados;

    public ControladorVentanaPrincipal(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.ventanaPrincipal.setControlador(this);
        this.crear = crear;
        this.modificar = modificar;
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
                Modificar modificar = new Modificar();
                ControladorModificarSoldado modificarSoldado = new ControladorModificarSoldado(modificar,soldadoRaso,teniente,capitan,coronel);
                ventanaPrincipal.mostrarModificar(modificar);
                break;
            case "AsignarMision":
                AsignarM mision = new AsignarM();
                ControladorMision controladorMision = new ControladorMision(mision,soldadoRaso,teniente,capitan,coronel);
                ventanaPrincipal.mostrarAsignarMision(mision);
                break;
            case "AsignarEstado":
                ModificarEstado estado = new ModificarEstado();
                ControladorEstado controladorEstado = new ControladorEstado(estado,soldadoRaso,teniente,capitan,coronel);
                ventanaPrincipal.mostrarAsignarEstado(estado);
                break;
            case "Acciones":
                Acciones acciones = new Acciones();
                ControladorAcciones controladorAcciones = new ControladorAcciones(acciones,soldadoRaso,teniente,capitan,coronel,todosLosSoldados);
                acciones.setControlador(controladorAcciones);
                ventanaPrincipal.mostrarAcciones(acciones);
                break;
            case "RESET ALL":
                    resetAll();
                break;
            case "Rango":
                String rango = ventanaPrincipal.getComboBoxRango();
                actualizarListaSoldados(rango);
                break;
        }
    }

    private void actualizarListaSoldados(String rango) {

        ArrayList<SoldadoRaso> soldadosRasos = soldadoRaso.getSoldadosRasos();
        ArrayList<String[]> listaSoldadosRasos = new ArrayList<>();

        for (SoldadoRaso raso : soldadosRasos) {

            String[] datos = {

                    raso.getId(),
                    raso.getNombre(),
                    raso.getMision(),
                    raso.getEstado()
            };

            if(datos[2]==null){
                soldadoRaso.setMision("Sin mision");
                datos[2]= soldadoRaso.getMision();
            }
            if(datos[3]==null){
                soldadoRaso.setEstado("Sin mision");
                datos[3]= soldadoRaso.getEstado();
            }

            listaSoldadosRasos.add(datos);
        }

        ArrayList<Teniente> tenientes = teniente.getTeniente();
        ArrayList<String[]> listaTenientes = new ArrayList<>();

        for (Teniente teniente1 : tenientes) {
            String[] datos = {

                    teniente1.getId(),
                    teniente1.getNombre(),
                    teniente1.getMision(),
                    teniente1.getEstado(),
                    teniente1.getUnidad()
            };

            if(datos[2]==null){
                teniente.setMision("Sin mision");
                datos[2]= teniente.getMision();
            }
            if(datos[3]==null){
                teniente.setEstado("Sin mision");
                datos[3]= teniente.getEstado();
            }

            listaTenientes.add(datos);
        }

        ArrayList<Capitan> capitanes = capitan.getCapitan();
        ArrayList<String[]> listaCapitanes = new ArrayList<>();

        for (Capitan capitan1 : capitanes) {

            String[] datos = {

                    capitan1.getId(),
                    capitan1.getNombre(),
                    capitan1.getMision(),
                    capitan1.getEstado(),
                    capitan1.getCantidadSoldadosBajoSuMando()
            };

            if(datos[2]==null){
                capitan.setMision("Sin mision");
                datos[2]= capitan.getMision();
            }
            if(datos[3]==null){
                capitan.setEstado("Sin mision");
                datos[3]= capitan.getEstado();
            }

            listaCapitanes.add(datos);
        }

        ArrayList<Coronel> coroneles = coronel.getCoronel();
        ArrayList<String[]> listaCoroneles = new ArrayList<>();

        for (Coronel coronel1 : coroneles) {

            String[] datos = {

                    coronel1.getId(),
                    coronel1.getNombre(),
                    coronel1.getMision(),
                    coronel1.getEstado(),
                    coronel1.getEstrategia()
            };

            if(datos[2]==null){
                coronel.setMision("Sin mision");
                datos[2]= coronel.getMision();
            }
            if(datos[3]==null){
                coronel.setEstado("Sin mision");
                datos[3]= coronel.getEstado();
            }

            listaCoroneles.add(datos);
        }
        ventanaPrincipal.rango(listaSoldadosRasos,listaTenientes,listaCapitanes,listaCoroneles,rango);
    }

    public void resetAll(){
        soldadoRaso.getSoldadosRasos().clear();
        teniente.getTeniente().clear();
        capitan.getCapitan().clear();
        coronel.getCoronel().clear();
        todosLosSoldados.getTodosLosSoldados().clear();
        javax.swing.JOptionPane.showMessageDialog(null, "TODOS LOS DATOS HAN SIDO ELIMINADOS.");
    }
}
