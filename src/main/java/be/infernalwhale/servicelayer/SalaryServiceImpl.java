package be.infernalwhale.servicelayer;

import be.infernalwhale.datalayer.ContractDAO;
import be.infernalwhale.datalayer.EmployeeDAO;
import be.infernalwhale.model.Employee;

import java.math.BigDecimal;

public class SalaryServiceImpl implements SalaryService {
    private EmployeeDAO employeeDAO;
    private ContractDAO contractDAO;

    public SalaryServiceImpl(EmployeeDAO empDAO, ContractDAO cDAO) {
        this.contractDAO = cDAO;
        this.employeeDAO = empDAO;
    }


    public BigDecimal calculateSalary(Employee employee, int monthOfYear, int year) {
        return null;
    }
}
