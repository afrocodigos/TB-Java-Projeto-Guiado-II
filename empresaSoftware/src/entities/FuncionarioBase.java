package entities;

public abstract class FuncionarioBase implements InterfaceFuncionario{
    // atributos
    protected String nomeFuncionario;
    protected String cargoFuncionario;
    protected double salarioFuncionario;
    protected String cpfFuncionario;

    // construtor
    public FuncionarioBase(String nomeFuncionario, String cargoFuncionario, double salarioFuncionario, String cpfFuncionario){
        this.nomeFuncionario = nomeFuncionario;
        this.cargoFuncionario = cargoFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.cpfFuncionario = cpfFuncionario;
    }

    // métodos
    @Override
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    @Override
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }
    @Override
    public String getCargoFuncionario() {
        return cargoFuncionario;
    }
    @Override
    public void setCargoFuncionario(String cargoFuncionario) {
        this.cargoFuncionario = cargoFuncionario;
    }
    @Override
    public double getSalarioFuncionario() {
        return salarioFuncionario;
    }
    @Override
    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }
    @Override
    public String getCpfFuncionario() {
        return cpfFuncionario;
    }
    @Override
    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }
}
