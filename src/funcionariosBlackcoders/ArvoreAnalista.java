package funcionariosBlackcoders;

public class ArvoreAnalista extends ArvoreDeFuncionarios<Analista>{

    @Override
    public void adicionar(Analista funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public Analista buscar(String nome) {
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
