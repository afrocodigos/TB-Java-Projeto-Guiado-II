package rhIbalo.controller;
import rhIbalo.model.FuncBase;

public class VPDeEng extends FuncBase {

    public VPDeEng(String nome, String Cargo, double salario, String cpf) {
        super(nome, Cargo, salario, cpf);
    }

    public void criar() {
        System.out.println("VP de Engenharia criado com sucesso!");
    }

    public void ler() {
        System.out.println("Nome " + nome + ", Cargo: " + cargo + ", Salário: R$" + salario);
    }

    public void atualizarDados(double novoSalario, String novoCargo) {
        this.salario = novoSalario;
        this.cargo = novoCargo;
        System.out.println("Dados do VP atualizado com sucesso!");
    }

    public void remover() {
        System.out.println("VP removido com sucesso");
    }
}