package gerenciamentocolaboradores.model.cargo;

import gerenciamentocolaboradores.model.funcionario.FuncionarioBase;

/**
 * Classe que representa um Líder Técnico.
 *  @author Diego Moura
 */
public class LiderTecnico extends FuncionarioBase {

    public LiderTecnico(String nome, String cpf, double salario) {
        super(nome, String.valueOf(Cargos.LT), cpf, salario);
    }
}
