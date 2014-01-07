/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao;

import com.server.asset.entity.Category;
import java.util.List;

/**
 *
 * @author USER
 */
public interface CategoryDao {

    public void addCategory(Category category);
    public List<Category> listCategory();
    public void deleteCategory(Category category);
    public void updateCategory(Category category);

}
