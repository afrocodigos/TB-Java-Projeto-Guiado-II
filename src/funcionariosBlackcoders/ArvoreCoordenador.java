package funcionariosBlackcoders;

public class ArvoreCoordenador extends ArvoreDeFuncionarios<Coordenador> {
    @Override
    public void adicionar(Coordenador funcionario) {
        super.adicionar(funcionario);
        System.out.println("Coordenador adicionado com sucesso!");
    }

    @Override
    public Coordenador buscar(String nome) {
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
