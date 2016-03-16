/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnTelefono;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnTelefonoFacadeLocal {

    void create(YcnTelefono ycnTelefono);

    void edit(YcnTelefono ycnTelefono);

    void remove(YcnTelefono ycnTelefono);

    YcnTelefono find(Object id);

    List<YcnTelefono> findAll();

    List<YcnTelefono> findRange(int[] range);

    int count();
    
}
