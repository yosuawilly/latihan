/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.service.impl;

import com.server.asset.dao.CategoryDao;
import com.server.asset.entity.Category;
import com.server.asset.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USER
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryDao categoryDao;

    @Override
    @Transactional
    public void addCategory(Category category) {
        categoryDao.addCategory(category);
    }

    @Override
    public List<Category> listCategory() {
        return categoryDao.listCategory();
    }

    @Override
    @Transactional
    public void deleteCategory(Category category) {
        categoryDao.deleteCategory(category);
    }

    @Override
    @Transactional
    public void updateCategory(Category category) {
        categoryDao.updateCategory(category);
    }

}
