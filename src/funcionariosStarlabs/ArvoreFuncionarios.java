package funcionariosStarlabs;

public class ArvoreFuncionarios {
    private FuncionarioNode root;

    public ArvoreFuncionarios() {
        root = null;
    }

    private FuncionarioNode inserirRecursivo(FuncionarioNode node, FuncionarioBase funcionario) {
        if (node == null) {
            return new FuncionarioNode(funcionario);
        }

        if (funcionario.getNome().compareTo(node.funcionario.getNome()) < 0) {
            node.leftChild = inserirRecursivo(node.leftChild, funcionario);
        } else if (funcionario.getNome().compareTo(node.funcionario.getNome()) > 0) {
            node.rightChild = inserirRecursivo(node.rightChild, funcionario);
        }

        return node;
    }

    public void inserir(FuncionarioBase funcionario) {
        root = inserirRecursivo(root, funcionario);
    }

    private FuncionarioBase buscarRecursivo(FuncionarioNode node, String nome) {
        
        if (node == null || node.funcionario.getNome().equals(nome)) {
            return node == null ? null : node.funcionario;
        }

        if (nome.compareTo(node.funcionario.getNome()) < 0) {
            return buscarRecursivo(node.leftChild, nome);
        } else {
            buscarRecursivo(node.rightChild, nome);
        }
        
        return null;
    }

    public FuncionarioBase buscar(String nome) {
        return buscarRecursivo(root, nome);
    }


    private FuncionarioNode removerRecursivo(FuncionarioNode node, String nome) {
        if (node == null) {
            return null;
        }

        if (nome.compareTo(node.funcionario.getCargo()) < 0) {
            node.leftChild = removerRecursivo(node.leftChild, nome);
        } else if (nome.compareTo(node.funcionario.getNome()) > 0) {
            node.rightChild = removerRecursivo(node.rightChild, nome);
        } else {
            if (node.leftChild == null) {
                return node.rightChild;
                } else if (node.rightChild == null) {
                    return node.leftChild;
                }

            node.funcionario = minValue(node.rightChild);
            node.rightChild = removerRecursivo(node.rightChild, node.funcionario.getNome());
        }
        return node;
    }

    public void remover(String nome) {
        root = removerRecursivo(root, nome);
    }

    private FuncionarioBase minValue(FuncionarioNode node) {
        FuncionarioBase menorfuncionario = node.funcionario;
        while(node.leftChild != null) {
            menorfuncionario = node.leftChild.funcionario;
            node = node.leftChild;
        }

        return menorfuncionario;
    }

    public void mostarDadosEmOrdem() {
        mostarDadosEmOrdemRecursivo(root);
    }

    private void mostarDadosEmOrdemRecursivo(FuncionarioNode node) {
        if (node != null) {
            mostarDadosEmOrdemRecursivo(node.leftChild);
            System.out.println(node.funcionario.getNome() + " - " + node.funcionario.getCargo());
            mostarDadosEmOrdemRecursivo(node.rightChild);
        }
    }
}
