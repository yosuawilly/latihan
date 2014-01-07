/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao;

import com.server.asset.entity.StatusMaintenance;
import java.util.List;

/**
 *
 * @author USER
 */
public interface StatusMaintenanceDao {

    public void addStatusMaintenance(StatusMaintenance statusMaintenance);
    public List<StatusMaintenance> listStatusMaintenance();
    public void deleteStatusMaintenance(StatusMaintenance statusMaintenance);
    public void updateStatusMaintenance(StatusMaintenance statusMaintenance);
    public StatusMaintenance findByStatus(String status);

}
