package builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeBuilderTest {
    @Test
    public void shouldReturnExceptionInvalidCpf() {
        try {
            EmployeeBuilder employeeBuilder = new EmployeeBuilder();
            employeeBuilder.setName("Patrick")
                           .setRegistration(105)
                           .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid cpf!", e.getMessage());
        }
    }

    @Test
    public void shouldReturnExceptionInvalidName() {
        try {
            EmployeeBuilder employeeBuilder = new EmployeeBuilder();
            employeeBuilder.setCpf("07627914035")
                    .setRegistration(105)
                    .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid name!", e.getMessage());
        }
    }

    @Test
    public void shouldReturnExceptionInvalidRegistration() {
        try {
            EmployeeBuilder employeeBuilder = new EmployeeBuilder();
            employeeBuilder.setCpf("07627914035")
                           .setName("Patrick")
                           .build();

            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid registration!", e.getMessage());
        }
    }

    @Test
    public void shouldReturnValidEmployee() {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();
        Employee employer = employeeBuilder.setCpf("07627914035")
                       .setName("Patrick")
                       .setRegistration(17)
                       .build();

        assertNotNull(employer);
    }
}