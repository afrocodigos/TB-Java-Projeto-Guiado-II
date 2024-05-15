package model;

public class QA extends FuncionarioBase {

    public QA(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);

    }

    public void criar() {
        System.out.println("QA criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do QA atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("QA removido com sucesso");
    }

}

