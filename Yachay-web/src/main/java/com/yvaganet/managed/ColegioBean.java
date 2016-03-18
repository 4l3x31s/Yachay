/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.managed;

import com.yvaganet.beans.YcnColegioFacadeLocal;
import com.yvaganet.entities.YcnColegio;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alexeis
 */
@ManagedBean(name = "colegioBean")
@RequestScoped
public class ColegioBean {
    
    @ManagedProperty("#{paisBean}")
    private PaisBean paisBean;

    public PaisBean getPaisBean() {
        return paisBean;
    }

    public void setPaisBean(PaisBean paisBean) {
        this.paisBean = paisBean;
    }
    
    
    private YcnColegio ycnColegio;
    private int idCol;

    
    @EJB
    private YcnColegioFacadeLocal ycnColegioFacadeLocal;
    
    /**
     * Creates a new instance of ColegioBean
     */
    public ColegioBean() {
    }
    public void ObtenerColegio(){
        
    }
    
    
    public void obtenerColegio(){
        YcnColegio respuesta = ycnColegioFacadeLocal.find(1);
    }
    
    @PostConstruct
    public void init() {
        this.ycnColegio = this.ycnColegioFacadeLocal.find(this.paisBean.getIdColegio());
        
    }
    public YcnColegio getYcnColegio() {
        return ycnColegio;
    }

    public void setYcnColegio(YcnColegio ycnColegio) {
        this.ycnColegio = ycnColegio;
    }
    public String irColegio(int idColegio) {
        this.setIdCol(idColegio);
        return "colegio.xhtml";
    }
    public int getIdCol() {
        return idCol;
    }

    public void setIdCol(int idCol) {
        this.idCol = idCol;
    }
}
