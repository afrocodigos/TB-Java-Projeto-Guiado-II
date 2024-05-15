package entities;

import utils.FuncionarioBase;

public class FuncionarioCLevel extends FuncionarioBase {
    public FuncionarioCLevel(String nomeCLevel, String cpfCLevel){
        super(nomeCLevel, cpfCLevel);
        this.cargoFuncionario = "C-Level";
        this.salarioFuncionario = 20000;
    }
    public FuncionarioCLevel(String nomeCLevel, String cpfCLevel, String enderecoCLevel){
        super(nomeCLevel, cpfCLevel, enderecoCLevel);
        this.cargoFuncionario = "C-Level";
        this.salarioFuncionario = 20000;
    }

    @Override
    public void trabalhar(){
        System.out.println("Chefiando o setor");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }

    public void demitir(){
        System.out.println("Você está demitido!");
    }
}
