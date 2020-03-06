package be.intecbrussel.dao;

import be.intecbrussel.model.Company;
import be.intecbrussel.model.Employee;

public interface EmployeeDao {

    void create(Employee employee);

    Employee readById(int id);

    void update(Employee employee);

    void deleteById(int id);
}
