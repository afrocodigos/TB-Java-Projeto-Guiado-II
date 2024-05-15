package model;

public class GerenteDeProjetos extends FuncionarioBase {

    public GerenteDeProjetos(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);

    }

    public void criar() {
        System.out.println("Gerente de Projetos criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do Gerente de Projetos atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("Gerente de Projetos removido com sucesso");
    }

}
