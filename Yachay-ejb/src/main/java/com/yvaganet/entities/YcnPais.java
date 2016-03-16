/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexeis
 */
@Entity
@Table(name = "ycn_pais")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnPais.findAll", query = "SELECT y FROM YcnPais y"),
    @NamedQuery(name = "YcnPais.findByPasId", query = "SELECT y FROM YcnPais y WHERE y.pasId = :pasId"),
    @NamedQuery(name = "YcnPais.findByPasNombre", query = "SELECT y FROM YcnPais y WHERE y.pasNombre = :pasNombre")})
public class YcnPais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "PAS_ID")
    private Integer pasId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "PAS_NOMBRE")
    private String pasNombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ciuPasId")
    private List<YcnCiudad> ycnCiudadList;

    public YcnPais() {
    }

    public YcnPais(Integer pasId) {
        this.pasId = pasId;
    }

    public YcnPais(Integer pasId, String pasNombre) {
        this.pasId = pasId;
        this.pasNombre = pasNombre;
    }

    public Integer getPasId() {
        return pasId;
    }

    public void setPasId(Integer pasId) {
        this.pasId = pasId;
    }

    public String getPasNombre() {
        return pasNombre;
    }

    public void setPasNombre(String pasNombre) {
        this.pasNombre = pasNombre;
    }

    @XmlTransient
    public List<YcnCiudad> getYcnCiudadList() {
        return ycnCiudadList;
    }

    public void setYcnCiudadList(List<YcnCiudad> ycnCiudadList) {
        this.ycnCiudadList = ycnCiudadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pasId != null ? pasId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnPais)) {
            return false;
        }
        YcnPais other = (YcnPais) object;
        if ((this.pasId == null && other.pasId != null) || (this.pasId != null && !this.pasId.equals(other.pasId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnPais[ pasId=" + pasId + " ]";
    }
    
}
