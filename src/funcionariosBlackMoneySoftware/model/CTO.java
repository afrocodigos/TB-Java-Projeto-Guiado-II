// CTO.java
package funcionariosBlackMoneySoftware.model;

public class CTO extends FuncionarioBase {
    private static final String NOME = "Lucas Teles";
    private static final String CARGO = "CTO";
    private static final String CPF = "123456";
    private static final String LOGIN = "rootCTO";
    private static final String SENHA = "Cto@123123";
    private static final double SALARIO = 29999.00;

    public CTO() {
        super(NOME, CARGO, SALARIO, LOGIN, SENHA, CPF);
    }

    public boolean autenticar(String login, String senha) {
        return getLogin().equals(login) && getSenha().equals(senha);
    }
}
