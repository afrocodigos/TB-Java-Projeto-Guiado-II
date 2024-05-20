package src.funcionariosStarlabs.model;

import java.util.HashMap;
import java.util.Map;

public class Salario {
    private static final Map<String, Double> SALARIOS = new HashMap<>();
    
    static {
        // Definindo os salários para cada nível
        SALARIOS.put("GESTOR", 50000.00);
        SALARIOS.put("SENIOR", 38600.00);
        SALARIOS.put("PLENO", 27570.09);
        SALARIOS.put("JUNIOR", 15030.87);
        SALARIOS.put("ESTAGIÁRIO", 2600.00);
    }

    public static double getSalarioByNivel(String nivel) {
        Double salario = SALARIOS.get(nivel.toUpperCase());
        if (salario == null) {
            throw new IllegalArgumentException("Nível de senioridade inválido: " + nivel);
        }
        return salario;
    }
}
