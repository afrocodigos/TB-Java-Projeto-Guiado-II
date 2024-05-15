package data;

import model.AnalistaDeDados;

public class ArvoreAnalistaDeDados extends ArvoreDeFuncionarios<AnalistaDeDados> {

    @Override
    public void adicionar(AnalistaDeDados funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public AnalistaDeDados buscar(String nome) {
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

