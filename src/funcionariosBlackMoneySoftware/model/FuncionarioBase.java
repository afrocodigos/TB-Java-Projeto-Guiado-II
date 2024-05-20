package funcionariosBlackMoneySoftware.model;

import funcionariosBlackMoneySoftware.controller.FuncionarioInterface;
import funcionariosBlackMoneySoftware.controller.ValidadorDaSenha;

public class FuncionarioBase implements FuncionarioInterface {
    protected String nome;
    protected String cargo;
    protected double salario;
    protected String login;
    protected String getSenha;
    private String senha;
    private String cpf;
    private ValidadorDaSenha validadorDaSenha;

    public FuncionarioBase(String nome, String cargo, double salario, String login, String senha, String cpf) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.validadorDaSenha = new ValidadorDaSenha();
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String getLogin() {
        return login;
    }

    public void visualizarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Salário: " + getSalario());
    }

    public void atualizarSenha(String novaSenha) {
        if (validadorDaSenha.verificarSenha(novaSenha)) {
            setSenha(novaSenha);
            System.out.println("Senha atualizada com sucesso.");
        } else {
            System.out.println("Senha inválida. A senha deve ter entre 8 e 16 caracteres, incluindo letras maiúsculas e minúsculas, números e caracteres especiais.");
        }
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return this.login.equals(login) && this.getSenha().equals(senha);
    }
}
