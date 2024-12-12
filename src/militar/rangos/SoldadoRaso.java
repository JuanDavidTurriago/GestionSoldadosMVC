package militar.rangos;

import modelo.militar.soldados.Rango;

public class SoldadoRaso extends Rango {


    public SoldadoRaso(String nombre, String id, String rango, int nivel) {
        super(nombre, id, rango, nivel);
    }

    @Override
    public void realizarAccion() {
        String accion = "Ejecutar las operaciones básicas de vigilancia y seguridad.";
    }

    @Override
    public void asignarMision(String mision) {

    }

    @Override
    public void reportarEstado(String estado) {

    }
}
