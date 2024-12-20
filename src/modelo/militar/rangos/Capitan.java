package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

import java.util.ArrayList;

public class Capitan extends Rango {

    String cantidadSoldadosBajoSuMando;
    private String patru;
    private String salu;
    private ArrayList<Capitan> capitanes;

    public Capitan(String nombre, String id, String rango, int nivel, String cantidadSoldadosBajoSuMando) {
        super(nombre, id, rango, nivel);
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
        this.capitanes = new ArrayList<Capitan>();
    }

    @Override
    public void realizarAccion() {
        String accion = "Planificar y optimizar las operaciones de patrullaje en función de las necesidades estratégicas.";
    }

    public void patrullar(String nombre, String id) {

        int randomNumber = (int) (Math.random() * 3) + 1;

        System.out.println("El Capitan ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente");

        if(randomNumber == 1){
            patru = "El Capitan ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente \n " +
                    "Diseñar las estrategias de patrullaje para áreas críticas.";
        } else if (randomNumber == 2) {
            patru = "El Capitan ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente \n " +
                    "Evaluar informes de los tenientes y soldados rasos para identificar patrones o riesgos.";
        } else if (randomNumber == 3) {
            patru = "El Capitan ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente \n " +
                    "Asegurarse de que se cumplen los protocolos y procedimientos establecidos.";
        }

    }


    public void saludar(String nombre) {

        String lowerCaseNombre = nombre.toLowerCase();

        char primeraLetra = lowerCaseNombre.charAt(0);
        char ultimaLetra = lowerCaseNombre.charAt(lowerCaseNombre.length() - 1);

        if(primeraLetra==ultimaLetra){
            salu = "¡Buenos días, mi coronel! Patrullas desplegadas según las órdenes.";
        }else{
            salu = "¡Buenos días, equipo! Necesito un informe completo antes del mediodía.";
        }
    }

    public String getPatru() {
        return patru;
    }

    public String getSalu() {
        return salu;
    }

    public String getCantidadSoldadosBajoSuMando() {
        return cantidadSoldadosBajoSuMando;
    }

    public void setCantidadSoldadosBajoSuMando(String cantidadSoldadosBajoSuMando) {
        this.cantidadSoldadosBajoSuMando = cantidadSoldadosBajoSuMando;
    }

    @Override
    public void asignarMision(String mision) {
        this.mision = mision;
    }

    @Override
    public void reportarEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Capitan> getCapitan() {
        return capitanes;
    }

    public void setCapitan(Capitan capitan) {
        capitanes.add(capitan);
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() +
                ", ID: " + this.getId() +
                ", Rango: " + this.getRango() +
                ", Soldados bajo su mando: " + this.getCantidadSoldadosBajoSuMando();
    }
}
