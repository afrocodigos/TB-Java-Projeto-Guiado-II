package entities;

import utils.FuncionarioBase;

public class FuncionarioQA extends FuncionarioBase {

    public FuncionarioQA(String nomeQA, String cpfQA){
        super(nomeQA, cpfQA);
        this.cargoFuncionario = "QA";
        this.salarioFuncionario = 11000;
    }
    public FuncionarioQA(String nomeQA, String cpfQA, String enderecoQA){
        super(nomeQA, cpfQA, enderecoQA);
        this.cargoFuncionario = "QA";
        this.salarioFuncionario = 11000;
    }

    @Override
    public void trabalhar(){
        System.out.println("Testando os critérios de qualidade do projeto");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }
}
