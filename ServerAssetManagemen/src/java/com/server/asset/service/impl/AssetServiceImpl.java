/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.service.impl;

import com.server.asset.dao.AssetDao;
import com.server.asset.entity.Asset;
import com.server.asset.service.AssetService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USER
 */
@Service
public class AssetServiceImpl implements AssetService{
    
    @Autowired
    private AssetDao assetDao;

    @Override
    @Transactional
    public void addAsset(Asset asset) {
        assetDao.addAsset(asset);
    }

    @Override
    public List<Asset> listAsset() {
        return assetDao.listAsset();
    }

    @Override
    @Transactional
    public void deleteAsset(Asset asset) {
        assetDao.deleteAsset(asset);
    }

    @Override
    @Transactional
    public void updateAsset(Asset asset) {
        assetDao.updateAsset(asset);
    }

    @Override
    public Asset findAssetByName(String name) {
        return assetDao.findAssetByName(name);
    }

}
