/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao.impl;

import com.server.asset.dao.CategoryDao;
import com.server.asset.entity.Category;
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
public class CategoryDaoImpl implements CategoryDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCategory(Category category) {
        sessionFactory.getCurrentSession().save(category);
    }

    @Override
    @Transactional
    public List<Category> listCategory() {
        return sessionFactory.getCurrentSession().createQuery("from Category").list();
    }

    @Override
    public void deleteCategory(Category category) {
        sessionFactory.getCurrentSession().delete(category);
    }

    @Override
    public void updateCategory(Category category) {
        sessionFactory.getCurrentSession().update(category);
    }

}
