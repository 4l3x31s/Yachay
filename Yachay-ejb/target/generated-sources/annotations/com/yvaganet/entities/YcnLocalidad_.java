package com.yvaganet.entities;

import com.yvaganet.entities.YcnCiudad;
import com.yvaganet.entities.YcnColegio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-17T23:50:16")
@StaticMetamodel(YcnLocalidad.class)
public class YcnLocalidad_ { 

    public static volatile SingularAttribute<YcnLocalidad, String> locNombre;
    public static volatile SingularAttribute<YcnLocalidad, Integer> locId;
    public static volatile ListAttribute<YcnLocalidad, YcnColegio> ycnColegioList;
    public static volatile SingularAttribute<YcnLocalidad, YcnCiudad> locCiuId;

}