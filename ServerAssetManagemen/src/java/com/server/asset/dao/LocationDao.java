/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao;

import com.server.asset.entity.Location;
import java.util.List;

/**
 *
 * @author USER
 */
public interface LocationDao {

    public void addLocation(Location location);
    public List<Location> listLocation();
    public void deleteLocation(Location location);
    public void updateLocation(Location location);

}
