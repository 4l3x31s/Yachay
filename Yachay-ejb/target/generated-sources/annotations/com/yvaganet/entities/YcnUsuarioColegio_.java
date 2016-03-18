package com.yvaganet.entities;

import com.yvaganet.entities.YcnColegio;
import com.yvaganet.entities.YcnUsuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-17T23:50:16")
@StaticMetamodel(YcnUsuarioColegio.class)
public class YcnUsuarioColegio_ { 

    public static volatile SingularAttribute<YcnUsuarioColegio, Integer> ucoId;
    public static volatile SingularAttribute<YcnUsuarioColegio, YcnColegio> ucoColId;
    public static volatile SingularAttribute<YcnUsuarioColegio, YcnUsuario> ucoUsrId;

}