package entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor", date = "2022-02-01T22:42:37.366+0200")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, Qualification> qualification;
	public static volatile SingularAttribute<Employee, String> name;
	public static volatile SingularAttribute<Employee, Long> id;
	public static volatile SingularAttribute<Employee, Double> salary;
	public static volatile SingularAttribute<Employee, TransportCompany> transportCompany;

	public static final String QUALIFICATION = "qualification";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String SALARY = "salary";
	public static final String TRANSPORT_COMPANY = "transportCompany";

}

