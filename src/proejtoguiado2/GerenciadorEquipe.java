package proejtoguiado2;



// Interface para gerenciar uma equipe
public interface GerenciadorEquipe {
    void adicionarRecurso(Recurso recurso);
    void removerRecurso(Recurso recurso);
    void adicionarAtividade(Atividade atividade);
}

// Classe para representar uma equipe
import java.util.ArrayList;
import java.util.List;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRecursos(List<Recurso> recursos) {
        this.recursos = recursos;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    @Override
    public String toString() {
        return "Equipe [nome=" + nome + ", recursos=" + recursos + ", atividades=" + atividades + ", getRecursos()="
                + getRecursos() + ", getAtividades()=" + getAtividades() + ", getNome()=" + getNome() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
    
    // getters e setters

