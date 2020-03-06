package be.intecbrussel.dao;

public interface Dao<T> {

    void create(T object);

    T readyById(int id);

    void update(T object);

    void deleteById(int id);
}
