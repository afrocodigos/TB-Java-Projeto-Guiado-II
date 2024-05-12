package data;

import model.SuporteTecnico;

public class ArvoreSuporteTecnico extends ArvoreDeFuncionarios<SuporteTecnico> {

    @Override
    public void adicionar(SuporteTecnico funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public SuporteTecnico buscar(String nome) {
        return super.buscar(nome);
    }

    @Override
    public void remover(String nome) {
        super.remover(nome);
    }

    @Override
    public void mostrarTodos() {
        super.mostrarTodos();
    }

    @Override
    public void atualizarDados(String nome, double novoSalario, String novoCargo) {
        super.atualizarDados(nome, novoSalario, novoCargo);
    }
}
