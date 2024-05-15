package interf4ce;

import java.util.UUID;

public interface FuncionarioBaseInterface extends FuncionarioInterface {
    @Override
    String getNome();

    @Override
    void setNome(String nome);

    @Override
    String getCargo();

    @Override
    void setCargo(String cargo);

    @Override
    double getSalario();

    @Override
    void setSalario(double salario);

    @Override
    String getCpf();

    @Override
    void setCpf(String cpf);

    UUID getId();
}
