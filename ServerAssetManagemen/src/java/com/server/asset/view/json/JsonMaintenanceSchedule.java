/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.view.json;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class JsonMaintenanceSchedule implements Serializable{
    
    private int idMaintenance;
    private String asset;
    private String statusMaintenance;
    private String commentStatus;
    private String estimasiWaktu;
    private String pic;
    private String tanggalAwal;
    private String tanggalSelesai;

    public JsonMaintenanceSchedule() {
    }

    public int getIdMaintenance() {
        return idMaintenance;
    }

    public void setIdMaintenance(int idMaintenance) {
        this.idMaintenance = idMaintenance;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getStatusMaintenance() {
        return statusMaintenance;
    }

    public void setStatusMaintenance(String statusMaintenance) {
        this.statusMaintenance = statusMaintenance;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public String getEstimasiWaktu() {
        return estimasiWaktu;
    }

    public void setEstimasiWaktu(String estimasiWaktu) {
        this.estimasiWaktu = estimasiWaktu;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getTanggalAwal() {
        return tanggalAwal;
    }

    public void setTanggalAwal(String tanggalAwal) {
        this.tanggalAwal = tanggalAwal;
    }

    public String getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(String tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }
    
}
