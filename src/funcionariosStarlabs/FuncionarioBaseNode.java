package funcionariosStarlabs;

public class FuncionarioBaseNode {
    FuncionarioBase funcionario;
    FuncionarioBaseNode leftChild;
    FuncionarioBaseNode rightChild;

    public FuncionarioBaseNode(FuncionarioBase funcionario) {
        this.funcionario = funcionario;
        leftChild = null;
        rightChild = null;
    }
}
