package rhIbalo;


public class Cto extends FuncBase {

    public Cto(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);
    }

    public void criar() {
        System.out.println("CTO criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do CTO atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("CTO removido com sucesso");
    }
}
