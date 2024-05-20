package src.funcionariosStarlabs.model;

public class Nivel {
    private int nivel;
    private static final String[] NIVEIS = {"Estagiário", "Junior", "Pleno", "Senior", "Gestor"};

    public Nivel(int nivel) {
        if (nivel < 1 || nivel > NIVEIS.length) {
            throw new IllegalArgumentException("Nível inválido: " + nivel);
        }
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public String getNivelAsString() {
        return NIVEIS[nivel - 1];
    }
}
