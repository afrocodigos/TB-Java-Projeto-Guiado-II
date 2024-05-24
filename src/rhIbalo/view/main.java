package rhIbalo.view;

import rhIbalo.controller.Cto;
import rhIbalo.controller.VPDeEng;
import rhIbalo.model.treeCto;
import rhIbalo.model.treeVp;
import static rhIbalo.controller.GeradorFuncionario.gerarFuncionarioAleatorio;

public class main {

    public static void main(String[] args) {
        treeCto arvcto = new treeCto();
        treeVp arvvp = new treeVp();
        logicapreenchimento(arvcto, arvvp);

        arvcto.mostrarTodos();
        arvvp.mostrarTodos();
        arvvp.buscar("Laura");


    }

    private static void logicapreenchimento(treeCto arvcto, treeVp arvvp) {
        Cto funcionario0 = new Cto("Miguel", "Desenvolvedor", 2800, "17163934777");
        var i = 0;
        arvcto.adicionar(funcionario0);
        while (!funcionario0.getNome().equals(gerarFuncionarioAleatorio().getNome())) {
            i++;
            var funcionarioAl = gerarFuncionarioAleatorio();
            if (i % 2 == 0) {
                Cto funcionario = new Cto(funcionarioAl.getNome(), funcionarioAl.getCargo(), funcionarioAl.getSalario(), funcionarioAl.getCpf());
                arvcto.adicionar(funcionario);
                if ("Enzo".equals(funcionarioAl.getNome())) {
                    funcionario.atualizarDados(0);
                }
            } else {
                VPDeEng funcionario = new VPDeEng(funcionarioAl.getNome(), funcionarioAl.getCargo(), funcionarioAl.getSalario(), funcionarioAl.getCpf());
                arvvp.adicionar(funcionario);
                if ("Valentina".equals(funcionarioAl.getNome())) {
                    funcionario.atualizarDados(0, "FariaLimer");
                }
            }

        }

        var funcionario1 = gerarFuncionarioAleatorio().getNome();
        System.out.println(funcionario1);
        if (!(arvcto.buscar(funcionario1) == null)){
            arvcto.remover(funcionario1);
        } else if (!(arvvp.buscar(funcionario1) == null)){
            arvvp.remover(funcionario1);
        }

    }
}

