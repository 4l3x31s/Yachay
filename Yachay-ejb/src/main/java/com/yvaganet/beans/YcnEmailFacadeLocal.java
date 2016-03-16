/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnEmail;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnEmailFacadeLocal {

    void create(YcnEmail ycnEmail);

    void edit(YcnEmail ycnEmail);

    void remove(YcnEmail ycnEmail);

    YcnEmail find(Object id);

    List<YcnEmail> findAll();

    List<YcnEmail> findRange(int[] range);

    int count();
    
}
