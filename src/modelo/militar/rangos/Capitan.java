package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

import java.util.ArrayList;

public class Capitan extends Rango {

    String cantidadSoldadosBajoSuMando;
    private ArrayList<Capitan> capitanes;

    public Capitan(String nombre, String id, String rango, int nivel, String cantidadSoldadosBajoSuMando) {
        super(nombre, id, rango, nivel);
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
        this.capitanes = new ArrayList<Capitan>();
    }

    @Override
    public void realizarAccion() {
        String accion = "Planificar y optimizar las operaciones de patrullaje en función de las necesidades estratégicas.";
    }

    public String getCantidadSoldadosBajoSuMando() {
        return cantidadSoldadosBajoSuMando;
    }

    public void setCantidadSoldadosBajoSuMando(String cantidadSoldadosBajoSuMando) {
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    @Override
    public void asignarMision(String mision) {

    }

    @Override
    public void reportarEstado(String estado) {

    }

    public ArrayList<Capitan> getCapitan() {
        return capitanes;
    }

    public void setCapitan(Capitan capitan) {
        capitanes.add(capitan);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +
                ", ID: " + this.getId() +
                ", Rango: " + this.getRango() +
                ", Soldados bajo su mando: " + this.getCantidadSoldadosBajoSuMando();
    }
}
