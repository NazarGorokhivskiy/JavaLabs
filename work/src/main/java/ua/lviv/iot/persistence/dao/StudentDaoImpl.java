package ua.lviv.iot.persistence.dao;

import java.io.Serializable;

import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ua.lviv.iot.Hoop;

@Named
@Dependent
public class StudentDaoImpl extends AbstractDao<Hoop> implements HoopDao, Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Hoop> getEntityClass() {
        return Hoop.class;
    }

    //@Resource
    //private UserTransaction userTransaction;

}
