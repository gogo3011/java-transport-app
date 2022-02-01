package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-02-01T22:42:37.314+0200")
@StaticMetamodel(TransportCompany.class)
public abstract class TransportCompany_ {

	public static volatile SingularAttribute<TransportCompany, Long> profits;
	public static volatile SetAttribute<TransportCompany, Transport> transports;
	public static volatile SetAttribute<TransportCompany, Client> clients;
	public static volatile SingularAttribute<TransportCompany, String> name;
	public static volatile SetAttribute<TransportCompany, Vehicle> vehicles;
	public static volatile SingularAttribute<TransportCompany, Long> id;
	public static volatile SetAttribute<TransportCompany, Employee> employees;

	public static final String PROFITS = "profits";
	public static final String TRANSPORTS = "transports";
	public static final String CLIENTS = "clients";
	public static final String NAME = "name";
	public static final String VEHICLES = "vehicles";
	public static final String ID = "id";
	public static final String EMPLOYEES = "employees";

}

