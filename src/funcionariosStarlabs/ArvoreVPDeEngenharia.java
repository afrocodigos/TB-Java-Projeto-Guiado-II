package funcionariosStarlabs;

public class ArvoreVPDeEngenharia extends ArvoreDeFuncionarios<VPDeEngenharia> {
    
    @Override
    public void adicionar(VPDeEngenharia funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public VPDeEngenharia buscar(String nome) {
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
