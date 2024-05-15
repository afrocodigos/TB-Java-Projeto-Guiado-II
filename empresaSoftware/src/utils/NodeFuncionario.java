package utils;

public class NodeFuncionario{
    FuncionarioBase funcionario;
    NodeFuncionario leftChild;
    NodeFuncionario rightChild;

    public NodeFuncionario(FuncionarioBase funcionario){
        this.funcionario = funcionario;
        leftChild = null;
        rightChild = null;
    }
}
