package be.infernalwhale.servicelayer;

import be.infernalwhale.model.Employee;

import java.math.BigDecimal;

public interface SalaryService {
    BigDecimal calculateSalary(Employee employee, int monthOfYear, int year);
}
