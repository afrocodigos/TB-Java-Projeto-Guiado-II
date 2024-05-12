package funcionariosBlackcoders;

import java.util.TreeSet;

public class CEO extends Executivo {

    public CEO(String nome, String cargo, double salario, String cpf, String departamento) {
        super(nome, cargo, salario, cpf, departamento);
    }

    public void criar() {
        System.out.println("CEO criado com sucesso");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario + ", Departamento: " + departamento);
    }

    public void atualizarDados(double novoSalario) {
        this.salario = novoSalario;
        System.out.println("Dados do CEO atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("CEO removido com sucesso");
    }

}