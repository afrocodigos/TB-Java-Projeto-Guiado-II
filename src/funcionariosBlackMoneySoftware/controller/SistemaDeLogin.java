package funcionariosBlackMoneySoftware.controller;

import java.util.HashMap;
import java.util.Map;

public class SistemaDeLogin {
    private Map<String, String> logins;
    private String login;
    private String senha;

    public SistemaDeLogin() {
        logins = new HashMap<>();
        logins.put(login, senha);
    }

    public boolean login(String login, String senha) {
        return logins.containsKey(login) && logins.get(login).equals(senha);
    }

    public void adicionarLogin(String login, String senha) {
        logins.put(login, senha);
    }
}
