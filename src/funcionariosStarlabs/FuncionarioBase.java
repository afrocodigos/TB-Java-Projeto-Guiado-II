package funcionariosStarlabs;

import funcionariosStarlabs.interfaces.FuncionarioBaseInterface;

public abstract class FuncionarioBase implements FuncionarioBaseInterface {

    protected String nome;
    protected String cargo;
    protected double salario;
    protected String cpf;

    public FuncionarioBase(String nome, String cargo, double salario, String cpf) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.cpf = cpf;
    }

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String getCargo() {
        return cargo;
    }
    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    @Override
    public double getSalario() {
        return salario;
    }
    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    @Override
    public String getCpf() {
        return cpf;
    }
    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}