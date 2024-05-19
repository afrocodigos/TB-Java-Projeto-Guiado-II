package funcionariosStarlabs.arvores;

import funcionariosStarlabs.controllers.EngenheiroDeSoftware;
import funcionariosStarlabs.controllers.Gestor;

public class ArvoreEngSoftware extends ArvoreDeFuncionarios<EngenheiroDeSoftware> {

    @Override
    public void adicionar(EngenheiroDeSoftware funcionario) {
        super.adicionar(funcionario);
    }

    @Override
    public EngenheiroDeSoftware buscar(String nome) {
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

}
