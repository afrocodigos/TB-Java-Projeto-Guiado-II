package funcionariosBlackMoneySoftware.model;

public  class ArvoreCTO extends ArvoreDeFuncionarios<CTO> {
    @Override
    public void adicionarFuncionario(CTO funcionario) {
        super.adicionarFuncionario(funcionario);
    }

    @Override
    public CTO buscar(String nome) {
        return super.buscar(nome);
    }

    @Override
    public void removerFuncionario(String nome) {
        super.removerFuncionario(nome);
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
