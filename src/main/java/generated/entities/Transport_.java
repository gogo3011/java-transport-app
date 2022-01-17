package entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-01-18T00:50:59.455+0200")
@StaticMetamodel(Transport.class)
public abstract class Transport_ {

	public static volatile SingularAttribute<Transport, String> cost;
	public static volatile SingularAttribute<Transport, String> destination;
	public static volatile SingularAttribute<Transport, Client> client;
	public static volatile SingularAttribute<Transport, Long> id;
	public static volatile SingularAttribute<Transport, Transport> transport;
	public static volatile SingularAttribute<Transport, Employee> employee;

	public static final String COST = "cost";
	public static final String DESTINATION = "destination";
	public static final String CLIENT = "client";
	public static final String ID = "id";
	public static final String TRANSPORT = "transport";
	public static final String EMPLOYEE = "employee";

}

