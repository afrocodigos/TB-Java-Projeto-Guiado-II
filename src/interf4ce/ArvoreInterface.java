package interf4ce;

import model.FuncionarioBase;

public interface ArvoreInterface<T extends FuncionarioBase> {
    void adicionar(T funcionario);

    boolean existeFuncionario(T funcionario);

    T buscar(String nome);

    void remover(String nome);

    void mostrarTodos();

    void atualizarDados(String nome, double novoSalario, String novoCargo);
}
