package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

public class Coronel extends Rango {

    String estrategia;

    public Coronel(String nombre, String id, String rango, int nivel, String estrategia) {
        super(nombre, id, rango, nivel);
        this.estrategia = estrategia;
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
}
