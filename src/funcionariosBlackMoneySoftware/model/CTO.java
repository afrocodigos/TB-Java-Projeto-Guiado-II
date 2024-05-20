package funcionariosBlackMoneySoftware.model;

import funcionariosBlackMoneySoftware.controller.ValidadorDaSenha;

public class CTO extends FuncionarioBase {
    private static final String NOME = "Lucas Teles";
    private static final String LOGIN = "rootCTO";
    private static final String SENHA = "Cto@123123";

    public CTO() {
        super(NOME, "CTO", 27000.0, LOGIN, SENHA, "123123123");
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return getLogin().equals(login) && getSenha().equals(senha);
    }

}
