package funcionariosEvilCorp.gerenciamentoCargos;

import funcionariosEvilCorp.modelo.*;

public class ArvoreFuncionarioRoot {
    private FuncionarioNode root;

    public ArvoreFuncionarioRoot() {
        root = null;
    }

    private FuncionarioNode inserirRecursivo(FuncionarioNode node, Funcionario funcionario) {
        if (node == null) {
            return new FuncionarioNode(funcionario);
        }

        if (funcionario.getNome().compareTo(node.funcionario.getNome()) < 0) {
            node.leftChild = inserirRecursivo(node.leftChild, funcionario);
        } else if (funcionario.getNome().compareTo(node.getFuncionario().getNome()) > 0) {
            node.setRightChild(inserirRecursivo(node.getRightChild(), funcionario));
        }

        return node;
    }

    public void inserir(Funcionario funcionario) {
        root = inserirRecursivo(root, funcionario);
    }

    private Funcionario buscarRecursivo(FuncionarioNode node, String nome) {

        if (node == null || node.getFuncionario().getNome().equals(nome)) {
            return node == null ? null : node.getFuncionario();
        }

        if (nome.compareTo(node.getFuncionario().getNome()) < 0) {
            return buscarRecursivo(node.leftChild, nome);
        } else {
            buscarRecursivo(node.getRightChild(), nome);
        }

        return null;
    }

    public Funcionario buscar(String nome) {
        return buscarRecursivo(root, nome);
    }

    private FuncionarioNode removerRecursivo(FuncionarioNode node, String nome) {
        if (node == null) {
            return null;
        }

        if (nome.compareTo(node.funcionario.getCargo()) < 0) {
            node.leftChild = removerRecursivo(node.leftChild, nome);
        } else if (nome.compareTo(node.funcionario.getNome()) > 0) {
            node.setRightChild(removerRecursivo(node.getRightChild(), nome));
        } else {
            if (node.leftChild == null) {
                return node.getRightChild();
            } else if (node.getRightChild() == null) {
                return node.leftChild;
            }

            node.funcionario = minValue(node.getRightChild());
            node.setRightChild(removerRecursivo(node.getRightChild(), node.funcionario.getNome()));
        }
        return node;
    }

    public void remover(String nome) {
        root = removerRecursivo(root, nome);
    }

    private Funcionario minValue(FuncionarioNode node) {
        Funcionario menorFuncionario = node.funcionario;
        while (node.leftChild != null) {
            menorFuncionario = node.leftChild.funcionario;
            node = node.leftChild;
        }

        return menorFuncionario;
    }

    public void mostarDadosEmOrdem() {
        mostarDadosEmOrdemRecursivo(root);
    }

    private void mostarDadosEmOrdemRecursivo(FuncionarioNode node) {
        if (node != null) {
            mostarDadosEmOrdemRecursivo(node.leftChild);
            System.out.println(node.funcionario.getNome() + " - " + node.funcionario.getCargo());
            mostarDadosEmOrdemRecursivo(node.getRightChild());
        }
    }
}
