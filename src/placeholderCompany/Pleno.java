package placeholderCompany;

public class Pleno extends FuncionarioBase{

    public Pleno(String nome, String cargo, double salario, String cpf) {
        super(nome, cargo, salario, cpf);
    }

    public void ganharBonus() {
        this.salario *= 1.1;
    }

    @Override
    public String toString() {
        return super.toString() + " - Pleno";
    }


    
}
