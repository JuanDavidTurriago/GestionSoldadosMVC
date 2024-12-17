package modelo.militar.soldados;

import java.util.ArrayList;

public class TodosLosSoldados {

    int nivel;
    String id;
    private ArrayList<TodosLosSoldados> todosLosSoldados;

    public TodosLosSoldados(String id, int nivel){
        this.nivel = nivel;
        this.id = id;
        this.todosLosSoldados = new ArrayList<>();
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<TodosLosSoldados> getTodosLosSoldados() {
        return todosLosSoldados;
    }

    public void setTodos(TodosLosSoldados todos) {
        todosLosSoldados.add(todos);
    }

    @Override
    public String toString() {
        return "Nivel: " + this.getNivel() +
                ", ID: " + this.getId();
    }
}
