package src.funcionariosStarlabs.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import src.funcionariosStarlabs.model.Funcionario;
import src.funcionariosStarlabs.model.NodeFuncionario;

public class ArvoreDeCargos {
    private List<Funcionario> funcionarios;

    public ArvoreDeCargos() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String cpf) {
        funcionarios = funcionarios.stream()
                .filter(funcionario -> !funcionario.getCpf().getCpf().equals(cpf))
                .collect(Collectors.toList());
    }
    

    public List<Funcionario> buscarFuncionariosPorCargo(String cargo) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.getCargo().getCargo().equals(cargo))
                .collect(Collectors.toList());
    }


    public List<Funcionario> buscarFuncionariosPorNome(String nome) {
        return funcionarios.stream()
                .filter(funcionario -> funcionario.getNome().contains(nome))
                .collect(Collectors.toList());
    }

    private NodeFuncionario root; // Declare and initialize the root variable

    public void filtrarPorNome(String nome) {
        List<Funcionario> funcionariosFiltrados = new ArrayList<>();
        filtrarPorNomeRecursivo(root, nome, funcionariosFiltrados);
        
        if (funcionariosFiltrados.isEmpty()) {
            System.out.println("Nenhum funcionário encontrado com o nome fornecido.");
        } else {
            System.out.println("-------------------------------------------");
            System.out.println("Funcionários encontrados com o nome '" + nome + "':");
            for (Funcionario funcionario : funcionariosFiltrados) {
                System.out.println(funcionario);
            }
            System.out.println("-------------------------------------------");
        }
    }

    private void filtrarPorNomeRecursivo(NodeFuncionario node, String nome, List<Funcionario> funcionariosFiltrados) {
        if (node != null) {
            filtrarPorNomeRecursivo(node.getLeftChild(), nome, funcionariosFiltrados);
            if (node.getFuncionario().getNome().toLowerCase().contains(nome.toLowerCase())) {
                funcionariosFiltrados.add(node.getFuncionario());
            }
            filtrarPorNomeRecursivo(node.getRightChild(), nome, funcionariosFiltrados);
        }
    }

}
