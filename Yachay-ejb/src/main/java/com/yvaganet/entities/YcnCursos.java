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
@Table(name = "ycn_cursos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnCursos.findAll", query = "SELECT y FROM YcnCursos y"),
    @NamedQuery(name = "YcnCursos.findByCurId", query = "SELECT y FROM YcnCursos y WHERE y.curId = :curId"),
    @NamedQuery(name = "YcnCursos.findByCurCurso", query = "SELECT y FROM YcnCursos y WHERE y.curCurso = :curCurso")})
public class YcnCursos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CUR_ID")
    private Integer curId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "CUR_CURSO")
    private String curCurso;
    @JoinColumn(name = "CUR_NAC_ID", referencedColumnName = "NAC_ID")
    @ManyToOne
    private YcnNivelAcademico curNacId;

    public YcnCursos() {
    }

    public YcnCursos(Integer curId) {
        this.curId = curId;
    }

    public YcnCursos(Integer curId, String curCurso) {
        this.curId = curId;
        this.curCurso = curCurso;
    }

    public Integer getCurId() {
        return curId;
    }

    public void setCurId(Integer curId) {
        this.curId = curId;
    }

    public String getCurCurso() {
        return curCurso;
    }

    public void setCurCurso(String curCurso) {
        this.curCurso = curCurso;
    }

    public YcnNivelAcademico getCurNacId() {
        return curNacId;
    }

    public void setCurNacId(YcnNivelAcademico curNacId) {
        this.curNacId = curNacId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (curId != null ? curId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnCursos)) {
            return false;
        }
        YcnCursos other = (YcnCursos) object;
        if ((this.curId == null && other.curId != null) || (this.curId != null && !this.curId.equals(other.curId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnCursos[ curId=" + curId + " ]";
    }
    
}
