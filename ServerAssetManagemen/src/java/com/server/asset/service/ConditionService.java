/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.server.asset.service;

import com.server.asset.entity.Condition;
import java.util.List;

/**
 *
 * @author USER
 */
public interface ConditionService {

    public void addCondition(Condition condition);
    public List<Condition> listCondition();
    public void deleteCondition(Condition condition);
    public void updateCondition(Condition condition);

}
