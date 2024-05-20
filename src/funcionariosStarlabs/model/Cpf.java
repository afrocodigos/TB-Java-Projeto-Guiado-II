package src.funcionariosStarlabs.model;

public class Cpf {
    private String cpf;

    public Cpf(String cpf) {
        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11) {
            throw new IllegalArgumentException("CPF inválido: deve conter 11 dígitos numéricos");
        }

        this.cpf = formatarCPF(cpf);
    }

    private String formatarCPF(String cpf) {
        return cpf.substring(0, 3) + "." +
               cpf.substring(3, 6) + "." +
               cpf.substring(6, 9) + "-" +
               cpf.substring(9);
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return cpf;
    }
}
