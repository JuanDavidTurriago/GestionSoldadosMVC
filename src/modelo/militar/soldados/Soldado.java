package modelo.militar.soldados;

public class Soldado {

    String nombre;
    String id;
    String rango;
    public String estado;
    public String mision;

    public Soldado(String nombre, String id, String rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }

    public String regañado(String rango) {

        if (rango.equals("Soldado")) {
             rango="Expulsar";
        }
        if (rango.equals("Teniente")) {
            rango="Soldado";
        }
        if (rango.equals("Capitan")) {
            rango="Teniente";
        }
        if (rango.equals("Coronel")) {
            rango="Capitan";
        }

        return rango;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado() {

        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }
}
