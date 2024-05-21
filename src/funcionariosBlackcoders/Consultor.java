package funcionariosBlackcoders;

public class Consultor extends ConsultorBase {
    public Consultor(String nome, String cargo, double salario, String cpf, String projeto) {
        super(nome, cargo, salario, cpf, projeto);
    }

    public void criar() {
        System.out.println("Consultor de Desenvolvimento criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario + ", Projeto: " + projeto);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do Consultor atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("Consultor removido com sucesso");
    }
}
