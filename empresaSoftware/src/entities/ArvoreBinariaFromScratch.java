package entities;

public class ArvoreBinariaFromScratch {
    private NodeFuncionario root;
    public ArvoreBinariaFromScratch(){
        root = null;
    }

    private NodeFuncionario inserirRecursivo(NodeFuncionario nodeFuncionario, FuncionarioBase funcionario){
        if(nodeFuncionario == null){
            return new NodeFuncionario(funcionario);
        }
        if(funcionario.getNomeFuncionario().compareTo(nodeFuncionario.getNomeFuncionario()) < 0){
            nodeFuncionario.leftChild = inserirRecursivo(nodeFuncionario.leftChild, funcionario);
        }
        else if (funcionario.getNomeFuncionario().compareTo(nodeFuncionario.getNomeFuncionario()) > 0){
            nodeFuncionario.rightChild = inserirRecursivo(nodeFuncionario.rightChild, funcionario);
        }
        return nodeFuncionario;
    }

    private void inserirNodeFuncionario(FuncionarioBase funcionario){
        root = inserirRecursivo(root, funcionario);
    }

    private FuncionarioBase buscarRecursivo(NodeFuncionario nodeFuncionario, String nomeFuncionario){
        if (nodeFuncionario == null || nodeFuncionario.funcionario.getNomeFuncionario().equals(nomeFuncionario)){
            return nodeFuncionario == null ? null : nodeFuncionario.funcionario;
        }
        if (nomeFuncionario.compareTo(nodeFuncionario.funcionario.getNomeFuncionario()) < 0){
            return buscarRecursivo(nodeFuncionario.leftChild, nomeFuncionario);
        }
        else if (nomeFuncionario.compareTo(nodeFuncionario.funcionario.getNomeFuncionario()) > 0){
            return buscarRecursivo(nodeFuncionario.rightChild, nomeFuncionario);
        }
        return null;
    }

    public FuncionarioBase buscarFuncionario(String nomeFuncionario){
        return buscarRecursivo(root, nomeFuncionario);
    }
}
