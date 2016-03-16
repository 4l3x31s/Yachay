/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnNivelAcademico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnNivelAcademicoFacadeLocal {

    void create(YcnNivelAcademico ycnNivelAcademico);

    void edit(YcnNivelAcademico ycnNivelAcademico);

    void remove(YcnNivelAcademico ycnNivelAcademico);

    YcnNivelAcademico find(Object id);

    List<YcnNivelAcademico> findAll();

    List<YcnNivelAcademico> findRange(int[] range);

    int count();
    
}
