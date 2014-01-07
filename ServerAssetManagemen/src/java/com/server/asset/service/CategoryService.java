/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.service;

import com.server.asset.entity.Category;
import java.util.List;

/**
 *
 * @author USER
 */
public interface CategoryService {

    public void addCategory(Category category);
    public List<Category> listCategory();
    public void deleteCategory(Category category);
    public void updateCategory(Category category);

}
