package data;

import funcionariosStarlabs.ArvoreDeFuncionarios;
import funcionariosStarlabs.CTO;

public class ArvoreCTO extends ArvoreDeFuncionarios<CTO> {
    
    @Override
    public void adicionar(CTO funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public CTO buscar(String nome) {
        return super.buscar(nome);
    }

    @Override
    public void remover(String nome) {
        super.remover(nome);
    }

    @Override
    public void mostrarTodos() {
        super.mostrarTodos();
    }

    @Override
    public void atualizarDados(String nome, double novoSalario, String novoCargo) {
        super.atualizarDados(nome, novoSalario, novoCargo);
    }
}
