/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexeis
 */
@Entity
@Table(name = "ycn_telefono")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnTelefono.findAll", query = "SELECT y FROM YcnTelefono y"),
    @NamedQuery(name = "YcnTelefono.findByTelId", query = "SELECT y FROM YcnTelefono y WHERE y.telId = :telId"),
    @NamedQuery(name = "YcnTelefono.findByTelTelefono", query = "SELECT y FROM YcnTelefono y WHERE y.telTelefono = :telTelefono")})
public class YcnTelefono implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TEL_ID")
    private Integer telId;
    @Size(max = 50)
    @Column(name = "TEL_TELEFONO")
    private String telTelefono;
    @OneToMany(mappedBy = "colTelId")
    private List<YcnColegio> ycnColegioList;

    public YcnTelefono() {
    }

    public YcnTelefono(Integer telId) {
        this.telId = telId;
    }

    public Integer getTelId() {
        return telId;
    }

    public void setTelId(Integer telId) {
        this.telId = telId;
    }

    public String getTelTelefono() {
        return telTelefono;
    }

    public void setTelTelefono(String telTelefono) {
        this.telTelefono = telTelefono;
    }

    @XmlTransient
    public List<YcnColegio> getYcnColegioList() {
        return ycnColegioList;
    }

    public void setYcnColegioList(List<YcnColegio> ycnColegioList) {
        this.ycnColegioList = ycnColegioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (telId != null ? telId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnTelefono)) {
            return false;
        }
        YcnTelefono other = (YcnTelefono) object;
        if ((this.telId == null && other.telId != null) || (this.telId != null && !this.telId.equals(other.telId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnTelefono[ telId=" + telId + " ]";
    }
    
}
