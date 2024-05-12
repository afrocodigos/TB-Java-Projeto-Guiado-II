package data;

import model.EspecialistaSI;

public class ArvoreEspecialistaSI extends ArvoreDeFuncionarios<EspecialistaSI> {
    @Override
    public void adicionar(EspecialistaSI funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public EspecialistaSI buscar(String nome) {
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
