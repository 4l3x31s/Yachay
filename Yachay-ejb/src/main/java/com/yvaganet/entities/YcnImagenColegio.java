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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Alexeis
 */
@Entity
@Table(name = "ycn_imagen_colegio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnImagenColegio.findAll", query = "SELECT y FROM YcnImagenColegio y"),
    @NamedQuery(name = "YcnImagenColegio.findByImgId", query = "SELECT y FROM YcnImagenColegio y WHERE y.imgId = :imgId"),
    @NamedQuery(name = "YcnImagenColegio.findByImgTipo", query = "SELECT y FROM YcnImagenColegio y WHERE y.imgTipo = :imgTipo")})
public class YcnImagenColegio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IMG_ID")
    private Integer imgId;
    @Lob
    @Size(max = 65535)
    @Column(name = "IMG_URL")
    private String imgUrl;
    @Column(name = "IMG_TIPO")
    private Integer imgTipo;
    @JoinColumn(name = "IMG_COL_ID", referencedColumnName = "COL_ID")
    @ManyToOne
    private YcnColegio imgColId;

    public YcnImagenColegio() {
    }

    public YcnImagenColegio(Integer imgId) {
        this.imgId = imgId;
    }

    public Integer getImgId() {
        return imgId;
    }

    public void setImgId(Integer imgId) {
        this.imgId = imgId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getImgTipo() {
        return imgTipo;
    }

    public void setImgTipo(Integer imgTipo) {
        this.imgTipo = imgTipo;
    }

    public YcnColegio getImgColId() {
        return imgColId;
    }

    public void setImgColId(YcnColegio imgColId) {
        this.imgColId = imgColId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (imgId != null ? imgId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnImagenColegio)) {
            return false;
        }
        YcnImagenColegio other = (YcnImagenColegio) object;
        if ((this.imgId == null && other.imgId != null) || (this.imgId != null && !this.imgId.equals(other.imgId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnImagenColegio[ imgId=" + imgId + " ]";
    }
    
}
