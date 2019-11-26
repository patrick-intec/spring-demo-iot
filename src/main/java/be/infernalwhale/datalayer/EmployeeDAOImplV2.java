package be.infernalwhale.datalayer;

import be.infernalwhale.model.Employee;

import java.sql.Connection;
import java.util.List;

public class EmployeeDAOImplV2 implements EmployeeDAO {
    private Connection connection;

    public EmployeeDAOImplV2(Connection connection) {
        this.connection = connection;
    }


    public Employee createEmployee(Employee employee) {
        return null;
    }

    public Employee saveEmployee(Employee employee) {
        return null;
    }

    public boolean deleteEmployee(int id) {
        return false;
    }

    public boolean deleteEmployee(Employee employee) {
        return false;
    }

    public Employee findEmployee(int id) {
        return null;
    }

    public List<Employee> findEmployee(Employee queryParameters) {
        return null;
    }
}
