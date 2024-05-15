package model;

public class Devops extends FuncionarioBase {

    public Devops(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);
    }

    public void criar() {
        System.out.println("Devops criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do Devops atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("Devops removido com sucesso");
    }

}
