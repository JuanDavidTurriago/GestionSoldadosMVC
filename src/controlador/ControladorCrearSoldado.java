package controlador;

import modelo.militar.rangos.Capitan;
import modelo.militar.rangos.Coronel;
import modelo.militar.rangos.SoldadoRaso;
import modelo.militar.rangos.Teniente;
import modelo.militar.soldados.TodosLosSoldados;
import vista.Crear;
import java.util.ArrayList;

public class ControladorCrearSoldado{
    private Crear crear;
    private ArrayList<TodosLosSoldados> todosLosSoldados;
    private ArrayList<SoldadoRaso> soldadosRasos;
    private ArrayList<Teniente> tenientes;
    private ArrayList<Capitan> capitanes;
    private ArrayList<Coronel> coroneles;

    public ControladorCrearSoldado(Crear crear) {

        this.crear = crear;
        this.crear.setControlador(this);

        todosLosSoldados = new ArrayList<TodosLosSoldados>();
        soldadosRasos = new ArrayList<SoldadoRaso>();
        tenientes = new ArrayList<Teniente>();
        capitanes = new ArrayList<Capitan>();
        coroneles = new ArrayList<Coronel>();

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


        if (rango=="SoldadoRaso") {

            for(TodosLosSoldados todos : todosLosSoldados){
                if(todos.getId()==ID){
                    javax.swing.JOptionPane.showMessageDialog(null, "Por favor escriba un 'ID' valido.");
                    return;
                }
            }
            TodosLosSoldados todoLosSoldados = new TodosLosSoldados(ID,1);
            todosLosSoldados.add(todoLosSoldados);

            SoldadoRaso soldadoRaso = new SoldadoRaso(nombre, ID, "Soldado raso", 1);
            soldadosRasos.add(soldadoRaso);

            System.out.println(soldadosRasos);

        } else if (rango=="Teniente") {

            for(TodosLosSoldados todos : todosLosSoldados){
                if(todos.getId()==ID){
                    javax.swing.JOptionPane.showMessageDialog(null, "Por favor escriba un 'ID' valido.");
                    return;
                }
            }
            TodosLosSoldados todoLosSoldados = new TodosLosSoldados(ID,1);
            todosLosSoldados.add(todoLosSoldados);

            Teniente teniente = new Teniente(nombre, ID, "Teniente", 2, unidad);
            tenientes.add(teniente);

        } else if (rango=="Capitan") {

            for(TodosLosSoldados todos : todosLosSoldados){
                if(todos.getId()==ID){
                    javax.swing.JOptionPane.showMessageDialog(null, "Por favor escriba un 'ID' valido.");
                    return;
                }
            }

            if (soldadosMando=="") {
                javax.swing.JOptionPane.showMessageDialog(null, "Por favor ingrese un numero.");
                return;
            }

            TodosLosSoldados todoLosSoldados = new TodosLosSoldados(ID,1);
            todosLosSoldados.add(todoLosSoldados);

            Capitan capitan = new Capitan(nombre, ID, "Capitan", 3, soldadosMando);
            capitanes.add(capitan);

        }else if (rango=="Coronel") {

            for(TodosLosSoldados todos : todosLosSoldados){
                if(todos.getId()==ID){
                    javax.swing.JOptionPane.showMessageDialog(null, "Por favor escriba un 'ID' valido.");
                    return;
                }
            }
            TodosLosSoldados todoLosSoldados = new TodosLosSoldados(ID,1);
            todosLosSoldados.add(todoLosSoldados);

            Coronel coronel = new Coronel(nombre, ID, "Coronel", 4,estrategia);
            coroneles.add(coronel);
            //encontrado = true;
        }

    }
}
