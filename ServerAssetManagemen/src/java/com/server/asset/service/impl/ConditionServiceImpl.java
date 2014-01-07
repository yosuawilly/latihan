/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.service.impl;

import com.server.asset.dao.ConditionDao;
import com.server.asset.entity.Condition;
import com.server.asset.service.ConditionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author USER
 */
@Service
public class ConditionServiceImpl implements ConditionService{

    @Autowired
    private ConditionDao conditionDao;

    @Override
    @Transactional
    public void addCondition(Condition condition) {
        conditionDao.addCondition(condition);
    }

    @Override
    public List<Condition> listCondition() {
        return conditionDao.listCondition();
    }

    @Override
    @Transactional
    public void deleteCondition(Condition condition) {
        conditionDao.deleteCondition(condition);
    }

    @Override
    @Transactional
    public void updateCondition(Condition condition) {
        conditionDao.updateCondition(condition);
    }

}
