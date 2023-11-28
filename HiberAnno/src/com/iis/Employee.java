package com.iis;
import javax.persistence.*;
//It will make class as a part of hibernate framework
@Entity
@Table(name="EmployeeAnnotation")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name="EmployeeId")
	private int empid;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Column(name="EmployeeName")
   private String empname;
	@Column(name="salary")
	private double salary;
	@OneToOne(targetEntity=Address.class)
	@JoinColumn(name="AddId")
	private Address aobj;
	public Address getAobj() {
		return aobj;
	}
	public void setAobj(Address aobj) {
		this.aobj = aobj;
	}
}
