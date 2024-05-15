package data;

import model.QA;

public class ArvoreQA extends ArvoreDeFuncionarios<QA> {

    @Override
    public void adicionar(QA funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public QA buscar(String nome) {
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