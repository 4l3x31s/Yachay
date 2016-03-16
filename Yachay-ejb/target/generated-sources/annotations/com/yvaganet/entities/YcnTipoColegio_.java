package com.yvaganet.entities;

import com.yvaganet.entities.YcnColegio;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-15T23:24:35")
@StaticMetamodel(YcnTipoColegio.class)
public class YcnTipoColegio_ { 

    public static volatile SingularAttribute<YcnTipoColegio, Integer> tueId;
    public static volatile SingularAttribute<YcnTipoColegio, String> tueNombre;
    public static volatile ListAttribute<YcnTipoColegio, YcnColegio> ycnColegioList;

}