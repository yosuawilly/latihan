package com.server.asset.entity;
// Generated 04 Jan 14 15:05:08 by Hibernate Tools 3.2.1.GA


import java.util.Date;

/**
 * MaintenanceSchedule generated by hbm2java
 */
public class MaintenanceSchedule  implements java.io.Serializable {


     private Integer idMaintenance;
     private Asset asset;
     private StatusMaintenance statusMaintenance;
     private String commentStatus;
     private Integer estimasiWaktu;
     private String pic;
     private Date tanggalAwal;
     private Date tanggalSelesai;

    public MaintenanceSchedule() {
    }

	
    public MaintenanceSchedule(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }
    public MaintenanceSchedule(int idMaintenance, Asset asset, StatusMaintenance statusMaintenance, String commentStatus, Integer estimasiWaktu, String pic, Date tanggalAwal, Date tanggalSelesai) {
       this.idMaintenance = idMaintenance;
       this.asset = asset;
       this.statusMaintenance = statusMaintenance;
       this.commentStatus = commentStatus;
       this.estimasiWaktu = estimasiWaktu;
       this.pic = pic;
       this.tanggalAwal = tanggalAwal;
       this.tanggalSelesai = tanggalSelesai;
    }
   
    public Integer getIdMaintenance() {
        return this.idMaintenance;
    }
    
    public void setIdMaintenance(Integer idMaintenance) {
        this.idMaintenance = idMaintenance;
    }
    public Asset getAsset() {
        return this.asset;
    }
    
    public void setAsset(Asset asset) {
        this.asset = asset;
    }
    public StatusMaintenance getStatusMaintenance() {
        return this.statusMaintenance;
    }
    
    public void setStatusMaintenance(StatusMaintenance statusMaintenance) {
        this.statusMaintenance = statusMaintenance;
    }
    public String getCommentStatus() {
        return this.commentStatus;
    }
    
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }
    public Integer getEstimasiWaktu() {
        return this.estimasiWaktu;
    }
    
    public void setEstimasiWaktu(Integer estimasiWaktu) {
        this.estimasiWaktu = estimasiWaktu;
    }
    public String getPic() {
        return this.pic;
    }
    
    public void setPic(String pic) {
        this.pic = pic;
    }
    public Date getTanggalAwal() {
        return this.tanggalAwal;
    }
    
    public void setTanggalAwal(Date tanggalAwal) {
        this.tanggalAwal = tanggalAwal;
    }
    public Date getTanggalSelesai() {
        return this.tanggalSelesai;
    }
    
    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }




}

