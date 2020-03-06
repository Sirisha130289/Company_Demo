package be.intecbrussel.dao;

import be.intecbrussel.model.Company;

public interface CompanyDao {

    void create(Company company);

    Company readById(int id);

    void update(Company company);

    void deleteById(int id);

}
