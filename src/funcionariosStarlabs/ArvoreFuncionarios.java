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
}
