package rhIbalo.model;


import rhIbalo.controller.Cto;

public class treeCto extends treesetFunc<Cto> {




    @Override
    public void adicionar(Cto funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public Cto buscar(String nome) {
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
