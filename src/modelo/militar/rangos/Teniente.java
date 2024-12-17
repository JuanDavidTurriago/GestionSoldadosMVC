package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

public class Teniente extends Rango {

    String unidad;

    public Teniente(String nombre, String id, String rango, int nivel, String unidad) {
        super(nombre, id, rango, nivel);
        this.unidad = unidad;
    }


    @Override
    public void realizarAccion() {
        //aca va la logica para regañar al soldado

    }



    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    @Override
    public void asignarMision(String mision) {

    }

    @Override
    public void reportarEstado(String estado) {

    }
}
