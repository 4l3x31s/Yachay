/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnLugarExpedicion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnLugarExpedicionFacadeLocal {

    void create(YcnLugarExpedicion ycnLugarExpedicion);

    void edit(YcnLugarExpedicion ycnLugarExpedicion);

    void remove(YcnLugarExpedicion ycnLugarExpedicion);

    YcnLugarExpedicion find(Object id);

    List<YcnLugarExpedicion> findAll();

    List<YcnLugarExpedicion> findRange(int[] range);

    int count();
    
}
