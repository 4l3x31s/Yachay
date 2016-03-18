package com.yvaganet.entities;

import com.yvaganet.entities.YcnCiudad;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-17T23:50:16")
@StaticMetamodel(YcnPais.class)
public class YcnPais_ { 

    public static volatile SingularAttribute<YcnPais, String> pasNombre;
    public static volatile SingularAttribute<YcnPais, Integer> pasId;
    public static volatile ListAttribute<YcnPais, YcnCiudad> ycnCiudadList;

}