/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.service.impl;

import com.server.asset.dao.LocationDao;
import com.server.asset.entity.Location;
import com.server.asset.service.LocationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USER
 */
@Service
public class LocationServiceImpl implements LocationService{

    @Autowired
    private LocationDao locationDao;

    @Override
    @Transactional
    public void addLocation(Location location) {
        locationDao.addLocation(location);
    }

    @Override
    public List<Location> listLocation() {
        return locationDao.listLocation();
    }

    @Override
    @Transactional
    public void deleteLocation(Location location) {
        locationDao.deleteLocation(location);
    }

    @Override
    @Transactional
    public void updateLocation(Location location) {
        locationDao.updateLocation(location);
    }

}
