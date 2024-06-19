package src.funcionariosStarlabs.model;

import java.util.Objects;

public class Cpf {
    private String valor;

    public Cpf(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }

    public String getCpf() {
        return valor;
    }

    public void setCpf(String cpf) {
        this.valor = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cpf cpf1 = (Cpf) o;
        return Objects.equals(valor, cpf1.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public String toString() {
        return valor;
    }
}
