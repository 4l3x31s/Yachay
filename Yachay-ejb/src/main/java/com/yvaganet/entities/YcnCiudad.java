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
@Table(name = "ycn_ciudad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnCiudad.findAll", query = "SELECT y FROM YcnCiudad y"),
    @NamedQuery(name = "YcnCiudad.findByCiuId", query = "SELECT y FROM YcnCiudad y WHERE y.ciuId = :ciuId"),
    @NamedQuery(name = "YcnCiudad.findByCiuNombre", query = "SELECT y FROM YcnCiudad y WHERE y.ciuNombre = :ciuNombre")})
public class YcnCiudad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CIU_ID")
    private Integer ciuId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "CIU_NOMBRE")
    private String ciuNombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "locCiuId")
    private List<YcnLocalidad> ycnLocalidadList;
    @JoinColumn(name = "CIU_PAS_ID", referencedColumnName = "PAS_ID")
    @ManyToOne(optional = false)
    private YcnPais ciuPasId;

    public YcnCiudad() {
    }

    public YcnCiudad(Integer ciuId) {
        this.ciuId = ciuId;
    }

    public YcnCiudad(Integer ciuId, String ciuNombre) {
        this.ciuId = ciuId;
        this.ciuNombre = ciuNombre;
    }

    public Integer getCiuId() {
        return ciuId;
    }

    public void setCiuId(Integer ciuId) {
        this.ciuId = ciuId;
    }

    public String getCiuNombre() {
        return ciuNombre;
    }

    public void setCiuNombre(String ciuNombre) {
        this.ciuNombre = ciuNombre;
    }

    @XmlTransient
    public List<YcnLocalidad> getYcnLocalidadList() {
        return ycnLocalidadList;
    }

    public void setYcnLocalidadList(List<YcnLocalidad> ycnLocalidadList) {
        this.ycnLocalidadList = ycnLocalidadList;
    }

    public YcnPais getCiuPasId() {
        return ciuPasId;
    }

    public void setCiuPasId(YcnPais ciuPasId) {
        this.ciuPasId = ciuPasId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ciuId != null ? ciuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnCiudad)) {
            return false;
        }
        YcnCiudad other = (YcnCiudad) object;
        if ((this.ciuId == null && other.ciuId != null) || (this.ciuId != null && !this.ciuId.equals(other.ciuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnCiudad[ ciuId=" + ciuId + " ]";
    }
    
}
