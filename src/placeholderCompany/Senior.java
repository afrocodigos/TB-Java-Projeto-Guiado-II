package placeholderCompany;

public class Senior extends FuncionarioBase {
    public Senior(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);
    }

    public void ganharBonus() {
        this.salario *= 1.3;
    }

    @Override
    public String toString() {
        return super.toString() + " - Senior";
    }
    
}
