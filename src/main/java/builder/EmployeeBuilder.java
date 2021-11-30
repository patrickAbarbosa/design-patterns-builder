package builder;

public class EmployeeBuilder {
    Employee employee;

    public EmployeeBuilder() {
        employee = new Employee();
    }

    public EmployeeBuilder setName(String name) {
        employee.setName(name);
        return this;
    }

    public EmployeeBuilder setCpf(String cpf) {
        employee.setCpf(cpf);
        return this;
    }

    public EmployeeBuilder setRegistration(int registration) {
        employee.setRegistration(registration);
        return this;
    }

    public Employee build() {
        if (employee.getCpf().equals("")) {
            throw new IllegalArgumentException("Invalid cpf!");
        }

        if (employee.getName().equals("")) {
            throw new IllegalArgumentException("Invalid name!");
        }

        if (employee.getRegistration() <= 0) {
            throw new IllegalArgumentException("Invalid registration!");
        }

        return employee;
    }
}
