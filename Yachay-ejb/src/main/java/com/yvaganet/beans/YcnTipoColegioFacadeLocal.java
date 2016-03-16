/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnTipoColegio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnTipoColegioFacadeLocal {

    void create(YcnTipoColegio ycnTipoColegio);

    void edit(YcnTipoColegio ycnTipoColegio);

    void remove(YcnTipoColegio ycnTipoColegio);

    YcnTipoColegio find(Object id);

    List<YcnTipoColegio> findAll();

    List<YcnTipoColegio> findRange(int[] range);

    int count();
    
}
