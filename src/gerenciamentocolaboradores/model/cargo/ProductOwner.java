package gerenciamentocolaboradores.model.cargo;

import gerenciamentocolaboradores.model.funcionario.FuncionarioBase;

/**
 * Classe que representa um Product Owner.
 * @author Diego Moura
 */
public class ProductOwner extends FuncionarioBase {

    public ProductOwner(String nome, String cpf, double salario) {
        super(nome, String.valueOf(Cargos.PO), cpf, salario);
    }
}
