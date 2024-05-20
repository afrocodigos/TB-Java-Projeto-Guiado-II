package src.funcionariosStarlabs.model;

public class Nome {
    private String nome;
    private String sobrenome;

    public Nome(String nome, String sobrenome) {
        if (nome == null || nome.trim().isEmpty() || contemNumeros(nome)) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if (sobrenome == null || sobrenome.trim().isEmpty() || contemNumeros(sobrenome)) {
            throw new IllegalArgumentException("Sobrenome inválido");
        }

        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    private boolean contemNumeros(String texto) {
        for (char c : texto.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
}
