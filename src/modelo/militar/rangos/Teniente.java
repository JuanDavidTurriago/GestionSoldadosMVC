package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

import java.util.ArrayList;

public class Teniente extends Rango {

    String unidad;
    private String patru;
    private String salu;
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

    public void patrullar(String nombre, String id) {

        int randomNumber = (int) (Math.random() * 3) + 1;

        System.out.println("El Teniente ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente");

        if(randomNumber == 1){
            patru = "El Teniente ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente \n " +
                    "Supervisar a los soldados rasos durante el patrullaje.";
        } else if (randomNumber == 2) {
            patru = "El Teniente ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente \n " +
                    "Coordinar las rutas de patrullaje y asignar sectores a cada grupo.";
        } else if (randomNumber == 3) {
            patru = "El Teniente ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente \n " +
                    "Actuar como punto de contacto entre los soldados y los rangos superiores.";
        }

    }


    public void saludar(String nombre) {

        String lowerCaseNombre = nombre.toLowerCase();

        char primeraLetra = lowerCaseNombre.charAt(0);
        char ultimaLetra = lowerCaseNombre.charAt(lowerCaseNombre.length() - 1);

        if(primeraLetra==ultimaLetra){
            salu = "¡Buenos días, mi capitán! Todo en orden en el sector asignado.";
        }else{
            salu = "¡Buenos días, soldados! Preparémonos para la inspección.";
        }
    }

    public String getPatru() {
        return patru;
    }

    public String getSalu() {
        return salu;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getUnidad() {
        return unidad;
    }

    @Override
    public void asignarMision(String mision) {
        this.mision = mision;
    }

    @Override
    public void reportarEstado(String estado) {
        this.estado = estado;
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
