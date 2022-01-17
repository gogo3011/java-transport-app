package entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-01-18T00:50:59.500+0200")
@StaticMetamodel(Client.class)
public abstract class Client_ {

	public static volatile SetAttribute<Client, Transport> transports;
	public static volatile SingularAttribute<Client, String> name;
	public static volatile SingularAttribute<Client, Long> id;

	public static final String TRANSPORTS = "transports";
	public static final String NAME = "name";
	public static final String ID = "id";

}

