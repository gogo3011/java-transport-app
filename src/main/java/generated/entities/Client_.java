package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-02-01T22:42:37.395+0200")
@StaticMetamodel(Client.class)
public abstract class Client_ {

	public static volatile SingularAttribute<Client, String> name;
	public static volatile SingularAttribute<Client, Long> id;
	public static volatile SetAttribute<Client, Transport> sent;

	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String SENT = "sent";

}

