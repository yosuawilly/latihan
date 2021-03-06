package com.server.asset.entity;
// Generated 04 Jan 14 15:05:08 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Location generated by hbm2java
 */
public class Location  implements java.io.Serializable {


     private int idLocation;
     private String location;
     private Set assets = new HashSet(0);

    public Location() {
    }

	
    public Location(int idLocation) {
        this.idLocation = idLocation;
    }
    public Location(int idLocation, String location, Set assets) {
       this.idLocation = idLocation;
       this.location = location;
       this.assets = assets;
    }
   
    public int getIdLocation() {
        return this.idLocation;
    }
    
    public void setIdLocation(int idLocation) {
        this.idLocation = idLocation;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public Set getAssets() {
        return this.assets;
    }
    
    public void setAssets(Set assets) {
        this.assets = assets;
    }




}


