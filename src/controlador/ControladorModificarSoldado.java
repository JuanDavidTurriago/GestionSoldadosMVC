package controlador;

import modelo.militar.rangos.Capitan;
import modelo.militar.rangos.Coronel;
import modelo.militar.rangos.SoldadoRaso;
import modelo.militar.rangos.Teniente;
import modelo.militar.soldados.TodosLosSoldados;
import vista.Crear;
import vista.Modificar;

import java.util.ArrayList;

public class ControladorModificarSoldado {

    private Modificar modificar;
    private SoldadoRaso soldadoRaso;
    private Teniente teniente;
    private Capitan capitan;
    private Coronel coronel;
    private TodosLosSoldados todosLosSoldados;

    public ControladorModificarSoldado(Modificar modificar, SoldadoRaso soldadoRaso,Teniente teniente,Capitan capitan,Coronel coronel, TodosLosSoldados todosLosSoldados) {

        this.modificar = modificar;
        this.soldadoRaso = soldadoRaso;
        this.teniente = teniente;
        this.capitan = capitan;
        this.coronel = coronel;
        this.todosLosSoldados = todosLosSoldados;

        this.modificar.setControlador(this);

        this.modificar.agregarListener(e -> {
            System.out.println("sirve");modificarSoldado();
        });

    }


    public void modificarSoldado() {
        String ID = modificar.getID();
        String nombre = modificar.getNombre();
        String unidad = modificar.getjUnidad();
        String soldadosMando = modificar.getSoldadosMando();
        String estrategia = modificar.getEstrategia();
        String rango = modificar.getRango();


        switch (rango){
            case "SoldadoRaso":
                ArrayList<SoldadoRaso> listaSoldadosRaso = soldadoRaso.getSoldadosRasos();

                for (SoldadoRaso raso : listaSoldadosRaso) {
                    if (raso.getId().equals(ID)) {
                        raso.setNombre(nombre);

                        break;
                    }
                }
                break;
            case "Teniente":
                ArrayList<Teniente> listaTeniente = teniente.getTeniente();

                for (Teniente teniente1 : listaTeniente) {
                    if (teniente1.getId().equals(ID)) {
                        teniente1.setNombre(nombre);
                        teniente1.setUnidad(unidad);

                        break;
                    }
                }


                break;
            case "Capitan":

                ArrayList<Capitan> listaCapitan = capitan.getCapitan();

                for (Capitan capitan1 : listaCapitan) {
                    if (capitan1.getId().equals(ID)) {
                        capitan1.setNombre(nombre);
                        capitan1.setCantidadSoldadosBajoSuMando(soldadosMando);

                        break;
                    }
                }
                break;
            case "Coronel":

                ArrayList<Coronel> listaCoronel = coronel.getCoronel();

                for (Coronel coronel1 : listaCoronel) {
                    if (coronel1.getId().equals(ID)) {
                        coronel1.setNombre(nombre);
                        coronel.setEstrategia(estrategia);

                        break;
                    }
                }
                break;
        }

    }

}
