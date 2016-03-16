/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnLocalidad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnLocalidadFacadeLocal {

    void create(YcnLocalidad ycnLocalidad);

    void edit(YcnLocalidad ycnLocalidad);

    void remove(YcnLocalidad ycnLocalidad);

    YcnLocalidad find(Object id);

    List<YcnLocalidad> findAll();

    List<YcnLocalidad> findRange(int[] range);

    int count();
    
}
