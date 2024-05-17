package funcionariosStarlabs.view;

import java.util.logging.Level;

import funcionariosStarlabs.controller.CLevel;
import funcionariosStarlabs.model.ArvoreDeFuncionarios;

public class Main {

   public static void main(String[] args) {
      // instancia funcionario
      CLevel cLevel = new CLevel(123, "Juliao", "CLevel", 20000, "123654");

      // adiciona funcionario na arvore
      ArvoreDeFuncionarios arvore = new ArvoreDeFuncionarios<>();
      arvore.adicionar(cLevel);

      arvore.mostrarTodos();

   }
}
