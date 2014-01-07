/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.dao;

import com.server.asset.entity.Asset;
import java.util.List;

/**
 *
 * @author USER
 */
public interface AssetDao {

    public void addAsset(Asset asset);
    public List<Asset> listAsset();
    public void deleteAsset(Asset asset);
    public void updateAsset(Asset asset);
    public Asset findAssetByName(String name);

}
