package entities;

import utils.FuncionarioBase;

public class FuncionarioDesign extends FuncionarioBase {
    public FuncionarioDesign(String nomeDesign, String cpfDesign){
        super(nomeDesign, cpfDesign);
        this.cargoFuncionario = "Designer";
        this.salarioFuncionario = 10000;
    }
    public FuncionarioDesign(String nomeDesign, String cpfDesign, String enderecoDesign){
        super(nomeDesign, cpfDesign, enderecoDesign);
        this.cargoFuncionario = "Designer";
        this.salarioFuncionario = 10000;
    }

    @Override
    public void trabalhar(){
        System.out.println("Fazendo o layout do projeto");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }
}
