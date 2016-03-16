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
@Table(name = "ycn_lugar_expedicion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnLugarExpedicion.findAll", query = "SELECT y FROM YcnLugarExpedicion y"),
    @NamedQuery(name = "YcnLugarExpedicion.findByLexId", query = "SELECT y FROM YcnLugarExpedicion y WHERE y.lexId = :lexId"),
    @NamedQuery(name = "YcnLugarExpedicion.findByLexLugar", query = "SELECT y FROM YcnLugarExpedicion y WHERE y.lexLugar = :lexLugar")})
public class YcnLugarExpedicion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LEX_ID")
    private Integer lexId;
    @Size(max = 150)
    @Column(name = "LEX_LUGAR")
    private String lexLugar;
    @OneToMany(mappedBy = "usrLexId")
    private List<YcnUsuario> ycnUsuarioList;

    public YcnLugarExpedicion() {
    }

    public YcnLugarExpedicion(Integer lexId) {
        this.lexId = lexId;
    }

    public Integer getLexId() {
        return lexId;
    }

    public void setLexId(Integer lexId) {
        this.lexId = lexId;
    }

    public String getLexLugar() {
        return lexLugar;
    }

    public void setLexLugar(String lexLugar) {
        this.lexLugar = lexLugar;
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
        hash += (lexId != null ? lexId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnLugarExpedicion)) {
            return false;
        }
        YcnLugarExpedicion other = (YcnLugarExpedicion) object;
        if ((this.lexId == null && other.lexId != null) || (this.lexId != null && !this.lexId.equals(other.lexId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnLugarExpedicion[ lexId=" + lexId + " ]";
    }
    
}
