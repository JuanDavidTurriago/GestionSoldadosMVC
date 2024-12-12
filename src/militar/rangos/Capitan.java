package militar.rangos;

import modelo.militar.soldados.Rango;

public class Capitan extends Rango {

    int cantidadSoldadosBajoSuMando;

    public Capitan(String nombre, String id, String rango, int nivel) {
        super(nombre, id, rango, nivel);
    }

    @Override
    public void realizarAccion() {
        String accion = "Planificar y optimizar las operaciones de patrullaje en función de las necesidades estratégicas.";
    }

    public int getCantidadSoldadosBajoSuMando() {
        return cantidadSoldadosBajoSuMando;
    }

    public void setCantidadSoldadosBajoSuMando(int cantidadSoldadosBajoSuMando) {
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    @Override
    public void asignarMision(String mision) {

    }

    @Override
    public void reportarEstado(String estado) {

    }
}
