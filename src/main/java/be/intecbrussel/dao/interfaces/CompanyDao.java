package be.intecbrussel.dao.interfaces;

import be.intecbrussel.model.Company;

public interface CompanyDao extends Dao<Company> {

    Company createAndReturnCompany(Company company);
}
