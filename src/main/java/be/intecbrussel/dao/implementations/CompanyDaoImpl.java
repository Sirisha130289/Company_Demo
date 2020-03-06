package be.intecbrussel.dao.implementations;

import be.intecbrussel.config.ConnectionProvider;
import be.intecbrussel.custom_exception.CustomException;
import be.intecbrussel.dao.interfaces.CompanyDao;
import be.intecbrussel.model.Company;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CompanyDaoImpl implements CompanyDao {

    public Connection createConnection() throws SQLException {
        return ConnectionProvider.getInstance().getConnection();
    }


    @Override
    public Company createAndReturnCompany(Company company) {
        return null;
    }

    @Override
    public void create(Company object) throws CustomException {

    }

    @Override
    public Company readyById(int id) throws CustomException {
        return null;
    }

    @Override
    public void update(Company object) throws CustomException{

    }

    @Override
    public void deleteById(int id)throws CustomException {

    }

    @Override
    public List<Company> getList() {
        return null;
    }
}
