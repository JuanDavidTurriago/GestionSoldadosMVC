package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

import java.util.ArrayList;

public class Coronel extends Rango {

    String estrategia;
    private String patru;
    private String salu;
    private ArrayList<Coronel> coroneles;

    public Coronel(String nombre, String id, String rango, int nivel, String estrategia) {
        super(nombre, id, rango, nivel);
        this.estrategia = estrategia;
        this.coroneles = new ArrayList<>();
    }

    @Override
    public void realizarAccion() {

    }

    public void patrullar(String nombre, String id) {

        int randomNumber = (int) (Math.random() * 3) + 1;

        System.out.println("El Coronel ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente");

        if(randomNumber == 1){
            patru = "El Coronel ("+ nombre + ") con numero de identificacion: (" + id + ")  debe hacer lo siguiente \n " +
                    "Supervisar las operaciones generales de patrullaje y evaluar su efectividad.";
        } else if (randomNumber == 2) {
            patru = "El Coronel ("+ nombre + ") con numero de identificacion: (" + id + ")  debe hacer lo siguiente \n " +
                    "Tomar decisiones de alto nivel sobre la reasignación de recursos o ajustes en las estrategias de vigilancia.";
        } else if (randomNumber == 3) {
            patru = "El Coronel ("+ nombre + ") con numero de identificacion: (" + id + ")  debe hacer lo siguiente \n " +
                    "Gestionar la comunicación y coordinación entre diferentes áreas o unidades.";
        }

    }

    public void saludar(String nombre) {

        String lowerCaseNombre = nombre.toLowerCase();

        char primeraLetra = lowerCaseNombre.charAt(0);
        char ultimaLetra = lowerCaseNombre.charAt(lowerCaseNombre.length() - 1);


        if(primeraLetra==ultimaLetra){
            salu = "¡Buenos días! Procedemos según las instrucciones.";
        }else{
            salu = "Coronel, asegúrese de que todas las unidades estén en posición.";
        }


    }

    public String getPatru() {
        return patru;
    }

    public String getSalu() {
        return salu;
    }

    @Override
    public void asignarMision(String mision) {
        this.mision = mision;
    }

    @Override
    public void reportarEstado(String estado) {
        this.estado = estado;
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
