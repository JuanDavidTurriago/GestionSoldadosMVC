package militar.soldados;

public class Soldado {

    String nombre;
    String id;
    String rango;

    public Soldado(String nombre, String id, String rango) {
        this.nombre = nombre;
        this.id = id;
        this.rango = rango;
    }

    public void mostrarInformacion(String nombre, String id, String rango){

            System.out.println("Nombre: " + nombre);
            System.out.println("ID: " + id);
            System.out.println("Rango: " + rango);
    }

    public void patrullar(String rango) {

        if(rango.equals("Lider")){

        }if(rango.equals("SubLider")){

        }if(rango.equals("MedioLider")){

        }if(rango.equals("Lidertt")){

        }

    }

    public void saludar(String nombre,String saludo) {
        this.nombre = nombre;
        String lowerCaseNombre = nombre.toLowerCase();

        char primeraLetra = lowerCaseNombre.charAt(0);
        char ultimaLetra = lowerCaseNombre.charAt(lowerCaseNombre.length() - 1);

        if(primeraLetra==ultimaLetra){
            System.out.println(saludo);
        }else{
            System.out.println(saludo);
        }
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
}
