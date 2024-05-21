package funcionariosBlackcoders;

public class ArvoreSupervisor extends ArvoreDeFuncionarios<Supervisor>{
    @Override
    public void adicionar(Supervisor funcionario) {
        super.adicionar(funcionario);
        System.out.println("Supervisor adicionado com sucesso!");
    }

    @Override
    public Supervisor buscar(String nome) {
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