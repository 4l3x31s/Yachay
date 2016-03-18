/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnPais;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnPaisFacadeLocal {

    void create(YcnPais ycnPais);

    void edit(YcnPais ycnPais);

    void remove(YcnPais ycnPais);

    YcnPais find(Object id);

    List<YcnPais> findAll();

    List<YcnPais> findRange(int[] range);

    int count();
    
    boolean AddPais(String nombrePais);
}
