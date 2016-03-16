/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnUsuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexeis
 */
@Stateless
public class YcnUsuarioFacade extends AbstractFacade<YcnUsuario> implements YcnUsuarioFacadeLocal {

    @PersistenceContext(unitName = "com.yvaganet_Yachay-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public YcnUsuarioFacade() {
        super(YcnUsuario.class);
    }
    
}
