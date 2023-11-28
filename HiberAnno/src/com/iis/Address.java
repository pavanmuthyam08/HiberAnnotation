package com.iis;
import javax.persistence.*;
@Entity
@Table(name="AddressAnnotation")
public class Address {
	@Id
	@Column(name="Address_Id")
    private int addressid;
	public int getAddressid() {
		return addressid;
	}
	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getHouseno() {
		return houseno;
	}
	public void setHouseno(int houseno) {
		this.houseno = houseno;
	}
	@Column(name="City")
    private String city;
	@Column(name="HouseNo")
    private int houseno;
	//this is the name of object which is created in Employee Class
	@OneToOne(mappedBy="aobj")
    private Employee eobj;
	public Employee getEobj() {
		return eobj;
	}
	public void setEobj(Employee eobj) {
		this.eobj = eobj;
	}
}
