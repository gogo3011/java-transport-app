package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-02-01T22:42:37.334+0200")
@StaticMetamodel(Package.class)
public abstract class Package_ {

	public static volatile SingularAttribute<Package, String> description;
	public static volatile SingularAttribute<Package, Long> id;
	public static volatile SingularAttribute<Package, Transport> transport;

	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String TRANSPORT = "transport";

}

