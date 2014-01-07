/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.service.impl;

import com.server.asset.dao.MaintenanceScheduleDao;
import com.server.asset.entity.MaintenanceSchedule;
import com.server.asset.service.MaintenanceScheduleService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USER
 */
@Service
public class MaintenanceScheduleServiceImpl implements MaintenanceScheduleService{

    @Autowired
    private MaintenanceScheduleDao maintenanceScheduleDao;

    @Override
    @Transactional
    public void addMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
        maintenanceScheduleDao.addMaintenanceSchedule(maintenanceSchedule);
    }

    @Override
    public List<MaintenanceSchedule> listMaintenanceSchedule() {
        return maintenanceScheduleDao.listMaintenanceSchedule();
    }

    @Override
    @Transactional
    public void deleteMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
        maintenanceScheduleDao.deleteMaintenanceSchedule(maintenanceSchedule);
    }

    @Override
    @Transactional
    public void updateMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
        maintenanceScheduleDao.updateMaintenanceSchedule(maintenanceSchedule);
    }

    @Override
    public MaintenanceSchedule getScheduleLastDate(String asset) {
        return maintenanceScheduleDao.getScheduleLastDate(asset);
    }

}
