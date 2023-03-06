package com.test;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

@Entity
public class Department {
	@Id
	@Column(name = "Department_Id")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int depId;
	
	@Column(name = "Department_Name")
	private String depName;
	
	@Column(name = "Department_location")
	private String depLocation;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "department_Id")
	@OrderColumn(name = "type")
	private List<Employees> employee;
	
	
	public Department(int depId, String depName, String depLocation, List<Employees> employee) {
		
		this.depId = depId;
		this.depName = depName;
		this.depLocation = depLocation;
		this.employee = employee;
	}
	public Department() {
		
	}
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", depLocation=" + depLocation + ", employee="
				+ employee + "]";
	}
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public String getDepLocation() {
		return depLocation;
	}
	public void setDepLocation(String depLocation) {
		this.depLocation = depLocation;
	}
	public List<Employees> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employees> employee) {
		this.employee = employee;
	}
	
	
	
	

}
