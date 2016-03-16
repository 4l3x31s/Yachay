/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnTipoDocumento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Alexeis
 */
@Local
public interface YcnTipoDocumentoFacadeLocal {

    void create(YcnTipoDocumento ycnTipoDocumento);

    void edit(YcnTipoDocumento ycnTipoDocumento);

    void remove(YcnTipoDocumento ycnTipoDocumento);

    YcnTipoDocumento find(Object id);

    List<YcnTipoDocumento> findAll();

    List<YcnTipoDocumento> findRange(int[] range);

    int count();
    
}
