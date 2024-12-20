package controlador;

import modelo.militar.rangos.Capitan;
import modelo.militar.rangos.Coronel;
import modelo.militar.rangos.SoldadoRaso;
import modelo.militar.rangos.Teniente;
import modelo.militar.soldados.TodosLosSoldados;
import vista.Crear;

public class ControladorCrearSoldado{
    private Crear crear;
    private SoldadoRaso soldadoRaso;
    private Teniente teniente;
    private Capitan capitan;
    private Coronel coronel;
    private TodosLosSoldados todosLosSoldados;


    public ControladorCrearSoldado(Crear crear, SoldadoRaso soldadoRaso,Teniente teniente,Capitan capitan,Coronel coronel, TodosLosSoldados todosLosSoldados) {

        this.crear = crear;
        this.soldadoRaso = soldadoRaso;
        this.teniente = teniente;
        this.capitan = capitan;
        this.coronel = coronel;
        this.todosLosSoldados = todosLosSoldados;

        this.crear.setControlador(this);

        this.crear.agregarListener(e -> {
            crearSoldado();
        });

    }

    public void crearSoldado() {
        String ID = crear.getID();
        String nombre = crear.getNombre();
        String unidad = crear.getjUnidad();
        String soldadosMando = crear.getSoldadosMando();
        String estrategia = crear.getEstrategia();
        String rango = crear.getRango();

        if (rango.equals("SoldadoRaso")) {

            for(TodosLosSoldados todos : todosLosSoldados.getTodosLosSoldados()){
                if(todos.getId().equals(ID)){
                    javax.swing.JOptionPane.showMessageDialog(null, "Por favor escriba un 'ID' valido.");
                    return;
                }
            }
            TodosLosSoldados todoLosSoldados = new TodosLosSoldados(ID,1);
            todosLosSoldados.setTodos(todoLosSoldados);

            SoldadoRaso nuevoSoldado = new SoldadoRaso(nombre, ID, "Soldado raso", 1);
            soldadoRaso.setSoldado(nuevoSoldado);

            javax.swing.JOptionPane.showMessageDialog(null, "Soldado creado con exito.");
            crear.limpiar();

        } else if (rango.equals("Teniente")) {

            for(TodosLosSoldados todos : todosLosSoldados.getTodosLosSoldados()){
                if(todos.getId().equals(ID)){
                    javax.swing.JOptionPane.showMessageDialog(null, "Por favor escriba un 'ID' valido.");
                    return;
                }
            }

            if (unidad == null || unidad.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Por favor ingrese un numero en unidad.");
                return;
            }
            TodosLosSoldados todoLosSoldados = new TodosLosSoldados(ID,2);
            todosLosSoldados.setTodos(todoLosSoldados);

            Teniente nuevoTeniente = new Teniente(nombre, ID, "Teniente", 2, unidad);
            teniente.setTeniente(nuevoTeniente);

            javax.swing.JOptionPane.showMessageDialog(null, "Soldado creado con exito.");
            crear.limpiar();

        } else if (rango.equals("Capitan")) {

            for(TodosLosSoldados todos : todosLosSoldados.getTodosLosSoldados()){
                if(todos.getId().equals(ID)){
                    javax.swing.JOptionPane.showMessageDialog(null, "Por favor escriba un 'ID' valido.");
                    return;
                }
            }

            if (soldadosMando == null || soldadosMando.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Por favor ingrese un numero en soldados bajo su mando.");
                return;
            }

            TodosLosSoldados todoLosSoldados = new TodosLosSoldados(ID,3);
            todosLosSoldados.setTodos(todoLosSoldados);

            Capitan nuevoCapitan = new Capitan(nombre, ID, "Capitan", 3, soldadosMando);
            capitan.setCapitan(nuevoCapitan);

            javax.swing.JOptionPane.showMessageDialog(null, "Soldado creado con exito.");
            crear.limpiar();

        }else if (rango.equals("Coronel")) {

            for(TodosLosSoldados todos : todosLosSoldados.getTodosLosSoldados()){
                if(todos.getId().equals(ID)){
                    javax.swing.JOptionPane.showMessageDialog(null, "Por favor escriba un 'ID' valido.");
                    return;
                }
            }

            if (estrategia == null || estrategia.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(null, "Por favor ingrese una estrategia.");
                return;
            }

            TodosLosSoldados todoLosSoldados = new TodosLosSoldados(ID,4);
            todosLosSoldados.setTodos(todoLosSoldados);

            Coronel nuevoCoronel = new Coronel(nombre, ID, "Coronel", 4,estrategia);
            coronel.setCoronel(nuevoCoronel);

            javax.swing.JOptionPane.showMessageDialog(null, "Soldado creado con exito.");
            crear.limpiar();

        }
    }
}
