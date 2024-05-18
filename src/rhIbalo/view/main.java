package rhIbalo.view;
import rhIbalo.controller.Cto;
import rhIbalo.controller.GeradorFuncionario;
import rhIbalo.model.treeCto;
import java.util.ArrayList;
import java.util.List;
import rhIbalo.model.treesetFunc;

import static rhIbalo.controller.GeradorFuncionario.gerarFuncionarioAleatorio;

public class main {
    public static void main(String[] args) {


        Cto funcionario = new Cto (gerarFuncionarioAleatorio().getNome(), gerarFuncionarioAleatorio().getCargo(), (gerarFuncionarioAleatorio().getSalario()), gerarFuncionarioAleatorio().getCpf());
        treeCto arvcto  = new treeCto();
        arvcto.adicionar(funcionario);
        arvcto.mostrarTodos();

    }
}
