package entities;

import utils.FuncionarioBase;

public class FuncionarioDevOps extends FuncionarioBase {
    public FuncionarioDevOps(String nomeDevOps, String cpfDevOps){
        super(nomeDevOps, cpfDevOps);
        this.cargoFuncionario = "DevOps";
        this.salarioFuncionario = 12000;
    }
    public FuncionarioDevOps(String nomeDevOps, String cpfDevOps, String enderecoDevOps){
        super(nomeDevOps, cpfDevOps, enderecoDevOps);
        this.cargoFuncionario = "DevOps";
        this.salarioFuncionario = 12000;
    }

    @Override
    public void trabalhar(){
        System.out.println("Fazendo o deploy");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }
}
