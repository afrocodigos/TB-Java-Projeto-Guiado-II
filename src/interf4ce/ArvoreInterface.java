package interf4ce;

import model.FuncionarioBase;

public interface ArvoreInterface<T extends FuncionarioBase> {
    void adicionar(T funcionario);

    default boolean existeFuncionario(T funcionario) {
        for (T f : funcionarios) {
            if (f.getNome().equals(funcionario.getNome()) && f.getCpf().equals(funcionario.getCpf())) {
                return true;
            }
        }
        return false;
    }

    T buscar(String nome);

    void remover(String nome);

    void mostrarTodos();

    void atualizarDados(String nome, double novoSalario, String novoCargo);
}
