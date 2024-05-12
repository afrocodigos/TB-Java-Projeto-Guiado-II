package funcionariosBlackcoders;

public class Desenvolvimento extends FuncionarioBase {
    protected String departamento;

    public Desenvolvimento(String nome, String cargo, double salario, String cpf, String departamento) {
        super(nome, cargo, salario, cpf);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
