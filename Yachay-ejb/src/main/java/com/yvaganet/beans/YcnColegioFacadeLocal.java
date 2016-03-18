/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnColegio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnColegioFacadeLocal {

    void create(YcnColegio ycnColegio);

    void edit(YcnColegio ycnColegio);

    void remove(YcnColegio ycnColegio);

    YcnColegio find(Object id);

    List<YcnColegio> findAll();

    List<YcnColegio> findRange(int[] range);

    int count();

}
