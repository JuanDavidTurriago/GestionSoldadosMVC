package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

import java.util.ArrayList;

public class Coronel extends Rango {

    String estrategia;
    private ArrayList<Coronel> coroneles;

    public Coronel(String nombre, String id, String rango, int nivel, String estrategia) {
        super(nombre, id, rango, nivel);
        this.estrategia = estrategia;
        this.coroneles = new ArrayList<>();
    }

    @Override
    public void realizarAccion() {

    }

    @Override
    public void saludar(String nombre, String saludo) {
        super.saludar(nombre, saludo);
    }

    @Override
    public void asignarMision(String mision) {

    }

    @Override
    public void reportarEstado(String estado) {

    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    public ArrayList<Coronel> getCoronel() {
        return coroneles;
    }

    public void setCoronel(Coronel coronel) {
        coroneles.add(coronel);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +
                ", ID: " + this.getId() +
                ", Rango: " + this.getRango() +
                ", Soldados bajo su mando: " + this.getEstrategia();
    }
}
