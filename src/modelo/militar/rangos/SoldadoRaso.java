package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

import java.util.ArrayList;

public class SoldadoRaso extends Rango {

    private ArrayList<SoldadoRaso> soldadosRasos;

    public SoldadoRaso(String nombre, String id, String rango, int nivel) {
        super(nombre, id, rango, nivel);
        this.soldadosRasos = new ArrayList<SoldadoRaso>();
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

    public ArrayList<SoldadoRaso> getSoldadosRasos() {
        return soldadosRasos;
    }

    public void setSoldado(SoldadoRaso soldado) {
        soldadosRasos.add(soldado);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +
                ", ID: " + this.getId() +
                ", Rango: " + this.getRango();
    }
}
