package ua.lviv.iot.persistence.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

public abstract class AbstractDao<T> implements IDao<T> {

    @PersistenceContext
    private EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    protected abstract Class<T> getEntityClass();

    @Transactional(value = TxType.REQUIRED)
    @Override
    public T findById(Integer id) {
        T result = (T) entityManager.find(getEntityClass(), id);
        return result;
    }

    @Transactional(value = TxType.REQUIRED)
    @Override
    public T persist(T object) {
        entityManager.persist(object);
        return object;
    }

}
