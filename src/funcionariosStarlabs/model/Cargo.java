package src.funcionariosStarlabs.model;

import java.util.Arrays;

public class Cargo {
    private String cargo;
    private final  String[] CARGOS_VALIDOS = {
        "engenheiro",
        "arquiteto",
        "qa",
        "gestor"
    };

    public Cargo(String cargo) {
        if (Arrays.asList(CARGOS_VALIDOS).contains(cargo)) {
            this.cargo = cargo;
        } else {
            throw new IllegalArgumentException("Cargo inválido: " + cargo);
        }
    }

    public String getCargo() {
        return cargo;
    }
}
