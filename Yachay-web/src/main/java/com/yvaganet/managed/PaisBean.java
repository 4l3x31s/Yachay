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
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author Alexeis
 */
@ManagedBean(name = "paisBean")
@SessionScoped
public class PaisBean {
    private String strNombrePais;
    private int idColegio;

    
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
    public String irColegio(int idColegio){
        this.setIdColegio(idColegio);
        return "colegio.xhtml";
    }
    public String getStrNombrePais() {
        return strNombrePais;
    }
    public void setStrNombrePais(String strNombrePais) {
        this.strNombrePais = strNombrePais;
    }
    public int getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(int idColegio) {
        this.idColegio = idColegio;
    }
}
