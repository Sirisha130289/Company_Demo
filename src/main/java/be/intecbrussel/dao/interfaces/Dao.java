package be.intecbrussel.dao.interfaces;

import be.intecbrussel.custom_exception.CustomException;

import java.util.List;

public interface Dao<T> {

    void create(T object) throws CustomException;

    T readyById(int id) throws CustomException;

    void update(T object) throws CustomException;

    void deleteById(int id) throws CustomException;

    List<T> getList();
}
