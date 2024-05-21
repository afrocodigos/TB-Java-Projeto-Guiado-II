package funcionariosBlackcoders;

public abstract class ConsultorBase implements FuncionarioInterface {
    protected String nome;
    protected String cargo;
    protected double salario;
    protected String cpf;
    protected String projeto;

    public ConsultorBase(String nome, String cargo, double salario, String cpf, String projeto) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.cpf = cpf;
        this.projeto = this.projeto;
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

    public String getProjeto() {
        return projeto;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }
}
