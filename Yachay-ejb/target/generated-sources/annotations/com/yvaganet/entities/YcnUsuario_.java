package com.yvaganet.entities;

import com.yvaganet.entities.YcnLugarExpedicion;
import com.yvaganet.entities.YcnTipoDocumento;
import com.yvaganet.entities.YcnUsuarioColegio;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-16T01:21:18")
@StaticMetamodel(YcnUsuario.class)
public class YcnUsuario_ { 

    public static volatile SingularAttribute<YcnUsuario, String> usrEstado;
    public static volatile SingularAttribute<YcnUsuario, Date> usrFechaRegistro;
    public static volatile SingularAttribute<YcnUsuario, Integer> usrId;
    public static volatile SingularAttribute<YcnUsuario, YcnTipoDocumento> usrTdoId;
    public static volatile SingularAttribute<YcnUsuario, String> usrNacionalidad;
    public static volatile SingularAttribute<YcnUsuario, String> usrPassword;
    public static volatile SingularAttribute<YcnUsuario, String> usrDocumentoIdentificacion;
    public static volatile SingularAttribute<YcnUsuario, Date> usrFechaModificacion;
    public static volatile SingularAttribute<YcnUsuario, String> usrUsuario;
    public static volatile SingularAttribute<YcnUsuario, String> usrGenero;
    public static volatile SingularAttribute<YcnUsuario, YcnLugarExpedicion> usrLexId;
    public static volatile SingularAttribute<YcnUsuario, Date> usrFechaNac;
    public static volatile ListAttribute<YcnUsuario, YcnUsuarioColegio> ycnUsuarioColegioList;

}