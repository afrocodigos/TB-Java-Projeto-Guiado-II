package src.funcionariosStarlabs.service;

import java.util.HashMap;
import java.util.Map;
import src.funcionariosStarlabs.model.Funcionario;
import src.funcionariosStarlabs.model.Cargo;

public class ArvoreDeCargos implements GerenciamentoFuncionarios {
    private Map<String, Funcionario> cargos = new HashMap<>();

    @Override
    public void adicionarFuncionario(Funcionario funcionario) {
        cargos.put(funcionario.getCpf().getValor(), funcionario);
    }

    @Override
    public void removerFuncionario(String cpf) {
        cargos.remove(cpf);
    }

    @Override
    public Funcionario buscarFuncionario(String cpf) {
        return cargos.get(cpf);
    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) {
        cargos.put(funcionario.getCpf().getValor(), funcionario);
    }

    @Override
    public void mostrarDadosOrdenados() {
        cargos.values().forEach(System.out::println);
    }

    @Override
    public void filtrarPorCargo(Cargo cargo) {
        cargos.values().stream()
            .filter(funcionario -> funcionario.getCargo().equals(cargo))
            .forEach(System.out::println);
    }

    @Override
    public void filtrarPorNome(String nome) {
        cargos.values().stream()
            .filter(funcionario -> funcionario.getNome().contains(nome))
            .forEach(System.out::println);
    }
}
