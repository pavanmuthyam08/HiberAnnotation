package com.iis;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	SessionFactory sesfact=new Configuration().configure("hiber.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(Address.class).buildSessionFactory();
	Session ses=sesfact.openSession();
    Transaction tx=ses.beginTransaction();	
    //emp is the Object of Employee Class
    Employee emp=new Employee();
    emp.setEmpname("vishnu");
    emp.setSalary(3745676);
    //add.is the Object of Address Class
    Address add=new Address();
    add.setAddressid(1);
    add.setCity("Delhi");
    add.setHouseno(176);
    //add.setEobj(emp);
    emp.setAobj(add);
    ses.save(add);
    ses.save(emp);
    tx.commit();
    System.out.println("Data Saved");
}
}
