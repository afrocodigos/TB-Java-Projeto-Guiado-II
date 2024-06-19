package src.funcionariosStarlabs.service;

import src.funcionariosStarlabs.model.Funcionario;
import src.funcionariosStarlabs.model.Cargo;

public interface GerenciamentoFuncionarios {
    void adicionarFuncionario(Funcionario funcionario);
    void removerFuncionario(String cpf);
    Funcionario buscarFuncionario(String cpf);
    void atualizarFuncionario(Funcionario funcionario);
    void mostrarDadosOrdenados();
    void filtrarPorCargo(Cargo cargo);
    void filtrarPorNome(String nome);
}
