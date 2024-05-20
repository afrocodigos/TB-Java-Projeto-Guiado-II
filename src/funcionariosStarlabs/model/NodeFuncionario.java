package src.funcionariosStarlabs.model;

public class NodeFuncionario {
    private Funcionario funcionario;
    private NodeFuncionario leftChild;
    private NodeFuncionario rightChild;

    public NodeFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.leftChild = null;
        this.rightChild = null;
    }

    // Getters e Setters
    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public NodeFuncionario getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(NodeFuncionario leftChild) {
        this.leftChild = leftChild;
    }

    public NodeFuncionario getRightChild() {
        return rightChild;
    }

    public void setRightChild(NodeFuncionario rightChild) {
        this.rightChild = rightChild;
    }
}
