package funcionariosStarlabs.view;

import funcionariosStarlabs.controller.Engenheiro;
import funcionariosStarlabs.controller.CLevel;
import funcionariosStarlabs.controller.Dados;
import funcionariosStarlabs.controller.Designers;
import funcionariosStarlabs.controller.DevOps;
import funcionariosStarlabs.controller.Gerente;
import funcionariosStarlabs.controller.QA;
import funcionariosStarlabs.model.ArvoreDeFuncionarios;

public class Main {

   public static void main(String[] args) {
      // instancia funcionario
      CLevel cLevel = new CLevel(123, "Juliao", "CLevel", 20000, "123654");
      Engenheiro eng = new Engenheiro(456, "Heloise", "Engenheira", 15000, "963852");
      Dados dados = new Dados(789, "Maria", "Dados", 15000, "741258");
      Designers designers = new Designers(101, "Sofia", "Designers", 7500, "852147");
      DevOps devOps = new DevOps(121, "Jose", "DevOps", 10000, "321456");
      Gerente gerente = new Gerente(314, "Joicy", "Gerente", 20000, "753159");
      QA QA = new QA(151, "Mateus", "QA", 18000, "741984");

      // adiciona funcionario na arvore
      ArvoreDeFuncionarios operacao = new ArvoreDeFuncionarios<>();
      operacao.adicionar(cLevel);
      operacao.adicionar(eng);
      operacao.adicionar(dados);
      operacao.adicionar(designers);
      operacao.adicionar(devOps);
      operacao.adicionar(gerente);
      operacao.adicionar(QA);

      // atualiza dados
      operacao.atualizarDados("Heloise", 20000, "Engenheira");

      // remove funcionario
      operacao.remover("Sofia");

      // mostrar funcionario
      operacao.mostrarTodos();

   }
}
