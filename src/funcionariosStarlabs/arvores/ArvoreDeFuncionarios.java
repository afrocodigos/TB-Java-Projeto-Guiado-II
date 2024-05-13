package funcionariosStarlabs.arvores;
import funcionariosStarlabs.FuncionarioBase;

import java.util.TreeSet;

public class ArvoreDeFuncionarios<T extends FuncionarioBase> {

    private TreeSet<T> funcionarios;

    public ArvoreDeFuncionarios() {
        funcionarios = new TreeSet<>((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
    }

    public void adicionar(T funcionario) {
        try {
            funcionarios.add(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");
        } catch (NullPointerException e) {
            System.out.println("Erro: O funcionário fornecido é nulo");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao adicionar o funcionário: " + e.getMessage());
        }
    }

    public T buscar(String nome) {
        try {
            for (T funcionarioBase : funcionarios) {
                if (funcionarioBase.getNome().equals(nome)) {
                    return funcionarioBase; // retorno o funcionário encontrado
                }
            }
            System.out.println("Funcionário não existe na nossa base de dados");
        } catch (NullPointerException e) {
            System.out.println("Erro: O nome fornecido é nulo");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao buscar o funcionário: " + e.getMessage());
        }
        return null;
    }

    public void remover(String nome) {
        try {
            T funcionarioParaRemover = buscar(nome);
            if (funcionarioParaRemover != null) {
                funcionarios.remove(funcionarioParaRemover);
                System.out.println("Funcionário " + nome + " removido com sucesso!");
            } else {
                System.out.println(nome + " não foi encontrado na nossa base de dados");
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: O nome fornecido é nulo");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao remover o funcionário: " + e.getMessage());
        }
    }

    public void mostrarTodos() {
        try {
            if (funcionarios.isEmpty()) {
                System.out.println("Não há funcionários na nossa base de dados");
            } else {
                System.out.println("\n=== Todos os Funcionários ===");
                for (T funcionarioBase : funcionarios) {
                    System.out.println(funcionarioBase.getNome() + " - " + funcionarioBase.getCargo() + " - " + funcionarioBase.getSalario());
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao mostrar todos os funcionários: " + e.getMessage());
        }
    }

    public void atualizarDados(String nome, double novoSalario, String novoCargo) {
        try {
            T funcionarioParaAtualizar = buscar(nome);
            if (funcionarioParaAtualizar != null) {
                funcionarioParaAtualizar.setSalario(novoSalario);
                funcionarioParaAtualizar.setCargo(novoCargo);
                System.out.println("Dados do funcionário atualizados com sucesso!");
            } else {
                System.out.println("Funcionário não encontrado em nossa base!");
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: O nome fornecido é nulo");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao atualizar o funcionário: " + e.getMessage());
        }
    }

    protected void atualizarDados(String nome,double novoSalario) {

        try {
            T funcionarioParaAtualizar = buscar(nome);
            if (funcionarioParaAtualizar != null) {
                funcionarioParaAtualizar.setSalario(novoSalario);
                System.out.println("Dados do funcionário atualizados com sucesso!");
            } else {
                System.out.println("Funcionário não encontrado em nossa base!");
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: O nome fornecido é nulo");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao atualizar o funcionário: " + e.getMessage());
        }
    }
}