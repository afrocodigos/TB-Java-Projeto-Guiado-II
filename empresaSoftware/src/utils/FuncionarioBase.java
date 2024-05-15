package utils;

public abstract class FuncionarioBase implements InterfaceFuncionario{
    // atributos
    protected String nomeFuncionario;
    protected String cpfFuncionario;
    protected String enderecoFuncionario = "";
    protected String cargoFuncionario;
    protected double salarioFuncionario = 0;

    // construtor
    public FuncionarioBase(String nomeFuncionario, String cpfFuncionario, String enderecoFuncionario){
        this.nomeFuncionario = nomeFuncionario;
        this.cpfFuncionario = cpfFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public FuncionarioBase(String nomeFuncionario, String cpfFuncionario){
        this.nomeFuncionario = nomeFuncionario;
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
    public String getEnderecoFuncionario(){
        return enderecoFuncionario;
    }
    @Override
    public void setEnderecoFuncionario(String enderecoFuncionario){
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

    public void adicionaEndereco(String endereco){
        setEnderecoFuncionario(endereco);
        System.out.println("Endereço cadastrado");
    }

    public void atualizarSalario(double novoSalario){
        setSalarioFuncionario(novoSalario);
        System.out.println("Salário atualizado");
    }

    public abstract void trabalhar();
}
