package be.intecbrussel;

import be.intecbrussel.custom_exception.CustomException;
import be.intecbrussel.dao.implementations.CompanyDaoImpl;
import be.intecbrussel.dao.implementations.EmployeeDaoImpl;
import be.intecbrussel.dao.interfaces.CompanyDao;
import be.intecbrussel.dao.interfaces.Dao;
import be.intecbrussel.model.Company;
import be.intecbrussel.model.Employee;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {

        CompanyDao dao = new CompanyDaoImpl();
        Dao<Employee> employeeDao = new EmployeeDaoImpl() {
            @Override
            public void create(Employee object) throws CustomException {

            }

            @Override
            public Employee readyById(int id) throws CustomException {
                return null;
            }

            @Override
            public void update(Employee object) throws CustomException {

            }

            @Override
            public void deleteById(int id) throws CustomException {

            }

            @Override
            public List<Employee> getList() {
                return null;
            }
        };
        try {
//            dao.create(new Company("intec"));
//            System.out.println(dao.createAndReturnCompany(new Company("moktok")));

            Company company = dao.createAndReturnCompany(new Company("Company name"));
            employeeDao.create(new Employee("Something", "somejob", company));
        } catch (CustomException e) {
            e.printStackTrace();
        }


    }
}
