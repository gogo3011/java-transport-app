package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-01-27T01:56:30.938+0200")
@StaticMetamodel(Package.class)
public abstract class Package_ {

	public static volatile SetAttribute<Package, Transport> transports;
	public static volatile SingularAttribute<Package, String> description;
	public static volatile SingularAttribute<Package, Long> id;

	public static final String TRANSPORTS = "transports";
	public static final String DESCRIPTION = "description";
	public static final String ID = "id";

}

