package entities;

import utils.FuncionarioBase;
import utils.OrganogramaFuncionarios;

public class FuncionarioEngSoft extends FuncionarioBase {
    public FuncionarioEngSoft(String nomeEngSoft, String cpfEngSoft){
        super(nomeEngSoft, cpfEngSoft);
        this.cargoFuncionario = "Engenheiro de software";
        this.salarioFuncionario = 12000;
    }
    public FuncionarioEngSoft(String nomeEngSoft, String cpfEngSoft, String enderecoEngSoft){
        super(nomeEngSoft, cpfEngSoft, enderecoEngSoft);
        this.cargoFuncionario = "Engenheiro de software";
        this.salarioFuncionario = 12000;
    }

    @Override
    public void trabalhar(){
        System.out.println("Fazendo o software");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }
}
