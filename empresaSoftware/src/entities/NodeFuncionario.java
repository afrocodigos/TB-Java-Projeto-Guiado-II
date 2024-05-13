package entities;

public class NodeFuncionario extends FuncionarioBase{
    FuncionarioBase funcionario;
    NodeFuncionario leftChild;
    NodeFuncionario rightChild;

    public NodeFuncionario(FuncionarioBase funcionario){
        super(funcionario.getNomeFuncionario(), funcionario.getCargoFuncionario(), funcionario.getSalarioFuncionario(), funcionario.getCpfFuncionario());
        this.funcionario = funcionario;
        leftChild = null;
        rightChild = null;
    }
}
