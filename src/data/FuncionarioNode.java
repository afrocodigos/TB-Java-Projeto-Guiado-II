package data;

import model.FuncionarioBase;

public class FuncionarioNode {
    FuncionarioBase funcionario;
    FuncionarioNode leftChild;
    FuncionarioNode rightChild;

    public FuncionarioNode(FuncionarioBase funcionario) {
        this.funcionario = funcionario;
        leftChild = null;
        rightChild = null;
    }
}
