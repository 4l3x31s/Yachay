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
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Alexeis
 */
@ManagedBean
@ViewScoped
public class ColegioBean {
    
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
        System.out.println("Respuesta");
        System.out.println("colegio obtenido: " + respuesta.getColNombre());
        System.out.println("colegio obtenido: " + respuesta.getColDireccion());
    }
    
    @PostConstruct
    public void init() {
        System.out.println("init" + this.getIdCol());
        this.ycnColegio = this.ycnColegioFacadeLocal.find(this.getIdCol());
        
    }
    public YcnColegio getYcnColegio() {
        return ycnColegio;
    }

    public void setYcnColegio(YcnColegio ycnColegio) {
        this.ycnColegio = ycnColegio;
    }
    public String irColegio(int idColegio) {
        System.out.println(idColegio);
        this.setIdCol(idColegio);
        System.out.println(this.getIdCol());
        return "colegio.xhtml";
    }
    public int getIdCol() {
        return idCol;
    }

    public void setIdCol(int idCol) {
        this.idCol = idCol;
    }
}
