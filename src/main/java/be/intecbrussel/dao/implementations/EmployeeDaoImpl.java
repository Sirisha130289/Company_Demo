package be.intecbrussel.dao.implementations;

import be.intecbrussel.config.ConnectionProvider;
import be.intecbrussel.custom_exception.CustomException;
import be.intecbrussel.dao.interfaces.Dao;
import be.intecbrussel.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl implements Dao<Employee> {

    //Connecting the already configured connection
    public Connection createConnection() throws SQLException {
        return ConnectionProvider.getInstance().getConnection();
    }


    @Override
    public void create(Employee object) throws CustomException {
        try (PreparedStatement preparedStatement = createConnection()
                .prepareStatement("INSERT INTO company_db.employees(name,job_title,company_id) " +
                        "VALUES (?,?,?)")) {
            preparedStatement.setString(1, object.getName());
            preparedStatement.setString(2, object.getJobTitle());
            preparedStatement.setInt(3, object.getId());

            preparedStatement.execute();
        } catch (SQLException se) {
            System.out.println(se.getMessage());
            throw new CustomException();
        }
    }

    @Override
    public Employee readyById(int id) throws CustomException {
        return null;
    }

    @Override
    public void update(Employee employee) throws CustomException {

    }

    @Override
    public void deleteById(int id) throws CustomException {

    }

    @Override
    public List<Employee> getList() {
        return null;
    }


}
