package br.com.starlabs;

public class CTORoot extends EmployeeRoot<CTO> {

    @Override
    public void create(CTO employee) {
        super.create(employee);
    }

    @Override
    public CTO getById(String name) {
        return super.getById(name);
    }

    @Override
    public void delete(String name) {
        super.delete(name);
    }

    @Override
    public void getAll() {
        super.getAll();
    }

    @Override
    public void update(String name, double newSalary, String newPosition) {
        super.update(name, newSalary, newPosition);
    }

}
