package funcionariosStarlabs.controllers;

import funcionariosStarlabs.FuncionarioBase;

import java.util.ArrayList;
import java.util.List;

public class Gestor<T> extends FuncionarioBase  {

    private List<T> subordinados;

    public Gestor(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);
        this.subordinados = new ArrayList<>();
    }

    public void adicionarSubordinado(T subordinado) {
        try {
            if (subordinado == null) {
                System.out.println("Erro: O funcionário fornecido é nulo");
                return;
            }

            if (subordinados.contains(subordinado)) {
                System.out.println("O funcionário já é subordinado deste gestor.");
                return;
            }

            subordinados.add(subordinado);
            System.out.println("Funcionário adicionado como subordinado do gestor com sucesso!");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao adicionar o subordinado: " + e.getMessage());
        }
    }

    public void removerSubordinado(T subordinado) {
        try {
            if (subordinados.contains(subordinado)) {
                subordinados.remove(subordinado);
                System.out.println("Subordinado removido com sucesso!");
            } else {
                System.out.println("O funcionário não é subordinado deste gestor.");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao remover o subordinado: " + e.getMessage());
        }
    }

    public void mostrarSubordinados() {
        try {
            if (subordinados.isEmpty()) {
                System.out.println("Este gestor não tem subordinados.");
            } else {
                System.out.println("\nSubordinados do gestor " + this.getNome() + ":");
                for (T subordinado : subordinados) {
                    if (subordinado instanceof FuncionarioBase) {
                        FuncionarioBase funcionario = (FuncionarioBase) subordinado;
                        System.out.println(funcionario.getNome() + " - " + funcionario.getCargo() + " - " + funcionario.getSalario());
                    } else {
                        System.out.println("Erro: O tipo de objeto não é suportado para mostrar subordinados.");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao mostrar os subordinados: " + e.getMessage());
        }
    }

    public int contarSubordinados() {
        try {
            return subordinados.size();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao contar os subordinados: " + e.getMessage());
            return -1; // Retorna -1 em caso de erro
        }
    }

    public void addBonus (){
        double adicional= 500.00;

        if (contarSubordinados() >=1 ){
            double calAdicional= this.getSalario() + adicional;

            this.setSalario(calAdicional);
        }
    }

}
