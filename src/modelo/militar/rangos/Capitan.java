package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

public class Capitan extends Rango {

    String cantidadSoldadosBajoSuMando;

    public Capitan(String nombre, String id, String rango, int nivel, String cantidadSoldadosBajoSuMando) {
        super(nombre, id, rango, nivel);
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
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
}
