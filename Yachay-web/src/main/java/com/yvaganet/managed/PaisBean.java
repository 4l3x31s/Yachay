/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.managed;

import com.yvaganet.beans.YcnPaisFacadeLocal;
import com.yvaganet.entities.YcnPais;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Alexeis
 */
@ManagedBean
@RequestScoped
public class PaisBean {
    private String strNombrePais;
    /**
     * Creates a new instance of PaisBean
     */
    @EJB
    private YcnPaisFacadeLocal ycnPaisFacadeLocal;
    public PaisBean() {
    }
    public boolean insertarPais() {
        return this.ycnPaisFacadeLocal.AddPais(this.strNombrePais);
    }
    public String getStrNombrePais() {
        return strNombrePais;
    }
    public void setStrNombrePais(String strNombrePais) {
        this.strNombrePais = strNombrePais;
    }
}
