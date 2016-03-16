package com.yvaganet.entities;

import com.yvaganet.entities.YcnEmail;
import com.yvaganet.entities.YcnImagenColegio;
import com.yvaganet.entities.YcnLocalidad;
import com.yvaganet.entities.YcnNivelAcademico;
import com.yvaganet.entities.YcnTelefono;
import com.yvaganet.entities.YcnTipoColegio;
import com.yvaganet.entities.YcnUsuarioColegio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-16T01:21:18")
@StaticMetamodel(YcnColegio.class)
public class YcnColegio_ { 

    public static volatile SingularAttribute<YcnColegio, String> colHistoria;
    public static volatile SingularAttribute<YcnColegio, String> colLogo;
    public static volatile SingularAttribute<YcnColegio, Integer> colNacId;
    public static volatile SingularAttribute<YcnColegio, String> colNombre;
    public static volatile ListAttribute<YcnColegio, YcnNivelAcademico> ycnNivelAcademicoList;
    public static volatile SingularAttribute<YcnColegio, String> colMision;
    public static volatile SingularAttribute<YcnColegio, YcnEmail> colEmlId;
    public static volatile SingularAttribute<YcnColegio, YcnLocalidad> colLocId;
    public static volatile SingularAttribute<YcnColegio, String> colVision;
    public static volatile SingularAttribute<YcnColegio, String> colSie;
    public static volatile SingularAttribute<YcnColegio, String> colPresentacion;
    public static volatile SingularAttribute<YcnColegio, String> colInfraestructura;
    public static volatile SingularAttribute<YcnColegio, String> colDireccion;
    public static volatile SingularAttribute<YcnColegio, YcnTelefono> colTelId;
    public static volatile ListAttribute<YcnColegio, YcnImagenColegio> ycnImagenColegioList;
    public static volatile SingularAttribute<YcnColegio, YcnTipoColegio> colTueId;
    public static volatile SingularAttribute<YcnColegio, String> colTurno;
    public static volatile SingularAttribute<YcnColegio, Integer> colId;
    public static volatile SingularAttribute<YcnColegio, String> colRecomendacion;
    public static volatile ListAttribute<YcnColegio, YcnUsuarioColegio> ycnUsuarioColegioList;

}