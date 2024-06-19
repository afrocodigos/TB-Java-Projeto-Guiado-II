package src.funcionariosStarlabs.model;

public class Funcionario {
    private String nome;
    private Cpf cpf;
    private Cargo cargo;
    private Nivel nivel;
    private Salario salario;

    public Funcionario(String nome, Cpf cpf, Cargo cargo, Nivel nivel, Salario salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.nivel = nivel;
        this.salario = salario;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cpf getCpf() {
        return cpf;
    }

    public void setCpf(Cpf cpf) {
        this.cpf = cpf;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf.getValor() +
                ", cargo=" + cargo +
                ", nivel=" + nivel +
                ", salario=" + salario.getValor() +
                '}';
    }
}
