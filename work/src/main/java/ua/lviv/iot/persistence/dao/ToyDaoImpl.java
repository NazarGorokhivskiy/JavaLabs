package ua.lviv.iot.persistence.dao;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ua.lviv.iot.Hoop;
import ua.lviv.iot.Toy;

@Named
@Dependent
public class ToyDaoImpl extends AbstractDao<Toy> implements ToyDao, Serializable {
    
    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Toy> getEntityClass() {
        return Toy.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

}
