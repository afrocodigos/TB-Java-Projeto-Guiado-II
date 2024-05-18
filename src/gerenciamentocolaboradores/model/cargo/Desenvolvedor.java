package gerenciamentocolaboradores.model.cargo;

import gerenciamentocolaboradores.model.funcionario.FuncionarioBase;

/**
 * Classe que representa um Desenvolvedor, que pode ser BACKEND, FRONTEND ou MOBILE.
 * @author Diego Moura
 */
public class Desenvolvedor extends FuncionarioBase {

    public Desenvolvedor(String nome, String cpf, double salario, Cargos cargo) {
        super(nome, cargo.toString(), cpf, salario);
    }
}
