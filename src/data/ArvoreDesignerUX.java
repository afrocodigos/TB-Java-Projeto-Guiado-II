package data;

import model.DesignerUX;

public class ArvoreDesignerUX extends ArvoreDeFuncionarios<DesignerUX> {

    @Override
    public void adicionar(DesignerUX funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public DesignerUX buscar(String nome) {
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
