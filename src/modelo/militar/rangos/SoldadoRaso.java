package modelo.militar.rangos;

import modelo.militar.soldados.Rango;

import java.util.ArrayList;

public class SoldadoRaso extends Rango {

    private ArrayList<SoldadoRaso> soldadosRasos;
    private String patru;
    private String salu;

    public SoldadoRaso(String nombre, String id, String rango, int nivel) {
        super(nombre, id, rango, nivel);
        this.soldadosRasos = new ArrayList<SoldadoRaso>();
    }


    public void patrullar(String nombre, String id) {

        int randomNumber = (int) (Math.random() * 3) + 1;

        System.out.println("El soldado raso ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente");

        if(randomNumber == 1){
            patru= "El soldado raso ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente \n " +
                    "Patrullar áreas asignadas siguiendo rutas establecidas.";
        } else if (randomNumber == 2) {
            patru= "El soldado raso ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente \n " +
                    "Reportar incidentes observados durante el patrullaje.";
        } else if (randomNumber == 3) {
            patru= "El soldado raso ("+ nombre + ") con numero de identificacion: (" + id + ") debe hacer lo siguiente \n " +
                    "Realizar revisiones en puntos de control específicos.";
        }
    }

    public void saludar(String nombre) {

        String lowerCaseNombre = nombre.toLowerCase();

        char primeraLetra = lowerCaseNombre.charAt(0);
        char ultimaLetra = lowerCaseNombre.charAt(lowerCaseNombre.length() - 1);

        if(primeraLetra==ultimaLetra){
            salu = "¡Buenos días! soldado "+ nombre +" reportándose al servicio.";
        }else{
            salu = "¿Qué tal, compañero? Listo para el turno de patrulla.";
        }
    }

    public String getPatru() {
        return patru;
    }

    public String getSalu() {
        return salu;
    }

    @Override
    public void realizarAccion() {
        String accion = "Ejecutar las operaciones básicas de vigilancia y seguridad.";
    }

    @Override
    public void asignarMision(String mision) {
        this.mision = mision;
    }

    @Override
    public void reportarEstado(String estado) {
        this.estado = estado;
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
