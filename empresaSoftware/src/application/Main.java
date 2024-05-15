package application;

import entities.*;
import utils.OrganogramaFuncionarios;

public class Main {
    public static void main(String[] args) {
        OrganogramaFuncionarios organogramaGeral = new OrganogramaFuncionarios();

        FuncionarioQA func1 = new FuncionarioQA("José","000.000.000-01");
        FuncionarioCLevel func2 = new FuncionarioCLevel("João","000.000.000-02");
        FuncionarioDados func3 = new FuncionarioDados("José","000.000.000-03");
        FuncionarioDesign func4 = new FuncionarioDesign("Maria","000.000.000-04");
        FuncionarioDevOps func5 = new FuncionarioDevOps("Larissa","000.000.000-05");
        FuncionarioEngSoft func6 = new FuncionarioEngSoft("Cecília","000.000.000-06");
        FuncionarioGerente func7 = new FuncionarioGerente("Agatha","000.000.000-07");
        FuncionarioVP func8 = new FuncionarioVP("Christian","000.000.000-08");

        organogramaGeral.adicionarFuncionario(func1);
        organogramaGeral.adicionarFuncionario(func2);
        organogramaGeral.adicionarFuncionario(func3);
        organogramaGeral.adicionarFuncionario(func4);
        organogramaGeral.adicionarFuncionario(func5);
        organogramaGeral.adicionarFuncionario(func6);
        organogramaGeral.adicionarFuncionario(func7);
        organogramaGeral.adicionarFuncionario(func8);
        organogramaGeral.mostrarTodosFuncionarios();
    }
}