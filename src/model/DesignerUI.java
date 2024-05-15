package model;

public class DesignerUI extends FuncionarioBase {

    public DesignerUI(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);

    }

    public void criar() {
        System.out.println("DesignerUI criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do DesignerUI atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("DesignerUI removido com sucesso");
    }
}
