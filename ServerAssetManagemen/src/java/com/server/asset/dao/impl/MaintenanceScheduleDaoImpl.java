/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao.impl;

import com.server.asset.dao.MaintenanceScheduleDao;
import com.server.asset.entity.MaintenanceSchedule;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public class MaintenanceScheduleDaoImpl implements MaintenanceScheduleDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
        sessionFactory.getCurrentSession().save(maintenanceSchedule);
    }

    @Override
    public List<MaintenanceSchedule> listMaintenanceSchedule() {
        return sessionFactory.getCurrentSession().createQuery("from MaintenanceSchedule").list();
    }

    @Override
    public void deleteMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
        sessionFactory.getCurrentSession().delete(maintenanceSchedule);
    }

    @Override
    public void updateMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
        sessionFactory.getCurrentSession().update(maintenanceSchedule);
    }

    @Override
    public MaintenanceSchedule getScheduleLastDate(String asset) {
        return (MaintenanceSchedule) sessionFactory.getCurrentSession().createQuery("from MaintenanceSchedule where asset.asset = :asset order by tanggalAwal desc")
                .setParameter("asset", asset).setMaxResults(1).uniqueResult();
    }

}
