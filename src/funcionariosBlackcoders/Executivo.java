package funcionariosBlackcoders;

public class Executivo extends FuncionarioBase {
    protected String departamento;

    public Executivo(String nome, String cargo, double salario, String cpf, String departamento) {
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
