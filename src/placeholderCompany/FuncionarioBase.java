package placeholderCompany;

public abstract class FuncionarioBase implements FuncionarioBaseInterface{
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

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario + ", CPF: " + cpf;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FuncionarioBase) {
            FuncionarioBase funcionario = (FuncionarioBase) obj;
            return this.cpf.equals(funcionario.getCpf());
        }
        return false;
    }
}