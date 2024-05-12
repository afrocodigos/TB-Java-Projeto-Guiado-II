package model;

public class EspecialistaSI extends FuncionarioBase {

    public EspecialistaSI(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);

    }

    public void criar() {
        System.out.println("EspecialistaSI criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do EspecialistaSI atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("EspecialistaSI removido com sucesso");
    }

}
