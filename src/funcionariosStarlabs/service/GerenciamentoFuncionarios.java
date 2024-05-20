package src.funcionariosStarlabs.service;

import src.funcionariosStarlabs.model.Funcionario;

public interface GerenciamentoFuncionarios {
    void adicionarFuncionario(Funcionario funcionario);
    void removerFuncionario(Funcionario funcionario);
    Funcionario buscarFuncionario(String nome);
    void mostrarDadosOrdenados();
}
