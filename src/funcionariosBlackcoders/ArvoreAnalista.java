package funcionariosBlackcoders;

public class ArvoreAnalista extends ArvoreDeFuncionarios<Analista>{

    @Override
    public void adicionar(Analista funcionario) {
        super.adicionar(funcionario);
        System.out.println("Analista adicionado com sucesso!");
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
        System.out.println("\n==== Todos os Analistas ====");
        super.mostrarTodos();
    }

    @Override
    public void atualizarDados(String nome, double novoSalario, String novoCargo) {
        super.atualizarDados(nome, novoSalario, novoCargo);
        System.out.println("Analista atualizado com sucesso!");
    }
}
