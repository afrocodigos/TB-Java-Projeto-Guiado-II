package entities;

import utils.FuncionarioBase;

public class FuncionarioDados extends FuncionarioBase {
    public FuncionarioDados(String nomeDados, String cpfDados){
        super(nomeDados, cpfDados);
        this.cargoFuncionario = "Analista de dados";
        this.salarioFuncionario = 11000;
    }
    public FuncionarioDados(String nomeDados, String cpfDados, String enderecoDados){
        super(nomeDados, cpfDados, enderecoDados);
        this.cargoFuncionario = "Analista de dados";
        this.salarioFuncionario = 11000;
    }

    @Override
    public void trabalhar(){
        System.out.println("Analisando os dados");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }
}
