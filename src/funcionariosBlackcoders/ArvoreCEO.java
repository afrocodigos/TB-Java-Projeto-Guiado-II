package funcionariosBlackcoders;

public class ArvoreCEO extends ArvoreDeFuncionarios<CEO> {
    @Override
    public void adicionar(CEO funcionario) {
        super.adicionar(funcionario);
        System.out.println("CEO adicionado com sucesso!");
    }

    @Override
    public CEO buscar(String nome) {
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
