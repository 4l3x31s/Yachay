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
@Table(name = "ycn_nivel_academico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnNivelAcademico.findAll", query = "SELECT y FROM YcnNivelAcademico y"),
    @NamedQuery(name = "YcnNivelAcademico.findByNacId", query = "SELECT y FROM YcnNivelAcademico y WHERE y.nacId = :nacId"),
    @NamedQuery(name = "YcnNivelAcademico.findByNacNiveles", query = "SELECT y FROM YcnNivelAcademico y WHERE y.nacNiveles = :nacNiveles")})
public class YcnNivelAcademico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "NAC_ID")
    private Integer nacId;
    @Size(max = 150)
    @Column(name = "NAC_NIVELES")
    private String nacNiveles;
    @OneToMany(mappedBy = "colNacId")
    private List<YcnColegio> ycnColegioList;

    public YcnNivelAcademico() {
    }

    public YcnNivelAcademico(Integer nacId) {
        this.nacId = nacId;
    }

    public Integer getNacId() {
        return nacId;
    }

    public void setNacId(Integer nacId) {
        this.nacId = nacId;
    }

    public String getNacNiveles() {
        return nacNiveles;
    }

    public void setNacNiveles(String nacNiveles) {
        this.nacNiveles = nacNiveles;
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
        hash += (nacId != null ? nacId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnNivelAcademico)) {
            return false;
        }
        YcnNivelAcademico other = (YcnNivelAcademico) object;
        if ((this.nacId == null && other.nacId != null) || (this.nacId != null && !this.nacId.equals(other.nacId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnNivelAcademico[ nacId=" + nacId + " ]";
    }
    
}
