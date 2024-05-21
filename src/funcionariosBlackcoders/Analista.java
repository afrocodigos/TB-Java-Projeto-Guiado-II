package funcionariosBlackcoders;

public class Analista extends Desenvolvimento {
    public Analista(String nome, String cargo, double salario, String cpf, String departamento) {
        super(nome, cargo, salario, cpf, departamento);
    }

    public void criar() {
        System.out.println("Coordenador de Desenvolvimento criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario + ", Departamento: " + departamento);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do Analista atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("Analista removido com sucesso");
    }
}
