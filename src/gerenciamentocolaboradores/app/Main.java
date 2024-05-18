package gerenciamentocolaboradores.app;

import gerenciamentocolaboradores.controller.GerenciamentoFuncionario;
import gerenciamentocolaboradores.model.cargo.*;
import gerenciamentocolaboradores.model.funcionario.FuncionarioBase;

public class Main {
    public static void main(String[] args) {

        GerenciamentoFuncionario gf = new GerenciamentoFuncionario();

        System.out.println("\n----------> Cadastra Funcionário <---------");
        FuncionarioBase fun1 = new ProductOwner("Alice", "111.111.111-45", 10000);
        FuncionarioBase fun2 = new LiderTecnico("João", "222.222.222-85", 15000);
        FuncionarioBase fun3 = new Desenvolvedor("Bob", "333.333.333-45", 6000, Cargos.BACKEND);
        FuncionarioBase fun4 = new Desenvolvedor("Dave", "111.111.111-45", 5000, Cargos.FRONTEND);
        FuncionarioBase fun5 = new Desenvolvedor("Eve", "102.102.102-78", 6500, Cargos.MOBILE);
        FuncionarioBase fun6 = new Designer("Carol", "789.458.962-52", 4900, Cargos.UX);
        FuncionarioBase fun7 = new Designer("Carol", "789.458.962-52", 4900, Cargos.UI);

        System.out.println(fun1);
        System.out.println(fun2);
        System.out.println(fun3);
        System.out.println(fun4);
        System.out.println(fun5);
        System.out.println(fun6);
        System.out.println(fun7);

        System.out.println("\n----------> Adiciona Funcionário <---------");
        gf.adicionarFuncionario(fun1);
        gf.adicionarFuncionario(fun2);
        gf.adicionarFuncionario(fun3);
        gf.adicionarFuncionario(fun4);
        gf.adicionarFuncionario(fun5);
        gf.adicionarFuncionario(fun6);
        gf.adicionarFuncionario(fun7);

        System.out.println("\n----------> Lista Funcionário <---------");
        gf.listarFuncionarios();

        System.out.println("\n----------> Busca Funcionário <---------");
        FuncionarioBase encontrado = gf.buscarFuncionario("111.111.111-45");
        System.out.println("Funcionário (a): " + encontrado.getNome() + " | Cargo: " + encontrado.getCargo() + " | Salário: R$" + encontrado.getSalario());

        System.out.println("\n----------> Atualiza Funcionário <---------");
        FuncionarioBase funcAtualizado = new Desenvolvedor("Bob Jr", "333.333.333-45", 8500, Cargos.BACKEND);
        gf.atualizarFuncionario("333.333.333-45", funcAtualizado);

        System.out.println("\n----------> Lista novamente para ver a atualização <---------");
        gf.listarFuncionarios();

        System.out.println("\n----------> Remove Funcionário <---------");
        gf.removerFuncionario("789.458.962-52");

        System.out.println("\n----------> Lista novamente para ver a remoção <---------");
        gf.listarFuncionarios();

    }
}
