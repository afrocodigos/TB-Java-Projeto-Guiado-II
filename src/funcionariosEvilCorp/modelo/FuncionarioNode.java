package funcionariosEvilCorp.modelo;

public class FuncionarioNode {
    public Funcionario funcionario;
    public FuncionarioNode leftChild;
    FuncionarioNode rightChild;

    public FuncionarioNode(Funcionario funcionario) {
        this.funcionario = funcionario;
        leftChild = null;
        rightChild = null;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public FuncionarioNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(FuncionarioNode leftChild) {
        this.leftChild = leftChild;
    }

    public FuncionarioNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(FuncionarioNode rightChild) {
        this.rightChild = rightChild;
    }
}
