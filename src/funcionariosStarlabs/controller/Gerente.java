package funcionariosStarlabs.controller;

import funcionariosStarlabs.model.FuncionarioBase;

public class Gerente extends FuncionarioBase {

    public Gerente(int id, String nome, String cargo, double salario, String cpf) {
        super(id, nome, cargo, salario, cpf);
    }

}
