/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao;

import com.server.asset.entity.MaintenanceSchedule;
import java.util.List;

/**
 *
 * @author USER
 */
public interface MaintenanceScheduleDao {

    public void addMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule);
    public List<MaintenanceSchedule> listMaintenanceSchedule();
    public void deleteMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule);
    public void updateMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule);
    public MaintenanceSchedule getScheduleLastDate(String asset);

}
