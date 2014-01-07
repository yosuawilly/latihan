/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao.impl;

import com.server.asset.dao.ConditionDao;
import com.server.asset.entity.Condition;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USER
 */
@Repository
public class ConditionDaoImpl implements ConditionDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCondition(Condition condition) {
        sessionFactory.getCurrentSession().save(condition);
    }

    @Override
    @Transactional
    public List<Condition> listCondition() {
        return sessionFactory.getCurrentSession().createQuery("from Condition").list();
    }

    @Override
    public void deleteCondition(Condition condition) {
        sessionFactory.getCurrentSession().delete(condition);
    }

    @Override
    public void updateCondition(Condition condition) {
        sessionFactory.getCurrentSession().update(condition);
    }

}
