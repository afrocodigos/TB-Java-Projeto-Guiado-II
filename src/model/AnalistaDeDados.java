package model;

public class AnalistaDeDados extends FuncionarioBase {

    public AnalistaDeDados(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);

    }

    public void criar() {
        System.out.println("AnalistaDeDados criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do AnalistaDeDados atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("AnalistaDeDados removido com sucesso");
    }
}
