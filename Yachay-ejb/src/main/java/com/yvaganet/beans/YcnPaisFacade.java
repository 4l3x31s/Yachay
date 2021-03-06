/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.beans;

import com.yvaganet.entities.YcnPais;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Alexeis
 */
@Stateless
public class YcnPaisFacade extends AbstractFacade<YcnPais> implements YcnPaisFacadeLocal {

    @PersistenceContext(unitName = "com.yvaganet_Yachay-ejb_ejb_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public YcnPaisFacade() {
        super(YcnPais.class);
    }

    @Override
    public boolean AddPais(String nombrePais) {
        try {
            YcnPais ycnPais = new YcnPais();
            ycnPais.setPasNombre(nombrePais);
            em.persist(ycnPais);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
