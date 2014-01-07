package com.server.asset.entity;
// Generated 04 Jan 14 15:05:08 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * StatusMaintenance generated by hbm2java
 */
public class StatusMaintenance  implements java.io.Serializable {


     private int idStatus;
     private String status;
     private Set maintenanceSchedules = new HashSet(0);

    public StatusMaintenance() {
    }

	
    public StatusMaintenance(int idStatus) {
        this.idStatus = idStatus;
    }
    public StatusMaintenance(int idStatus, String status, Set maintenanceSchedules) {
       this.idStatus = idStatus;
       this.status = status;
       this.maintenanceSchedules = maintenanceSchedules;
    }
   
    public int getIdStatus() {
        return this.idStatus;
    }
    
    public void setIdStatus(int idStatus) {
        this.idStatus = idStatus;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Set getMaintenanceSchedules() {
        return this.maintenanceSchedules;
    }
    
    public void setMaintenanceSchedules(Set maintenanceSchedules) {
        this.maintenanceSchedules = maintenanceSchedules;
    }




}


