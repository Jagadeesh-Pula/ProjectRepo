package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Please Select Your operation to do :");
		System.out.println("1.insert data 2.update Dept Data");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		switch (n) {
		case 1:
			
			break;

		default:
			break;
		}

	}

	public static void insertData() {
		SessionFactory sessionFac = DeptEmpUtil.getSessionFactory();
		Session session = sessionFac.openSession();
		Transaction tx = session.beginTransaction();
		ArrayList<Employees> empList = new ArrayList<Employees>();
		Department deptList = new Department();

		empList.add(new Employees(0, "Jagadeesh", "Bangalore"));
		empList.add(new Employees(0, "Naveen", "Hyberabad"));
		empList.add(new Employees(0, "Naresh", "Bangalore"));
		empList.add(new Employees(0, "Pavan", "chennai"));
		deptList.setEmployee(empList);
		Department dept = new Department(1001, "IT", "Bangalore", empList);

		session.save(dept);
		tx.commit();
		session.close();
	}

	public static void selectDeptData() {

		SessionFactory sessionFac = DeptEmpUtil.getSessionFactory();
		Session session = sessionFac.openSession();
		Criteria cr = session.createCriteria(Department.class);
		List list = cr.list();

		for (Object obj : list) {
			System.out.println(obj);
		}
		session.close();
	}

	public static void selectEmployeeData() {

		SessionFactory sessionFac = DeptEmpUtil.getSessionFactory();
		Session session = sessionFac.openSession();
		Criteria cr = session.createCriteria(Employees.class);
		List list = cr.list();

		for (Object obj : list) {
			System.out.println(obj);
		}
		session.close();
	}

	public static void updateDeptData() {
		Scanner sc=new Scanner(System.in);
		SessionFactory sessionFac = DeptEmpUtil.getSessionFactory();
		Session session = sessionFac.openSession();
		Transaction tx = session.beginTransaction();
		Criteria cr = session.createCriteria(Department.class);
		List list = cr.list();
		for (Object obj : list) {
			System.out.println(obj);
			
		}
		Department dept = new Department();
		System.out.println("Enter Department Id to Update:");
		dept.setDepId(sc.nextInt());
		Department newdept = (Department) session.get(Department.class, dept.getDepId());
		System.out.println("Enter your Dept Name");
		newdept.setDepName(sc.next());
		System.out.println("Enter your Dept location");
		newdept.setDepLocation(sc.next());
		session.update(newdept);
		tx.commit();
		session.close();
		System.out.println("department updated successfully");
	}
	public static void updateEmployeeData() {
		Scanner sc=new Scanner(System.in);
		SessionFactory sessionFac = DeptEmpUtil.getSessionFactory();
		Session session = sessionFac.openSession();
		Transaction tx = session.beginTransaction();
		Criteria cr = session.createCriteria(Employees.class);
		List list = cr.list();
		for (Object obj : list) {
			System.out.println(obj);
			
		}
		Employees emp = new Employees();
		System.out.println("Enter employee Id to Update:");
		emp.setEmpId(sc.nextInt());
		Employees newEmp = (Employees) session.get(Employees.class, emp.getEmpId());
		System.out.println("Enter your Employee Name");
		newEmp.setEmpName(sc.next());
		System.out.println("Enter your Employee location");
		newEmp.setEmpLocation(sc.next());
		session.update(newEmp);
		tx.commit();
		session.close();
		System.out.println("Employee updated successfully");
	}
	public static void deleteDeptData() {
		Scanner sc=new Scanner(System.in);
		SessionFactory sessionFac = DeptEmpUtil.getSessionFactory();
		Session session = sessionFac.openSession();
		Transaction tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Department.class);
		List list = cr.list();
		for (Object obj : list) {
			System.out.println(obj);
		}
		Department dept = new Department();
		System.out.println("Enter Department Id to delete:");
		dept.setDepId(sc.nextInt());
		Department newdept = (Department) session.get(Department.class, dept.getDepId());
		session.delete(newdept);
		tx.commit();
		session.close();
		System.out.println("department deleted successfully");
	}
	public static void deleteEmployeeData() {
		Scanner sc=new Scanner(System.in);
		SessionFactory sessionFac = DeptEmpUtil.getSessionFactory();
		Session session = sessionFac.openSession();
		Transaction tx=session.beginTransaction();
		Criteria cr = session.createCriteria(Employees.class);
		List list = cr.list();
		for (Object obj : list) {
			System.out.println(obj);
		}
		Employees emp = new Employees();
		System.out.println("Enter Employee Id to delete:");
		emp.setEmpId(sc.nextInt());
		Employees newEmp = (Employees) session.get(Employees.class, emp.getEmpId());
		session.delete(newEmp);
		tx.commit();
		session.close();
		System.out.println("Employee deleted successfully");
	}

}
