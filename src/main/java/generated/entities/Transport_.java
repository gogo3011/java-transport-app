package entities;

import java.sql.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-02-01T22:42:37.348+0200")
@StaticMetamodel(Transport.class)
public abstract class Transport_ {

	public static volatile SingularAttribute<Transport, Double> cost;
	public static volatile SingularAttribute<Transport, Client> receiver;
	public static volatile SingularAttribute<Transport, Client> sender;
	public static volatile SingularAttribute<Transport, Date> dateReceived;
	public static volatile SingularAttribute<Transport, String> destination;
	public static volatile SingularAttribute<Transport, Boolean> paid;
	public static volatile SingularAttribute<Transport, Long> id;
	public static volatile SingularAttribute<Transport, Employee> employee;
	public static volatile SingularAttribute<Transport, Date> dateSent;
	public static volatile SingularAttribute<Transport, TransportCompany> transportCompany;

	public static final String COST = "cost";
	public static final String RECEIVER = "receiver";
	public static final String SENDER = "sender";
	public static final String DATE_RECEIVED = "dateReceived";
	public static final String DESTINATION = "destination";
	public static final String PAID = "paid";
	public static final String ID = "id";
	public static final String EMPLOYEE = "employee";
	public static final String DATE_SENT = "dateSent";
	public static final String TRANSPORT_COMPANY = "transportCompany";

}

