/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnCiudad;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnCiudadFacadeLocal {

    void create(YcnCiudad ycnCiudad);

    void edit(YcnCiudad ycnCiudad);

    void remove(YcnCiudad ycnCiudad);

    YcnCiudad find(Object id);

    List<YcnCiudad> findAll();

    List<YcnCiudad> findRange(int[] range);

    int count();
    
}
