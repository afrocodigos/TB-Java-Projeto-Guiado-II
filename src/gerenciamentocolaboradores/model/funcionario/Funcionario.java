package gerenciamentocolaboradores.model.funcionario;

/**
 * Interface que define os métodos básicos que um funcionário deve implementar.
 * @author Diego Moura
 */
public interface Funcionario {

    String getNome();
    String getCargo();
    String getCpf();
    double getSalario();

    void setNome(String nome);
    void setCargo(String cargo);
    void setCpf(String cpf);
    void setSalario(double salario);
}