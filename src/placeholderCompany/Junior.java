package placeholderCompany;

public class Junior extends FuncionarioBase{

    public Junior(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);
    }

    @Override
    public String toString() {
        return super.toString() + " - Junior";
    }
}
