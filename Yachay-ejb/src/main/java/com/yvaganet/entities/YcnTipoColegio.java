/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexeis
 */
@Entity
@Table(name = "ycn_tipo_colegio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnTipoColegio.findAll", query = "SELECT y FROM YcnTipoColegio y"),
    @NamedQuery(name = "YcnTipoColegio.findByTueId", query = "SELECT y FROM YcnTipoColegio y WHERE y.tueId = :tueId"),
    @NamedQuery(name = "YcnTipoColegio.findByTueNombre", query = "SELECT y FROM YcnTipoColegio y WHERE y.tueNombre = :tueNombre")})
public class YcnTipoColegio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "TUE_ID")
    private Integer tueId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "TUE_NOMBRE")
    private String tueNombre;
    @JoinColumn(name = "TUE_COL_ID", referencedColumnName = "COL_ID")
    @ManyToOne
    private YcnColegio tueColId;

    public YcnTipoColegio() {
    }

    public YcnTipoColegio(Integer tueId) {
        this.tueId = tueId;
    }

    public YcnTipoColegio(Integer tueId, String tueNombre) {
        this.tueId = tueId;
        this.tueNombre = tueNombre;
    }

    public Integer getTueId() {
        return tueId;
    }

    public void setTueId(Integer tueId) {
        this.tueId = tueId;
    }

    public String getTueNombre() {
        return tueNombre;
    }

    public void setTueNombre(String tueNombre) {
        this.tueNombre = tueNombre;
    }

    public YcnColegio getTueColId() {
        return tueColId;
    }

    public void setTueColId(YcnColegio tueColId) {
        this.tueColId = tueColId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tueId != null ? tueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnTipoColegio)) {
            return false;
        }
        YcnTipoColegio other = (YcnTipoColegio) object;
        if ((this.tueId == null && other.tueId != null) || (this.tueId != null && !this.tueId.equals(other.tueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnTipoColegio[ tueId=" + tueId + " ]";
    }
    
}
