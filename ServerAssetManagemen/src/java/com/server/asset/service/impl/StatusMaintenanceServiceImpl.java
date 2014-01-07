/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.service.impl;

import com.server.asset.dao.StatusMaintenanceDao;
import com.server.asset.entity.StatusMaintenance;
import com.server.asset.service.StatusMaintenanceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USER
 */
@Service
public class StatusMaintenanceServiceImpl implements StatusMaintenanceService{

    @Autowired
    private StatusMaintenanceDao statusMaintenanceDao;

    @Override
    @Transactional
    public void addStatusMaintenance(StatusMaintenance statusMaintenance) {
        statusMaintenanceDao.addStatusMaintenance(statusMaintenance);
    }

    @Override
    public List<StatusMaintenance> listStatusMaintenance() {
        return statusMaintenanceDao.listStatusMaintenance();
    }

    @Override
    @Transactional
    public void deleteStatusMaintenance(StatusMaintenance statusMaintenance) {
        statusMaintenanceDao.deleteStatusMaintenance(statusMaintenance);
    }

    @Override
    @Transactional
    public void updateStatusMaintenance(StatusMaintenance statusMaintenance) {
        statusMaintenanceDao.updateStatusMaintenance(statusMaintenance);
    }

    @Override
    public StatusMaintenance findByStatus(String status) {
        return statusMaintenanceDao.findByStatus(status);
    }

}
