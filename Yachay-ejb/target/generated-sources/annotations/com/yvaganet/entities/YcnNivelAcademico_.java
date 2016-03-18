package com.yvaganet.entities;

import com.yvaganet.entities.YcnColegio;
import com.yvaganet.entities.YcnCursos;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-03-17T23:50:16")
@StaticMetamodel(YcnNivelAcademico.class)
public class YcnNivelAcademico_ { 

    public static volatile SingularAttribute<YcnNivelAcademico, Integer> nacId;
    public static volatile SingularAttribute<YcnNivelAcademico, String> nacNiveles;
    public static volatile ListAttribute<YcnNivelAcademico, YcnCursos> ycnCursosList;
    public static volatile SingularAttribute<YcnNivelAcademico, YcnColegio> nacColId;

}