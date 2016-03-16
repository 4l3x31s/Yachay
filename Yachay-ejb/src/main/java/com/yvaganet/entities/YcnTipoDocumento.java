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
@Table(name = "ycn_tipo_documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnTipoDocumento.findAll", query = "SELECT y FROM YcnTipoDocumento y"),
    @NamedQuery(name = "YcnTipoDocumento.findByTdoId", query = "SELECT y FROM YcnTipoDocumento y WHERE y.tdoId = :tdoId"),
    @NamedQuery(name = "YcnTipoDocumento.findByTdoTipoDocumento", query = "SELECT y FROM YcnTipoDocumento y WHERE y.tdoTipoDocumento = :tdoTipoDocumento")})
public class YcnTipoDocumento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TDO_ID")
    private Integer tdoId;
    @Size(max = 150)
    @Column(name = "TDO_TIPO_DOCUMENTO")
    private String tdoTipoDocumento;
    @OneToMany(mappedBy = "usrTdoId")
    private List<YcnUsuario> ycnUsuarioList;

    public YcnTipoDocumento() {
    }

    public YcnTipoDocumento(Integer tdoId) {
        this.tdoId = tdoId;
    }

    public Integer getTdoId() {
        return tdoId;
    }

    public void setTdoId(Integer tdoId) {
        this.tdoId = tdoId;
    }

    public String getTdoTipoDocumento() {
        return tdoTipoDocumento;
    }

    public void setTdoTipoDocumento(String tdoTipoDocumento) {
        this.tdoTipoDocumento = tdoTipoDocumento;
    }

    @XmlTransient
    public List<YcnUsuario> getYcnUsuarioList() {
        return ycnUsuarioList;
    }

    public void setYcnUsuarioList(List<YcnUsuario> ycnUsuarioList) {
        this.ycnUsuarioList = ycnUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tdoId != null ? tdoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnTipoDocumento)) {
            return false;
        }
        YcnTipoDocumento other = (YcnTipoDocumento) object;
        if ((this.tdoId == null && other.tdoId != null) || (this.tdoId != null && !this.tdoId.equals(other.tdoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnTipoDocumento[ tdoId=" + tdoId + " ]";
    }
    
}
