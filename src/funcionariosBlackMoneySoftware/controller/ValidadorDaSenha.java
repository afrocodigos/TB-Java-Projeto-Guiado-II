package funcionariosBlackMoneySoftware.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorDaSenha {
    private static final String SENHA_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,16}$";

    private Pattern senhaPattern;

    public ValidadorDaSenha() {
        senhaPattern = Pattern.compile(SENHA_REGEX);
    }

    public boolean verificarSenha(String senha) {
        Matcher matcher = senhaPattern.matcher(senha);
        return matcher.matches();
    }
}
