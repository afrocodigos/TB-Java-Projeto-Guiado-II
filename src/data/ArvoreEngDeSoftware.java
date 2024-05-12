package data;

import model.EngDeSoftware;

public class ArvoreEngDeSoftware extends ArvoreDeFuncionarios<EngDeSoftware> {

    @Override
    public void adicionar(EngDeSoftware funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public EngDeSoftware buscar(String nome) {
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
