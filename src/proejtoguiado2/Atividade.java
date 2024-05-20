package proejtoguiado2;
// Classe para representar uma atividade do projeto
import java.util.HashMap;
import java.util.Map;

public class Atividade {
    private String descricao;
    private StatusAtividade status;
    private Map<String, String> observacoes; // Mapa de observações gerais sobre a atividade (usuário -> observação)
    // outros atributos relevantes
    
    // Enum para representar o status de uma atividade
    public enum StatusAtividade {
        NAO_INICIADA,
        EM_ANDAMENTO,
        CONCLUIDA
    }

    public Atividade(String descricao) {
        this.descricao = descricao;
        this.status = StatusAtividade.NAO_INICIADA;
        this.observacoes = new HashMap<>();
    }
    
    public StatusAtividade getStatus() {
        return status;
    }
    
    public void setStatus(StatusAtividade status) {
        this.status = status;
    }
    
    public void adicionarObservacao(String usuario, String observacao) {
        observacoes.put(usuario, observacao);
    }
    
    public Map<String, String> getObservacoes() {
        return observacoes;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    // getters e setters
}
