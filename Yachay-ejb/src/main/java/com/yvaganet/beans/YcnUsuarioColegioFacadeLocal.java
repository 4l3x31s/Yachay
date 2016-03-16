/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnUsuarioColegio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnUsuarioColegioFacadeLocal {

    void create(YcnUsuarioColegio ycnUsuarioColegio);

    void edit(YcnUsuarioColegio ycnUsuarioColegio);

    void remove(YcnUsuarioColegio ycnUsuarioColegio);

    YcnUsuarioColegio find(Object id);

    List<YcnUsuarioColegio> findAll();

    List<YcnUsuarioColegio> findRange(int[] range);

    int count();
    
}
