// Main.java
package funcionariosBlackMoneySoftware;

import funcionariosBlackMoneySoftware.controller.MainController;
import funcionariosBlackMoneySoftware.model.CTO;

public class Main {
    public static void main(String[] args) {
        CTO cto = new CTO();
        MainController controller = new MainController(cto);
        controller.iniciarSistema();
    }
}
