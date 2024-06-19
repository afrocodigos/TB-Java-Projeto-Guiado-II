package src.funcionariosStarlabs.model;

public enum Nivel {
    ESTAGIARIO("Estagiário"),
    JUNIOR("Júnior"),
    PLENO("Pleno"),
    SENIOR("Sênior"),
    GESTOR("Gestor");

    private final String nivel;

    Nivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivelAsString() {
        return nivel;
    }
}
