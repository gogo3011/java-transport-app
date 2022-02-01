package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-02-01T22:42:37.381+0200")
@StaticMetamodel(Vehicle.class)
public abstract class Vehicle_ {

	public static volatile SingularAttribute<Vehicle, String> registrationNumber;
	public static volatile SingularAttribute<Vehicle, String> model;
	public static volatile SingularAttribute<Vehicle, Long> id;
	public static volatile SingularAttribute<Vehicle, TransportCompany> transportCompany;

	public static final String REGISTRATION_NUMBER = "registrationNumber";
	public static final String MODEL = "model";
	public static final String ID = "id";
	public static final String TRANSPORT_COMPANY = "transportCompany";

}

