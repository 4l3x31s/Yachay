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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ycn_localidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnLocalidad.findAll", query = "SELECT y FROM YcnLocalidad y"),
    @NamedQuery(name = "YcnLocalidad.findByLocId", query = "SELECT y FROM YcnLocalidad y WHERE y.locId = :locId"),
    @NamedQuery(name = "YcnLocalidad.findByLocNombre", query = "SELECT y FROM YcnLocalidad y WHERE y.locNombre = :locNombre")})
public class YcnLocalidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private Integer locId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "LOC_NOMBRE")
    private String locNombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colLocId")
    private List<YcnColegio> ycnColegioList;
    @JoinColumn(name = "LOC_CIU_ID", referencedColumnName = "CIU_ID")
    @ManyToOne(optional = false)
    private YcnCiudad locCiuId;

    public YcnLocalidad() {
    }

    public YcnLocalidad(Integer locId) {
        this.locId = locId;
    }

    public YcnLocalidad(Integer locId, String locNombre) {
        this.locId = locId;
        this.locNombre = locNombre;
    }

    public Integer getLocId() {
        return locId;
    }

    public void setLocId(Integer locId) {
        this.locId = locId;
    }

    public String getLocNombre() {
        return locNombre;
    }

    public void setLocNombre(String locNombre) {
        this.locNombre = locNombre;
    }

    @XmlTransient
    public List<YcnColegio> getYcnColegioList() {
        return ycnColegioList;
    }

    public void setYcnColegioList(List<YcnColegio> ycnColegioList) {
        this.ycnColegioList = ycnColegioList;
    }

    public YcnCiudad getLocCiuId() {
        return locCiuId;
    }

    public void setLocCiuId(YcnCiudad locCiuId) {
        this.locCiuId = locCiuId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locId != null ? locId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnLocalidad)) {
            return false;
        }
        YcnLocalidad other = (YcnLocalidad) object;
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnLocalidad[ locId=" + locId + " ]";
    }
    
}
