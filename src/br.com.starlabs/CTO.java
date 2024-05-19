package br.com.starlabs;

public class CTO extends EmployeeReference {

    public CTO(String name, String position, double salary, String cpf) {
        super(name, position, salary, cpf);
    }

    public void create() {
        System.out.println("201 - CTO was created");
    }

    public void read() {
        System.out.println("Name " + name + ", position: " + position + ", Salário: R$" + salary);
    }

    public void update(double newSalary) {
        this.salary = newSalary;
        System.out.println("200 - CTO was updated");
    }

    public void delete() {
        System.out.println("204 - CTO was deleted");
    }
}
