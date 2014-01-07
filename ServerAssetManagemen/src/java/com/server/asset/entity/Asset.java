package com.server.asset.entity;
// Generated 04 Jan 14 15:05:08 by Hibernate Tools 3.2.1.GA


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Asset generated by hbm2java
 */
public class Asset  implements java.io.Serializable {


     private int idAsset;
     private Location location;
     private Condition condition;
     private Category category;
     private String asset;
     private String departemen;
     private Date acquiredDate;
     private Double currentValue;
     private Double purchasePrice;
     private String manufacturer;
     private String description;
     private String comment;
     private String model;
     private Integer scheduleInterval;
     private Integer estimasiWaktu;
     private Set maintenanceSchedules = new HashSet(0);

    public Asset() {
    }

	
    public Asset(int idAsset, String asset) {
        this.idAsset = idAsset;
        this.asset = asset;
    }
    public Asset(int idAsset, Location location, Condition condition, Category category, String asset, String departemen, Date acquiredDate, Double currentValue, Double purchasePrice, String manufacturer, String description, String comment, String model, Integer scheduleInterval, Integer estimasiWaktu, Set maintenanceSchedules) {
       this.idAsset = idAsset;
       this.location = location;
       this.condition = condition;
       this.category = category;
       this.asset = asset;
       this.departemen = departemen;
       this.acquiredDate = acquiredDate;
       this.currentValue = currentValue;
       this.purchasePrice = purchasePrice;
       this.manufacturer = manufacturer;
       this.description = description;
       this.comment = comment;
       this.model = model;
       this.scheduleInterval = scheduleInterval;
       this.estimasiWaktu = estimasiWaktu;
       this.maintenanceSchedules = maintenanceSchedules;
    }
   
    public int getIdAsset() {
        return this.idAsset;
    }
    
    public void setIdAsset(int idAsset) {
        this.idAsset = idAsset;
    }
    public Location getLocation() {
        return this.location;
    }
    
    public void setLocation(Location location) {
        this.location = location;
    }
    public Condition getCondition() {
        return this.condition;
    }
    
    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    public Category getCategory() {
        return this.category;
    }
    
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getAsset() {
        return this.asset;
    }
    
    public void setAsset(String asset) {
        this.asset = asset;
    }
    public String getDepartemen() {
        return this.departemen;
    }
    
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    public Date getAcquiredDate() {
        return this.acquiredDate;
    }
    
    public void setAcquiredDate(Date acquiredDate) {
        this.acquiredDate = acquiredDate;
    }
    public Double getCurrentValue() {
        return this.currentValue;
    }
    
    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
    public Double getPurchasePrice() {
        return this.purchasePrice;
    }
    
    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getModel() {
        return this.model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getScheduleInterval() {
        return this.scheduleInterval;
    }
    
    public void setScheduleInterval(Integer scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
    }
    public Integer getEstimasiWaktu() {
        return this.estimasiWaktu;
    }
    
    public void setEstimasiWaktu(Integer estimasiWaktu) {
        this.estimasiWaktu = estimasiWaktu;
    }
    public Set getMaintenanceSchedules() {
        return this.maintenanceSchedules;
    }
    
    public void setMaintenanceSchedules(Set maintenanceSchedules) {
        this.maintenanceSchedules = maintenanceSchedules;
    }




}

