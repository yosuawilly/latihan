/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao.impl;

import com.server.asset.dao.AssetDao;
import com.server.asset.entity.Asset;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public class AssetDaoImpl implements AssetDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAsset(Asset asset) {
        sessionFactory.getCurrentSession().save(asset);
    }

    @Override
    public List<Asset> listAsset() {
        return sessionFactory.getCurrentSession().createQuery("from Asset").list();
    }

    @Override
    public void deleteAsset(Asset asset) {
        sessionFactory.getCurrentSession().delete(asset);
    }

    @Override
    public void updateAsset(Asset asset) {
        sessionFactory.getCurrentSession().update(asset);
    }

    @Override
    public Asset findAssetByName(String name) {
        return (Asset) sessionFactory.getCurrentSession().createQuery("from Asset where asset = :name ")
                .setParameter("name", name).uniqueResult();
    }

}
