package data;

import model.Devops;

public class ArvoreDevops extends ArvoreDeFuncionarios<Devops> {

    @Override
    public void adicionar(Devops funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public Devops buscar(String nome) {
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

