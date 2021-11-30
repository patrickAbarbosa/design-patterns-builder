package builder;

import java.util.Arrays;

public class Employee {
    String name;
    String cpf;
    int registration;

    public Employee() {
        name = "";
        cpf = "";
        registration = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }
}
