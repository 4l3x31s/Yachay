/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnImagenColegio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnImagenColegioFacadeLocal {

    void create(YcnImagenColegio ycnImagenColegio);

    void edit(YcnImagenColegio ycnImagenColegio);

    void remove(YcnImagenColegio ycnImagenColegio);

    YcnImagenColegio find(Object id);

    List<YcnImagenColegio> findAll();

    List<YcnImagenColegio> findRange(int[] range);

    int count();
    
}
