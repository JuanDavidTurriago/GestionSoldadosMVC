package militar.soldados;

import modelo.militar.OperacionesMilitares;

public abstract class Rango extends Soldado implements OperacionesMilitares {

    int nivel;

    public Rango(String nombre,String id,String rango,int nivel) {
        super(nombre,id,rango);
        this.nivel = nivel;
    }


    public abstract void realizarAccion();


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
