package src.funcionariosStarlabs.model;

public enum Cargo {
    ENGENHEIRO("Engenheiro"),
    ARQUITETO("Arquiteto"),
    QA("QA"),
    GESTOR("Gestor");

    private final String cargo;

    Cargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }
}
