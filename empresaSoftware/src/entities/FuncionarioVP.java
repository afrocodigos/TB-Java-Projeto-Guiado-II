package entities;

import utils.FuncionarioBase;

public class FuncionarioVP extends FuncionarioBase {
    public FuncionarioVP(String nomeVP, String cpfVP){
        super(nomeVP, cpfVP);
        this.cargoFuncionario = "VP";
        this.salarioFuncionario = 17000;
    }
    public FuncionarioVP(String nomeVP, String cpfVP, String enderecoVP){
        super(nomeVP, cpfVP, enderecoVP);
        this.cargoFuncionario = "VP";
        this.salarioFuncionario = 17000;
    }

    @Override
    public void trabalhar(){
        System.out.println("Chefiando o setor provisoriamente");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }
}
