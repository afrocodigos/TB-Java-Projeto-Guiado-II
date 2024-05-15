package data;

import model.Programadores;

public class ArvoreProgramadores extends ArvoreDeFuncionarios<Programadores> {

    @Override
    public void adicionar(Programadores funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public Programadores buscar(String nome) {
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
