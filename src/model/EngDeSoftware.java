package model;

public class EngDeSoftware extends FuncionarioBase {

    public EngDeSoftware(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);

    }

    public void criar() {
        System.out.println("EngDeSoftware criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do EngDeSoftware atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("EngDeSoftware removido com sucesso");
    }

}
