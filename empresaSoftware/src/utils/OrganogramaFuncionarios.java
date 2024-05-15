package utils;

import java.util.TreeSet;

public class OrganogramaFuncionarios {
    private TreeSet<FuncionarioBase> arvoreFuncionarios;

    public OrganogramaFuncionarios(){
        arvoreFuncionarios = new TreeSet<FuncionarioBase>((funcionario1,funcionario2) -> funcionario1.getCpfFuncionario().compareTo(funcionario2.getCpfFuncionario()));
        System.out.println("Organograma criado");
    }

    public void adicionarFuncionario(FuncionarioBase funcionario){
        arvoreFuncionarios.add(funcionario);
        System.out.printf("Funcionário de CPF %s adicionado ao organograma\n", funcionario.getCpfFuncionario());
    }

    public FuncionarioBase buscarFuncionario(String cpfFuncionario){
        for (FuncionarioBase funcionario : arvoreFuncionarios){
            if (funcionario.getCpfFuncionario().equals(cpfFuncionario)){
                return funcionario;
            }
        }
        System.out.printf("CPF %s não foi encontrado no organograma\n", cpfFuncionario);
        return null;
    }

    public void removerFuncionario(String cpfFuncionario){
        FuncionarioBase funcionarioDesligado = buscarFuncionario(cpfFuncionario);
        if(funcionarioDesligado != null){
            arvoreFuncionarios.remove(funcionarioDesligado);
            System.out.printf("Funcionário de CPF %s removido do organograma\n", cpfFuncionario);
        }
    }

    public void mostrarTodosFuncionarios(){
        System.out.println("Lista de funcionários cadastrados:");
        for (FuncionarioBase funcionario : arvoreFuncionarios){
            System.out.printf("Nome: %s (%s) - %s - R$ %.2f\n", funcionario.getNomeFuncionario(), funcionario.getCpfFuncionario(), funcionario.getCargoFuncionario(), funcionario.getSalarioFuncionario());
        }
    }

    public void atualizarFuncionario(String cpfFuncionario, String nomeFuncionario, String enderecoFuncionario, String cargoFuncionario){
        FuncionarioBase funcionarioAtualizado = buscarFuncionario(cpfFuncionario);
        if (funcionarioAtualizado != null){
            funcionarioAtualizado.setNomeFuncionario(nomeFuncionario);
            funcionarioAtualizado.setEnderecoFuncionario(enderecoFuncionario);
            System.out.printf("Nome e endereço do funcionário de CPF %s atualizado\n", cpfFuncionario);
        }
    }
}
