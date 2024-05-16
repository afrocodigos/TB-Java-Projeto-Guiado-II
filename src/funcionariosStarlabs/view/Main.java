package funcionariosStarlabs.view;

import funcionariosStarlabs.controller.CTO;
import funcionariosStarlabs.model.ArvoreDeFuncionarios;

public class Main {

   public static void main(String[] args) {
      // instancia funcionario
      CTO novoCTO = new CTO("Juliao", "CTO", 20000, "123654");

      // adiciona funcionario na arvore
      ArvoreDeFuncionarios arvore = new ArvoreDeFuncionarios<>();
      arvore.adicionar(novoCTO);

   }
}
