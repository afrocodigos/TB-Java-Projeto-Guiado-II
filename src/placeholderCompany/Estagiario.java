package placeholderCompany;

public class Estagiario extends FuncionarioBase {
    private double horasSemanais;

    public Estagiario(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);
        this.horasSemanais = 60;
    }

    public double getHorasSemanais() {
        return horasSemanais;
    }

    public void setHorasSemanais(double horasSemanais) {
        this.horasSemanais = horasSemanais;
    }

    @Override
    public String toString() {
        return super.toString() + " - Estagiário com " + horasSemanais + " horas semanais";
    }

}
