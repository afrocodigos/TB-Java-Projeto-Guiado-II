package funcionariosBlackcoders;

public class CTO extends Executivo {

    public CTO(String nome, String cargo, double salario, String cpf, String departamento) {
    super(nome, cargo, salario, cpf, departamento);
}

    public void criar() {
        System.out.println("CTO criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario + ", Departamento: " + departamento);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do CTO atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("CTO removido com sucesso");
    }
}
