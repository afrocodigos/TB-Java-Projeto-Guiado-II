package funcionariosBlackMoneySoftware.controller;

import java.util.HashMap;
import java.util.Map;

public class SistemaDeLogin {
    private Map<String, String> logins;
    private String loginCTO = "cto";
    private String senhaCTO = "Cto@123321";

    public SistemaDeLogin() {
        logins = new HashMap<>();
        logins.put(loginCTO, senhaCTO);
    }

    public boolean login(String login, String senha) {
        return logins.containsKey(login) && logins.get(login).equals(senha);
    }

    public void adicionarLogin(String login, String senha) {
        logins.put(login, senha);
    }
}
