public class EmployeeReference implements EmployeeReference {
    protected String name;
    protected String position;
    protected double salary;
    protected String cpf;

    public EmployeeReference(String name, String position, double salary, String cpf) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.cpf = cpf;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.Name = name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.Position = position;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.Salary = salary;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
