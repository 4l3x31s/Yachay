package com.yvaganet.entities;

import com.yvaganet.entities.YcnLocalidad;
import com.yvaganet.entities.YcnPais;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-17T21:09:00")
@StaticMetamodel(YcnCiudad.class)
public class YcnCiudad_ { 

    public static volatile SingularAttribute<YcnCiudad, YcnPais> ciuPasId;
    public static volatile SingularAttribute<YcnCiudad, String> ciuNombre;
    public static volatile ListAttribute<YcnCiudad, YcnLocalidad> ycnLocalidadList;
    public static volatile SingularAttribute<YcnCiudad, Integer> ciuId;

}