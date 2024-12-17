package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

import java.util.ArrayList;

public class Teniente extends Rango {

    String unidad;
    private ArrayList<Teniente> tenientes;

    public Teniente(String nombre, String id, String rango, int nivel, String unidad) {
        super(nombre, id, rango, nivel);
        this.unidad = unidad;
        this.tenientes = new ArrayList<Teniente>();
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

    public ArrayList<Teniente> getTeniente() {
        return tenientes;
    }

    public void setTeniente(Teniente teniente) {
        tenientes.add(teniente);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +
                ", ID: " + this.getId() +
                ", Rango: " + this.getRango() +
                ", Unidad: " + this.getUnidad();
    }

}
