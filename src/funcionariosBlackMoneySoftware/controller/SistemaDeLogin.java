// SistemaDeLogin.java
package funcionariosBlackMoneySoftware.controller;

import java.util.HashMap;
import java.util.Map;

public class SistemaDeLogin {
    private Map<String, String> logins;

    public SistemaDeLogin() {
        this.logins = new HashMap<>();
    }

    public void adicionarLogin(String login, String senha) {
        logins.put(login, senha);
    }

    public boolean login(String login, String senha) {
        return logins.containsKey(login) && logins.get(login).equals(senha);
    }
}
