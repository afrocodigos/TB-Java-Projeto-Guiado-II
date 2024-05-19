package placeholderCompany;

public class Diretor extends FuncionarioBase{

    public Diretor(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);
    }

    public void ganharBonus() {
        this.salario *= 1.5;
    }

    @Override
    public String toString() {
        return super.toString() + " - Diretor";
    }
    
}
