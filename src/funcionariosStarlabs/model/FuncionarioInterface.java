package funcionariosStarlabs.model;

public interface FuncionarioInterface {

    int getId();

    void setId(int id);

    String getNome();

    void setNome(String nome);

    String getCargo();

    void setCargo(String cargo);

    double getSalario();

    void setSalario(double salario);

    String getCpf();

    void setCpf(String cpf);
}