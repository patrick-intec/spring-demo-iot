package be.infernalwhale.datalayer;

import be.infernalwhale.model.Employee;

import java.util.List;


public interface EmployeeDAO {
    Employee createEmployee(Employee employee);

    Employee saveEmployee(Employee employee);

    boolean deleteEmployee(int id);

    boolean deleteEmployee(Employee employee);

    Employee findEmployee(int id);

    List<Employee> findEmployee(Employee queryParameters);
}
