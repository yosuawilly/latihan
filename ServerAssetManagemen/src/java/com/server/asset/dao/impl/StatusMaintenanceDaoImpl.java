/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao.impl;

import com.server.asset.dao.StatusMaintenanceDao;
import com.server.asset.entity.StatusMaintenance;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USER
 */
@Repository
public class StatusMaintenanceDaoImpl implements StatusMaintenanceDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addStatusMaintenance(StatusMaintenance statusMaintenance) {
        sessionFactory.getCurrentSession().save(statusMaintenance);
    }

    @Override
    public List<StatusMaintenance> listStatusMaintenance() {
        return sessionFactory.getCurrentSession().createQuery("from StatusMaintenance").list();
    }

    @Override
    public void deleteStatusMaintenance(StatusMaintenance statusMaintenance) {
        sessionFactory.getCurrentSession().delete(statusMaintenance);
    }

    @Override
    public void updateStatusMaintenance(StatusMaintenance statusMaintenance) {
        sessionFactory.getCurrentSession().update(statusMaintenance);
    }

    @Override
    public StatusMaintenance findByStatus(String status) {
        return (StatusMaintenance) sessionFactory.getCurrentSession().createQuery("from StatusMaintenance where status = :status ")
                .setParameter("status", status).uniqueResult();
    }

}
