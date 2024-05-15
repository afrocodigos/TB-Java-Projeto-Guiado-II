package data;

import model.GerenteDeProjetos;

public class ArvoreGerenteDeProjetos extends ArvoreDeFuncionarios<GerenteDeProjetos> {

    @Override
    public void adicionar(GerenteDeProjetos funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public GerenteDeProjetos buscar(String nome) {
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

