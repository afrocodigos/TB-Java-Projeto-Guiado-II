package br.com.starlabs;

public class EmployeeRoot<T extends EmployeeReference> {

    private TreeSet<T> employees;

    public EmployeeRoot() {
        employees = new TreeSet<>((f1, f2) -> f1.getName().compareTo(f2.getName()));
    }

    public void create(T employee) {
        employees.add(employee);
        System.out.println("201 - Employee was added!");
    }

    public T getById(String name) {

        for (T employeeReference : employees) {
            if (employeeReference.getName().equals(name)) {
                return employeeReference;
            }
        }
        System.out.println("404 - The employee was not found");
        return null;
    }

    public void delete(String name) {
        T employeeToDelete = getById(name);
        if (employeeToDelete != null) {
            employees.remove(employeeToDelete);
            System.out.println("200 - Employee was deleted");
        } else {
            System.out.println("404 - Employee not found");
        }
    }

    public void getAll() {
        System.out.println("******* All Employees ********");
        for (T employeeReference : employees) {
            System.out.println(employeeReference.getName() + " - " + employeeReference.getPosition() + " - "
                    + employeeReference.getSalary());
        }
    }

    public void update(String name, double newSalary, String newPosition) {
        T employeeToUpdate = getById(name);
        if (employeeToUpdate != null) {
            employeeToUpdate.setSalary(newSalary);
            employeeToUpdate.setPosition(newPosition);
            System.out.println("200 - Employee updated");
        } else {
            System.out.println("404 - Employee not found");
        }
    }

}
