package funcionariosStarlabs.arvores;

import funcionariosStarlabs.controllers.Gestor;


public class ArvoreGestor extends ArvoreDeFuncionarios<Gestor> {


    @Override
    public void adicionar(Gestor funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public Gestor buscar(String nome) {
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
    public void atualizarDados(String nome, double novoSalario) {
        super.atualizarDados(nome, novoSalario);
    }
}
