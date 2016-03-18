/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnCursos;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnCursosFacadeLocal {

    void create(YcnCursos ycnCursos);

    void edit(YcnCursos ycnCursos);

    void remove(YcnCursos ycnCursos);

    YcnCursos find(Object id);

    List<YcnCursos> findAll();

    List<YcnCursos> findRange(int[] range);

    int count();
    
}
