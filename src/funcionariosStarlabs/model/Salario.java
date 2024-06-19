package src.funcionariosStarlabs.model;

import java.util.HashMap;
import java.util.Map;

public class Salario {
    private static final Map<String, Double> SALARIOS = new HashMap<>();
    private double valor;

    public Salario(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    static {
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
