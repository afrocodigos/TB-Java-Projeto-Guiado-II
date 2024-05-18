package gerenciamentocolaboradores.model.cargo;

import gerenciamentocolaboradores.model.funcionario.FuncionarioBase;

/**
 * Classe que representa um Designer, que pode ser UX ou UI.
 * @author Diego Moura
 */
public class Designer extends FuncionarioBase {

    public Designer(String nome, String cpf, double salario, Cargos cargo) {
        super(nome, cargo.toString(), cpf, salario);
    }
}
