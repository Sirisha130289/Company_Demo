package be.intecbrussel.dao.interfaces;

import be.intecbrussel.custom_exception.CustomException;
import be.intecbrussel.model.Company;
import be.intecbrussel.model.Employee;

public interface EmployeeDao extends Dao<Employee>{

    void create(Employee employee) throws CustomException;

    Employee readById(int id);

    void update(Employee employee);

    void deleteById(int id);
}
