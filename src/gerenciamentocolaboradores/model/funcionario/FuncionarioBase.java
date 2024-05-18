package gerenciamentocolaboradores.model.funcionario;

/**
 * Classe base que implementa a interface Funcionario e representa um funcionário.
 * @author Diego Moura
 */
public abstract class FuncionarioBase implements Funcionario {

    private String nome;
    private String cargo;
    private String cpf;
    private double salario;

    //region ...Constructor
    public FuncionarioBase(String nome, String cargo, String cpf, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.salario = salario;
    }
    //endregion

    //region ...Getter and Setters
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }
    //endregion

    //region ...toString
    @Override
    public String toString() {
        return "FuncionarioBase{" +
                "nome= '" + nome + '\'' +
                ", cargo= '" + cargo + '\'' +
                ", cpf= '" + cpf + '\'' +
                ", salario= " + salario +
                '}';
    }
    //endregion
}