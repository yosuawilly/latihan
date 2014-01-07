/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao.impl;

import com.server.asset.dao.LocationDao;
import com.server.asset.entity.Location;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public class LocationDaoImpl implements LocationDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addLocation(Location location) {
        sessionFactory.getCurrentSession().save(location);
    }

    @Override
    public List<Location> listLocation() {
        return sessionFactory.getCurrentSession().createQuery("from Location").list();
    }

    @Override
    public void deleteLocation(Location location) {
        sessionFactory.getCurrentSession().delete(location);
    }

    @Override
    public void updateLocation(Location location) {
        sessionFactory.getCurrentSession().update(location);
    }

}
