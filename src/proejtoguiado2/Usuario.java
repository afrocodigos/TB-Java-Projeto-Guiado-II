package proejtoguiado2;

// Enum para representar os diferentes papéis


// Classe para representar um usuário com seu papel
public class Usuario {
    private String nome;
    private Papel papel;
}
    public Usuario(String nome, Papel papel) {
        this.nome = nome;
        this.papel = papel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Papel getPapel() {
        return papel;
    }

    public void setPapel(Papel papel) {
        this.papel = papel;
    }
    


