package com.test;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employees {
	@Id
	@Column(name = "Employee_Id",unique = true)
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int empId;
	
	@Column(name = "Employee_Name")
	private String empName;
	
	@Column(name = "Employee_location")
	private String empLocation;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	@Override
	public String toString() {
		return "Employees [empId=" + empId + ", empName=" + empName + ", empLocation=" + empLocation + "]";
	}
	public Employees(int empId, String empName, String empLocation) {
		
		this.empId = empId;
		this.empName = empName;
		this.empLocation = empLocation;
	}
	public Employees() {
		
	}
	
	
	
	

}
