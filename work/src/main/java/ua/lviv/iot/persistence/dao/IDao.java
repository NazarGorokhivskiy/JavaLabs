package ua.lviv.iot.persistence.dao;

public interface IDao<T> {

    T findById(Integer id);

    T persist(T object);

}