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

    private NodeFuncionario removerRecursivo(NodeFuncionario nodeFuncionario, String nomeFuncionario){
        if (nodeFuncionario == null){
            return null;
        }
        if (nomeFuncionario.compareTo(nodeFuncionario.funcionario.getNomeFuncionario()) < 0){
            nodeFuncionario.leftChild = removerRecursivo(nodeFuncionario.leftChild, nomeFuncionario);
        }
        else if (nomeFuncionario.compareTo(nodeFuncionario.funcionario.getNomeFuncionario()) > 0){
            nodeFuncionario.rightChild = removerRecursivo(nodeFuncionario.rightChild, nomeFuncionario);
        }
        else {
            if (nodeFuncionario.leftChild == null){
                return nodeFuncionario.rightChild;
            }
            else if(nodeFuncionario.rightChild == null){
                return nodeFuncionario.leftChild;
            }

            nodeFuncionario.funcionario = achaMenorFuncionario(nodeFuncionario.rightChild);
            nodeFuncionario.rightChild = removerRecursivo(nodeFuncionario.rightChild, nodeFuncionario.funcionario.getNomeFuncionario());
        }

        return nodeFuncionario;
    }

    public void removerFuncionario(String nomeFuncionario){
        root = removerRecursivo(root, nomeFuncionario);
    }

    private FuncionarioBase achaMenorFuncionario(NodeFuncionario nodeFuncionario){
        FuncionarioBase menorFuncionario = nodeFuncionario.funcionario;

        while (nodeFuncionario.leftChild != null) {
            menorFuncionario = nodeFuncionario.leftChild.funcionario;
            nodeFuncionario = nodeFuncionario.leftChild;

        }

        return menorFuncionario;
    }
}
