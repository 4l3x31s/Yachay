/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnUsuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnUsuarioFacadeLocal {

    void create(YcnUsuario ycnUsuario);

    void edit(YcnUsuario ycnUsuario);

    void remove(YcnUsuario ycnUsuario);

    YcnUsuario find(Object id);

    List<YcnUsuario> findAll();

    List<YcnUsuario> findRange(int[] range);

    int count();
    
}
