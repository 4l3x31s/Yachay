/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yvaganet.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexeis
 */
@Entity
@Table(name = "ycn_usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "YcnUsuario.findAll", query = "SELECT y FROM YcnUsuario y"),
    @NamedQuery(name = "YcnUsuario.findByUsrId", query = "SELECT y FROM YcnUsuario y WHERE y.usrId = :usrId"),
    @NamedQuery(name = "YcnUsuario.findByUsrDocumentoIdentificacion", query = "SELECT y FROM YcnUsuario y WHERE y.usrDocumentoIdentificacion = :usrDocumentoIdentificacion"),
    @NamedQuery(name = "YcnUsuario.findByUsrNacionalidad", query = "SELECT y FROM YcnUsuario y WHERE y.usrNacionalidad = :usrNacionalidad"),
    @NamedQuery(name = "YcnUsuario.findByUsrGenero", query = "SELECT y FROM YcnUsuario y WHERE y.usrGenero = :usrGenero"),
    @NamedQuery(name = "YcnUsuario.findByUsrFechaNac", query = "SELECT y FROM YcnUsuario y WHERE y.usrFechaNac = :usrFechaNac"),
    @NamedQuery(name = "YcnUsuario.findByUsrUsuario", query = "SELECT y FROM YcnUsuario y WHERE y.usrUsuario = :usrUsuario"),
    @NamedQuery(name = "YcnUsuario.findByUsrPassword", query = "SELECT y FROM YcnUsuario y WHERE y.usrPassword = :usrPassword"),
    @NamedQuery(name = "YcnUsuario.findByUsrFechaRegistro", query = "SELECT y FROM YcnUsuario y WHERE y.usrFechaRegistro = :usrFechaRegistro"),
    @NamedQuery(name = "YcnUsuario.findByUsrFechaModificacion", query = "SELECT y FROM YcnUsuario y WHERE y.usrFechaModificacion = :usrFechaModificacion"),
    @NamedQuery(name = "YcnUsuario.findByUsrEstado", query = "SELECT y FROM YcnUsuario y WHERE y.usrEstado = :usrEstado")})
public class YcnUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private Integer usrId;
    @Size(max = 10)
    @Column(name = "USR_DOCUMENTO_IDENTIFICACION")
    private String usrDocumentoIdentificacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "USR_NACIONALIDAD")
    private String usrNacionalidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "USR_GENERO")
    private String usrGenero;
    @Basic(optional = false)
    @NotNull
    @Column(name = "USR_FECHA_NAC")
    @Temporal(TemporalType.DATE)
    private Date usrFechaNac;
    @Size(max = 150)
    @Column(name = "USR_USUARIO")
    private String usrUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "USR_PASSWORD")
    private String usrPassword;
    @Column(name = "USR_FECHA_REGISTRO")
    @Temporal(TemporalType.DATE)
    private Date usrFechaRegistro;
    @Column(name = "USR_FECHA_MODIFICACION")
    @Temporal(TemporalType.DATE)
    private Date usrFechaModificacion;
    @Size(max = 1)
    @Column(name = "USR_ESTADO")
    private String usrEstado;
    @JoinColumn(name = "USR_TDO_ID", referencedColumnName = "TDO_ID")
    @ManyToOne
    private YcnTipoDocumento usrTdoId;
    @JoinColumn(name = "USR_LEX_ID", referencedColumnName = "LEX_ID")
    @ManyToOne
    private YcnLugarExpedicion usrLexId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ucoUsrId")
    private List<YcnUsuarioColegio> ycnUsuarioColegioList;

    public YcnUsuario() {
    }

    public YcnUsuario(Integer usrId) {
        this.usrId = usrId;
    }

    public YcnUsuario(Integer usrId, String usrNacionalidad, String usrGenero, Date usrFechaNac, String usrPassword) {
        this.usrId = usrId;
        this.usrNacionalidad = usrNacionalidad;
        this.usrGenero = usrGenero;
        this.usrFechaNac = usrFechaNac;
        this.usrPassword = usrPassword;
    }

    public Integer getUsrId() {
        return usrId;
    }

    public void setUsrId(Integer usrId) {
        this.usrId = usrId;
    }

    public String getUsrDocumentoIdentificacion() {
        return usrDocumentoIdentificacion;
    }

    public void setUsrDocumentoIdentificacion(String usrDocumentoIdentificacion) {
        this.usrDocumentoIdentificacion = usrDocumentoIdentificacion;
    }

    public String getUsrNacionalidad() {
        return usrNacionalidad;
    }

    public void setUsrNacionalidad(String usrNacionalidad) {
        this.usrNacionalidad = usrNacionalidad;
    }

    public String getUsrGenero() {
        return usrGenero;
    }

    public void setUsrGenero(String usrGenero) {
        this.usrGenero = usrGenero;
    }

    public Date getUsrFechaNac() {
        return usrFechaNac;
    }

    public void setUsrFechaNac(Date usrFechaNac) {
        this.usrFechaNac = usrFechaNac;
    }

    public String getUsrUsuario() {
        return usrUsuario;
    }

    public void setUsrUsuario(String usrUsuario) {
        this.usrUsuario = usrUsuario;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public Date getUsrFechaRegistro() {
        return usrFechaRegistro;
    }

    public void setUsrFechaRegistro(Date usrFechaRegistro) {
        this.usrFechaRegistro = usrFechaRegistro;
    }

    public Date getUsrFechaModificacion() {
        return usrFechaModificacion;
    }

    public void setUsrFechaModificacion(Date usrFechaModificacion) {
        this.usrFechaModificacion = usrFechaModificacion;
    }

    public String getUsrEstado() {
        return usrEstado;
    }

    public void setUsrEstado(String usrEstado) {
        this.usrEstado = usrEstado;
    }

    public YcnTipoDocumento getUsrTdoId() {
        return usrTdoId;
    }

    public void setUsrTdoId(YcnTipoDocumento usrTdoId) {
        this.usrTdoId = usrTdoId;
    }

    public YcnLugarExpedicion getUsrLexId() {
        return usrLexId;
    }

    public void setUsrLexId(YcnLugarExpedicion usrLexId) {
        this.usrLexId = usrLexId;
    }

    @XmlTransient
    public List<YcnUsuarioColegio> getYcnUsuarioColegioList() {
        return ycnUsuarioColegioList;
    }

    public void setYcnUsuarioColegioList(List<YcnUsuarioColegio> ycnUsuarioColegioList) {
        this.ycnUsuarioColegioList = ycnUsuarioColegioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof YcnUsuario)) {
            return false;
        }
        YcnUsuario other = (YcnUsuario) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.yvaganet.entities.YcnUsuario[ usrId=" + usrId + " ]";
    }
    
}
