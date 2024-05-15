package model;

public class DesignerUX extends FuncionarioBase {

    public DesignerUX(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);

    }

    public void criar() {
        System.out.println("DesignerUX criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do DesignerUX atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("DesignerUX removido com sucesso");
    }
}
