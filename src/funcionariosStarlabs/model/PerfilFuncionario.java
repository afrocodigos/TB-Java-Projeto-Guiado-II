package funcionariosStarlabs.model;

import funcionariosStarlabs.controller.CLevel;

public class PerfilFuncionario extends ArvoreDeFuncionarios<CLevel> {
    @Override
    public void adicionar(CLevel funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public CLevel buscar(String nome) {
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
