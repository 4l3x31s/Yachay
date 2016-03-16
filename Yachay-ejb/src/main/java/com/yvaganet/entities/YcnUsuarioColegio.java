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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexeis
 */
@Entity
@Table(name = "ycn_usuario_colegio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnUsuarioColegio.findAll", query = "SELECT y FROM YcnUsuarioColegio y"),
    @NamedQuery(name = "YcnUsuarioColegio.findByUcoId", query = "SELECT y FROM YcnUsuarioColegio y WHERE y.ucoId = :ucoId")})
public class YcnUsuarioColegio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "UCO_ID")
    private Integer ucoId;
    @JoinColumn(name = "UCO_USR_ID", referencedColumnName = "USR_ID")
    @ManyToOne(optional = false)
    private YcnUsuario ucoUsrId;
    @JoinColumn(name = "UCO_COL_ID", referencedColumnName = "COL_ID")
    @ManyToOne(optional = false)
    private YcnColegio ucoColId;

    public YcnUsuarioColegio() {
    }

    public YcnUsuarioColegio(Integer ucoId) {
        this.ucoId = ucoId;
    }

    public Integer getUcoId() {
        return ucoId;
    }

    public void setUcoId(Integer ucoId) {
        this.ucoId = ucoId;
    }

    public YcnUsuario getUcoUsrId() {
        return ucoUsrId;
    }

    public void setUcoUsrId(YcnUsuario ucoUsrId) {
        this.ucoUsrId = ucoUsrId;
    }

    public YcnColegio getUcoColId() {
        return ucoColId;
    }

    public void setUcoColId(YcnColegio ucoColId) {
        this.ucoColId = ucoColId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ucoId != null ? ucoId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnUsuarioColegio)) {
            return false;
        }
        YcnUsuarioColegio other = (YcnUsuarioColegio) object;
        if ((this.ucoId == null && other.ucoId != null) || (this.ucoId != null && !this.ucoId.equals(other.ucoId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnUsuarioColegio[ ucoId=" + ucoId + " ]";
    }
    
}
