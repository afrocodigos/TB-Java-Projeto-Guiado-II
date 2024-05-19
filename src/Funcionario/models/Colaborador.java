package Funcionario.models;

public class Colaborador {
    private int id;
    private String nome;
    private Area area;
    private Gestor gestor;

    public Colaborador(int id, String nome, Area area, Gestor gestor) {
        this.id = id;
        this.nome = nome;
        this.area = area;
        this.gestor = gestor;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    @Override
    public String toString() {
        return "Colaborador{id=" + id + ", nome='" + nome + "', area=" + area + ", gestor=" + gestor + "}";
    }
}
