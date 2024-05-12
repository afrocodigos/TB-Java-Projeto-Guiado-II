package data;

import model.DesignerUI;

public class ArvoreDesignerUI extends ArvoreDeFuncionarios<DesignerUI> {

    @Override
    public void adicionar(DesignerUI funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public DesignerUI buscar(String nome) {
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
