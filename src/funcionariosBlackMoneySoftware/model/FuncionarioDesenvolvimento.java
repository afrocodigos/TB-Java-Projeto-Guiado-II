package funcionariosBlackMoneySoftware.model;

public class FuncionarioDesenvolvimento extends FuncionarioBase {
    public FuncionarioDesenvolvimento(String nome, String cargo, double salario, String login, String senha, String cpf) {
        super(nome, cargo, salario, login, senha, cpf);
    }

    public void iniciarProjeto() {
        System.out.println("Projeto iniciado.");
    }

    public void atualizarProjeto() {
        System.out.println("Projeto atualizado.");
    }

    public void finalizarProjeto() {
        System.out.println("Projeto finalizado.");
    }

    public void notificar() {
        System.out.println("Notificação: sistema em manutenção.");
    }
}