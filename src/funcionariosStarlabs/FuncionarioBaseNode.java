package funcionariosStarlabs;

public class FuncionarioBaseNode implements java.io.Serializable{
    FuncionarioBase funcionario;
    FuncionarioBaseNode leftChild;
    FuncionarioBaseNode rightChild;

    public FuncionarioBaseNode(FuncionarioBase funcionario) {
        this.funcionario = funcionario;
        leftChild = null;
        rightChild = null;
    }
}
