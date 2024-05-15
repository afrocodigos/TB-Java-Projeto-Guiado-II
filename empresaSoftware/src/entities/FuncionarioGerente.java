package entities;

import utils.FuncionarioBase;

public class FuncionarioGerente extends FuncionarioBase {
    public FuncionarioGerente(String nomeGerente, String cpfGerente){
        super(nomeGerente, cpfGerente);
        this.cargoFuncionario = "Gerente";
        this.salarioFuncionario = 15000;
    }
    public FuncionarioGerente(String nomeGerente, String cpfGerente, String enderecoGerente){
        super(nomeGerente, cpfGerente, enderecoGerente);
        this.cargoFuncionario = "Gerente";
        this.salarioFuncionario = 15000;
    }

    @Override
    public void trabalhar(){
        System.out.println("Gerenciando o setor");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }
}
