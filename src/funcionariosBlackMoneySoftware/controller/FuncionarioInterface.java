package funcionariosBlackMoneySoftware.controller;

public interface FuncionarioInterface {
    String getNome();
    void setNome(String nome);
    String getCargo();
    void setCargo(String cargo);
    double getSalario();
    void setSalario(double salario);
    String getCpf();
    void setCpf(String cpf);

    String getSenha();

    void setSenha(String senha);

    String getLogin();
    void setLogin(String login);
}
