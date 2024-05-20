package funcionariosBlackMoneySoftware.model;

import funcionariosBlackMoneySoftware.model.trees.ArvoreDeFuncionarios;

public class FuncionarioRH extends FuncionarioBase {
    public FuncionarioRH(String nome, String cargo, double salario, String login, String senha, String cpf) {
        super(nome, cargo, salario, login, senha, cpf);
        this.setSenha(senha);
    }

    public void atualizarSalario(FuncionarioBase funcionario, double novoSalario) {
        funcionario.setSalario(novoSalario);
        System.out.println("Salário atualizado para " + novoSalario);
    }

    public void demitirFuncionario(ArvoreDeFuncionarios<FuncionarioBase> arvoreDeFuncionarios, String nome) {
        arvoreDeFuncionarios.removerFuncionario(nome);
        System.out.println("Funcionário " + nome + " demitido.");
    }

    public void darFerias(FuncionarioBase funcionario) {
        System.out.println("Férias concedidas a " + funcionario.getNome());
    }

    public void atualizarCargo(FuncionarioBase funcionario, String novoCargo) {
        funcionario.setCargo(novoCargo);
        System.out.println("Cargo atualizado para " + novoCargo);
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return this.getLogin().equals(login) && this.getSenha().equals(senha);
    }

}