package com.yvaganet.entities;

import com.yvaganet.entities.YcnColegio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-16T01:21:18")
@StaticMetamodel(YcnTelefono.class)
public class YcnTelefono_ { 

    public static volatile SingularAttribute<YcnTelefono, String> telTelefono;
    public static volatile SingularAttribute<YcnTelefono, Integer> telId;
    public static volatile ListAttribute<YcnTelefono, YcnColegio> ycnColegioList;

}