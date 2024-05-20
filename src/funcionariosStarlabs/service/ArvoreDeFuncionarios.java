package src.funcionariosStarlabs.service;

import java.util.ArrayList;
import java.util.List;
import src.funcionariosStarlabs.model.Funcionario;
import src.funcionariosStarlabs.model.NodeFuncionario;
import src.funcionariosStarlabs.model.Salario;

public class ArvoreDeFuncionarios {
    private NodeFuncionario root;

    public ArvoreDeFuncionarios() {
        this.root = null;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        this.root = adicionarRecursivo(this.root, funcionario);
    }

    private NodeFuncionario adicionarRecursivo(NodeFuncionario node, Funcionario funcionario) {
        if (node == null) {
            return new NodeFuncionario(funcionario);
        }

        int comparacao = funcionario.getNome().compareTo(node.getFuncionario().getNome());
        if (comparacao < 0) {
            node.setLeftChild(adicionarRecursivo(node.getLeftChild(), funcionario));
        } else if (comparacao > 0) {
            node.setRightChild(adicionarRecursivo(node.getRightChild(), funcionario));
        }

        return node;
    }

    public void removerFuncionario(String cpf) {
        this.root = removerRecursivo(this.root, cpf);
    }

    private NodeFuncionario removerRecursivo(NodeFuncionario node, String cpf) {
        if (node == null) {
            return null;
        }

        int comparacao = cpf.compareTo(node.getFuncionario().getCpf().getCpf());
        if (comparacao < 0) {
            node.setLeftChild(removerRecursivo(node.getLeftChild(), cpf));
        } else if (comparacao > 0) {
            node.setRightChild(removerRecursivo(node.getRightChild(), cpf));
        } else {
            // Caso 1: Nó sem filhos
            if (node.getLeftChild() == null && node.getRightChild() == null) {
                return null;
            }
            // Caso 2: Nó com apenas um filho
            if (node.getLeftChild() == null) {
                return node.getRightChild();
            }
            if (node.getRightChild() == null) {
                return node.getLeftChild();
            }
            // Caso 3: Nó com dois filhos
            NodeFuncionario sucessor = findMinNode(node.getRightChild());
            node.setFuncionario(sucessor.getFuncionario());
            node.setRightChild(removerRecursivo(node.getRightChild(), sucessor.getFuncionario().getCpf().getCpf()));
        }
        return node;
    }

    private NodeFuncionario findMinNode(NodeFuncionario node) {
        NodeFuncionario current = node;
        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current;
    }

    public void atualizarFuncionario(Funcionario funcionarioAtualizado) {
        atualizarRecursivo(this.root, funcionarioAtualizado);
    }

    private void atualizarRecursivo(NodeFuncionario node, Funcionario funcionarioAtualizado) {
        if (node != null) {
            if (node.getFuncionario().getCpf().getCpf().equals(funcionarioAtualizado.getCpf().getCpf())) {
                node.setFuncionario(funcionarioAtualizado);
            } else {
                atualizarRecursivo(node.getLeftChild(), funcionarioAtualizado);
                atualizarRecursivo(node.getRightChild(), funcionarioAtualizado);
            }
        }
    }

    public Funcionario buscarFuncionario(String cpf) {
        return buscarRecursivo(this.root, cpf);
    }

    private Funcionario buscarRecursivo(NodeFuncionario node, String cpf) {
        if (node == null) {
            return null;
        }

        int comparacao = cpf.compareTo(node.getFuncionario().getCpf().getCpf());
        if (comparacao < 0) {
            return buscarRecursivo(node.getLeftChild(), cpf);
        } else if (comparacao > 0) {
            return buscarRecursivo(node.getRightChild(), cpf);
        } else {
            return node.getFuncionario();
        }
    }

    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        listarRecursivo(root, funcionarios);
        return funcionarios;
    }
    
    private void listarRecursivo(NodeFuncionario node, List<Funcionario> funcionarios) {
        if (node != null) {
            listarRecursivo(node.getLeftChild(), funcionarios);
            Funcionario funcionario = node.getFuncionario();
            String nomeCompleto = funcionario.getNome();
            String primeiroNome = nomeCompleto.substring(0, 1).toUpperCase() + ".";
            String sobrenome = nomeCompleto.substring(nomeCompleto.lastIndexOf(" ") + 1).toUpperCase();
            String nomeFormatado = primeiroNome + " " + sobrenome;
            String cpf = funcionario.getCpf().getCpf();
            String cargo = funcionario.getCargo().getCargo().toUpperCase();
            String nivel = funcionario.getNivel().getNivelAsString().toUpperCase();
            double valorSalario = Salario.getSalarioByNivel(funcionario.getNivel().getNivelAsString());
    
            if (node == root) {
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.printf(" %-20s  %-19s  %-15s  %-15s  %-15s \n", "NOME", "CPF", "CARGO", "NÍVEL", "SALÁRIO");
                System.out.println("-------------------------------------------------------------------------------------------");
            }
    
            System.out.printf(" %-20s  %-19s  %-15s  %-15s  R$ %,9.2f \n", nomeFormatado, cpf, cargo, nivel, valorSalario);
    
            if (node.getRightChild() == null) {
                System.out.println("-------------------------------------------------------------------------------------------");
            }
    
            listarRecursivo(node.getRightChild(), funcionarios);
        }
    }
    
    public List<Funcionario> getFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        listarRecursivo(root, funcionarios);
        return funcionarios;
    }

    public boolean estaVazia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    
    
}
