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
@Table(name = "ycn_email")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnEmail.findAll", query = "SELECT y FROM YcnEmail y"),
    @NamedQuery(name = "YcnEmail.findByEmlId", query = "SELECT y FROM YcnEmail y WHERE y.emlId = :emlId"),
    @NamedQuery(name = "YcnEmail.findByEmlEmail", query = "SELECT y FROM YcnEmail y WHERE y.emlEmail = :emlEmail")})
public class YcnEmail implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EML_ID")
    private Integer emlId;
    @Size(max = 250)
    @Column(name = "EML_EMAIL")
    private String emlEmail;
    @OneToMany(mappedBy = "colEmlId")
    private List<YcnColegio> ycnColegioList;

    public YcnEmail() {
    }

    public YcnEmail(Integer emlId) {
        this.emlId = emlId;
    }

    public Integer getEmlId() {
        return emlId;
    }

    public void setEmlId(Integer emlId) {
        this.emlId = emlId;
    }

    public String getEmlEmail() {
        return emlEmail;
    }

    public void setEmlEmail(String emlEmail) {
        this.emlEmail = emlEmail;
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
        hash += (emlId != null ? emlId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnEmail)) {
            return false;
        }
        YcnEmail other = (YcnEmail) object;
        if ((this.emlId == null && other.emlId != null) || (this.emlId != null && !this.emlId.equals(other.emlId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnEmail[ emlId=" + emlId + " ]";
    }
    
}
