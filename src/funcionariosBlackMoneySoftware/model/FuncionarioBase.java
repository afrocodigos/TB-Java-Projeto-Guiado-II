package funcionariosBlackMoneySoftware.model;

import funcionariosBlackMoneySoftware.controller.FuncionarioInterface;
import funcionariosBlackMoneySoftware.controller.ValidadorDaSenha;

public class FuncionarioBase implements FuncionarioInterface {
    private String nome;
    private String cargo;
    private double salario;
    protected String login;
    private String senha;
    private String cpf;

    public FuncionarioBase(String nome, String cargo, double salario, String login, String senha, String cpf) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {

    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {

    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {

    }

    public String getLogin() {
        return login;
    }

    @Override
    public void setLogin(String login) {

    }

    @Override
    public boolean autenticar(String login, String senha) {
        return false;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {

    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {

    }

    public void visualizarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("CPF: " + cpf);
    }

    public void atualizarSenha(String novaSenha) {
        ValidadorDaSenha validador = new ValidadorDaSenha();
        if (validador.verificarSenha(novaSenha)) {
            this.senha = novaSenha;
            System.out.println("Senha atualizada com sucesso.");
        } else {
            System.out.println("A senha não atende aos critérios de segurança. (8 a 16 caracteres, Maiuscula, minuscula e caractere especial)");
        }
    }


}
