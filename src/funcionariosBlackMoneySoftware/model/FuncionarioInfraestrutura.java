package funcionariosBlackMoneySoftware.model;

public class FuncionarioInfraestrutura extends FuncionarioBase {
    public FuncionarioInfraestrutura(String nome, String cargo, double salario, String login, String senha, String cpf) {
        super(nome, cargo, salario, login, senha, cpf);
    }

    public void gerenciarServidor() {
        System.out.println("Servidor gerenciado.");
    }

    public void rodarScript() {
        System.out.println("Script executado.");
    }

    public void notificar() {
        System.out.println("Notificação: sistema em manutenção.");
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.getSenha().equals(senha);
    }

}