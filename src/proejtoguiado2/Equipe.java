package proejtoguiado2;

// Classe para representar uma equipe
import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Recurso> recursos;
    private List<Atividade> atividades;
    // outros atributos relevantes
    
    public Equipe(String nome) {
        this.nome = nome;
        this.recursos = new ArrayList<>();
        this.atividades = new ArrayList<>();
    }
    
    public void adicionarRecurso(Recurso recurso) {
        this.recursos.add(recurso);
    }
    
    public void removerRecurso(Recurso recurso) {
        this.recursos.remove(recurso);
    }
    
    public void adicionarAtividade(Atividade atividade) {
        this.atividades.add(atividade);
    }
    
    public List<Recurso> getRecursos() {
        return recursos;
    }
    
    public List<Atividade> getAtividades() {
        return atividades;
    }
    
    public String getNome() {
        return nome;
    }
    
    // getters e setters
}
