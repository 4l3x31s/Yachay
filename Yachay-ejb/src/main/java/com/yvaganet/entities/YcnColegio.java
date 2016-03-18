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
import javax.persistence.Lob;
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
@Table(name = "ycn_colegio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnColegio.findAll", query = "SELECT y FROM YcnColegio y"),
    @NamedQuery(name = "YcnColegio.findByColId", query = "SELECT y FROM YcnColegio y WHERE y.colId = :colId"),
    @NamedQuery(name = "YcnColegio.findByColNombre", query = "SELECT y FROM YcnColegio y WHERE y.colNombre = :colNombre"),
    @NamedQuery(name = "YcnColegio.findByColSie", query = "SELECT y FROM YcnColegio y WHERE y.colSie = :colSie"),
    @NamedQuery(name = "YcnColegio.findByColLogo", query = "SELECT y FROM YcnColegio y WHERE y.colLogo = :colLogo"),
    @NamedQuery(name = "YcnColegio.findByColTurno", query = "SELECT y FROM YcnColegio y WHERE y.colTurno = :colTurno")})
public class YcnColegio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COL_ID")
    private Integer colId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "COL_NOMBRE")
    private String colNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "COL_SIE")
    private String colSie;
    @Size(max = 250)
    @Column(name = "COL_LOGO")
    private String colLogo;
    @Lob
    @Size(max = 65535)
    @Column(name = "COL_MISION")
    private String colMision;
    @Lob
    @Size(max = 65535)
    @Column(name = "COL_VISION")
    private String colVision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "COL_TURNO")
    private String colTurno;
    @Lob
    @Size(max = 65535)
    @Column(name = "COL_PRESENTACION")
    private String colPresentacion;
    @Lob
    @Size(max = 65535)
    @Column(name = "COL_HISTORIA")
    private String colHistoria;
    @Lob
    @Size(max = 65535)
    @Column(name = "COL_INFRAESTRUCTURA")
    private String colInfraestructura;
    @Lob
    @Size(max = 65535)
    @Column(name = "COL_RECOMENDACION")
    private String colRecomendacion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "COL_DIRECCION")
    private String colDireccion;
    @JoinColumn(name = "COL_LOC_ID", referencedColumnName = "LOC_ID")
    @ManyToOne(optional = false)
    private YcnLocalidad colLocId;
    @OneToMany(mappedBy = "telColId")
    private List<YcnTelefono> ycnTelefonoList;
    @OneToMany(mappedBy = "tueColId")
    private List<YcnTipoColegio> ycnTipoColegioList;
    @OneToMany(mappedBy = "imgColId")
    private List<YcnImagenColegio> ycnImagenColegioList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ucoColId")
    private List<YcnUsuarioColegio> ycnUsuarioColegioList;
    @OneToMany(mappedBy = "emlColId")
    private List<YcnEmail> ycnEmailList;
    @OneToMany(mappedBy = "nacColId")
    private List<YcnNivelAcademico> ycnNivelAcademicoList;

    public YcnColegio() {
    }

    public YcnColegio(Integer colId) {
        this.colId = colId;
    }

    public YcnColegio(Integer colId, String colNombre, String colSie, String colTurno, String colDireccion) {
        this.colId = colId;
        this.colNombre = colNombre;
        this.colSie = colSie;
        this.colTurno = colTurno;
        this.colDireccion = colDireccion;
    }

    public Integer getColId() {
        return colId;
    }

    public void setColId(Integer colId) {
        this.colId = colId;
    }

    public String getColNombre() {
        return colNombre;
    }

    public void setColNombre(String colNombre) {
        this.colNombre = colNombre;
    }

    public String getColSie() {
        return colSie;
    }

    public void setColSie(String colSie) {
        this.colSie = colSie;
    }

    public String getColLogo() {
        return colLogo;
    }

    public void setColLogo(String colLogo) {
        this.colLogo = colLogo;
    }

    public String getColMision() {
        return colMision;
    }

    public void setColMision(String colMision) {
        this.colMision = colMision;
    }

    public String getColVision() {
        return colVision;
    }

    public void setColVision(String colVision) {
        this.colVision = colVision;
    }

    public String getColTurno() {
        return colTurno;
    }

    public void setColTurno(String colTurno) {
        this.colTurno = colTurno;
    }

    public String getColPresentacion() {
        return colPresentacion;
    }

    public void setColPresentacion(String colPresentacion) {
        this.colPresentacion = colPresentacion;
    }

    public String getColHistoria() {
        return colHistoria;
    }

    public void setColHistoria(String colHistoria) {
        this.colHistoria = colHistoria;
    }

    public String getColInfraestructura() {
        return colInfraestructura;
    }

    public void setColInfraestructura(String colInfraestructura) {
        this.colInfraestructura = colInfraestructura;
    }

    public String getColRecomendacion() {
        return colRecomendacion;
    }

    public void setColRecomendacion(String colRecomendacion) {
        this.colRecomendacion = colRecomendacion;
    }

    public String getColDireccion() {
        return colDireccion;
    }

    public void setColDireccion(String colDireccion) {
        this.colDireccion = colDireccion;
    }

    public YcnLocalidad getColLocId() {
        return colLocId;
    }

    public void setColLocId(YcnLocalidad colLocId) {
        this.colLocId = colLocId;
    }

    @XmlTransient
    public List<YcnTelefono> getYcnTelefonoList() {
        return ycnTelefonoList;
    }

    public void setYcnTelefonoList(List<YcnTelefono> ycnTelefonoList) {
        this.ycnTelefonoList = ycnTelefonoList;
    }

    @XmlTransient
    public List<YcnTipoColegio> getYcnTipoColegioList() {
        return ycnTipoColegioList;
    }

    public void setYcnTipoColegioList(List<YcnTipoColegio> ycnTipoColegioList) {
        this.ycnTipoColegioList = ycnTipoColegioList;
    }

    @XmlTransient
    public List<YcnImagenColegio> getYcnImagenColegioList() {
        return ycnImagenColegioList;
    }

    public void setYcnImagenColegioList(List<YcnImagenColegio> ycnImagenColegioList) {
        this.ycnImagenColegioList = ycnImagenColegioList;
    }

    @XmlTransient
    public List<YcnUsuarioColegio> getYcnUsuarioColegioList() {
        return ycnUsuarioColegioList;
    }

    public void setYcnUsuarioColegioList(List<YcnUsuarioColegio> ycnUsuarioColegioList) {
        this.ycnUsuarioColegioList = ycnUsuarioColegioList;
    }

    @XmlTransient
    public List<YcnEmail> getYcnEmailList() {
        return ycnEmailList;
    }

    public void setYcnEmailList(List<YcnEmail> ycnEmailList) {
        this.ycnEmailList = ycnEmailList;
    }

    @XmlTransient
    public List<YcnNivelAcademico> getYcnNivelAcademicoList() {
        return ycnNivelAcademicoList;
    }

    public void setYcnNivelAcademicoList(List<YcnNivelAcademico> ycnNivelAcademicoList) {
        this.ycnNivelAcademicoList = ycnNivelAcademicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (colId != null ? colId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnColegio)) {
            return false;
        }
        YcnColegio other = (YcnColegio) object;
        if ((this.colId == null && other.colId != null) || (this.colId != null && !this.colId.equals(other.colId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnColegio[ colId=" + colId + " ]";
    }
    
}
