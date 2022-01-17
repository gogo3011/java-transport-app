package entities;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-01-18T00:50:59.416+0200")
@StaticMetamodel(TransportCompany.class)
public abstract class TransportCompany_ {

	public static volatile SingularAttribute<TransportCompany, String> name;
	public static volatile SetAttribute<TransportCompany, Vehicle> vehicles;
	public static volatile SingularAttribute<TransportCompany, Long> id;
	public static volatile SetAttribute<TransportCompany, Employee> employees;

	public static final String NAME = "name";
	public static final String VEHICLES = "vehicles";
	public static final String ID = "id";
	public static final String EMPLOYEES = "employees";

}

